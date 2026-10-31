package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bes0 implements ces0 {
    public final String a;
    public final String b;

    public bes0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bes0)) {
            return false;
        }
        bes0 bes0Var = (bes0) obj;
        return this.a.equals(bes0Var.a) && this.b.equals(bes0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
