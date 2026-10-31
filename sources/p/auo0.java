package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class auo0 extends puo0 {
    public final vuo0 a;

    public auo0(vuo0 vuo0Var) {
        this.a = vuo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof auo0) && this.a.equals(((auo0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(1000L) + (this.a.hashCode() * 31);
    }
}
