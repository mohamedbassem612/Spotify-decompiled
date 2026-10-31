package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s9n0 extends op71 {
    public final String c;

    public s9n0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9n0) && u890.j(this.c, ((s9n0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
