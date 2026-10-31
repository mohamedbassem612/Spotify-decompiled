package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class epq0 extends jo31 {
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final Function0 j;

    public epq0(int i, int i2, boolean z, boolean z2, boolean z3, int i3) {
        wso0 wso0Var = wso0.W0;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = i3;
        this.j = wso0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epq0)) {
            return false;
        }
        epq0 epq0Var = (epq0) obj;
        return this.d == epq0Var.d && this.e == epq0Var.e && this.f == epq0Var.f && this.g == epq0Var.g && this.h == epq0Var.h && this.i == epq0Var.i && this.j.equals(epq0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + kaa0.f(this.i, xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.e, Integer.hashCode(this.d) * 31, 31), 31, this.f), 31, this.g), 31, this.h), 31);
    }
}
