package p;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ina1 implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public ina1(int i) {
        int iR = mp10.r(10);
        this.b = new int[iR];
        this.c = new Object[iR];
    }

    public final void a(int i, ColorStateList colorStateList) {
        int i2 = this.d;
        if (i2 != 0 && i <= this.b[i2 - 1]) {
            e(i, colorStateList);
            return;
        }
        if (this.a && i2 >= this.b.length) {
            dio1.l(this);
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int iR = mp10.r(i3 + 1);
            this.b = Arrays.copyOf(this.b, iR);
            this.c = Arrays.copyOf(this.c, iR);
        }
        this.b[i3] = i;
        this.c[i3] = colorStateList;
        this.d = i3 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ina1 clone() {
        ina1 ina1Var = (ina1) super.clone();
        ina1Var.b = (int[]) this.b.clone();
        ina1Var.c = (Object[]) this.c.clone();
        return ina1Var;
    }

    public final int d(int i) {
        if (this.a) {
            dio1.l(this);
        }
        return this.b[i];
    }

    public final void e(int i, Object obj) {
        int iJ = mp10.j(this.d, i, this.b);
        if (iJ >= 0) {
            this.c[iJ] = obj;
            return;
        }
        int i2 = ~iJ;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == dio1.a) {
                this.b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            dio1.l(this);
            i2 = ~mp10.j(this.d, i, this.b);
        }
        int i4 = this.d;
        if (i4 >= this.b.length) {
            int iR = mp10.r(i4 + 1);
            this.b = Arrays.copyOf(this.b, iR);
            this.c = Arrays.copyOf(this.c, iR);
        }
        int i5 = this.d;
        if (i5 - i2 != 0) {
            int[] iArr = this.b;
            int i6 = i2 + 1;
            f46.P(i6, i2, i5, iArr, iArr);
            Object[] objArr2 = this.c;
            f46.Q(i6, i2, this.d, objArr2, objArr2);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public final int g() {
        if (this.a) {
            dio1.l(this);
        }
        return this.d;
    }

    public final Object h(int i) {
        if (this.a) {
            dio1.l(this);
        }
        Object[] objArr = this.c;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            Object objH = h(i2);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
