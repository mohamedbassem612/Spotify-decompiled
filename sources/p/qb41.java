package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class qb41 implements Update {
    public static final qb41 a = new qb41();

    public final Next a(Object obj, Object obj2) {
        ArrayList arrayList;
        Set set;
        yb41 yb41Var;
        int i;
        ArrayList arrayList2;
        wb41 wb41VarA = (wb41) obj;
        pb41 pb41Var = (pb41) obj2;
        boolean z = pb41Var instanceof hb41;
        Set set2 = w7x.a;
        yb41 yb41Var2 = yb41.NOTHING;
        z6x z6xVar = z6x.a;
        yb41 yb41Var3 = yb41.UPLOAD_IMAGE;
        yb41 yb41Var4 = yb41.GET_CORE_PROFILE_DATA;
        if (!z) {
            if (pb41Var instanceof db41) {
                return Next.i(wb41.a(wb41VarA, 1, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, z6xVar, z6xVar, yb41Var2, 8388606), wb41VarA.r == yb41Var3 ? Collections.singleton(new ya41("")) : set2);
            }
            if (pb41Var instanceof ob41) {
                ob41 ob41Var = (ob41) pb41Var;
                return ob41Var.a.length() == 0 ? Next.h(wb41.a(wb41VarA, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862)) : u9x0.k(wb41.a(wb41VarA, 0, 0.0f, ob41Var.a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108859), set2);
            }
            if (pb41Var instanceof fb41) {
                fb41 fb41Var = (fb41) pb41Var;
                String str = fb41Var.c;
                String str2 = fb41Var.b;
                if (!fb41Var.a) {
                    return Next.h(wb41.a(wb41VarA, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
                }
                wb41 wb41VarA2 = wb41.a(wb41VarA, 0, 0.0f, null, null, str2, str, null, null, null, null, null, null, null, null, null, null, null, null, 67108815);
                if (wb41VarA2.r == yb41Var4) {
                    return u9x0.k(wb41.a(wb41VarA2, 0, 0.0f, null, null, null, null, str2, str, null, null, null, null, null, null, null, null, null, null, 67107327), set2);
                }
                return u9x0.g(wb41VarA2) ? u9x0.k(wb41VarA2, Collections.singleton(new pa41(false))) : Next.h(wb41VarA2);
            }
            if (pb41Var instanceof nb41) {
                nb41 nb41Var = (nb41) pb41Var;
                if (!nb41Var.a) {
                    return Next.h(wb41.a(wb41VarA, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
                }
                String str3 = nb41Var.b;
                if (str3 != null) {
                    return str3.length() > 0 ? u9x0.k(wb41.a(wb41VarA, 0, 0.0f, null, nb41Var.b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108855), set2) : Next.h(wb41.a(wb41VarA, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
                }
                return Next.h(u9x0.m(wb41VarA, nb41Var.c));
            }
            if (pb41Var instanceof jb41) {
                return ((jb41) pb41Var).a ? u9x0.k(wb41VarA, set2) : Next.h(wb41.a(wb41VarA, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
            }
            if (pb41Var instanceof gb41) {
                return ((gb41) pb41Var).a ? u9x0.k(wb41VarA, set2) : Next.h(wb41.a(wb41VarA, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
            }
            if (pb41Var instanceof ib41) {
                return ((ib41) pb41Var).a ? u9x0.k(wb41VarA, set2) : Next.h(wb41.a(wb41VarA, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
            }
            if (pb41Var instanceof mb41) {
                return ((mb41) pb41Var).a ? u9x0.k(wb41VarA, set2) : Next.h(wb41.a(wb41VarA, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
            }
            if (pb41Var instanceof eb41) {
                if (((eb41) pb41Var).a) {
                    return u9x0.k(wb41VarA, set2);
                }
                return u9x0.g(wb41VarA) ? u9x0.k(wb41VarA, Collections.singleton(new pa41(false))) : Next.h(wb41VarA);
            }
            if (pb41Var instanceof lb41) {
                return ((lb41) pb41Var).a ? u9x0.k(wb41VarA, set2) : Next.h(wb41.a(wb41VarA, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
            }
            if (pb41Var instanceof kb41) {
                return ((kb41) pb41Var).a ? u9x0.k(wb41VarA, set2) : Next.h(wb41.a(wb41VarA, 3, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862));
            }
            eg.o();
            return null;
        }
        hb41 hb41Var = (hb41) pb41Var;
        if (wb41VarA.a == 2) {
            return Next.j();
        }
        ArrayList arrayList3 = new ArrayList();
        if (wb41VarA.c.length() == 0) {
            arrayList3.add(yb41.GET_USERNAME);
        }
        arrayList3.add(yb41Var4);
        if (hb41Var.a != null) {
            arrayList3.add(yb41.SET_DISPLAY_NAME);
            i = 2;
            set = set2;
            yb41Var = yb41Var3;
            arrayList = arrayList3;
            wb41VarA = wb41.a(wb41VarA, 0, 0.0f, null, null, null, null, null, null, hb41Var.a, null, null, null, null, null, null, null, null, null, 67043327);
        } else {
            arrayList = arrayList3;
            set = set2;
            yb41Var = yb41Var3;
            i = 2;
        }
        wb41 wb41VarA3 = wb41VarA;
        if (hb41Var.c == null && hb41Var.d == null && hb41Var.e == null) {
            arrayList2 = arrayList;
        } else {
            arrayList2 = arrayList;
            arrayList2.add(yb41.SET_PROFILE_DETAILS);
            wb41VarA3 = wb41.a(wb41VarA3, 0, 0.0f, null, null, null, null, null, null, null, null, null, null, hb41Var.c, hb41Var.d, hb41Var.e, null, null, null, 59768831);
        }
        wb41 wb41VarA4 = wb41VarA3;
        String str4 = hb41Var.b;
        if (str4 != null) {
            if (str4.length() == 0) {
                arrayList2.add(yb41.REMOVE_IMAGE);
                wb41VarA4 = wb41.a(wb41VarA4, 0, 0.0f, null, null, null, null, null, null, null, "", null, null, null, null, null, null, null, null, 66977791);
            } else {
                arrayList2.add(yb41Var);
                arrayList2.add(yb41.SET_IMAGE);
                wb41VarA4 = wb41.a(wb41VarA4, 0, 0.0f, null, null, null, null, null, null, null, hb41Var.b, null, null, null, null, null, null, null, null, 66977791);
            }
        }
        wb41 wb41VarA5 = wb41VarA4;
        if (hb41Var.f != null) {
            arrayList2.add(yb41.SET_KIDS_COLOR);
            wb41VarA5 = wb41.a(wb41VarA5, 0, 0.0f, null, null, null, null, null, null, null, null, hb41Var.f, null, null, null, null, null, null, null, 66846719);
        }
        wb41 wb41VarA6 = wb41VarA5;
        if (hb41Var.g != null) {
            arrayList2.add(yb41.SET_KIDS_AVATAR);
            wb41VarA6 = wb41.a(wb41VarA6, 0, 0.0f, null, null, null, null, null, null, null, null, null, hb41Var.g, null, null, null, null, null, null, 66584575);
        }
        arrayList2.add(yb41.CONFIRM_CHANGES);
        return u9x0.k(wb41.a(wb41VarA6, i, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList2, z6xVar, yb41Var2, 8388606), set);
    }
}
