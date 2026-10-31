package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cry {
    public final String a;
    public final String b;

    public cry(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cry)) {
            return false;
        }
        cry cryVar = (cry) obj;
        return u890.j(this.a, cryVar.a) && u890.j(this.b, cryVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
