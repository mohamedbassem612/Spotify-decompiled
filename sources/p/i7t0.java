package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i7t0 {
    public final String a;
    public final String b;
    public final String c;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String n;
    public final String d = "";
    public final String m = "";

    public i7t0(String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, String str7, String str8, String str9, String str10, String str11) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = arrayList;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.n = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7t0)) {
            return false;
        }
        i7t0 i7t0Var = (i7t0) obj;
        return this.a.equals(i7t0Var.a) && this.b.equals(i7t0Var.b) && this.c.equals(i7t0Var.c) && this.d.equals(i7t0Var.d) && this.e.equals(i7t0Var.e) && this.f.equals(i7t0Var.f) && this.g.equals(i7t0Var.g) && this.h.equals(i7t0Var.h) && this.i.equals(i7t0Var.i) && this.j.equals(i7t0Var.j) && this.k.equals(i7t0Var.k) && this.l.equals(i7t0Var.l) && this.m.equals(i7t0Var.m) && this.n.equals(i7t0Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(f4i1.b(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }
}
