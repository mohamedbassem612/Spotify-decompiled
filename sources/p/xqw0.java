package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xqw0 implements brw0 {
    public final cav a;

    public xqw0(cav cavVar) {
        this.a = cavVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqw0) && this.a.equals(((xqw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
