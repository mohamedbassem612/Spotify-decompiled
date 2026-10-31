package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iew0 implements kew0 {
    public final i091 a;

    public iew0(i091 i091Var) {
        this.a = i091Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iew0) && u890.j(this.a, ((iew0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
