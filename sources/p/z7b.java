package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z7b extends zr7 {
    public final String d;
    public final String e;
    public final String f;

    public z7b(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7b)) {
            return false;
        }
        z7b z7bVar = (z7b) obj;
        return u890.j(this.d, z7bVar.d) && u890.j(this.e, z7bVar.e) && u890.j(this.f, z7bVar.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        return Boolean.hashCode(true) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
