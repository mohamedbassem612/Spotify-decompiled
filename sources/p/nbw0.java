package p;

import com.google.protobuf.Duration;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nbw0 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Duration h;
    public final long i;
    public final String j;
    public final String k;
    public final int l;
    public final gab0 m;
    public final ArrayList n;
    public final aj90 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tyl f78p;
    public final int q;

    public nbw0(String str, String str2, String str3, String str4, String str5, String str6, String str7, Duration duration, long j, String str8, String str9, int i, gab0 gab0Var, ArrayList arrayList, aj90 aj90Var, tyl tylVar, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = duration;
        this.i = j;
        this.j = str8;
        this.k = str9;
        this.l = i;
        this.m = gab0Var;
        this.n = arrayList;
        this.o = aj90Var;
        this.f78p = tylVar;
        this.q = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbw0)) {
            return false;
        }
        nbw0 nbw0Var = (nbw0) obj;
        return this.a.equals(nbw0Var.a) && this.b.equals(nbw0Var.b) && this.c.equals(nbw0Var.c) && this.d.equals(nbw0Var.d) && this.e.equals(nbw0Var.e) && this.f.equals(nbw0Var.f) && this.g.equals(nbw0Var.g) && this.h.equals(nbw0Var.h) && this.i == nbw0Var.i && this.j.equals(nbw0Var.j) && this.k.equals(nbw0Var.k) && this.l == nbw0Var.l && this.m.equals(nbw0Var.m) && this.n.equals(nbw0Var.n) && this.o.equals(nbw0Var.o) && this.f78p.equals(nbw0Var.f78p) && this.q == nbw0Var.q;
    }

    public final int hashCode() {
        return l1d.C(this.q) + ((this.f78p.hashCode() + ((this.o.hashCode() + p3d1.f(this.n, (this.m.hashCode() + ab80.k(this.l, cy30.d(cy30.d(cy30.f((this.h.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, this.i, 31), 31, this.j), 31, this.k), 31)) * 31, 31)) * 31)) * 31);
    }
}
