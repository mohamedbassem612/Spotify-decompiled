package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wlb1 implements lmb1 {
    public final String a;
    public final List b;
    public final kp80 c;
    public final Set d;
    public final List e;
    public final Set f;

    public wlb1(String str, List list, kp80 kp80Var, Set set, List list2, Set set2) {
        this.a = str;
        this.b = list;
        this.c = kp80Var;
        this.d = set;
        this.e = list2;
        this.f = set2;
    }

    @Override // p.gob1
    public final String a() {
        return this.a;
    }

    @Override // p.lmb1
    public final kp80 b() {
        return this.c;
    }

    @Override // p.lmb1
    public final Set c() {
        return this.f;
    }

    @Override // p.lmb1
    public final List d() {
        return this.e;
    }

    @Override // p.lmb1
    public final Set e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlb1)) {
            return false;
        }
        wlb1 wlb1Var = (wlb1) obj;
        return this.a.equals(wlb1Var.a) && u890.j(this.b, wlb1Var.b) && this.c.equals(wlb1Var.c) && this.d.equals(wlb1Var.d) && u890.j(this.e, wlb1Var.e) && u890.j(this.f, wlb1Var.f);
    }

    @Override // p.lmb1
    public final List getData() {
        return this.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + f4i1.b(gvg.c((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }
}
