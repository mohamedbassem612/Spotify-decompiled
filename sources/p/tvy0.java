package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tvy0 extends mgo1 {
    public final String c;

    public tvy0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tvy0) && this.c.equals(((tvy0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
