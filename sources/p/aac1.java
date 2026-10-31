package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aac1 extends sio1 {
    public final String c;

    public aac1(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aac1) && u890.j(this.c, ((aac1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
