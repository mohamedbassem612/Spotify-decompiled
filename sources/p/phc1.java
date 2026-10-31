package p;

import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class phc1 extends DrawStyle {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final uw4 e;

    public phc1(float f, float f2, int i, int i2, uw4 uw4Var, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        uw4Var = (i3 & 16) != 0 ? null : uw4Var;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = uw4Var;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final float c() {
        return this.b;
    }

    public final uw4 d() {
        return this.e;
    }

    public final float e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phc1)) {
            return false;
        }
        phc1 phc1Var = (phc1) obj;
        return this.a == phc1Var.a && this.b == phc1Var.b && this.c == phc1Var.c && this.d == phc1Var.d && u890.j(this.e, phc1Var.e);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.d, kaa0.f(this.c, x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31), 31);
        uw4 uw4Var = this.e;
        return iF + (uw4Var != null ? uw4Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = "Unknown";
        int i = this.c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        StringBuilder sbM = gvg.m("Stroke(width=", this.a, ", miter=", this.b, ", cap=");
        bb00.j(sbM, str, ", join=", str2, ", pathEffect=");
        sbM.append(this.e);
        sbM.append(")");
        return sbM.toString();
    }
}
