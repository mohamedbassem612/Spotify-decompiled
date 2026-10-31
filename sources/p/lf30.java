package p;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lf30 {
    public static final ajn0 e = ajn0.g("<root>");
    public final String a;
    public transient kf30 b;
    public transient lf30 c;
    public transient ajn0 d;

    static {
        Pattern.compile("\\.");
    }

    public lf30(String str, lf30 lf30Var, ajn0 ajn0Var) {
        this.a = str;
        this.c = lf30Var;
        this.d = ajn0Var;
    }

    public static final List f(lf30 lf30Var) {
        if (lf30Var.c()) {
            return new ArrayList();
        }
        List listF = f(lf30Var.e());
        listF.add(lf30Var.g());
        return listF;
    }

    public final lf30 a(ajn0 ajn0Var) {
        String strB;
        if (c()) {
            strB = ajn0Var.b();
        } else {
            strB = this.a + '.' + ajn0Var.b();
        }
        strB.getClass();
        return new lf30(strB, this, ajn0Var);
    }

    public final void b() {
        String str = this.a;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z) {
                break;
            }
            if (cCharAt == '`') {
                z = !z;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length >= 0) {
            this.d = ajn0.d(str.substring(length + 1));
            this.c = new lf30(str.substring(0, length));
        } else {
            this.d = ajn0.d(str);
            this.c = kf30.c.a;
        }
    }

    public final boolean c() {
        return this.a.length() == 0;
    }

    public final boolean d() {
        return this.b != null || ihc1.v0(this.a, '<', 0, 6) < 0;
    }

    public final lf30 e() {
        lf30 lf30Var = this.c;
        if (lf30Var != null) {
            return lf30Var;
        }
        if (c()) {
            eg.m("root");
            return null;
        }
        b();
        lf30 lf30Var2 = this.c;
        lf30Var2.getClass();
        return lf30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lf30) {
            return u890.j(this.a, ((lf30) obj).a);
        }
        return false;
    }

    public final ajn0 g() {
        ajn0 ajn0Var = this.d;
        if (ajn0Var != null) {
            return ajn0Var;
        }
        if (c()) {
            eg.m("root");
            return null;
        }
        b();
        ajn0 ajn0Var2 = this.d;
        ajn0Var2.getClass();
        return ajn0Var2;
    }

    public final boolean h(ajn0 ajn0Var) {
        if (!c()) {
            String str = this.a;
            int iV0 = ihc1.v0(str, '.', 0, 6);
            if (iV0 == -1) {
                iV0 = str.length();
            }
            String strB = ajn0Var.b();
            if (iV0 == strB.length() && str.regionMatches(0, strB, 0, iV0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final kf30 i() {
        kf30 kf30Var = this.b;
        if (kf30Var != null) {
            return kf30Var;
        }
        kf30 kf30Var2 = new kf30(this);
        this.b = kf30Var2;
        return kf30Var2;
    }

    public final String toString() {
        return c() ? e.b() : this.a;
    }

    public lf30(String str) {
        this.a = str;
    }

    public lf30(String str, kf30 kf30Var) {
        this.a = str;
        this.b = kf30Var;
    }
}
