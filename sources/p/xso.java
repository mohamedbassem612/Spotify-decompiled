package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xso extends zso {
    public static final xso b = new xso("");

    private Object readResolve() {
        return b;
    }

    @Override // p.zso
    /* JADX INFO: renamed from: a */
    public final int compareTo(zso zsoVar) {
        return zsoVar == this ? 0 : -1;
    }

    @Override // p.zso
    public final void b(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // p.zso
    public final void c(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // p.zso, java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((zso) obj) == this ? 0 : -1;
    }

    @Override // p.zso
    public final Comparable d() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // p.zso
    public final boolean e(Comparable comparable) {
        return true;
    }

    @Override // p.zso
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }
}
