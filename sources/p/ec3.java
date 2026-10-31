package p;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ec3 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec3(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        String strB;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                return ((gc3) obj4).i.a((wto) obj, (zob1) obj3, (d0r) obj2);
            case 1:
                tk21 tk21Var = (tk21) obj4;
                tk21Var.a.c(new jyh0(tk21Var, qk21.a, (byte) 16));
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                x340 x340Var = (x340) ((b0k) obj2);
                x340Var.i0(955869654);
                ni20 ni20Var = (ni20) obj4;
                x340Var.r(false);
                return ni20Var;
            case 3:
                hsl1 hsl1Var = (hsl1) obj2;
                el00 el00Var = (el00) obj4;
                RecyclerView recyclerView = el00Var.T0;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), hsl1Var.a.i(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SET_CONTEXT_FAILED).d);
                el00Var.V0 = hsl1Var;
                return hsl1Var;
            case 4:
                b140 b140Var = (b140) obj;
                ((Number) obj3).intValue();
                d140 d140Var = (d140) obj4;
                h140 h140Var = d140Var.b;
                x340 x340Var2 = (x340) ((b0k) obj2);
                Object objT = x340Var2.T();
                if (objT == fkj0.X) {
                    objT = d140Var.e.a();
                    x340Var2.s0(objT);
                }
                mod.c(new ely0[]{llz0.a().a(b140Var.c()), bka1.a().a(b140Var.b())}, apo.r(-1196258583, new xh00((g140) objT, new f140(b140Var.a(), h140Var.getUsername(), h140Var.a(), b140Var.a().a()), (byte) 21), x340Var2), x340Var2, 56);
                return rih1Var;
            case 5:
                jjn0 jjn0Var = (jjn0) obj;
                tqw tqwVar = (tqw) obj3;
                kjn0 kjn0Var = (kjn0) obj4;
                if (((ijn0) obj2).equals(ijn0.a)) {
                    hqn1.r(kjn0.f(jjn0Var.a(), jjn0Var.b()), tqwVar, kjn0.e(kjn0Var));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 6:
                ((Number) obj3).intValue();
                x340 x340Var3 = (x340) ((b0k) obj2);
                x340Var3.i0(-693165011);
                x340Var3.i0(-411643145);
                otn0 otn0Var = (otn0) obj4;
                StringBuilder sb = new StringBuilder();
                sb.append(cwl1.o0(x340Var3, otn0Var.e));
                sb.append(", ");
                sb.append(cwl1.n0(2131959098, new Object[]{Integer.valueOf(otn0Var.b + 1), Integer.valueOf(otn0Var.c)}, x340Var3));
                if (otn0Var.f) {
                    x340Var3.i0(469259794);
                    sb.append(", ");
                    sb.append(cwl1.o0(x340Var3, 2131959099));
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(469390490);
                    x340Var3.r(false);
                }
                String string = sb.toString();
                x340Var3.r(false);
                boolean zG = x340Var3.g(otn0Var) | x340Var3.g(string);
                Object objT2 = x340Var3.T();
                if (zG || objT2 == fkj0.X) {
                    objT2 = new j9n0(otn0Var, string, (byte) 9);
                    x340Var3.s0(objT2);
                }
                qim0 qim0VarB = s161.b(nim0.a, false, (iu30) objT2);
                x340Var3.r(false);
                return qim0VarB;
            case 7:
                rho0 rho0Var = (rho0) obj;
                pho0 pho0Var = (qho0) obj2;
                tqw tqwVar2 = (tqw) obj3;
                et90 et90Var = (et90) obj4;
                if (pho0Var instanceof pho0) {
                    String strG = et90.g(et90Var, rho0Var, pho0Var.a());
                    tv80 tv80VarY = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                    if (et90.k(et90Var).j(et90.h(et90Var))) {
                        lzn0 lzn0VarK = et90.k(et90Var);
                        p1f0 p1f0VarW = rrn1.w(strG);
                        p1f0VarW.B(tv80VarY);
                        lzn0VarK.f(p1f0VarW.h());
                    } else {
                        a1r0.m(et90.l(et90Var), strG, tv80VarY, (Bundle) null, 12);
                    }
                } else {
                    if (!(pho0Var instanceof oho0)) {
                        eg.o();
                        return null;
                    }
                    tv80 tv80VarY2 = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                    if (et90.k(et90Var).j(et90.h(et90Var))) {
                        lzn0 lzn0VarK2 = et90.k(et90Var);
                        p1f0 p1f0VarW2 = rrn1.w(((oho0) pho0Var).a());
                        p1f0VarW2.B(tv80VarY2);
                        lzn0VarK2.f(p1f0VarW2.h());
                    } else {
                        a1r0.m(et90.l(et90Var), ((oho0) pho0Var).a(), tv80VarY2, (Bundle) null, 12);
                    }
                }
                return rih1Var;
            case 8:
                ngs0.k((ngs0) obj4).invoke((nc31) obj2);
                return rih1Var;
            case 9:
                ((Number) obj3).intValue();
                u8a1 u8a1Var = (u8a1) obj4;
                otw.c(u8a1.d(u8a1Var), exd0.x(u8a1.c(u8a1Var)), null, null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 10:
                kef1 kef1Var = (kef1) obj;
                hef1 hef1Var = (jef1) obj2;
                tqw tqwVar3 = (tqw) obj3;
                nef1 nef1Var = (nef1) obj4;
                if (hef1Var instanceof hef1) {
                    nef1.e(nef1Var).a(hef1Var.a(), cvl1.d(tqwVar3), (Bundle) null);
                } else {
                    if (!(hef1Var instanceof ief1)) {
                        eg.o();
                        return null;
                    }
                    cvt0 cvt0VarB = kef1Var.b();
                    if (cvt0VarB != null && (strB = cvt0VarB.b()) != null) {
                        xh71.b(nef1.f(nef1Var), new wa71(strB, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126), (Bundle) null, new vm71("top-stories"), cvl1.d(tqwVar3), (List) null, 18);
                    }
                }
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                ((j2i) obj4).invoke((b0k) obj2, 0);
                return rih1Var;
        }
    }
}
