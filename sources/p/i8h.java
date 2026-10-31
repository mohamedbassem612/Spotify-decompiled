package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i8h extends r4p1 {
    public final String c;

    public i8h(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8h) && this.c.equals(((i8h) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
