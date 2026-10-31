package p;

import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jx3 {
    public final String a;
    public final String b;
    public final boolean c;
    public final ti d;
    public final EnumSet e;

    public jx3(String str, String str2, boolean z, ti tiVar, EnumSet enumSet) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = tiVar;
        this.e = enumSet;
    }

    public final String a() {
        return this.b;
    }

    public final ti b() {
        return this.d;
    }

    public final boolean c(String str, String str2) {
        sw21 sw21Var;
        Object next;
        if (!this.b.equals(str2)) {
            return false;
        }
        Iterator it = sw21.f.iterator();
        do {
            sw21Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((sw21) next).a.equals(str));
        sw21 sw21Var2 = (sw21) next;
        if (sw21Var2 == null) {
            n57.e("No resource found for name: ".concat(str));
        } else {
            sw21Var = sw21Var2;
        }
        return this.e.contains(sw21Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx3)) {
            return false;
        }
        jx3 jx3Var = (jx3) obj;
        return this.a.equals(jx3Var.a) && this.b.equals(jx3Var.b) && this.c == jx3Var.c && this.d.equals(jx3Var.d) && this.e.equals(jx3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
