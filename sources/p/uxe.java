package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uxe implements nye {
    public final String a;
    public final String b;
    public final tom c;
    public final tom d;
    public final boolean e;
    public final boolean f;

    public uxe(String str, String str2, tom tomVar, tom tomVar2, boolean z, boolean z2) {
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
        if (!(obj instanceof uxe)) {
            return false;
        }
        uxe uxeVar = (uxe) obj;
        return u890.j(this.a, uxeVar.a) && u890.j(this.b, uxeVar.b) && this.c.equals(uxeVar.c) && this.d.equals(uxeVar.d) && this.e == uxeVar.e && this.f == uxeVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
    }
}
