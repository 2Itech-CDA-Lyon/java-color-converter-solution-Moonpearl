package com.example;

/**
 * Represents a color
 */
public class Color
{
    /**
     * Red channel value
     */
    private int red;
    /**
     * Green channel value
     */
    private int green;
    /**
     * Blue channel value
     */
    private int blue;

    /**
     * Create new color from hexadecimal string
     * @param hexString Hexadecimal string
     */
    public Color(String hexString)
    {
        red = Integer.valueOf( hexString.substring( 0, 2 ), 16 );
        green = Integer.valueOf( hexString.substring( 2, 4 ), 16 );
        blue = Integer.valueOf( hexString.substring( 4, 6 ), 16 );
    }

    /**
     * Create new color from RGB values
     * @param red Red channel value
     * @param green Green channel value
     * @param blue Blue channel value
     */
    public Color(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Get color as hexadecimal code
     * @return
     */
    public String toHex()
    {
        return String.format("#%02X%02X%02X", red, green, blue);
    }

    /**
     * Get color as rgb() code
     * @return
     */
    public String toRgbString()
    {
        return String.format("rgb(%01d, %01d, %01d)", red, green, blue);
    }
    
    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}
