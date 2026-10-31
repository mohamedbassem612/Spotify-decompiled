package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wto {
    public final String a;
    public final List b;
    public final vto c;
    public final tto d;
    public final Object e;
    public final v6g1 f;

    public wto(String str, List list, vto vtoVar, tto ttoVar, Object obj, v6g1 v6g1Var) {
        this.a = str;
        this.b = list;
        this.c = vtoVar;
        this.d = ttoVar;
        this.e = obj;
        this.f = v6g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wto)) {
            return false;
        }
        wto wtoVar = (wto) obj;
        return u890.j(this.a, wtoVar.a) && u890.j(this.b, wtoVar.b) && u890.j(this.c, wtoVar.c) && u890.j(this.d, wtoVar.d) && u890.j(this.e, wtoVar.e) && u890.j(this.f, wtoVar.f);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        vto vtoVar = this.c;
        int iHashCode = (this.d.hashCode() + ((iB + (vtoVar == null ? 0 : vtoVar.hashCode())) * 961)) * 31;
        Object obj = this.e;
        return this.f.hashCode() + ((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public /* synthetic */ wto(String str, List list, vto vtoVar, Object obj, v6g1 v6g1Var) {
        this(str, list, vtoVar, rto.a, obj, v6g1Var);
    }
}
