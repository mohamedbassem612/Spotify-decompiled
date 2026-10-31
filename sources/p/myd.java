package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class myd extends qyd {
    public final String a;
    public final int b;

    public myd(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myd)) {
            return false;
        }
        myd mydVar = (myd) obj;
        return this.a.equals(mydVar.a) && this.b == mydVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
