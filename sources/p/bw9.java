package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bw9 extends h4p1 {
    public final String c;

    public bw9(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bw9) && this.c.equals(((bw9) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
