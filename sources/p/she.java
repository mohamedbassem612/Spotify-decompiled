package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class she {
    public final String a;

    public she(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof she) && this.a.equals(((she) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
