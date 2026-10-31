package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v2j1 implements w2j1 {
    public final String a;

    public v2j1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2j1) && this.a.equals(((v2j1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
