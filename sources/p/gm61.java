package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gm61 {
    public final String a;

    public gm61(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm61) && this.a.equals(((gm61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
