package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x541 {
    public final String a;
    public final String b;

    public x541(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x541)) {
            return false;
        }
        x541 x541Var = (x541) obj;
        return this.a.equals(x541Var.a) && this.b.equals(x541Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
