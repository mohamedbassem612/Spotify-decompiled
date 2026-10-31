package p;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class un21 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final l370 b;
    public String c;
    public k370 d;
    public final ne e = new ne((byte) 9);
    public final t360 f;
    public r8i0 g;
    public final boolean h;
    public final kqi0 i;
    public final be30 j;
    public tn21 k;

    public un21(String str, l370 l370Var, String str2, v360 v360Var, r8i0 r8i0Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = l370Var;
        this.c = str2;
        this.g = r8i0Var;
        this.h = z;
        if (v360Var != null) {
            this.f = m5n1.i(v360Var);
        } else {
            this.f = new t360();
        }
        if (z2) {
            this.j = new be30((byte) 0);
        } else if (z3) {
            kqi0 kqi0Var = new kqi0((byte) 11);
            this.i = kqi0Var;
            kqi0Var.F(kwm0.f);
        }
    }

    public final void a(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                se11 se11Var = r8i0.e;
                this.g = bmq0.w(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(l1d.m("Malformed content type: ", str2), e);
            }
        }
        t360 t360Var = this.f;
        if (!z) {
            t360Var.b(str, str2);
            return;
        }
        t360Var.getClass();
        m5n1.G(str);
        m5n1.f(t360Var, str, str2);
    }

    public final void b(String str, String str2, boolean z) {
        k370 k370Var;
        String str3 = this.c;
        if (str3 != null) {
            l370 l370Var = this.b;
            l370Var.getClass();
            try {
                k370Var = new k370();
                k370Var.f(l370Var, str3);
            } catch (IllegalArgumentException unused) {
                k370Var = null;
            }
            this.d = k370Var;
            if (k370Var == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(l370Var);
                hhg1.j(sb, ", Relative: ", this.c);
                return;
            }
            this.c = null;
        }
        k370 k370Var2 = this.d;
        if (!z) {
            k370Var2.a(str, str2);
            return;
        }
        ArrayList arrayList = k370Var2.g;
        if (arrayList == null) {
            arrayList = new ArrayList();
            k370Var2.g = arrayList;
        }
        arrayList.add(mno1.i(0, 0, 83, str, " \"'<>#&=", true));
        ArrayList arrayList2 = k370Var2.g;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? mno1.i(0, 0, 83, str2, " \"'<>#&=", true) : null);
    }
}
