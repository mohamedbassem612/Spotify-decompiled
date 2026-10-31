package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yp80 extends jap1 {
    public final int c;
    public final String d;

    public yp80(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp80)) {
            return false;
        }
        yp80 yp80Var = (yp80) obj;
        return this.c == yp80Var.c && u890.j(this.d, yp80Var.d);
    }

    public final int hashCode() {
        int iC = l1d.C(this.c) * 31;
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ yp80() {
        this(1, null);
    }
}
