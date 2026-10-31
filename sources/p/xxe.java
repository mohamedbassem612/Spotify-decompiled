package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xxe implements nye {
    public final String a;
    public final String b;

    public xxe(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxe)) {
            return false;
        }
        xxe xxeVar = (xxe) obj;
        return u890.j(this.a, xxeVar.a) && u890.j(this.b, xxeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
