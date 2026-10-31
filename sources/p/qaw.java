package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qaw extends f0o1 {
    public final String c;

    public qaw(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qaw) && this.c.equals(((qaw) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
