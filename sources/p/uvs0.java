package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uvs0 implements vvs0 {
    public final int a;
    public final String b;

    public uvs0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvs0)) {
            return false;
        }
        uvs0 uvs0Var = (uvs0) obj;
        return this.a == uvs0Var.a && u890.j(this.b, uvs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
