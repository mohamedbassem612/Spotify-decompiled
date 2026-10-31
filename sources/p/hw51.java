package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hw51 {
    public final int a;
    public final String b;

    public hw51(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw51)) {
            return false;
        }
        hw51 hw51Var = (hw51) obj;
        return this.a == hw51Var.a && this.b.equals(hw51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
