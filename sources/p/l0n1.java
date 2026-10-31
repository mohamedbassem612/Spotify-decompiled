package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l0n1 extends ern1 {
    public final String c;

    public l0n1(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0n1) && u890.j(this.c, ((l0n1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
