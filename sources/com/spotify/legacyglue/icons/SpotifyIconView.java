package com.spotify.legacyglue.icons;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.WeakHashMap;
import p.a8o;
import p.b2u;
import p.b8k1;
import p.g4b1;
import p.j4b1;
import p.umz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Deprecated
public final class SpotifyIconView extends AppCompatImageView {
    public static final int[] f = {R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius};
    public j4b1 d;
    public final g4b1 e;

    /* JADX WARN: Multi-variable type inference failed */
    public SpotifyIconView(Context context, AttributeSet attributeSet, int i) {
        g4b1 g4b1Var;
        super(context, attributeSet, i);
        this.d = j4b1.ALBUM;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, umz0.a, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i2 != -1) {
            this.d = j4b1.T7[i2];
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(1, -1.0f);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f, i, 0);
        float f2 = typedArrayObtainStyledAttributes2.getFloat(3, 0.0f);
        float f3 = typedArrayObtainStyledAttributes2.getFloat(1, 0.0f);
        float f4 = typedArrayObtainStyledAttributes2.getFloat(2, 0.0f);
        int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (dimension != -1.0f) {
            g4b1Var = new g4b1(getContext(), this.d, dimension);
            this.e = g4b1Var;
        } else {
            g4b1Var = new g4b1(getContext(), this.d, a8o.y(32.0f, getResources()));
            this.e = g4b1Var;
        }
        g4b1Var.c(colorStateList == null ? ColorStateList.valueOf(-1) : colorStateList);
        setImageDrawable(g4b1Var);
        g4b1Var.g.setShadowLayer(f2, f3, f4, color);
        g4b1Var.invalidateSelf();
        if (isInEditMode()) {
            return;
        }
        b2u.o(this).a();
    }

    public void setColor(int i) {
        this.e.b(i);
    }

    public void setColorStateList(ColorStateList colorStateList) {
        this.e.c(colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIcon(j4b1 j4b1Var) {
        this.d = j4b1Var;
        g4b1 g4b1Var = this.e;
        g4b1Var.a = j4b1Var;
        g4b1Var.f();
        g4b1Var.g();
        g4b1Var.invalidateSelf();
        WeakHashMap weakHashMap = b8k1.a;
        postInvalidateOnAnimation();
    }

    public void setImageBitmap(Bitmap bitmap) {
        throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
    }

    public void setImageResource(int i) {
        throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
    }

    public g4b1 getDrawable() {
        return this.e;
    }

    public SpotifyIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpotifyIconView(Context context) {
        this(context, null);
    }
}
