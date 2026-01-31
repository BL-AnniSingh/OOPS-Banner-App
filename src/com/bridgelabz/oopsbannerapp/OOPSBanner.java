package com.bridgelabz.oopsbannerapp;

public class OOPSBanner {

    // Inner class representing a Letter pattern
    class Letter {
        private String[] pattern;

        public Letter(String[] pattern) {
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        OOPSBanner banner = new OOPSBanner();

        // Creating Letter objects using inner class
        Letter O = banner.new Letter(new String[] {
                "   ******   ",
                " **      ** ",
                "**        **",
                "**        **",
                "**        **",
                " **      ** ",
                "   ******   "
        });

        Letter P = banner.new Letter(new String[] {
                "********    ",
                "**      **  ",
                "**      **  ",
                "********    ",
                "**          ",
                "**          ",
                "**          "
        });

        Letter S = banner.new Letter(new String[] {
                "   ******   ",
                " **         ",
                "**          ",
                "   ******   ",
                "        **  ",
                "        **  ",
                "   ******   "
        });

        String[] oPattern = O.getPattern();
        String[] pPattern = P.getPattern();
        String[] sPattern = S.getPattern();

        // Print OOPS banner
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + "  " +   // O
                            oPattern[i] + "  " +   // O
                            pPattern[i] + "  " +   // P
                            sPattern[i]            // S
            );
        }
    }
}
