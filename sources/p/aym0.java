package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aym0 implements cym0 {
    public final gax a;

    public aym0(gax gaxVar) {
        this.a = gaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aym0) && this.a.equals(((aym0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
