package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iil {
    public boolean a;
    public int b;
    public int c;
    public float d;
    public float e;

    public final void a(iil iilVar) {
        this.a = iilVar.a;
        this.b = iilVar.b;
        this.d = iilVar.d;
        this.e = iilVar.e;
        this.c = iilVar.c;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, inz0.p);
        this.a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.b);
                this.b = i2;
                this.b = kil.h[i2];
            } else if (index == 4) {
                this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
            } else if (index == 3) {
                this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
