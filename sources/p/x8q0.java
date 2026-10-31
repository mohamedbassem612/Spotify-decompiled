package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x8q0 implements a9q0 {
    public final String a;

    public x8q0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8q0) && this.a.equals(((x8q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
