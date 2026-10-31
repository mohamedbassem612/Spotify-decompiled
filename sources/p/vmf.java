package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vmf {
    public final String a;
    public final String b;
    public final String c;
    public final iu30 d;
    public final String e;

    public vmf(String str, String str2, String str3, String str4, iu30 iu30Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = iu30Var;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmf)) {
            return false;
        }
        vmf vmfVar = (vmf) obj;
        return this.a.equals(vmfVar.a) && this.b.equals(vmfVar.b) && this.c.equals(vmfVar.c) && this.d.equals(vmfVar.d) && this.e.equals(vmfVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ktd.g(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
