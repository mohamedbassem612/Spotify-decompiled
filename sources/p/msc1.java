package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class msc1 {
    public final lsc1 a;
    public final u7h b;
    public final String c;
    public final boolean d;

    public msc1(lsc1 lsc1Var, u7h u7hVar, String str, boolean z) {
        this.a = lsc1Var;
        this.b = u7hVar;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msc1)) {
            return false;
        }
        msc1 msc1Var = (msc1) obj;
        return this.a.equals(msc1Var.a) && u890.j(this.b, msc1Var.b) && u890.j(this.c, msc1Var.c) && this.d == msc1Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        u7h u7hVar = this.b;
        return Boolean.hashCode(this.d) + cy30.d((iHashCode + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31, 31, this.c);
    }
}
