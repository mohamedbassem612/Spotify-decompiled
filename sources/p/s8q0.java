package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s8q0 implements w8q0 {
    public final String a;

    public s8q0(String str) {
        this.a = str;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8q0) && this.a.equals(((s8q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
