package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z1j0 implements a2j0 {
    public final String a;

    public z1j0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1j0) && u890.j(this.a, ((z1j0) obj).a);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
