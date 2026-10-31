package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zv9 extends h4p1 {
    public final String c;

    public zv9(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv9) && this.c.equals(((zv9) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
