package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import p.clv;
import p.inz0;
import p.npa0;
import p.ooa0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class KeyPosition extends KeyPositionBase {
    public String g = null;
    public int h = -1;
    public int i = 0;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2p = 0;

    public KeyPosition() {
        this.d = (byte) 2;
    }

    @Override // p.ooa0
    public final void a(HashMap map) {
        throw null;
    }

    @Override // p.ooa0
    /* JADX INFO: renamed from: b */
    public final ooa0 clone() {
        KeyPosition keyPosition = new KeyPosition();
        super.c(this);
        keyPosition.g = this.g;
        keyPosition.h = this.h;
        keyPosition.i = this.i;
        keyPosition.j = this.j;
        keyPosition.k = Float.NaN;
        keyPosition.l = this.l;
        keyPosition.m = this.m;
        keyPosition.n = this.n;
        keyPosition.o = this.o;
        return keyPosition;
    }

    @Override // p.ooa0
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, inz0.g);
        SparseIntArray sparseIntArray = npa0.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = npa0.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.X1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                    }
                    break;
                case 2:
                    this.a = typedArrayObtainStyledAttributes.getInt(index, this.a);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.g = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.g = clv.d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f = typedArrayObtainStyledAttributes.getInteger(index, this.f);
                    break;
                case 5:
                    this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
                    break;
                case 6:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 7:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 8:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    this.j = f;
                    this.k = f;
                    break;
                case 9:
                    this.f2p = typedArrayObtainStyledAttributes.getInt(index, this.f2p);
                    break;
                case 10:
                    this.h = typedArrayObtainStyledAttributes.getInt(index, this.h);
                    break;
                case 11:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 12:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }
}
