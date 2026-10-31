package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l7y {
    public final String a;

    public l7y(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7y) && this.a.equals(((l7y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
