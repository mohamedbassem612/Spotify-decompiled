package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mvp0 {
    public final String a;
    public final int b;

    public mvp0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvp0)) {
            return false;
        }
        mvp0 mvp0Var = (mvp0) obj;
        return this.a.equals(mvp0Var.a) && this.b == mvp0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
