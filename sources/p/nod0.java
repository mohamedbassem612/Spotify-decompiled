package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nod0 extends i2p1 {
    public final String c;

    public nod0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nod0) && u890.j(this.c, ((nod0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
