package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hn {
    public final String a;
    public final String b;
    public final String c;

    public hn(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn)) {
            return false;
        }
        hn hnVar = (hn) obj;
        return u890.j(this.a, hnVar.a) && u890.j(this.b, hnVar.b) && u890.j(this.c, hnVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
