package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kg1 {
    public final String a;

    public kg1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kg1) && this.a.equals(((kg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
