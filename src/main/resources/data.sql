INSERT INTO notes(title, text)
                    VALUES ('Example Bold, Italic and Default',
                            '<p><strong>Bold</strong></p>
                            <p><em>Italic</em></p>
                            <p>Default</p>');

INSERT INTO  notes(title, text)
                    VALUES ('Example Aligns',
                            '<p>Left</p>
                            <p style="text-align: center;">Center</p>
                            <p style="text-align: right;">Right</p>');

INSERT INTO  notes(title, text)
                    VALUES ('Example different fonts',
                            '<p><span style="font-family: impact, sans-serif;">Impact</span></p>
                            <p><span style="font-family: arial black, sans-serif;">Arial Black</span></p>
                            <p><span style="font-family: helvetica, arial, sans-serif;">Helvetica</span></p>');

INSERT INTO  notes(title, text)
                    VALUES ('Example different font size',
                            '<p><span style="font-size: 12pt;">12 pt</span></p>
                            <p><span style="font-size: 18pt;">18 pt</span></p>
                            <p><span style="font-size: 36pt;">36 pt</span></p>');

INSERT INTO  notes(title, text)
                    VALUES ('Example different colors&background colors',
                            '<p><span style="color: rgb(224, 62, 45);">Red</span></p>
                            <p><span style="color: rgb(45, 194, 107);">Green</span></p>
                            <p><span style="color: rgb(53, 152, 219);">Blue</span></p>
                            <p><span style="background-color: rgb(241, 196, 15);">Background color</span></p>');

INSERT INTO  notes(title, text)
                    VALUES ('Example image insert',
                            '<p><img src="https://javainterviewpoint.com/wp-content/uploads/2019/02/Spring-Boot-Tutorial.png" width="584" height="200"></p>');