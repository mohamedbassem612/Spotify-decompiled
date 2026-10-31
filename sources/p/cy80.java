package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cy80 implements iy80 {
    public final String a;

    public cy80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cy80) && this.a.equals(((cy80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
