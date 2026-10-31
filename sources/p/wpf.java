package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wpf {
    public final String a;
    public final byte b;
    public final vzq0 c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public /* synthetic */ wpf(String str, int i, vzq0 vzq0Var, List list, boolean z, boolean z2, int i2) {
        this(str, i, vzq0Var, (i2 & 8) != 0 ? z6x.a : list, false, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? true : z2);
    }

    public static wpf a(wpf wpfVar, ArrayList arrayList, boolean z, boolean z2, int i) {
        String str = wpfVar.a;
        byte b = wpfVar.b;
        vzq0 vzq0Var = wpfVar.c;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = wpfVar.d;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            z2 = wpfVar.f;
        }
        return new wpf(str, b, vzq0Var, list2, z, z2, wpfVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpf)) {
            return false;
        }
        wpf wpfVar = (wpf) obj;
        return u890.j(this.a, wpfVar.a) && this.b == wpfVar.b && u890.j(this.c, wpfVar.c) && u890.j(this.d, wpfVar.d) && this.e == wpfVar.e && this.f == wpfVar.f && this.g == wpfVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g(f4i1.b((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wpf(String str, int i, vzq0 vzq0Var, List list, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = i;
        this.c = vzq0Var;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }
}
