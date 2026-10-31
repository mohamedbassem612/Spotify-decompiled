package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jbb implements vbb {
    public final i3f0 a;

    public jbb(i3f0 i3f0Var) {
        this.a = i3f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbb) && this.a.equals(((jbb) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((bk8.d.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
