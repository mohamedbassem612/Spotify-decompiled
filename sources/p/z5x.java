package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z5x implements i980 {
    public final boolean a;

    public z5x(boolean z) {
        this.a = z;
    }

    @Override // p.i980
    public final pdo0 b() {
        return null;
    }

    @Override // p.i980
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return gvg.k(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }
}
