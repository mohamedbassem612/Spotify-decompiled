package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ghn0 extends cgj1 {
    public final String c;

    public ghn0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ghn0) && u890.j(this.c, ((ghn0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
