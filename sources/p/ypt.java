package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ypt {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final int e;
    public final boolean f;

    public ypt(String str, String str2, String str3, ArrayList arrayList, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypt)) {
            return false;
        }
        ypt yptVar = (ypt) obj;
        return u890.j(this.a, yptVar.a) && u890.j(this.b, yptVar.b) && u890.j(this.c, yptVar.c) && this.d.equals(yptVar.d) && this.e == yptVar.e && this.f == yptVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + kaa0.f(this.e, p3d1.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
    }
}
