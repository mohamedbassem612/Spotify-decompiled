package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vyh1 {
    public final String a;
    public final String b;

    public vyh1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyh1)) {
            return false;
        }
        vyh1 vyh1Var = (vyh1) obj;
        return this.a.equals(vyh1Var.a) && this.b.equals(vyh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
