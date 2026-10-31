package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v0f1 extends z0f1 {
    public final String a;

    public v0f1(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0f1) && this.a.equals(((v0f1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
