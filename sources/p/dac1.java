package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dac1 extends sio1 {
    public final String c;

    public dac1(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dac1) && u890.j(this.c, ((dac1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
