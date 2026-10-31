package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oz30 extends dug {
    public final String c;

    public oz30(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oz30) && this.c.equals(((oz30) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
