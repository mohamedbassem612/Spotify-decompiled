package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gld0 implements hld0 {
    public final String a;

    public gld0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gld0) && this.a.equals(((gld0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
