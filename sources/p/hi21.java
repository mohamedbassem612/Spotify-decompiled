package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hi21 extends si21 {
    public final String a;

    public hi21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hi21) && this.a.equals(((hi21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
