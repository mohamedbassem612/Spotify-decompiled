package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mh60 implements vh60 {
    public final String a;
    public final Exception b;

    public mh60(String str, Exception exc) {
        this.a = str;
        this.b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh60)) {
            return false;
        }
        mh60 mh60Var = (mh60) obj;
        return this.a.equals(mh60Var.a) && this.b.equals(mh60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
