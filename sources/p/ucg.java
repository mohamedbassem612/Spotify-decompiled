package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ucg extends eca {
    public int g;
    public final int h;
    public final int i;

    public ucg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 2132018785);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166689);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131166684);
        blo1.m(context, attributeSet, i, 2132018785);
        int[] iArr = omz0.i;
        blo1.n(context, attributeSet, iArr, i, 2132018785, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 2132018785);
        this.g = Math.max(dgo1.k(context, typedArrayObtainStyledAttributes, 2, dimensionPixelSize), this.a * 2);
        this.h = dgo1.k(context, typedArrayObtainStyledAttributes, 1, dimensionPixelSize2);
        this.i = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
