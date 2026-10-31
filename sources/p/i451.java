package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i451 extends j451 {
    public final String a;

    public i451(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i451) && this.a.equals(((i451) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
