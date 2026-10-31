package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class exw extends gxw {
    public final String a;

    public exw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exw) && u890.j(this.a, ((exw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
