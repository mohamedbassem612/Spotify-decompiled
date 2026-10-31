package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tw10 extends uw10 {
    public final Object a;
    public final String b;

    public tw10(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw10)) {
            return false;
        }
        tw10 tw10Var = (tw10) obj;
        return this.a.equals(tw10Var.a) && u890.j(this.b, tw10Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
