package p;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class eca {
    public int a;
    public int b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public eca(Context context, AttributeSet attributeSet, int i, int i2) {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166695);
        blo1.m(context, attributeSet, i, i2);
        int[] iArr = omz0.d;
        blo1.n(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = dgo1.k(context, typedArrayObtainStyledAttributes, 8, dimensionPixelSize);
        this.b = Math.min(dgo1.k(context, typedArrayObtainStyledAttributes, 7, 0), this.a / 2);
        this.e = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(1, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            this.c = new int[]{ago1.o(context, 2130969030, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            this.c = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                hhg1.n("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.d = typedArrayObtainStyledAttributes.getColor(6, -1);
        } else {
            this.d = this.c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.d = ago1.m(this.d, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void a() {
    }
}
