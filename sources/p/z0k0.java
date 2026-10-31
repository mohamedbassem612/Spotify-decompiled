package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z0k0 implements a1k0 {
    public final String a;

    public z0k0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0k0) && u890.j(this.a, ((z0k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
