package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mri1 {
    public final String a;
    public final String b;

    public mri1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mri1)) {
            return false;
        }
        mri1 mri1Var = (mri1) obj;
        return u890.j(this.a, mri1Var.a) && u890.j(this.b, mri1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
