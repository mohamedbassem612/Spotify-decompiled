package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e0k0 implements k1k0 {
    public final String a;

    public e0k0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0k0) && u890.j(this.a, ((e0k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
