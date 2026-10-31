package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tnf1 {
    public final String a;
    public final String b;

    public tnf1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnf1)) {
            return false;
        }
        tnf1 tnf1Var = (tnf1) obj;
        return this.a.equals(tnf1Var.a) && this.b.equals(tnf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
