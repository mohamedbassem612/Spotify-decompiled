package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a3y0 {
    public final String a;

    public a3y0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3y0) && this.a.equals(((a3y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
