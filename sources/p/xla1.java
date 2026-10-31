package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xla1 implements yla1 {
    public final tka0 a;

    public xla1(tka0 tka0Var) {
        this.a = tka0Var;
    }

    public final tka0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xla1) && u890.j(this.a, ((xla1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
