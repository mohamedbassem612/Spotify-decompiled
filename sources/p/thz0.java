package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class thz0 extends ulo1 {
    public final String c;

    public thz0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof thz0) && u890.j(this.c, ((thz0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
