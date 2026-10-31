package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l5f0 {
    public final int a;
    public final String b;

    public l5f0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5f0)) {
            return false;
        }
        l5f0 l5f0Var = (l5f0) obj;
        return this.a == l5f0Var.a && u890.j(this.b, l5f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
