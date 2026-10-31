package p;

import android.net.Uri;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class zyk implements Update {
    public static final zyk a = new zyk();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v6, types: [p.mrn] */
    public final Next a(Object obj, Object obj2) {
        String str;
        s781 s781Var;
        Object gvkVar;
        ArrayList arrayList;
        oxk oxkVar = (oxk) obj;
        zwk zwkVar = (fxk) obj2;
        boolean z = oxkVar.k;
        boolean z2 = oxkVar.j;
        boolean z3 = oxkVar.q;
        c380<s781> c380Var = oxkVar.c;
        r591 r591Var = oxkVar.B;
        qxk qxkVar = oxkVar.b;
        String str2 = oxkVar.i;
        yxk yxkVar = oxkVar.d;
        String str3 = oxkVar.C;
        sxk sxkVar = oxkVar.e;
        s781 s781Var2 = oxkVar.f;
        if (zwkVar.equals(uvk.a)) {
            return Next.a(Collections.singleton(jvk.a));
        }
        Object lrnVar = null;
        if (zwkVar.equals(wvk.a)) {
            if (z2 || z || z3) {
                return Next.j();
            }
            oxk oxkVarA = oxk.a(oxkVar, null, null, null, null, null, null, null, true, false, false, null, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536870399);
            String str4 = oxkVar.a;
            String str5 = yxkVar.a;
            s781 s781Var3 = oxkVar.f;
            sxk sxkVar2 = oxkVar.e;
            String str6 = oxkVar.g;
            String str7 = oxkVar.f50p;
            if (oxkVar.y) {
                c380 c380Var2 = oxkVar.v;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : c380Var2) {
                    if (oxkVar.w.contains(((rxk) obj3).a)) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((rxk) it.next()).a);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            return Next.i(oxkVarA, cwl1.j0(new hvk(str4, str5, s781Var3, sxkVar2, str6, str7, arrayList, oxkVar.B, oxkVar.C)));
        }
        if (u890.j(zwkVar, yvk.a)) {
            return Next.a(cwl1.j0(dvk.a));
        }
        if (zwkVar instanceof xvk) {
            return Next.h(oxk.a(oxkVar, null, null, null, null, null, null, ((xvk) zwkVar).a, false, false, false, null, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536870271));
        }
        if (zwkVar instanceof swk) {
            return Next.i(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536870399), cwl1.j0(new kvk(((swk) zwkVar).a)));
        }
        if (u890.j(zwkVar, rwk.a)) {
            return Next.i(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536870271), cwl1.j0(ivk.a));
        }
        boolean zJ = u890.j(zwkVar, zvk.a);
        Object obj4 = qvk.a;
        if (zJ) {
            return oxkVar.v.isEmpty() ? Next.j() : Next.i(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, nyb.d, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536862719), cwl1.j0(obj4));
        }
        boolean zJ2 = u890.j(zwkVar, awk.a);
        nyb nybVar = nyb.a;
        if (zJ2) {
            return Next.h(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, nybVar, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536862719));
        }
        if (zwkVar instanceof bwk) {
            qel qelVar = ((bwk) zwkVar).a;
            uel uelVarN = qxd0.N(oxkVar);
            Next nextJ = nb51.J(uelVarN, qelVar);
            uel uelVar = (uel) nextJ.f(uelVarN);
            List list = uelVar.b;
            Set<iel> setB = nextJ.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (iel ielVar : setB) {
                if (ielVar instanceof fel) {
                    gvkVar = new gvk(((fel) ielVar).a);
                } else if (u890.j(ielVar, gel.a)) {
                    gvkVar = obj4;
                } else {
                    if (!(ielVar instanceof hel)) {
                        eg.o();
                        return null;
                    }
                    gvkVar = null;
                }
                if (gvkVar != null) {
                    linkedHashSet.add(gvkVar);
                }
            }
            if (nextJ.d()) {
                return Next.i(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, null, 0, null, v8r.w(oxkVar.v, list), mqo1.C(uelVar.c), mqo1.C(uelVar.d), oxkVar.y || !nb51.B(uelVar).isEmpty(), mqo1.A(list), null, null, null, 471859199), linkedHashSet);
            }
            return linkedHashSet.isEmpty() ? Next.j() : Next.a(linkedHashSet);
        }
        if (zwkVar instanceof wwk) {
            sxk sxkVar3 = ((wwk) zwkVar).a;
            return (sxkVar.a == 1) != (sxkVar3.a == 1) ? Next.i(oxk.a(oxkVar, null, null, null, null, null, null, null, false, true, false, null, null, null, false, null, null, 0, sxkVar3, null, null, null, false, null, null, null, null, 535821311), cwl1.j0(new rvk(str2, yxkVar.a, sxkVar3, oxkVar.g))) : Next.h(oxk.a(oxkVar, null, null, null, null, sxkVar3, null, null, false, false, v8r.o(sxkVar3), null, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536866799));
        }
        if (zwkVar instanceof exk) {
            exk exkVar = (exk) zwkVar;
            return Next.h(oxk.a(oxkVar, null, null, null, new yxk(exkVar.a, exkVar.b), null, null, null, false, false, false, null, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536870903));
        }
        boolean z4 = zwkVar instanceof uwk;
        f1e f1eVar = f1e.a;
        if (z4) {
            sxk sxkVar4 = oxkVar.u;
            sxk sxkVar5 = sxkVar4 == null ? sxkVar : sxkVar4;
            boolean zO = v8r.o(sxkVar5);
            uwk uwkVar = (uwk) zwkVar;
            c380 c380Var3 = uwkVar.c;
            c380 c380VarA = mqo1.A(c380Var3);
            if (s781Var2.f == 1) {
                s781Var = (s781) o7h.s0(c380Var3);
                if (s781Var == null) {
                    s781Var = (s781) o7h.s0(c380VarA);
                }
            } else {
                for (Object obj5 : c380VarA) {
                    if (u890.j(((s781) obj5).a, s781Var2.a)) {
                        lrnVar = obj5;
                        break;
                    }
                }
                s781Var = (s781) lrnVar;
                if (s781Var == null) {
                    s781Var = (s781) o7h.s0(c380VarA);
                }
            }
            s781 s781Var4 = s781Var;
            String str8 = uwkVar.a;
            qxk qxkVar2 = uwkVar.b;
            String str9 = uwkVar.d;
            return s781Var4 == null ? Next.h(oxk.a(oxkVar, str8, qxkVar2, c380VarA, null, sxkVar5, null, dmc1.a, false, false, zO, null, null, null, false, null, f1eVar, 0, null, null, null, null, false, null, str9, null, null, 467921768)) : Next.h(oxk.a(oxkVar, str8, qxkVar2, c380VarA, null, sxkVar5, s781Var4, null, false, false, zO, null, null, null, false, null, f1eVar, 0, null, null, null, null, false, null, str9, null, null, 467921864));
        }
        if (zwkVar instanceof twk) {
            return Next.h(oxk.a(oxkVar, null, null, null, null, null, null, ((twk) zwkVar).a, false, false, false, null, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 535821183));
        }
        if (zwkVar instanceof zwk) {
            return Next.h(oxk.a(oxkVar, null, null, null, null, null, zwkVar.a, null, false, false, false, nybVar, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536862687));
        }
        if (u890.j(zwkVar, cxk.a)) {
            return Next.h(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536870783));
        }
        if (u890.j(zwkVar, vwk.a)) {
            return Next.a(cwl1.j0(new nvk(sxkVar)));
        }
        if (u890.j(zwkVar, dxk.a)) {
            return Next.a(cwl1.j0(pvk.a));
        }
        if (u890.j(zwkVar, nwk.a)) {
            return Next.a(cwl1.j0(new lvk(str2, s781Var2.b, str3)));
        }
        if (u890.j(zwkVar, pwk.a)) {
            String str10 = v8r.o(sxkVar) ? s781Var2.c : qxkVar.b;
            if (ihc1.y0(str10)) {
                str10 = null;
            }
            return Next.a(cwl1.j0(new mvk(str3, str10)));
        }
        if (zwkVar instanceof qwk) {
            qwk qwkVar = (qwk) zwkVar;
            return u890.j(qwkVar.a, str3) ? Next.j() : Next.h(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, qwkVar.a, 268435455));
        }
        if (u890.j(zwkVar, axk.a)) {
            return r591Var != null ? Next.a(cwl1.j0(new ovk(r591Var))) : Next.j();
        }
        if (zwkVar instanceof bxk) {
            r591 r591Var2 = ((bxk) zwkVar).a;
            return r591Var2 == r591Var ? Next.j() : Next.h(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, null, 0, null, null, null, null, false, null, null, r591Var2, null, 402653183));
        }
        boolean zJ3 = u890.j(zwkVar, xwk.a);
        nyb nybVar2 = nyb.b;
        if (zJ3) {
            return Next.h(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, nybVar2, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536862719));
        }
        if (u890.j(zwkVar, ywk.a)) {
            return Next.h(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, nybVar, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536862719));
        }
        boolean zJ4 = u890.j(zwkVar, owk.a);
        nyb nybVar3 = nyb.c;
        if (zJ4) {
            return (z2 || z || z3) ? Next.j() : Next.h(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, nybVar3, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536862719));
        }
        if (u890.j(zwkVar, hwk.a)) {
            return Next.h(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, nybVar3, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536862719));
        }
        if (u890.j(zwkVar, iwk.a)) {
            return Next.i(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, v8r.o(sxkVar) ? nybVar : nybVar2, null, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536862719), cwl1.j0(evk.a));
        }
        if (zwkVar instanceof kwk) {
            if (z3 || oxkVar.r != null) {
                return Next.j();
            }
            kwk kwkVar = (kwk) zwkVar;
            return Next.i(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, null, null, null, true, null, null, 0, null, null, null, null, false, null, null, null, null, 536805375), cwl1.j0(new fvk(oxkVar.a, kwkVar.a, kwkVar.b)));
        }
        if (zwkVar instanceof dwk) {
            dwk dwkVar = (dwk) zwkVar;
            String str11 = dwkVar.d;
            if (str11.length() == 0) {
                str11 = dwkVar.c;
            }
            String str12 = str11;
            String str13 = dwkVar.a;
            String str14 = dwkVar.b;
            List listX = dwkVar.e;
            if (listX.isEmpty()) {
                listX = k4p1.x(str12);
            }
            List list2 = listX;
            s781 s781Var5 = new s781(str13, str14, str12, list2, 0, 1);
            dyh1 dyh1Var = oxkVar.o;
            byh1 byh1Var = dyh1Var instanceof byh1 ? (byh1) dyh1Var : null;
            String str15 = byh1Var != null ? byh1Var.a : null;
            if (!v8r.o(sxkVar)) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : c380Var) {
                    if (!u890.j(((s781) obj6).a, str13)) {
                        arrayList4.add(obj6);
                    }
                }
                return Next.h(oxk.a(oxkVar, null, null, mqo1.A(o7h.O0(s781Var5, arrayList4)), null, null, s781Var5, null, false, false, false, nybVar, null, str15, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536240091));
            }
            int iP = yoi1.p(oxkVar.t, 0, yoi1.k(list2.size() - 1, 0));
            String str16 = (String) o7h.t0(iP, list2);
            if (str16 == null) {
                str16 = str12;
            }
            String str17 = qxkVar.a;
            qxkVar.getClass();
            qxk qxkVar3 = new qxk(str17, str16);
            ArrayList arrayList5 = new ArrayList(q7h.U(c380Var, 10));
            for (s781 s781Var6 : c380Var) {
                if (u890.j(s781Var6.a, str13)) {
                    s781Var6 = s781Var5;
                }
                arrayList5.add(s781Var6);
            }
            return Next.h(oxk.a(oxkVar, null, qxkVar3, mqo1.A(arrayList5), null, null, s781.a(s781Var5, str16), null, false, false, false, nybVar, null, str15, false, null, null, iP, null, null, null, null, false, null, null, null, null, 536240089));
        }
        boolean z5 = zwkVar instanceof cwk;
        krn krnVar = krn.a;
        if (z5) {
            return Next.h(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, null, null, null, false, krnVar, null, 0, null, null, null, null, false, null, null, null, null, 536674303));
        }
        if (zwkVar instanceof gwk) {
            return Next.a(cwl1.j0(new svk(((gwk) zwkVar).a)));
        }
        if (zwkVar instanceof lwk) {
            if (oxkVar.s instanceof g1e) {
                return w2g0.o(oxkVar, ((lwk) zwkVar).a);
            }
            lwk lwkVar = (lwk) zwkVar;
            zxh1 zxh1Var = lwkVar.a;
            zxh1 zxh1Var2 = zxh1Var instanceof zxh1 ? zxh1Var : null;
            if (zxh1Var2 != null) {
                lk7 lk7Var = zxh1Var2.a;
                if (lk7Var instanceof jk7) {
                    lrnVar = new lrn(((jk7) lk7Var).a);
                } else {
                    if (!u890.j(lk7Var, kk7.a)) {
                        eg.o();
                        return null;
                    }
                    lrnVar = krnVar;
                }
            }
            return Next.h(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, null, lwkVar.a, null, false, lrnVar, null, 0, null, null, null, null, false, null, null, null, null, 536723455));
        }
        if (u890.j(zwkVar, fwk.a) || u890.j(zwkVar, ewk.a)) {
            return Next.j();
        }
        boolean zJ5 = u890.j(zwkVar, jwk.a);
        ayh1 ayh1Var = ayh1.a;
        if (zJ5) {
            return Next.h(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, null, ayh1Var, null, false, null, null, 0, null, null, null, null, false, null, null, null, null, 536723455));
        }
        if (zwkVar instanceof tvk) {
            if (!v8r.o(sxkVar)) {
                return Next.h(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, null, ((tvk) zwkVar).b, null, null, null, null, false, null, null, null, null, 536346623));
            }
            tvk tvkVar = (tvk) zwkVar;
            f27 f27Var = tvkVar.a;
            return Next.h(oxk.a(oxkVar, null, null, null, null, null, s781.a(s781Var2, f27Var.a), null, false, false, false, null, null, f27Var.b, false, null, null, tvkVar.b, null, null, null, null, false, null, null, null, null, 536313823));
        }
        if (zwkVar instanceof vvk) {
            Uri uri = ((vvk) zwkVar).a;
            return Next.i(oxk.a(oxkVar, null, null, null, null, null, null, null, false, false, false, null, ayh1Var, null, false, null, new g1e(uri.toString()), 0, null, null, null, null, false, null, null, null, null, 536592383), cwl1.j0(new svk(uri)));
        }
        if (!u890.j(zwkVar, mwk.a)) {
            eg.o();
            return null;
        }
        for (Object obj7 : oxkVar.b()) {
            if (!((f27) obj7).c) {
                lrnVar = obj7;
                break;
            }
        }
        f27 f27Var2 = (f27) lrnVar;
        if (f27Var2 == null || (str = f27Var2.a) == null) {
            str = s781Var2.c;
        }
        return Next.h(oxk.a(oxkVar, null, null, null, null, null, s781.a(s781Var2, str), null, false, false, false, null, null, null, false, null, f1eVar, 0, null, null, null, null, false, null, null, null, null, 536051679));
    }
}
