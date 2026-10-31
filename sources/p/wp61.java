package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wp61 implements bq61 {
    public final tr80 a;

    public wp61(tr80 tr80Var) {
        this.a = tr80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp61) && this.a.equals(((wp61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
