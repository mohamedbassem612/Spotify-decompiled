package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j6e {
    public final String a;

    public j6e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j6e) && this.a.equals(((j6e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
