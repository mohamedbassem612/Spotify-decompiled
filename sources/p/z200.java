package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z200 implements y600 {
    public final String a;
    public final String b;

    public z200(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z200)) {
            return false;
        }
        z200 z200Var = (z200) obj;
        if (!u890.j(this.a, z200Var.a)) {
            return false;
        }
        String str = z200Var.b;
        nl7 nl7Var = jes0.b;
        return this.b.equals(str);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nl7 nl7Var = jes0.b;
        return this.b.hashCode() + iHashCode;
    }
}
