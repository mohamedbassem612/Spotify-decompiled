package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qg8 extends byo1 {
    public final String c;

    public qg8(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qg8) && this.c.equals(((qg8) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
