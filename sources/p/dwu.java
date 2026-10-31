package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dwu implements hwu {
    public final String a;
    public final String b;

    public dwu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwu)) {
            return false;
        }
        dwu dwuVar = (dwu) obj;
        return u890.j(this.a, dwuVar.a) && this.b.equals(dwuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
