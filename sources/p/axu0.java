package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class axu0 {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final String e;
    public final lik1 f;

    public axu0(String str, ArrayList arrayList, String str2, String str3, String str4, lik1 lik1Var) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = lik1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axu0)) {
            return false;
        }
        axu0 axu0Var = (axu0) obj;
        if (!u890.j(this.a, axu0Var.a) || !this.b.equals(axu0Var.b) || !this.c.equals(axu0Var.c) || !u890.j(this.d, axu0Var.d)) {
            return false;
        }
        w7x w7xVar = w7x.a;
        return w7xVar.equals(w7xVar) && w7xVar.equals(w7xVar) && this.e.equals(axu0Var.e) && u890.j(this.f, axu0Var.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d(p3d1.f(this.b, this.a.hashCode() * 961, 31), 29791, this.c), 29791, this.d), 31, this.e), 31, false);
    }
}
