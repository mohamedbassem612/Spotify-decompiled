package p;

import android.net.Uri;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b470 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b470(float f, CurrentTrackMetadata currentTrackMetadata, whb1 whb1Var) {
        super(3);
        this.a = (byte) 2;
        this.b = f;
        this.c = currentTrackMetadata;
        this.d = whb1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        spx spxVar;
        String strO0;
        byte b = this.a;
        float f = this.b;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    a6o1.d((s370) obj5, ((wgh1) obj4).f, anm1.N("HEADER", nim0Var), this.b, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                nim0 nim0Var2 = nim0.a;
                ma90 ma90Var = (ma90) obj5;
                a8o.c(ma90Var, this.b, (Function0) obj4, u291.f(nim0Var2, 1.0f), b0kVar, 0);
                a8o.o(0, ma90Var.d.c, b0kVar, grn1.o(uyn1.B(nim0Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), f), ma90Var.c);
                return rih1Var;
            case 2:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                et40 et40Var = et40.a;
                fc11.g(dm5.Q(et40Var, f + 16.0f), b0kVar2, 0);
                CurrentTrackMetadata currentTrackMetadata = (CurrentTrackMetadata) obj5;
                f5p1.h(currentTrackMetadata.getTitle(), currentTrackMetadata.getSubtitle(), (whb1) obj4, dm5.J(et40Var), (kee1) null, (kee1) null, (String) null, (String) null, 2, b0kVar2, 100663296, 240);
                return rih1Var;
            default:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                zl11 zl11Var = (zl11) obj5;
                u4p1 u4p1Var = (u4p1) obj4;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var3 = (x340) b0kVar3;
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(b0kVar3, nim0Var);
                hzj.A.getClass();
                x340 x340Var4 = (x340) b0kVar3;
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                boolean z2 = x340Var4.S;
                n4k n4kVar = hmb0.t1;
                if (z2) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, b0kVar3, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, b0kVar3, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, b0kVar3, lljVar3);
                nko1.F(b0kVar3);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, b0kVar3, lljVar4);
                as80 as80Var = mif1.P0;
                String str = zl11Var.d;
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                ltx ltxVar = ltx.c;
                nux nuxVar = new nux(ltxVar, ltxVar);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar3).f;
                eso1.e(uri, isl.a, xcg1.k(cbx.a, i1p1.q(nim0Var, er31.b(4.0f))), null, null, null, as80Var, null, null, nuxVar, false, false, b0kVar3, 1073741872, 0, 3512);
                b0k b0kVar4 = b0kVar3;
                if (zl11Var.g != null) {
                    x340Var4.i0(-1071328855);
                    qim0 qim0VarF = dug.f(h2c.a.b(nim0Var), ((vex) zex.a.e).c, d4o1.a);
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar4, qim0VarF);
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC2, b0kVar4, lljVar);
                    nko1.H(xos0VarM2, b0kVar4, lljVar2);
                    i3a.l(iHashCode2, b0kVar4, lljVar3, b0kVar4);
                    nko1.H(qim0VarE2, b0kVar4, lljVar4);
                    boolean z3 = u4p1Var instanceof pfu0;
                    if (z3) {
                        x340Var4.i0(-1260985100);
                        xto1.f(this.b, 4, 384, 2, cbx.a(b0kVar4).b.a, u7h.j, b0kVar4, (qim0) null);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-1260719864);
                        x340Var4.r(false);
                    }
                    if (z3) {
                        b0kVar4 = b0kVar4;
                        spxVar = spx.c;
                    } else {
                        b0kVar4 = b0kVar4;
                        spxVar = xpx.c;
                    }
                    if (z3) {
                        x340Var4.i0(790626330);
                        strO0 = cwl1.o0(b0kVar4, 2131959037);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(790629145);
                        strO0 = cwl1.o0(b0kVar4, 2131959038);
                        x340Var4.r(false);
                    }
                    jsl jslVar = new jsl(strO0);
                    zov0 zov0Var = cbx.b(b0kVar4).g;
                    w0h1.a(spxVar, jslVar, u291.r(nim0Var, 16.0f), 0L, 0L, false, b0kVar4, 8, 56);
                    z = true;
                    x340Var4.r(true);
                    x340Var4.r(false);
                } else {
                    z = true;
                    x340Var4.i0(-1070192953);
                    x340Var4.r(false);
                }
                x340Var4.r(z);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b470(Object obj, Object obj2, float f, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b470(ma90 ma90Var, float f, Function0 function0) {
        super(3);
        this.a = (byte) 1;
        this.c = ma90Var;
        this.b = f;
        this.d = function0;
    }
}
