package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class n0w implements Update {
    public static final n0w a = new n0w();

    public final Next a(Object obj, Object obj2) {
        s0w s0wVar = (s0w) obj;
        l0w l0wVar = (l0w) obj2;
        lrz0 lrz0Var = s0wVar.x;
        String str = s0wVar.o;
        boolean z = s0wVar.m;
        String str2 = s0wVar.a;
        boolean z2 = s0wVar.e;
        boolean z3 = l0wVar instanceof uzv;
        oyv oyvVar = oyv.b;
        qyv qyvVar = qyv.b;
        if (z3) {
            if (z) {
                return Next.i(s0w.a(s0wVar, null, false, null, null, null, false, null, null, null, 2147475455), Effects.a(new oyv[]{oyvVar}));
            }
            return s0wVar.C ? Next.a(Effects.a(new bzv[]{bzv.b})) : Next.a(Effects.a(new qyv[]{qyvVar}));
        }
        if (l0wVar instanceof tzv) {
            return Next.j();
        }
        if (l0wVar instanceof vzv) {
            return Next.a(Effects.a(new qyv[]{qyvVar}));
        }
        if (l0wVar instanceof i0w) {
            return Next.i(s0w.a(s0wVar, null, false, null, null, null, true, null, null, null, 2147475455), Effects.a(new xyv[]{ern1.B(s0wVar)}));
        }
        if (l0wVar instanceof pzv) {
            return Next.i(s0w.a(s0wVar, null, false, null, null, null, false, null, null, null, 2147475455), Effects.a(new oyv[]{oyvVar}));
        }
        if (l0wVar instanceof h0w) {
            return Next.i(s0w.a(s0wVar, null, false, null, null, null, true, null, null, null, 2147475455), Effects.a(new xyv[]{ern1.B(s0wVar)}));
        }
        if (l0wVar instanceof j0w) {
            xb41 xb41Var = ((j0w) l0wVar).a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (z && s0wVar.n.a == 2 && xb41Var.a == 1) {
                linkedHashSet.add(qyvVar);
            }
            return Next.i(s0w.a(s0wVar, null, false, null, null, null, false, xb41Var, null, null, 2147467263), linkedHashSet);
        }
        if (l0wVar instanceof d0w) {
            return ern1.p(s0wVar);
        }
        if (l0wVar instanceof qzv) {
            return ern1.p(s0wVar);
        }
        if (l0wVar instanceof szv) {
            return Next.a(Effects.a(new uyv[]{new uyv(false)}));
        }
        boolean z4 = l0wVar instanceof k0w;
        pyv pyvVar = pyv.b;
        if (z4) {
            return Next.a(Effects.a(new pyv[]{pyvVar}));
        }
        if (l0wVar instanceof g0w) {
            return Next.h(s0w.a(s0wVar, null, false, "", null, null, false, null, null, null, 2147483327));
        }
        if (l0wVar instanceof nzv) {
            int iC = l1d.C(((nzv) l0wVar).a);
            if (iC == 0) {
                return Next.i(s0w.a(s0wVar, null, false, null, null, null, false, null, null, null, 2147483615), Effects.a(new uyv[]{new uyv(true)}));
            }
            wyv wyvVar = wyv.b;
            if (iC == 1) {
                return z2 ? Next.h(s0w.a(s0wVar, null, false, null, null, null, false, null, null, null, 2147483615)) : Next.a(Effects.a(new wyv[]{wyvVar}));
            }
            if (iC == 2) {
                return z2 ? Next.i(s0w.a(s0wVar, null, false, null, null, null, false, null, null, null, 2147483615), Effects.a(new yyv[]{yyv.b})) : Next.i(s0w.a(s0wVar, null, true, null, null, null, false, null, null, null, 2147483615), Effects.a(new wyv[]{wyvVar}));
            }
            eg.o();
            return null;
        }
        if (l0wVar instanceof ozv) {
            if (((ozv) l0wVar).a) {
                return Next.i(s0w.a(s0wVar, null, false, null, null, null, false, null, null, null, 2147483615), Effects.a(new uyv[]{new uyv(true)}));
            }
            return z2 ? Next.a(Effects.a(new pyv[]{pyvVar})) : Next.j();
        }
        if (l0wVar instanceof mzv) {
            return Next.a(Effects.a(new tyv[]{tyv.b}));
        }
        if (l0wVar instanceof lzv) {
            return Next.j();
        }
        if (l0wVar instanceof wzv) {
            String str3 = ((wzv) l0wVar).a;
            return str3.equals(s0wVar.c) ? Next.j() : Next.h(s0w.a(s0wVar, str3, false, null, null, null, false, null, null, null, 2147483635));
        }
        if (l0wVar instanceof a0w) {
            return Next.h(s0w.a(s0wVar, null, false, ((a0w) l0wVar).a, null, null, false, null, null, null, 2147483327));
        }
        if (l0wVar instanceof b0w) {
            return Next.h(s0w.a(s0wVar, null, false, null, ((b0w) l0wVar).a, null, false, null, null, null, 2147482047));
        }
        if (l0wVar instanceof c0w) {
            return Next.h(s0w.a(s0wVar, null, false, null, null, Integer.valueOf(((c0w) l0wVar).a), false, null, null, null, 2147482047));
        }
        if (l0wVar instanceof f0w) {
            String str4 = ((f0w) l0wVar).a;
            if (str == null) {
                str = "";
            }
            return str4.equals(str) ? Next.j() : Next.h(s0w.a(s0wVar, null, false, null, null, null, false, null, str4, null, 2147385343));
        }
        if (l0wVar instanceof e0w) {
            String str5 = ((e0w) l0wVar).a;
            String str6 = s0wVar.q;
            return str5.equals(str6 != null ? str6 : "") ? Next.j() : Next.h(s0w.a(s0wVar, null, false, null, null, null, false, null, null, str5, 2147090431));
        }
        if (l0wVar instanceof zzv) {
            return Next.a(Effects.a(new czv[]{czv.b}));
        }
        if (l0wVar instanceof rzv) {
            return Next.a(Effects.a(new vyv[]{new vyv(str2, str)}));
        }
        if (l0wVar instanceof yzv) {
            return s0wVar.w ? Next.a(Effects.a(new syv[]{new syv(str2, s0wVar.b, lrz0Var)})) : Next.a(Effects.a(new dzv[]{new dzv(lrz0Var)}));
        }
        if (l0wVar instanceof xzv) {
            return Next.a(Effects.a(new ryv[]{new ryv(str2, s0wVar.B)}));
        }
        eg.o();
        return null;
    }
}
