package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class idr0 extends rrn1 {
    public final String c;

    public idr0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idr0) && u890.j(this.c, ((idr0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public /* synthetic */ idr0() {
        this("");
    }
}
