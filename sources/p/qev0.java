package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qev0 implements uev0 {
    public final bev0 a;

    public qev0(bev0 bev0Var) {
        this.a = bev0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qev0) && this.a.equals(((qev0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
