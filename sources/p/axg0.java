package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class axg0 extends z0o1 {
    public final String c;

    public axg0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axg0) && u890.j(this.c, ((axg0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
