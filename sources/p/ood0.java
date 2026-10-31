package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ood0 extends i2p1 {
    public final String c;

    public ood0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ood0) && u890.j(this.c, ((ood0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
