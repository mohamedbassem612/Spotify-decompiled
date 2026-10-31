package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x811 implements z811 {
    public final String a;
    public final String b;

    public x811(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x811)) {
            return false;
        }
        x811 x811Var = (x811) obj;
        return this.a.equals(x811Var.a) && this.b.equals(x811Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
