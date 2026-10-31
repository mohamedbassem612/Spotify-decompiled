package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cha extends fha {
    public final int a;
    public final w7g1 b;

    public cha(int i, w7g1 w7g1Var) {
        this.a = i;
        this.b = w7g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cha)) {
            return false;
        }
        cha chaVar = (cha) obj;
        return this.a == chaVar.a && this.b.equals(chaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
