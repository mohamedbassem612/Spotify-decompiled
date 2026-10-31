package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class deh1 {
    public final String a;
    public final String b;

    public deh1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deh1)) {
            return false;
        }
        deh1 deh1Var = (deh1) obj;
        return this.a.equals(deh1Var.a) && this.b.equals(deh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
