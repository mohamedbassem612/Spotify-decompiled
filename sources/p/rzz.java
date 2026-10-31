package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rzz implements t600 {
    public final int a;
    public final p111 b;

    public rzz(int i, p111 p111Var) {
        this.a = i;
        this.b = p111Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzz)) {
            return false;
        }
        rzz rzzVar = (rzz) obj;
        return this.a == rzzVar.a && this.b.equals(rzzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
