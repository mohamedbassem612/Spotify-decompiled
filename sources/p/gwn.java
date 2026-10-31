package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gwn implements jwn {
    public final String a;
    public final String b;
    public final List c;
    public final dwn d;
    public final Map e;
    public final boolean f;
    public final Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ gwn(int i, String str, String str2) {
        String str3 = (i & 1) != 0 ? "" : str;
        String str4 = (i & 2) != 0 ? "" : str2;
        cwn cwnVar = cwn.a;
        z6x z6xVar = z6x.a;
        b7x b7xVar = b7x.a;
        this(str3, str4, z6xVar, cwnVar, b7xVar, false, b7xVar);
    }

    public static gwn h(gwn gwnVar, String str, List list, dwn dwnVar, Map map, boolean z, Map map2, int i) {
        String str2 = str;
        String str3 = gwnVar.a;
        if ((i & 2) != 0) {
            str2 = gwnVar.b;
        }
        if ((i & 4) != 0) {
            list = gwnVar.c;
        }
        if ((i & 8) != 0) {
            dwnVar = gwnVar.d;
        }
        if ((i & 16) != 0) {
            map = gwnVar.e;
        }
        if ((i & 32) != 0) {
            z = gwnVar.f;
        }
        if ((i & 64) != 0) {
            map2 = gwnVar.g;
        }
        Map map3 = map2;
        boolean z2 = z;
        Map map4 = map;
        dwn dwnVar2 = dwnVar;
        return new gwn(str3, str2, list, dwnVar2, map4, z2, map3);
    }

    @Override // p.jwn
    public final Map a() {
        return this.e;
    }

    @Override // p.jwn
    public final String b() {
        return this.b;
    }

    @Override // p.jwn
    public final boolean c() {
        return this.f;
    }

    @Override // p.jwn
    public final List d() {
        return this.c;
    }

    @Override // p.jwn
    public final Map e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwn)) {
            return false;
        }
        gwn gwnVar = (gwn) obj;
        return u890.j(this.a, gwnVar.a) && u890.j(this.b, gwnVar.b) && u890.j(this.c, gwnVar.c) && u890.j(this.d, gwnVar.d) && u890.j(this.e, gwnVar.e) && this.f == gwnVar.f && u890.j(this.g, gwnVar.g);
    }

    @Override // p.jwn
    public final String f() {
        return this.a;
    }

    @Override // p.jwn
    public final dwn g() {
        return this.d;
    }

    public final int hashCode() {
        return this.g.hashCode() + xcg1.g(cy30.e((this.d.hashCode() + f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public gwn(String str, String str2, List list, dwn dwnVar, Map map, boolean z, Map map2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = dwnVar;
        this.e = map;
        this.f = z;
        this.g = map2;
    }
}
