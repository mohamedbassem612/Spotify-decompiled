package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zt80 extends sj1 {
    public final String i;

    public zt80(String str) {
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zt80) && u890.j(this.i, ((zt80) obj).i);
    }

    public final int hashCode() {
        return this.i.hashCode() - 810474083;
    }
}
