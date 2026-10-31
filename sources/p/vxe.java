package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vxe implements nye {
    public final String a;
    public final String b;
    public final tom c;
    public final tom d;
    public final boolean e;
    public final boolean f;

    public vxe(String str, String str2, tom tomVar, tom tomVar2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = tomVar;
        this.d = tomVar2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxe)) {
            return false;
        }
        vxe vxeVar = (vxe) obj;
        return u890.j(this.a, vxeVar.a) && u890.j(this.b, vxeVar.b) && this.c.equals(vxeVar.c) && this.d.equals(vxeVar.d) && this.e == vxeVar.e && this.f == vxeVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
    }
}
