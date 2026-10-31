package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mjd1 implements tjd1 {
    public final String a;

    public mjd1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mjd1) && this.a.equals(((mjd1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
