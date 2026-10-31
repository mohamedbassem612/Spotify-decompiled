package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e070 {
    public final d070 a;

    public e070(d070 d070Var) {
        this.a = d070Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e070) && this.a.equals(((e070) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
