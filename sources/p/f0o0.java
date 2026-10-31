package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f0o0 implements j0o0 {
    public final String a;

    public f0o0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0o0) && u890.j(this.a, ((f0o0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
