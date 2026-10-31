package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mmk implements omk {
    public final String a;

    public mmk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mmk) && this.a.equals(((mmk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
