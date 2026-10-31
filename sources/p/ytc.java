package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ytc {
    public final String a;
    public final String b;
    public final String c;
    public final vsc d;
    public final ArrayList e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ytc(String str, String str2, String str3, vsc vscVar, ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = vscVar;
        this.e = arrayList;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytc)) {
            return false;
        }
        ytc ytcVar = (ytc) obj;
        return u890.j(this.a, ytcVar.a) && u890.j(this.b, ytcVar.b) && this.c.equals(ytcVar.c) && this.d.equals(ytcVar.d) && this.e.equals(ytcVar.e) && this.f == ytcVar.f && this.g == ytcVar.g && this.h == ytcVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g(p3d1.f(this.e, (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31), 31, this.f), 31, this.g);
    }
}
