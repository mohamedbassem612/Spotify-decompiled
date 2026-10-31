package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tyw extends qgo1 {
    public final String c;

    public tyw(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyw) && u890.j(this.c, ((tyw) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
