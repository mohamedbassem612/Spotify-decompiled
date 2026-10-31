package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y340 implements x3k {
    public final j3k a;

    public y340(j3k j3kVar) {
        this.a = j3kVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y340) {
            return this.a.equals(((y340) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
