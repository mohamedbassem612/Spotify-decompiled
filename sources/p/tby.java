package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tby implements vby {
    public final boolean a;

    public tby(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tby) && this.a == ((tby) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
