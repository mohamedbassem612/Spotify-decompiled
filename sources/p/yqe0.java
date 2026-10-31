package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yqe0 extends pap1 {
    public final String c;

    public yqe0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqe0) && this.c.equals(((yqe0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
