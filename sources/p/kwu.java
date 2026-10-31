package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kwu extends lwu {
    public final le20 a;

    public kwu(le20 le20Var) {
        this.a = le20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kwu) && this.a.equals(((kwu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
