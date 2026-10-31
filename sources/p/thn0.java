package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class thn0 extends whn0 {
    public final shn0 a;

    public thn0(shn0 shn0Var) {
        this.a = shn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof thn0) && this.a == ((thn0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
