package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cy3 implements ey3 {
    public final String a;

    public cy3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cy3) && this.a.equals(((cy3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
