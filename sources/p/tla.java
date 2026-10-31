package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewView;
import com.spotify.mobius.android.MobiusLoopViewModel;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tla extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tla(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = 2;
        zB = true;
        boolean zB = true;
        int i2 = 1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                rla rlaVar = ((ula) obj2).a;
                String strValueOf = rlaVar.f;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(rlaVar.b);
                }
                b261.n(e261Var, strValueOf);
                return rih1Var;
            case 1:
                return ((tzo) obj2).c((String) obj);
            case 2:
                return Boolean.valueOf(((Number) obj).longValue() < ((mna) obj2).N1);
            case 3:
                return z590.a((z590) obj, (lsm0) obj2, false, (o091) null, false, 0L, 0L, 0.0f, 0L, (y1k1) null, 510);
            case 4:
                uqo uqoVar = (uqo) obj;
                String strT = zmo1.t(((oua) obj2).a, uqoVar.a, uqoVar.b);
                strT.getClass();
                return new kua(strT, (String) null, false);
            case 5:
                long j = ((gag1) obj2).b;
                n5f0 n5f0Var = ((jcg1) obj).c;
                if (j >= Long.valueOf(n5f0Var.a).longValue()) {
                    i2 = j >= Long.valueOf(n5f0Var.b).longValue() ? -1 : 0;
                }
                return Integer.valueOf(i2);
            case 6:
                String str = (String) obj;
                tva tvaVar = (tva) obj2;
                rm5 rm5Var = tvaVar.c;
                wc6 wc6Var = tvaVar.Y0;
                if (wc6Var == null) {
                    u890.C("artistBadgesView");
                    throw null;
                }
                int i3 = ((Boolean) wc6Var.N0.getValue()).booleanValue() ? 2 : 1;
                i8h1 i8h1Var = (i8h1) rm5Var.b;
                urk0 urk0Var = (urk0) rm5Var.a;
                int iC = l1d.C(i3);
                if (iC != 1) {
                    i = iC != 2 ? 1 : 3;
                }
                x6h1 x6h1VarC = urk0Var.b.c();
                x6h1VarC.i.add(new a7h1("badge_card", v8i0.f(i), 0, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("learn_more_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 7:
                ((ewa) obj2).a(((Number) obj).intValue());
                return rih1Var;
            case 8:
                CircularVideoPreviewView circularVideoPreviewView = new CircularVideoPreviewView((Context) obj, null, 0, 6, null);
                circularVideoPreviewView.setViewContext(new ycg((d9c1) obj2));
                return circularVideoPreviewView;
            case 9:
                return new rxc0(((e0t) obj2).b);
            case 10:
                MobiusLoopViewModel mobiusLoopViewModel = (MobiusLoopViewModel) obj2;
                wit witVar = ((xit) obj).a;
                if (witVar instanceof tit) {
                    mobiusLoopViewModel.U(hdb.a);
                } else if (witVar instanceof uit) {
                    mobiusLoopViewModel.U(gdb.a);
                } else if (witVar instanceof vit) {
                    mobiusLoopViewModel.U(ldb.a);
                } else if (witVar != null) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 11:
                m0d m0dVar = (m0d) obj;
                gus0 gus0Var = (gus0) obj2;
                if (gus0Var != null) {
                    bpb1 bpb1Var = gus0Var.d;
                    eus0 eus0Var = (eus0) bpb1Var.getValue();
                    eus0Var.getClass();
                    bpb1Var.m((Object) null, eus0.a(eus0Var, (List) null, m0dVar, 0, 21));
                }
                return rih1Var;
            case 12:
                qlb qlbVar = (qlb) obj2;
                return d3p1.F(qlbVar.b, (o3r) qlbVar.f, ((rlb) obj).a);
            case 13:
                w2l0 w2l0Var = (w2l0) obj;
                zqg0 zqg0Var = (zqg0) obj2;
                boolean z = zqg0Var.b;
                String str2 = zqg0Var.a;
                return z ? w2l0Var.h(str2) : w2l0Var.e(str2);
            case 14:
                return ((mnb) obj2).b;
            case 15:
                xnb xnbVar = (xnb) obj2;
                return new te1(d3p1.F(xnbVar.b, xnbVar.c, (String) obj), (byte) 9);
            case 16:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                gqb gqbVar = (gqb) obj2;
                DrawScope.d0(lslVar, gqbVar.a, 0L, 0L, 0.0f, new phc1(lslVar.X0(gqbVar.b), 0.0f, 0, 0, (uw4) null, 30), (ColorFilter) null, 110);
                return rih1Var;
            case 17:
                return new rm((lub) obj2, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                b261.n((e261) obj, ((sdp0) obj2).b);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (ior) ((jly0) new kp5(((j0q) ((zwa) obj2).b).a, (Activity) obj).h).get();
            case 20:
                kd31 kd31Var = (kd31) obj;
                v0c v0cVar = (v0c) obj2;
                float fFloatValue = ((Number) v0cVar.Q0.invoke()).floatValue();
                drr0 drr0Var = v0cVar.R0;
                kd31Var.b(drr0Var.s() * fFloatValue);
                kd31Var.q(((Number) v0cVar.P0.invoke()).floatValue() * drr0Var.s());
                kd31Var.r(((Number) v0cVar.P0.invoke()).floatValue() * drr0Var.s());
                return rih1Var;
            case 21:
                b261.n((e261) obj, ((l2c) obj2).e);
                return rih1Var;
            case 22:
                return (mr20) ((q01) obj2).invoke();
            case 23:
                ((a8c) obj2).k(new r7c((String) obj));
                return rih1Var;
            case 24:
                ehr0 ehr0Var = (ehr0) obj;
                cp31 cp31Var = (cp31) obj2;
                if (ehr0Var instanceof qy3) {
                    tv80 tv80Var = ((qy3) ehr0Var).a;
                    lzn0 lzn0Var = (lzn0) cp31Var.b;
                    if (tv80Var != null) {
                        lzn0Var.a(nik1.A1.a, tv80Var, (Bundle) null);
                    } else {
                        lzn0Var.h(nik1.A1.a);
                    }
                } else {
                    th41 th41Var = (th41) cp31Var.f;
                    if (th41Var == null) {
                        u890.C("scannablesNavigator");
                        throw null;
                    }
                    zB = th41Var.b(ehr0Var);
                }
                return Boolean.valueOf(zB);
            case 25:
                ((Number) obj).intValue();
                emt emtVar = (emt) obj2;
                String str3 = emtVar.e;
                String str4 = emtVar.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-browse-evo";
                x6h1VarI.f = "2.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.e = str3;
                x6h1VarI.d = str4;
                y6h1 y6h1VarA = x6h1VarI.a();
                p7h.M(new String[]{"find", "browse/genres"});
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            case 26:
                tv80 tv80Var2 = (tv80) obj;
                cab cabVar = (cab) obj2;
                if (((waz0) cabVar.c).a().a) {
                    g5p0.b((g5p0) cabVar.b, tv80Var2.a, 2);
                } else {
                    fcz0 fcz0Var = (fcz0) cabVar.d;
                    er91 er91Var = fcz0Var.e;
                    kt91 kt91Var = fcz0Var.a;
                    if (kt91Var.g()) {
                        kt91Var.k(er91Var);
                    } else {
                        kt91Var.o(er91Var);
                    }
                }
                return rih1Var;
            case 27:
                agx agxVar = (agx) ((bs0) obj2).b;
                return new odr(((ufx) agxVar.b).a, (String) agxVar.c, (r6h1) agxVar.d, (acq) agxVar.e, (mf4) agxVar.f);
            case 28:
                gac gacVar = new gac((Context) obj);
                bac bacVar = (bac) obj2;
                gacVar.setBubbleData(bacVar.b);
                gacVar.setContentDescription(bacVar.c);
                no80.N(gacVar);
                return gacVar;
            default:
                wxc wxcVar = (wxc) obj2;
                wxcVar.c.b(wxcVar.d, (ki0) obj);
                return rih1Var;
        }
    }
}
