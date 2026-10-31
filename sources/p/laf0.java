package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class laf0 extends xaf0 {
    public final String a;

    public laf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof laf0) && this.a.equals(((laf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
