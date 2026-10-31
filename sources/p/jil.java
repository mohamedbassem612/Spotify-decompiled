package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jil {
    public static final SparseIntArray o;
    public boolean a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public float n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        o = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(jil jilVar) {
        this.a = jilVar.a;
        this.b = jilVar.b;
        this.c = jilVar.c;
        this.d = jilVar.d;
        this.e = jilVar.e;
        this.f = jilVar.f;
        this.g = jilVar.g;
        this.h = jilVar.h;
        this.i = jilVar.i;
        this.j = jilVar.j;
        this.k = jilVar.k;
        this.l = jilVar.l;
        this.m = jilVar.m;
        this.n = jilVar.n;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, inz0.s);
        this.a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (o.get(index)) {
                case 1:
                    this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                    break;
                case 2:
                    this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 3:
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 4:
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 5:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 6:
                    this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 7:
                    this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                    break;
                case 8:
                    this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 9:
                    this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 10:
                    this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                    break;
                case 11:
                    this.m = true;
                    this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 12:
                    this.i = kil.p(typedArrayObtainStyledAttributes, index, this.i);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
