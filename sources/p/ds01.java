package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ds01 extends vxo1 {
    public final lv01 c;

    public ds01(lv01 lv01Var) {
        this.c = lv01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ds01) && this.c.equals(((ds01) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
