package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kqd {
    public final boolean a;
    public final String b;

    public kqd(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqd)) {
            return false;
        }
        kqd kqdVar = (kqd) obj;
        return this.a == kqdVar.a && this.b.equals(kqdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
