package p;

import android.net.Uri;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.profile.profile.proto.ProfilemodelRequest$Profile;
import java.util.Collections;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class g3x0 implements Update {
    public static final g3x0 a = new g3x0();

    public final Next a(Object obj, Object obj2) {
        String str;
        String str2;
        boolean z;
        String str3;
        LinkedHashSet linkedHashSet;
        m3x0 m3x0VarA = (m3x0) obj;
        z2x0 z2x0Var = (z2x0) obj2;
        String str4 = m3x0VarA.b;
        boolean z2 = m3x0VarA.P0;
        String str5 = m3x0VarA.a;
        if (z2x0Var instanceof u2x0) {
            boolean z3 = ((u2x0) z2x0Var).a;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            q730 q730Var = m3x0VarA.X;
            boolean zJ = u890.j(str5, str4);
            if (zJ && !z2 && !z3) {
                linkedHashSet2.add(new o1x0(str5));
            }
            if (m3x0VarA.k1 != 3) {
                if (z3) {
                    linkedHashSet2.add(new s1x0(str5, zJ));
                }
                linkedHashSet2.add(new n1x0(str5, z2));
                linkedHashSet = linkedHashSet2;
                m3x0VarA = m3x0.a(m3x0VarA, 2, null, null, false, false, false, false, 0, 0, null, false, false, null, 0, null, null, null, null, null, false, null, false, false, null, null, false, false, null, -2, 15);
            } else {
                linkedHashSet = linkedHashSet2;
                if (!u890.j(q730Var, new q730(0, 15)) && !z2) {
                    linkedHashSet.add(new p1x0(str5, q730Var, zJ));
                }
            }
            return Next.i(m3x0VarA, linkedHashSet);
        }
        if (z2x0Var instanceof v2x0) {
            return Next.a(Collections.singleton(new n1x0(str5, z2)));
        }
        if (!(z2x0Var instanceof k2x0)) {
            if (z2x0Var instanceof l2x0) {
                return Next.h(m3x0.a(m3x0VarA, 4, null, null, false, false, false, false, 0, 0, null, false, false, null, 0, null, null, null, null, null, false, null, false, false, null, null, false, false, null, -2, 15));
            }
            if (z2x0Var instanceof s2x0) {
                s2x0 s2x0Var = (s2x0) z2x0Var;
                return Next.h(m3x0.a(m3x0VarA, 0, s2x0Var.a, s2x0Var.b, s2x0Var.c, false, false, false, 0, 0, null, false, false, null, 0, s2x0Var.d, s2x0Var.e, s2x0Var.f, null, s2x0Var.g, false, null, false, false, null, null, false, false, null, -5111865, 15));
            }
            if (z2x0Var instanceof t2x0) {
                return Next.h(m3x0.a(m3x0VarA, 4, null, null, false, false, false, false, 0, 0, null, false, false, null, 0, null, null, null, null, null, false, null, false, false, null, null, false, false, null, -2, 15));
            }
            if (z2x0Var instanceof n2x0) {
                n2x0 n2x0Var = (n2x0) z2x0Var;
                return Next.h(m3x0.a(m3x0VarA, 0, n2x0Var.a, n2x0Var.b, n2x0Var.c, false, false, false, 0, 0, null, false, false, null, 0, null, null, null, null, null, false, null, false, false, null, null, false, false, null, -57, 15));
            }
            if (z2x0Var instanceof o2x0) {
                return Next.j();
            }
            if (z2x0Var instanceof p2x0) {
                return Next.h(m3x0.a(m3x0VarA, 3, null, null, false, false, false, false, 0, 0, ((p2x0) z2x0Var).a, false, false, null, 0, null, null, null, null, null, false, null, false, false, null, null, false, false, null, -2050, 15));
            }
            if (z2x0Var instanceof q2x0) {
                return Next.h(m3x0.a(m3x0VarA, 0, null, null, false, false, false, false, 0, 0, null, false, false, null, 0, null, null, null, null, null, false, null, ((q2x0) z2x0Var).a, false, null, null, false, false, null, -33554433, 15));
            }
            if (z2x0Var instanceof r2x0) {
                r2x0 r2x0Var = (r2x0) z2x0Var;
                return Next.h(m3x0.a(m3x0VarA, 0, null, null, false, false, false, false, 0, 0, null, false, false, null, 0, null, null, null, null, null, false, null, false, false, Boolean.valueOf(r2x0Var.a), r2x0Var.b, false, false, null, 1073741823, 15));
            }
            if (z2x0Var instanceof x2x0) {
                String str6 = ((x2x0) z2x0Var).a;
                String str7 = m3x0VarA.j1;
                if (str7 == null) {
                    str7 = "";
                }
                return Next.a(Effects.a(new u1x0[]{new u1x0(nhc1.W(str6, "{uri}", str7))}));
            }
            if (z2x0Var instanceof y2x0) {
                String str8 = ((y2x0) z2x0Var).a;
                return str8.equals(Uri.EMPTY.toString()) ? Next.j() : Next.h(m3x0.a(m3x0VarA, 0, null, null, false, false, false, false, 0, 0, null, false, false, str8, 0, null, null, null, null, null, false, null, false, false, null, null, false, false, null, -16385, 15));
            }
            if (!(z2x0Var instanceof w2x0)) {
                if (z2x0Var instanceof m2x0) {
                    return Next.h(m3x0.a(m3x0VarA, 0, null, null, false, false, false, false, 0, 0, null, false, false, null, 0, null, null, null, null, null, false, null, false, ((m2x0) z2x0Var).a, null, null, false, false, null, -134217729, 15));
                }
                eg.o();
                return null;
            }
            w2x0 w2x0Var = (w2x0) z2x0Var;
            m3x0 m3x0VarA2 = m3x0.a(m3x0VarA, 0, null, null, false, false, false, false, 0, 0, null, false, false, null, 0, null, null, null, null, null, false, new l3x0(w2x0Var.a, w2x0Var.b, w2x0Var.c, w2x0Var.d), false, false, null, null, false, false, null, -16777217, 15);
            xj61 xj61Var = new xj61();
            if (m3x0VarA.X0 != null) {
                xj61Var.add(new v1x0());
            }
            return Next.i(m3x0VarA2, cwl1.j(xj61Var));
        }
        ProfilemodelRequest$Profile profilemodelRequest$Profile = ((k2x0) z2x0Var).a;
        String str9 = m3x0VarA.c;
        boolean z4 = m3x0VarA.f1;
        if (str9.length() == 0) {
            String name = profilemodelRequest$Profile.getName();
            String imageUrl = profilemodelRequest$Profile.getImageUrl();
            boolean zU = profilemodelRequest$Profile.u();
            String strO = z4 ? profilemodelRequest$Profile.o() : null;
            z = z4;
            str2 = str5;
            str = str4;
            m3x0VarA = m3x0.a(m3x0VarA, 0, name, imageUrl, zU, false, false, false, 0, 0, null, false, false, null, 0, null, null, null, strO, null, false, null, false, false, null, null, false, false, null, -2097209, 15);
        } else {
            str = str4;
            str2 = str5;
            z = z4;
        }
        m3x0 m3x0Var = m3x0VarA;
        q730 q730Var2 = new q730(profilemodelRequest$Profile.s(), profilemodelRequest$Profile.t(), profilemodelRequest$Profile.getIsFollowing(), profilemodelRequest$Profile.v());
        boolean zX = profilemodelRequest$Profile.x();
        boolean zP = profilemodelRequest$Profile.p();
        boolean zB = profilemodelRequest$Profile.B();
        int iE = profilemodelRequest$Profile.E();
        int size = profilemodelRequest$Profile.A().size();
        boolean z5 = !profilemodelRequest$Profile.r();
        boolean showFollows = profilemodelRequest$Profile.getShowFollows();
        int color = profilemodelRequest$Profile.getColor();
        boolean zW = profilemodelRequest$Profile.w();
        String strN = profilemodelRequest$Profile.n();
        String strC = profilemodelRequest$Profile.C();
        strC.getClass();
        m3x0 m3x0VarA3 = m3x0.a(m3x0Var, 0, null, null, false, zX, zP, zB, iE, size, q730Var2, z5, showFollows, null, color, null, null, strC.length() > 0 ? strC : null, z ? profilemodelRequest$Profile.o() : null, strN, zW, null, false, false, null, null, profilemodelRequest$Profile.q().contains(pex0.c), false, null, -15253441, 13);
        String str10 = str2;
        boolean zJ2 = u890.j(str, str10);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        if (m3x0VarA3.k1 != 3) {
            linkedHashSet3.add(new p1x0(m3x0VarA3.a, q730Var2, zJ2));
            if (!zJ2 && m3x0VarA3.b1) {
                linkedHashSet3.add(new q1x0(str, str10));
            }
            if (!zJ2 && m3x0VarA3.c1) {
                linkedHashSet3.add(new r1x0(str, str10));
            }
            if (!zJ2 && !m3x0VarA3.h && ((str3 = m3x0VarA3.N0) == null || str3.length() == 0)) {
                linkedHashSet3.add(t1x0.g);
            }
        }
        return Next.i(m3x0VarA3, linkedHashSet3);
    }
}
