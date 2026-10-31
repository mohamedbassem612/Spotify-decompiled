package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t9b1 {
    public final dlb a;

    public t9b1(dlb dlbVar) {
        this.a = dlbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9b1) && this.a.equals(((t9b1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
