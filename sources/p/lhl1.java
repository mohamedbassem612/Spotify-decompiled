package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lhl1 extends jme {
    public final String c;

    public lhl1(String str) {
        super(str.concat("_reminder"), 2131963848);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lhl1) && u890.j(this.c, ((lhl1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
