package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class og2 implements sg2 {
    public final tg2 a;

    public og2(tg2 tg2Var) {
        this.a = tg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof og2) && this.a.equals(((og2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
