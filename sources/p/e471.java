package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e471 extends hyo1 {
    public final hux c;

    public e471(hux huxVar) {
        this.c = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e471) && this.c.equals(((e471) obj).c);
    }

    public final int hashCode() {
        return Integer.hashCode(2131103927) + (this.c.hashCode() * 31);
    }
}
