package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oc21 implements qc21 {
    public final String a;
    public final String b;

    public oc21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc21)) {
            return false;
        }
        oc21 oc21Var = (oc21) obj;
        return u890.j(this.a, oc21Var.a) && this.b.equals(oc21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
