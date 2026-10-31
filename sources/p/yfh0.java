package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yfh0 {
    public final String a;
    public final String b;

    public yfh0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfh0)) {
            return false;
        }
        yfh0 yfh0Var = (yfh0) obj;
        return this.a.equals(yfh0Var.a) && this.b.equals(yfh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
