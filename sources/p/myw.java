package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class myw extends mgo1 {
    public final int c;

    public myw(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof myw) && this.c == ((myw) obj).c;
    }

    public final int hashCode() {
        return l1d.C(this.c);
    }
}
