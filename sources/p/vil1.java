package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vil1 extends tm80 {
    public final int d;
    public final String e;
    public final String f;

    public vil1(int i, String str, String str2) {
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vil1)) {
            return false;
        }
        vil1 vil1Var = (vil1) obj;
        return this.d == vil1Var.d && this.e.equals(vil1Var.e) && this.f.equals(vil1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(Integer.hashCode(this.d) * 31, 31, this.e);
    }
}
