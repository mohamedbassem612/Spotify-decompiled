package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bye implements nye {
    public final String a;
    public final String b;
    public final tom c;
    public final boolean d;
    public final boolean e;

    public bye(String str, String str2, tom tomVar, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = tomVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bye)) {
            return false;
        }
        bye byeVar = (bye) obj;
        return u890.j(this.a, byeVar.a) && u890.j(this.b, byeVar.b) && this.c.equals(byeVar.c) && this.d == byeVar.d && this.e == byeVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }
}
