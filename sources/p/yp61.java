package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yp61 implements bq61 {
    public final ir61 a;

    public yp61(ir61 ir61Var) {
        this.a = ir61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yp61) && this.a.equals(((yp61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
