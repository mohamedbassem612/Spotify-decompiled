package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y23 implements d33 {
    public final String a;
    public final String b;

    public y23(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y23)) {
            return false;
        }
        y23 y23Var = (y23) obj;
        return this.a.equals(y23Var.a) && u890.j(this.b, y23Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
