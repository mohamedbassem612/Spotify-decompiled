package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uhn0 extends whn0 {
    public final shn0 a;

    public uhn0(shn0 shn0Var) {
        this.a = shn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uhn0) && this.a == ((uhn0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
