package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e8u0 extends x2p1 {
    public final String c;

    public e8u0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8u0) && u890.j(this.c, ((e8u0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
