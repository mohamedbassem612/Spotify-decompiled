package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kkh extends pkh {
    public final c380 b;

    public kkh(c380 c380Var) {
        super(fkh.g);
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkh) && u890.j(this.b, ((kkh) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
