package org.launchcode.studio7.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("skills")
public class SkillsController {

    @GetMapping
    public String mainMessage(){
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</html>";
    }

//    @RequestMapping(value="list", method={RequestMethod.GET, RequestMethod.POST})
//    public static String listFavorites(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third){
//        return "<html>" +
//                "<h1>"+name+"</h1>" +
//                "<ol>" +
//                "<li>"+first+"</li>" +
//                "<li>"+second+"</li>" +
//                "<li>"+third+"</li>" +
//                "</ol>" +
//                "</html>";
//
//    }

    @RequestMapping(value="list", method={RequestMethod.GET, RequestMethod.POST})
    public static String listFavorites(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third){
        return "<html>" +
                "<h1>"+name+"</h1>" +
                "<table>" +
                "<tr>" +
                "<th></th>" +
                "<th>Language</th>" +
                "</tr>" +
                "<tr>" +
                "<th>First</th>"+
                "<td>"+first+"</td>" +
                "</tr>"+
                "<tr>" +
                "<th>Second</th>"+
                "<td>"+second+"</td>" +
                "</tr>"+
                "<tr>" +
                "<th>Third</th>"+
                "<td>"+third+"</td>" +
                "</tr>"+
                "</table>" +
                "</html>";

    }

    @GetMapping("form")
    public String createForm(){
        return """
                <html>
                    <form action="list">
                        <label>Name:</label><input type="text" name="name"/>
                        <br>
                        <label>My favorite language:</label>
                        <select name="first">
                            <option value="Java">Java</option>
                            <option  value="JavaScript">JavaScript</option>
                            <option value="Python">Python</option>
                        </select>
                        <br>
                        <label>My second favorite language:</label>
                        <select name="second">
                            <option value="Java">Java</option>
                            <option value="JavaScript">JavaScript</option>
                            <option value="Python">Python</option>
                        </select>
                        <br>
                        <label>My third favorite language:</label>
                        <select name="third">
                            <option value="Java">Java</option>
                            <option value="JavaScript">JavaScript</option>
                            <option value="Python">Python</option>
                        </select>
                        <input type="submit"/>
                    </form>
                </html>
                """;
    }

//    @GetMapping("list/{name}")
//    public String listWithPathParam(@PathVariable String name){
//        return "Hello, " + name + "!";
//    }



}
