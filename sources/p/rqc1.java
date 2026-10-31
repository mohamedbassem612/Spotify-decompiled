package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rqc1 extends sqc1 {
    public final String a;

    public rqc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqc1) && this.a.equals(((rqc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
