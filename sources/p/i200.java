package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i200 extends d600 {
    public final String a;

    public i200(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i200) && this.a.equals(((i200) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
