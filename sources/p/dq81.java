package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dq81 extends eq81 {
    public final fo81 a;

    public dq81(fo81 fo81Var) {
        this.a = fo81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq81) && this.a.equals(((dq81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
