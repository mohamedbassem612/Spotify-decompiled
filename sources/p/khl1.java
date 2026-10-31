package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class khl1 extends jme {
    public final String c;

    public khl1(String str) {
        super(str.concat("_first_time"), 2131963849);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khl1) && u890.j(this.c, ((khl1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
