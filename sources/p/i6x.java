package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i6x extends sio1 {
    public final String c;

    public i6x(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6x) && u890.j(this.c, ((i6x) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(false) * 31);
    }
}
