package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rxl implements uxl {
    public final yvh a;

    public rxl(yvh yvhVar) {
        this.a = yvhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxl) && this.a.equals(((rxl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
