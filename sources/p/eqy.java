package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eqy {
    public final String a;

    public eqy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqy) && this.a.equals(((eqy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
