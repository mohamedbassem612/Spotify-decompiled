package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mpe implements npe {
    public final String a;
    public final boolean b;

    public mpe(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpe)) {
            return false;
        }
        mpe mpeVar = (mpe) obj;
        return this.a.equals(mpeVar.a) && this.b == mpeVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
