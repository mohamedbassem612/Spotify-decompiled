package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f8k0 implements g8k0 {
    public final String a;

    public f8k0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8k0) && u890.j(this.a, ((f8k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
