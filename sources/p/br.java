package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class br implements dr {
    public final String a;
    public final String b;
    public final boolean c;

    public br(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br)) {
            return false;
        }
        br brVar = (br) obj;
        return u890.j(this.a, brVar.a) && u890.j(this.b, brVar.b) && this.c == brVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
