package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class it81 implements kt81 {
    public final String a;
    public final int b;

    public it81(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it81)) {
            return false;
        }
        it81 it81Var = (it81) obj;
        return u890.j(this.a, it81Var.a) && this.b == it81Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
