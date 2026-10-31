package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nie {
    public final String a;

    public nie(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nie) && this.a.equals(((nie) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
