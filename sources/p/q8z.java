package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q8z extends qpn1 {
    public final String c;

    public q8z(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8z) && u890.j(this.c, ((q8z) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String y() {
        return this.c;
    }
}
