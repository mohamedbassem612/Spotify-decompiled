package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xwf implements ywf {
    public final String a;

    public xwf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xwf) && this.a.equals(((xwf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
