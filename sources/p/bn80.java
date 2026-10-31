package p;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bn80 {
    public final String a;
    public final List b;
    public final String c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final Set g;
    public final List h;

    public bn80(String str, List list, String str2, List list2, boolean z, boolean z2, Set set, List list3) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = list2;
        this.e = z;
        this.f = z2;
        this.g = set;
        this.h = list3;
    }

    public static bn80 a(bn80 bn80Var, String str, ArrayList arrayList, String str2, List list, boolean z, boolean z2, LinkedHashSet linkedHashSet, List list2, int i) {
        if ((i & 1) != 0) {
            str = bn80Var.a;
        }
        String str3 = str;
        List list3 = arrayList;
        if ((i & 2) != 0) {
            list3 = bn80Var.b;
        }
        List list4 = list3;
        if ((i & 4) != 0) {
            str2 = bn80Var.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = bn80Var.d;
        }
        List list5 = list;
        if ((i & 16) != 0) {
            z = bn80Var.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = bn80Var.f;
        }
        return new bn80(str3, list4, str4, list5, z3, z2, (i & 64) != 0 ? bn80Var.g : linkedHashSet, (i & 128) != 0 ? bn80Var.h : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn80)) {
            return false;
        }
        bn80 bn80Var = (bn80) obj;
        return u890.j(this.a, bn80Var.a) && u890.j(this.b, bn80Var.b) && u890.j(this.c, bn80Var.c) && u890.j(this.d, bn80Var.d) && this.e == bn80Var.e && this.f == bn80Var.f && u890.j(this.g, bn80Var.g) && this.h.equals(bn80Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + gvg.c(xcg1.g(xcg1.g(f4i1.b(cy30.d(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
