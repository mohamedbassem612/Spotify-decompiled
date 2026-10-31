package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class um3 extends ym3 {
    public final wub1 a;

    public um3(wub1 wub1Var) {
        this.a = wub1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um3) && u890.j(this.a, ((um3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
