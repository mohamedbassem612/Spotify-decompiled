package p;

import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class gqg0 {
    public static final vnr0 a(vnr0 vnr0Var, float f) {
        kor0 kor0Var = vnr0Var.c;
        if (kor0Var instanceof jor0) {
            jor0 jor0Var = (jor0) kor0Var;
            hor0 hor0Var = jor0Var.b;
            if (hor0Var instanceof gor0) {
                gor0 gor0Var = (gor0) hor0Var;
                return vnr0.a(vnr0Var, (String) null, (lee1) null, jor0.f(jor0Var, new gor0(gor0Var.c, jch0.U(f), gor0Var.a, gor0Var.b), null, 61), 0L, 27);
            }
        }
        return vnr0Var;
    }

    public static final String b(Paragraph paragraph) {
        String strU = ror0.a(paragraph).u();
        if (paragraph.u() == 3) {
            int i = 0;
            for (Object obj : paragraph.q().u()) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                strU = nhc1.W(strU, f4i1.c(i2, "$"), ((Paragraph.TextStyle) obj).u());
                i = i2;
            }
        }
        return strU;
    }

    public static final dzo1 c(ff ffVar) {
        String str;
        if (ffVar != null && (str = ffVar.b) != null) {
            if (ihc1.y0(str)) {
                str = null;
            }
            if (str != null) {
                if (!ihc1.y0(str)) {
                    return new y50(str);
                }
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return null;
            }
        }
        return z50.c;
    }

    public static final ksl d(ff ffVar) {
        String str;
        if (ffVar != null && (str = ffVar.a) != null) {
            if (ihc1.y0(str)) {
                str = null;
            }
            if (str != null) {
                return new jsl(str);
            }
        }
        return isl.a;
    }
}
