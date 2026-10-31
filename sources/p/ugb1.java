package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ugb1 extends wgb1 {
    public final wkt a;

    public ugb1(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugb1) && this.a.equals(((ugb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
