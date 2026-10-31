package p;

import androidx.compose.ui.graphics.Brush;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eui1 extends cui1 {
    public final float N0;
    public final float X;
    public final float Y;
    public final float Z;
    public final String a;
    public final List b;
    public final int c;
    public final Brush d;
    public final float e;
    public final Brush f;
    public final float g;
    public final float h;
    public final int i;
    public final int t;

    public eui1(String str, List list, int i, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = brush;
        this.e = f;
        this.f = brush2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.t = i3;
        this.X = f4;
        this.Y = f5;
        this.Z = f6;
        this.N0 = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eui1.class != obj.getClass()) {
            return false;
        }
        eui1 eui1Var = (eui1) obj;
        return this.a.equals(eui1Var.a) && u890.j(this.d, eui1Var.d) && this.e == eui1Var.e && u890.j(this.f, eui1Var.f) && this.g == eui1Var.g && this.h == eui1Var.h && hno1.h(this.i, eui1Var.i) && kno1.p(this.t, eui1Var.t) && this.X == eui1Var.X && this.Y == eui1Var.Y && this.Z == eui1Var.Z && this.N0 == eui1Var.N0 && loo1.t(this.c, eui1Var.c) && u890.j(this.b, eui1Var.b);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        Brush brush = this.d;
        int iF = x0d.f((iB + (brush != null ? brush.hashCode() : 0)) * 31, 31, this.e);
        Brush brush2 = this.f;
        return loo1.w(this.c) + x0d.f(x0d.f(x0d.f(x0d.f((kno1.x(this.t) + ((hno1.j(this.i) + x0d.f(x0d.f((iF + (brush2 != null ? brush2.hashCode() : 0)) * 31, 31, this.g), 31, this.h)) * 31)) * 31, 31, this.X), 31, this.Y), 31, this.Z), 31, this.N0);
    }
}
