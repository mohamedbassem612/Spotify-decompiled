package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v9h0 implements cah0 {
    public final String a;

    public v9h0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9h0) && this.a.equals(((v9h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
