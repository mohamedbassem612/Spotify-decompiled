package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class szz implements t600 {
    public final int a;
    public final p111 b;

    public szz(int i, p111 p111Var) {
        this.a = i;
        this.b = p111Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szz)) {
            return false;
        }
        szz szzVar = (szz) obj;
        return this.a == szzVar.a && this.b.equals(szzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
