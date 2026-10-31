package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vjy extends yjy {
    public final long a;
    public final float b;

    public vjy(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjy)) {
            return false;
        }
        vjy vjyVar = (vjy) obj;
        return this.a == vjyVar.a && Float.compare(this.b, vjyVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
