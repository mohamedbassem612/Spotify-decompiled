package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r70 implements s70 {
    public final gax a;

    public r70(gax gaxVar) {
        this.a = gaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r70) && this.a.equals(((r70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
