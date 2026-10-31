package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wdj0 extends ydj0 {
    public final String a;
    public final dio1 b;

    public wdj0(String str, dio1 dio1Var) {
        this.a = str;
        this.b = dio1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdj0)) {
            return false;
        }
        wdj0 wdj0Var = (wdj0) obj;
        return this.a.equals(wdj0Var.a) && this.b.equals(wdj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
