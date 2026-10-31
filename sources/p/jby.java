package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jby {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final Boolean g;

    public jby(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jby)) {
            return false;
        }
        jby jbyVar = (jby) obj;
        return this.a.equals(jbyVar.a) && this.b.equals(jbyVar.b) && u890.j(this.c, jbyVar.c) && this.d.equals(jbyVar.d) && this.e.equals(jbyVar.e) && this.f.equals(jbyVar.f) && this.g.equals(jbyVar.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.g.hashCode() + p3d1.f(this.f, p3d1.f(this.e, p3d1.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
    }
}
