package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q500 implements y600 {
    public final uas0 a;

    public q500(uas0 uas0Var) {
        this.a = uas0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q500) && this.a.equals(((q500) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
