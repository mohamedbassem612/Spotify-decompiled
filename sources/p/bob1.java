package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bob1 {
    public final f3f1 a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final b3f1 h;
    public final wkc1 i;
    public final List j;
    public final wkc1 k;

    public /* synthetic */ bob1(f3f1 f3f1Var, String str, String str2, b3f1 b3f1Var, wkc1 wkc1Var, ArrayList arrayList, int i) {
        this(f3f1Var, str, false, true, false, (i & 32) != 0 ? null : str2, true, b3f1Var, (i & 256) != 0 ? new wkc1("default", "default", "EVO") : wkc1Var, (i & 512) != 0 ? z6x.a : arrayList);
    }

    public static bob1 a(bob1 bob1Var, f3f1 f3f1Var, String str, boolean z, boolean z2, String str2, List list, int i) {
        if ((i & 1) != 0) {
            f3f1Var = bob1Var.a;
        }
        return new bob1(f3f1Var, (i & 2) != 0 ? bob1Var.b : str, (i & 4) != 0 ? bob1Var.c : z, bob1Var.d, (i & 16) != 0 ? bob1Var.e : z2, (i & 32) != 0 ? bob1Var.f : str2, bob1Var.g, bob1Var.h, bob1Var.i, (i & 512) != 0 ? bob1Var.j : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bob1)) {
            return false;
        }
        bob1 bob1Var = (bob1) obj;
        return u890.j(this.a, bob1Var.a) && u890.j(this.b, bob1Var.b) && this.c == bob1Var.c && this.d == bob1Var.d && this.e == bob1Var.e && u890.j(this.f, bob1Var.f) && this.g == bob1Var.g && this.h == bob1Var.h && u890.j(this.i, bob1Var.i) && u890.j(this.j, bob1Var.j);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iG2 = xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        b3f1 b3f1Var = this.h;
        return this.j.hashCode() + ((this.i.hashCode() + ((iG2 + (b3f1Var != null ? b3f1Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "isOnline: " + this.c + "\nisContentFirstLoad: " + this.d + "\ndsaModeEnabled: " + this.e + "\nhighlightedChipId: " + this.f + "\ndefaultSubFeedType: " + poo1.G(this.i.c) + "\nselectedFilter: " + this.k;
    }

    public bob1(f3f1 f3f1Var, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, b3f1 b3f1Var, wkc1 wkc1Var, List list) {
        this.a = f3f1Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str2;
        this.g = z4;
        this.h = b3f1Var;
        this.i = wkc1Var;
        this.j = list;
        c3f1 c3f1VarB = f3f1.b(f3f1Var.b);
        this.k = c3f1VarB != null ? r1p1.k(c3f1VarB) : wkc1Var;
    }
}
