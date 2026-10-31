package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x200 implements y600 {
    public final String a;
    public final String b;

    public x200(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x200)) {
            return false;
        }
        x200 x200Var = (x200) obj;
        if (!u890.j(this.a, x200Var.a)) {
            return false;
        }
        String str = x200Var.b;
        nl7 nl7Var = ges0.b;
        return this.b.equals(str);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nl7 nl7Var = ges0.b;
        return this.b.hashCode() + iHashCode;
    }
}
