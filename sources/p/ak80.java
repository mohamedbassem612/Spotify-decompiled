package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ak80 {
    public final ug60 a;

    public ak80(ug60 ug60Var) {
        this.a = ug60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak80) && this.a.equals(((ak80) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.a);
    }
}
