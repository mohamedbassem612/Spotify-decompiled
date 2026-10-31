package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class men implements ugn {
    public final boolean a;

    public men(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof men) && this.a == ((men) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
