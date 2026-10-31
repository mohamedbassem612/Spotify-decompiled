package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mrm implements nrm {
    public final w4i1 a;
    public final String b;
    public final String c;
    public final boolean d;
    public final vy30 e;
    public final iu30 f;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
    }

    public mrm(w4i1 w4i1Var, String str, String str2, boolean z, vy30 vy30Var, iu30 iu30Var) {
        this.a = w4i1Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = vy30Var;
        this.f = iu30Var;
    }

    @Override // p.nrm
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrm)) {
            return false;
        }
        mrm mrmVar = (mrm) obj;
        return u890.j(this.a, mrmVar.a) && u890.j(this.b, mrmVar.b) && u890.j(this.c, mrmVar.c) && this.d == mrmVar.d && u890.j(this.e, mrmVar.e) && u890.j(this.f, mrmVar.f);
    }

    @Override // p.nrm
    public final w4i1 getSender() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31);
    }

    @Override // p.nrm
    public final String y() {
        return this.c;
    }

    @Override // p.nrm
    public final boolean z() {
        return this.d;
    }
}
