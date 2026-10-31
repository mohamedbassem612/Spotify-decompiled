package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qio extends two1 {
    public final String c;

    public qio(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qio) && this.c.equals(((qio) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
