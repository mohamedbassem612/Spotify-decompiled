package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sm3 extends ym3 {
    public final ip41 a;

    public sm3(ip41 ip41Var) {
        this.a = ip41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm3) && this.a.equals(((sm3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
