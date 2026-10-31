package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class znx0 extends box0 {
    public final boolean a;

    public znx0(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof znx0) && this.a == ((znx0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
