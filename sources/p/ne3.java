package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ne3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne3(d0r d0rVar, g4v0 g4v0Var, String str, boolean z, boolean z2) {
        super(1);
        this.a = (byte) 5;
        this.e = d0rVar;
        this.d = g4v0Var;
        this.f = str;
        this.b = z;
        this.c = z2;
    }

    public final Object invoke(Object obj) {
        Object value;
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        Object obj3 = this.d;
        Object obj4 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                os11 os11Var = (os11) obj;
                ycc1 ycc1Var = (ycc1) obj4;
                yqg yqgVar = (yqg) ycc1Var.b;
                iu30 iu30Var = (iu30) obj3;
                xj61 xj61Var = new xj61();
                xj61Var.add(new yp21(jo70.class));
                xj61Var.add(new yp21(xkk1.class));
                xj61Var.add(new yp21(zoy0.class));
                if (z) {
                    xj61Var.add(new yp21(bql.class));
                }
                os11Var.r = new lvc1(cwl1.j(xj61Var), w7x.a, new kg3(yqgVar, iu30Var, z2), (byte) 26);
                os11Var.y = 2;
                os11Var.z = 2;
                os11Var.m = npc1.a;
                os11Var.n = true;
                os11Var.p = false;
                os11Var.h = (oe3) obj2;
                os11Var.s = new xb2(ycc1Var, (byte) 11);
                return rih1Var;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                err0 err0Var = (hdn0) obj2;
                if (z2) {
                    err0 err0Var2 = err0Var;
                    err0Var2.t(z ? yoi1.q(jch0.U(fFloatValue), p7h.K((List) obj4)) : 0);
                    ((iu30) obj3).invoke(Integer.valueOf(err0Var2.s()));
                }
                return rih1Var;
            case 2:
                long j = ((yr80) obj).a;
                ((hdn0) obj3).t((int) (j >> 32));
                t24 t24Var = (t24) obj4;
                mdt mdtVar = t24Var.i;
                wvr wvrVarF = wm5.f(new lxx(j, this.b, (flb0) obj2, this.c));
                drr0 drr0Var = t24Var.j;
                if (Float.isNaN(drr0Var.s()) || (value = wvrVarF.a(drr0Var.s())) == null) {
                    value = mdtVar.getValue();
                }
                t24Var.j(wvrVarF, value);
                return rih1Var;
            case 3:
                rtb0 rtb0Var = (rtb0) obj;
                eyr0 eyr0Var = (eyr0) obj2;
                pbq pbqVar = (pbq) obj3;
                h7g0 h7g0Var = (h7g0) obj4;
                if (z2 && !h7g0Var.h.isEmpty()) {
                    rtb0Var.d("artist_heading", "section_heading", new j2i(-279998783, new h6a0(pbqVar, ujf0.R0, (byte) 24), true));
                    ArrayList arrayList = h7g0Var.h;
                    rtb0Var.e(arrayList.size(), new qbb0(arrayList, (byte) 4), new qbb0(arrayList, (byte) 5), new j2i(2039820996, new c7g0(arrayList, eyr0Var, arrayList, (byte) 0), true));
                }
                if (z2 && !h7g0Var.h.isEmpty() && z && !h7g0Var.g.isEmpty()) {
                    rtb0Var.d("section_spacer", "spacer", syi.a);
                }
                if (z && !h7g0Var.g.isEmpty()) {
                    rtb0Var.d("track_heading", "section_heading", new j2i(-279998783, new h6a0(pbqVar, ujf0.S0, (byte) 24), true));
                    ArrayList arrayList2 = h7g0Var.g;
                    rtb0Var.e(arrayList2.size(), new qbb0(arrayList2, (byte) 6), new qbb0(arrayList2, (byte) 7), new j2i(2039820996, new c7g0(arrayList2, eyr0Var, arrayList2, (byte) 1), true));
                }
                return rih1Var;
            case 4:
                p410 p410Var = (p410) obj3;
                if (((tm81) obj4).d == 1) {
                    x1i1.a((x1i1) p410Var.g, kno1.a, 6);
                } else {
                    fn31.T(cto1.q((dg30) p410Var.b), (q8n) p410Var.f, 0, new dw8(p410Var, this.b, (String) obj2, this.c, (lnm) null, (byte) 3), 2);
                }
                return rih1Var;
            default:
                d0r d0rVar = (d0r) obj4;
                g4v0 g4v0Var = (g4v0) obj3;
                xzq xzqVar = new xzq(g4v0Var.c.a(d0rVar), svu0.X0);
                f9p f9pVar = (f9p) g4v0Var.j.a.c;
                jcq jcqVar = (jcq) ((e7z) f9pVar.X).q0.get();
                c8o.l(jcqVar);
                d2w d2wVar = (d2w) ((e7z) f9pVar.X).p0.get();
                c8o.l(d2wVar);
                return f6o1.A(new nu(xzqVar, d0rVar, new kpg0(new tm(d0rVar, jcqVar, d2wVar), new nxx((String) obj2, z2, z, (byte) 4))), null, null, 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne3(byte b, Object obj, Object obj2, Object obj3, boolean z, boolean z2) {
        super(1);
        this.a = b;
        this.e = obj;
        this.d = obj2;
        this.b = z;
        this.f = obj3;
        this.c = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne3(ycc1 ycc1Var, iu30 iu30Var, boolean z, boolean z2, oe3 oe3Var) {
        super(1);
        this.a = (byte) 0;
        this.e = ycc1Var;
        this.d = iu30Var;
        this.b = z;
        this.c = z2;
        this.f = oe3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne3(boolean z, h7g0 h7g0Var, pbq pbqVar, eyr0 eyr0Var, boolean z2) {
        super(1);
        this.a = (byte) 3;
        this.b = z;
        this.e = h7g0Var;
        this.d = pbqVar;
        this.f = eyr0Var;
        this.c = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne3(boolean z, boolean z2, List list, iu30 iu30Var, hdn0 hdn0Var) {
        super(1);
        this.a = (byte) 1;
        this.b = z;
        this.c = z2;
        this.e = list;
        this.d = iu30Var;
        this.f = hdn0Var;
    }
}
