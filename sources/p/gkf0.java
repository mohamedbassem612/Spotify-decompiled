package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gkf0 extends jkf0 {
    public final int b;

    public gkf0(int i) {
        super(i);
        this.b = i;
    }

    @Override // p.jkf0
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gkf0) && this.b == ((gkf0) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }
}
