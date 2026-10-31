package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hhd0 {
    public final String a;
    public final String b;

    public hhd0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhd0)) {
            return false;
        }
        hhd0 hhd0Var = (hhd0) obj;
        return this.a.equals(hhd0Var.a) && this.b.equals(hhd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
