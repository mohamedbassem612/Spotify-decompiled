package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vso extends zso {
    public static final vso b = new vso("");

    private Object readResolve() {
        return b;
    }

    @Override // p.zso
    /* JADX INFO: renamed from: a */
    public final int compareTo(zso zsoVar) {
        return zsoVar == this ? 0 : 1;
    }

    @Override // p.zso, java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((zso) obj) == this ? 0 : 1;
    }

    @Override // p.zso
    public final Comparable d() {
        throw new IllegalStateException("range unbounded on this side");
    }

    public final String toString() {
        return "+∞";
    }
}
