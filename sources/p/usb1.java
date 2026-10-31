package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class usb1 implements yue1 {
    public final String a;
    public final pks0 b;
    public final Map c;
    public final String d;
    public final int e;
    public final boolean f;

    public usb1(String str, pks0 pks0Var, Map map, String str2, int i, boolean z) {
        this.a = str;
        this.b = pks0Var;
        this.c = map;
        this.d = str2;
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usb1)) {
            return false;
        }
        usb1 usb1Var = (usb1) obj;
        return this.a.equals(usb1Var.a) && this.b.equals(usb1Var.b) && this.c.equals(usb1Var.c) && this.d.equals(usb1Var.d) && this.e == usb1Var.e && this.f == usb1Var.f;
    }

    @Override // p.yue1
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ab80.k(this.e, cy30.d(cy30.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31);
    }
}
