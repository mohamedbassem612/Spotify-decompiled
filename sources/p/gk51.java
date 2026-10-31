package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gk51 {
    public final String a;

    public gk51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gk51) && this.a.equals(((gk51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
