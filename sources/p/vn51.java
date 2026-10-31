package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vn51 implements xn51 {
    public final String a;

    public vn51(String str) {
        this.a = str;
    }

    @Override // p.xn51
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn51) && this.a.equals(((vn51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
