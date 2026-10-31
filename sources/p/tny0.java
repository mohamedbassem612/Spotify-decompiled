package p;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tny0 implements xny0, ml81 {
    public final UUID a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final mpj0 f;
    public final List g;
    public final long h;
    public final long i;
    public final long j;
    public final String k;
    public final String l;
    public final Long m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final UUID f14p;
    public final String q;

    public tny0(UUID uuid, String str, String str2, String str3, String str4, mpj0 mpj0Var, ArrayList arrayList, long j, long j2, long j3, String str5, String str6, Long l, String str7, String str8) {
        this.a = uuid;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = mpj0Var;
        this.g = arrayList;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = str5;
        this.l = str6;
        this.m = l;
        this.n = str7;
        this.o = str8;
        this.f14p = uuid;
        this.q = str;
    }

    public final qm81 a() {
        return qm81.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tny0)) {
            return false;
        }
        tny0 tny0Var = (tny0) obj;
        return u890.j(this.a, tny0Var.a) && u890.j(this.b, tny0Var.b) && u890.j(this.c, tny0Var.c) && u890.j(this.d, tny0Var.d) && u890.j(this.e, tny0Var.e) && u890.j(this.f, tny0Var.f) && u890.j(this.g, tny0Var.g) && this.h == tny0Var.h && this.i == tny0Var.i && this.j == tny0Var.j && u890.j(this.k, tny0Var.k) && u890.j(this.l, tny0Var.l) && u890.j(this.m, tny0Var.m) && u890.j(this.n, tny0Var.n) && u890.j(this.o, tny0Var.o);
    }

    public final UUID getId() {
        return this.f14p;
    }

    public final String getKey() {
        return this.q;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        mpj0 mpj0Var = this.f;
        int iHashCode = (iD + (mpj0Var == null ? 0 : mpj0Var.hashCode())) * 31;
        List list = this.g;
        int iD2 = cy30.d(cy30.f(cy30.f(cy30.f((iHashCode + (list == null ? 0 : list.hashCode())) * 31, this.h, 31), this.i, 31), this.j, 31), 31, this.k);
        String str = this.l;
        int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.m;
        int iD3 = cy30.d((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.n);
        String str2 = this.o;
        return iD3 + (str2 != null ? str2.hashCode() : 0);
    }
}
