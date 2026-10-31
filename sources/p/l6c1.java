package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l6c1 {
    public final int a;
    public final String b;

    public l6c1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6c1)) {
            return false;
        }
        l6c1 l6c1Var = (l6c1) obj;
        return this.a == l6c1Var.a && u890.j(this.b, l6c1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
