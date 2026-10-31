package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m321 extends o6p1 {
    public final String c;

    public m321(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m321) && this.c.equals(((m321) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
