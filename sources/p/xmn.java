package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xmn {
    public final mmn a;
    public final int b;
    public final vrv0 c;
    public final snn d;

    public xmn(mmn mmnVar, int i, vrv0 vrv0Var, snn snnVar) {
        this.a = mmnVar;
        this.b = i;
        this.c = vrv0Var;
        this.d = snnVar;
    }

    public final mmn a() {
        return this.a;
    }

    public final vrv0 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmn)) {
            return false;
        }
        xmn xmnVar = (xmn) obj;
        return this.a.equals(xmnVar.a) && this.b == xmnVar.b && u890.j(this.c, xmnVar.c) && this.d.equals(xmnVar.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        vrv0 vrv0Var = this.c;
        return this.d.hashCode() + ((iF + (vrv0Var == null ? 0 : vrv0Var.hashCode())) * 31);
    }
}
