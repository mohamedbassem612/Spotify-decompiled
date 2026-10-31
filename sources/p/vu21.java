package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vu21 extends wu21 {
    public final mq70 a;

    public vu21(mq70 mq70Var) {
        this.a = mq70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu21) && u890.j(this.a, ((vu21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
