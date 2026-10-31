package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hsz0 implements isz0 {
    public final boolean a;

    public hsz0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hsz0) && this.a == ((hsz0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
