package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jxh implements lxh {
    public final yvh a;

    public jxh(yvh yvhVar) {
        this.a = yvhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxh) && this.a.equals(((jxh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
