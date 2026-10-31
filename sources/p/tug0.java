package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/tug0;", "Lp/uim0;", "Lp/vug0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class tug0 extends uim0 {
    public final int a;
    public final int b;
    public final short c;
    public final swg0 d;
    public final float e;

    /* JADX WARN: Multi-variable type inference failed */
    public tug0(int i, int i2, int i3, swg0 swg0Var, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = swg0Var;
        this.e = f;
    }

    public final pim0 a() {
        return new vug0(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b(pim0 pim0Var) {
        vug0 vug0Var = (vug0) pim0Var;
        vug0Var.X0.setValue(this.d);
        vug0Var.Y0.setValue(new jug0(this.b));
        int i = vug0Var.O0;
        int i2 = this.a;
        short s = this.c;
        float f = this.e;
        if (i == i2 && vug0Var.P0 == 1200 && vug0Var.Q0 == s && p3v.c(vug0Var.R0, f)) {
            return;
        }
        vug0Var.O0 = i2;
        vug0Var.P0 = (short) 1200;
        vug0Var.Q0 = s;
        vug0Var.R0 = f;
        vug0Var.I1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tug0)) {
            return false;
        }
        tug0 tug0Var = (tug0) obj;
        return this.a == tug0Var.a && this.b == tug0Var.b && this.c == tug0Var.c && u890.j(this.d, tug0Var.d) && p3v.c(this.e, tug0Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + ((this.d.hashCode() + kaa0.f(this.c, kaa0.f(1200, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        String strA = jug0.a(this.b);
        String strD = p3v.d(this.e);
        StringBuilder sb = new StringBuilder("MarqueeModifierElement(iterations=");
        sb.append(this.a);
        sb.append(", animationMode=");
        sb.append(strA);
        sb.append(", delayMillis=1200, initialDelayMillis=");
        sb.append((int) this.c);
        sb.append(", spacing=");
        sb.append(this.d);
        sb.append(", velocity=");
        return l1d.n(strD, ")", sb);
    }
}
