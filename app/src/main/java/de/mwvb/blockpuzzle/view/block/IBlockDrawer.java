package de.mwvb.blockpuzzle.view.block;

import android.graphics.Canvas;

public interface IBlockDrawer {

    void draw(Canvas canvas, float tx, float ty, float p, int br, float f);
}
