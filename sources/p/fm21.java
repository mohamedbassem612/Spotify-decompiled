package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fm21 implements e9j1 {
    public final String a;

    public fm21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm21) && u890.j(this.a, ((fm21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
