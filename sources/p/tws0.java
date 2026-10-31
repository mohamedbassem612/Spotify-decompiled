package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tws0 implements uws0 {
    public final int a;
    public final String b;

    public tws0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tws0)) {
            return false;
        }
        tws0 tws0Var = (tws0) obj;
        return this.a == tws0Var.a && this.b.equals(tws0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
