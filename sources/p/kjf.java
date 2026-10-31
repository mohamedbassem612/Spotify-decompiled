package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kjf implements mjf {
    public final String a;
    public final boolean b;

    public kjf(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjf)) {
            return false;
        }
        kjf kjfVar = (kjf) obj;
        return u890.j(this.a, kjfVar.a) && this.b == kjfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
