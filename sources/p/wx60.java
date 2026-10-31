package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wx60 {
    public final ArrayList a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;

    public wx60(ArrayList arrayList, String str, boolean z, int i, String str2) {
        this.a = arrayList;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx60)) {
            return false;
        }
        wx60 wx60Var = (wx60) obj;
        return this.a.equals(wx60Var.a) && this.b.equals(wx60Var.b) && this.c == wx60Var.c && this.d == wx60Var.d && this.e.equals(wx60Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
