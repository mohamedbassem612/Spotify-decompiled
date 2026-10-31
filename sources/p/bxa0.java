package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bxa0 implements exa0 {
    public final boolean a;

    public bxa0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxa0) && this.a == ((bxa0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
