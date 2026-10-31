package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e1q0 implements j1q0 {
    public final String a;
    public final String b;

    public e1q0(String str) {
        this.a = str;
        this.b = str;
    }

    @Override // p.j1q0
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1q0) && u890.j(this.a, ((e1q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
