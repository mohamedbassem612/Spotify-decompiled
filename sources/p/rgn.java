package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rgn implements ugn {
    public final boolean a;

    public rgn(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgn) && this.a == ((rgn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
