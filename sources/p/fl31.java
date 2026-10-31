package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fl31 {
    public final int a;
    public final String b;

    public fl31(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl31)) {
            return false;
        }
        fl31 fl31Var = (fl31) obj;
        return this.a == fl31Var.a && u890.j(this.b, fl31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
