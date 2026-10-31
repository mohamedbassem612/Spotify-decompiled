package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eni0 {
    public final String a;
    public final String b;

    public eni0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eni0)) {
            return false;
        }
        eni0 eni0Var = (eni0) obj;
        return this.a.equals(eni0Var.a) && this.b.equals(eni0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
