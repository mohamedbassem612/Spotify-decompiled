package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yso extends zso {
    @Override // p.zso
    public final void b(StringBuilder sb) {
        sb.append('[');
        sb.append(this.a);
    }

    @Override // p.zso
    public final void c(StringBuilder sb) {
        sb.append(this.a);
        sb.append(')');
    }

    @Override // p.zso
    public final boolean e(Comparable comparable) {
        pqz0 pqz0Var = pqz0.c;
        return this.a.compareTo(comparable) <= 0;
    }

    @Override // p.zso
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\\" + this.a + "/";
    }
}
