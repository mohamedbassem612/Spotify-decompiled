package p;

/* JADX INFO: renamed from: p.new, reason: invalid class name */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class Cnew extends q0o1 {
    public final String c;

    public Cnew(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cnew) && u890.j(this.c, ((Cnew) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
