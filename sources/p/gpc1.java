package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gpc1 extends wpo1 {
    public final String c;

    public gpc1(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpc1) && u890.j(this.c, ((gpc1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
