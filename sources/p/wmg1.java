package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wmg1 {
    public final ddz a;

    public wmg1(ddz ddzVar) {
        this.a = ddzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wmg1) && this.a.equals(((wmg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
