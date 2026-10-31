package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tik extends vik {
    public final String a;
    public final String b;

    public tik(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tik)) {
            return false;
        }
        tik tikVar = (tik) obj;
        return u890.j(this.a, tikVar.a) && this.b.equals(tikVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
