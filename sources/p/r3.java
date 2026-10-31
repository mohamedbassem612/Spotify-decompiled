package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r3 {
    public final String a;

    public r3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3) && this.a.equals(((r3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
