package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ykp0 extends x9p1 {
    public final String c;

    public ykp0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ykp0) && u890.j(this.c, ((ykp0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
