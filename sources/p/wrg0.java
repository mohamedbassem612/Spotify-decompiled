package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wrg0 extends vzn1 {
    public final String c;

    public wrg0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrg0) && u890.j(this.c, ((wrg0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
