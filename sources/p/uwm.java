package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uwm {
    public final String a;
    public final String b;

    public uwm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwm)) {
            return false;
        }
        uwm uwmVar = (uwm) obj;
        return u890.j(this.a, uwmVar.a) && u890.j(this.b, uwmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
