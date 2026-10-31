package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xkc extends jlc {
    public final wwo1 a;

    public xkc(wwo1 wwo1Var) {
        this.a = wwo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xkc) && this.a.equals(((xkc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
