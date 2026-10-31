package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class drq0 {
    public final e7t0 a;
    public final jja b;
    public final p60 c;
    public final kyh1 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final List j;
    public final z811 k;

    public drq0(e7t0 e7t0Var, jja jjaVar, p60 p60Var, kyh1 kyh1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList arrayList, z811 z811Var, int i) {
        int i2 = i & 1;
        ArrayList arrayList2 = z6x.a;
        e7t0 e7t0Var2 = i2 != 0 ? new e7t0("", false, "", "", arrayList2, new p60(null, null, null, null, null, 0.0f, null, null, null, 0, null, null, 4095), arrayList2) : e7t0Var;
        jja jjaVar2 = (i & 2) != 0 ? new jja(null, null, 15) : jjaVar;
        p60 p60Var2 = (i & 4) != 0 ? new p60(null, null, null, null, null, 0.0f, null, null, null, 0, null, null, 4095) : p60Var;
        kyh1 kyh1Var2 = (i & 8) != 0 ? new kyh1() : kyh1Var;
        boolean z6 = (i & 16) != 0 ? false : z;
        boolean z7 = (i & 64) != 0 ? false : z2;
        boolean z8 = (i & 128) != 0 ? false : z3;
        boolean z9 = (i & 256) != 0 ? false : z4;
        boolean z10 = (i & 512) == 0 ? z5 : false;
        arrayList2 = (i & 1024) == 0 ? arrayList : arrayList2;
        z811 z811Var2 = (i & 2048) == 0 ? z811Var : null;
        this.a = e7t0Var2;
        this.b = jjaVar2;
        this.c = p60Var2;
        this.d = kyh1Var2;
        this.e = z6;
        this.f = z7;
        this.g = z8;
        this.h = z9;
        this.i = z10;
        this.j = arrayList2;
        this.k = z811Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drq0)) {
            return false;
        }
        drq0 drq0Var = (drq0) obj;
        return this.a.equals(drq0Var.a) && this.b.equals(drq0Var.b) && this.c.equals(drq0Var.c) && this.d.equals(drq0Var.d) && this.e == drq0Var.e && this.f == drq0Var.f && this.g == drq0Var.g && this.h == drq0Var.h && this.i == drq0Var.i && this.j.equals(drq0Var.j) && u890.j(this.k, drq0Var.k);
    }

    public final int hashCode() {
        int iB = f4i1.b(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, false), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        z811 z811Var = this.k;
        return iB + (z811Var != null ? z811Var.hashCode() : 0);
    }
}
