package p;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k0o0 {
    public final boolean a;
    public final Set b;
    public final Set c;
    public final List d;
    public final boolean e;
    public final uuf f;

    public k0o0(boolean z, Set set, Set set2, List list, boolean z2, uuf uufVar) {
        this.a = z;
        this.b = set;
        this.c = set2;
        this.d = list;
        this.e = z2;
        this.f = uufVar;
    }

    public static k0o0 a(k0o0 k0o0Var, boolean z, Set set, LinkedHashSet linkedHashSet, List list, boolean z2, uuf uufVar, int i) {
        if ((i & 1) != 0) {
            z = k0o0Var.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            set = k0o0Var.b;
        }
        Set set2 = set;
        Set set3 = linkedHashSet;
        if ((i & 4) != 0) {
            set3 = k0o0Var.c;
        }
        Set set4 = set3;
        if ((i & 8) != 0) {
            list = k0o0Var.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z2 = k0o0Var.e;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            uufVar = k0o0Var.f;
        }
        k0o0Var.getClass();
        return new k0o0(z3, set2, set4, list2, z4, uufVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0o0)) {
            return false;
        }
        k0o0 k0o0Var = (k0o0) obj;
        return this.a == k0o0Var.a && u890.j(this.b, k0o0Var.b) && u890.j(this.c, k0o0Var.c) && u890.j(this.d, k0o0Var.d) && this.e == k0o0Var.e && u890.j(this.f, k0o0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(f4i1.b(gvg.c(gvg.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
