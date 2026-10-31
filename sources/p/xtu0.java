package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xtu0 {
    public final wa71 a;

    public xtu0(wa71 wa71Var) {
        this.a = wa71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xtu0) && u890.j(this.a, ((xtu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
