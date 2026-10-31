package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tgn implements ugn {
    public final boolean a;

    public tgn(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tgn) && this.a == ((tgn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
