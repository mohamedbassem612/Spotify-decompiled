package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class as20 implements bs20 {
    public final evb1 a;

    public as20(evb1 evb1Var) {
        this.a = evb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as20) && this.a.equals(((as20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
