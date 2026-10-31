package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g1q0 implements j1q0 {
    public final String a;

    public g1q0(String str) {
        this.a = str;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1q0) && u890.j(this.a, ((g1q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
