package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class web implements xeb {
    public final fjt a;
    public final String b;

    public web(fjt fjtVar, String str) {
        this.a = fjtVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof web)) {
            return false;
        }
        web webVar = (web) obj;
        return this.a == webVar.a && u890.j(this.b, webVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
