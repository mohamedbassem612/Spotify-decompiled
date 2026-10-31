package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rw3 extends rqt0 {
    public final String i;

    public rw3(String str) {
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rw3) && u890.j(this.i, ((rw3) obj).i);
    }

    public final int hashCode() {
        return this.i.hashCode();
    }
}
