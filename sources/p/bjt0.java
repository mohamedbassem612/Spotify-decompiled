package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bjt0 extends ljt0 {
    public final tv80 a;

    public bjt0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bjt0) && this.a.equals(((bjt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
