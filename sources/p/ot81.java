package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ot81 {
    public final String a;
    public final String b;

    public ot81(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot81)) {
            return false;
        }
        ot81 ot81Var = (ot81) obj;
        return this.a.equals(ot81Var.a) && this.b.equals(ot81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
