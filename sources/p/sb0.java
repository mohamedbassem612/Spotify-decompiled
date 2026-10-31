package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sb0 extends tb0 implements rb0 {
    public final l560 a;

    public sb0(l560 l560Var) {
        this.a = l560Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sb0) && this.a.equals(((sb0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
