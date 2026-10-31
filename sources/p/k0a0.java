package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k0a0 implements l0a0 {
    public final String a;

    public k0a0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0a0) && u890.j(this.a, ((k0a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
