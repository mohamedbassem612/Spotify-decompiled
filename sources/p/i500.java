package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i500 implements y600 {
    public final String a;
    public final String b;

    public i500(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i500)) {
            return false;
        }
        i500 i500Var = (i500) obj;
        if (!u890.j(this.a, i500Var.a)) {
            return false;
        }
        String str = i500Var.b;
        nl7 nl7Var = v4t.b;
        return this.b.equals(str);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nl7 nl7Var = v4t.b;
        return this.b.hashCode() + iHashCode;
    }
}
