package p;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rmr0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public rmr0(int i, int i2) {
        this.a = Color.red(i);
        this.b = Color.green(i);
        this.c = Color.blue(i);
        this.d = i;
        this.e = i2;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        int i = this.d;
        int iG = uah.g(-1, i, 4.5f);
        int iG2 = uah.g(-1, i, 3.0f);
        if (iG != -1 && iG2 != -1) {
            this.h = uah.l(-1, iG);
            this.g = uah.l(-1, iG2);
            this.f = true;
            return;
        }
        int iG3 = uah.g(-16777216, i, 4.5f);
        int iG4 = uah.g(-16777216, i, 3.0f);
        if (iG3 == -1 || iG4 == -1) {
            this.h = iG != -1 ? uah.l(-1, iG) : uah.l(-16777216, iG3);
            this.g = iG2 != -1 ? uah.l(-1, iG2) : uah.l(-16777216, iG4);
            this.f = true;
        } else {
            this.h = uah.l(-16777216, iG3);
            this.g = uah.l(-16777216, iG4);
            this.f = true;
        }
    }

    public final float[] b() {
        float[] fArr = this.i;
        if (fArr == null) {
            fArr = new float[3];
            this.i = fArr;
        }
        uah.b(this.a, this.b, this.c, fArr);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rmr0.class == obj.getClass()) {
            rmr0 rmr0Var = (rmr0) obj;
            if (this.e == rmr0Var.e && this.d == rmr0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(rmr0.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
