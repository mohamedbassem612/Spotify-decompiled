package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class flk extends vlk {
    public final String a;

    public flk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof flk) && this.a.equals(((flk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
