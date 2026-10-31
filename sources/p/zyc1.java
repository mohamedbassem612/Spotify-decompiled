package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zyc1 {
    public final int a;
    public final String b;

    public zyc1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyc1)) {
            return false;
        }
        zyc1 zyc1Var = (zyc1) obj;
        return this.a == zyc1Var.a && u890.j(this.b, zyc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
