package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j151 extends q151 {
    public final String a;

    public j151(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j151) && this.a.equals(((j151) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
