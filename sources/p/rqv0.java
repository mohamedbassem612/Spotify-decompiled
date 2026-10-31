package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rqv0 implements sqv0 {
    public final String a;

    public rqv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqv0) && this.a.equals(((rqv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
