package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h6g0 extends n6g0 {
    public final String a;

    public h6g0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h6g0) && this.a.equals(((h6g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
