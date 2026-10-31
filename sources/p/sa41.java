package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sa41 extends ha71 {
    public final String c;

    public sa41(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa41) && u890.j(this.c, ((sa41) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
