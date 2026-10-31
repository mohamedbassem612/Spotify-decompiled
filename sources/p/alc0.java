package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class alc0 extends pwo1 {
    public final String b;

    public alc0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof alc0) && this.b.equals(((alc0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
