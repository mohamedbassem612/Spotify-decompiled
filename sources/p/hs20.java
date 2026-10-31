package p;

import android.graphics.RectF;
import android.view.View;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.casita.v1.resolved.ResolvedHome;
import java.util.Collections;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hs20 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs20(hnn0 hnn0Var, mnn0 mnn0Var, ii30 ii30Var, zf30 zf30Var) {
        super(0);
        this.a = (byte) 3;
        this.b = mnn0Var;
        this.c = zf30Var;
    }

    public final Object invoke() {
        Double dA0;
        switch (this.a) {
            case 0:
                return (mr20) ((js20) this.b).a.invoke(this.c);
            case 1:
                ((iu30) this.b).invoke((r830) this.c);
                return rih1.a;
            case 2:
                if (!((ed30) this.b).c) {
                    krw0.i.f.a((fd30) this.c);
                }
                return rih1.a;
            case 3:
                mnn0 mnn0Var = (mnn0) this.b;
                zf30 zf30Var = (zf30) this.c;
                for (hnn0 hnn0Var : (Iterable) mnn0Var.f.a.getValue()) {
                    if (ii30.n()) {
                        Objects.toString(hnn0Var);
                        Objects.toString(zf30Var);
                    }
                    mnn0Var.c(hnn0Var);
                }
                return rih1.a;
            case 4:
                ((dk30) this.b).a("WrappedStory · reset", (uqt) this.c);
                dk30 dk30Var = (dk30) this.b;
                dk30Var.e = 0L;
                dk30Var.f = 0L;
                dk30Var.g = 0L;
                dk30Var.h = 0L;
                dk30Var.i = 0L;
                dk30Var.t = 0.0f;
                dk30Var.Y = 0;
                dk30Var.Z = 0;
                dk30Var.N0.clear();
                dk30Var.O0 = 0L;
                dk30Var.P0 = 0L;
                dk30Var.Q0 = 0L;
                dk30Var.R0.clear();
                dk30Var.S0 = -1;
                dk30Var.T0 = -1L;
                synchronized (dk30Var.U0) {
                    dk30Var.Z0 = 0;
                    dk30Var.a1 = 0;
                    dk30Var.b1 = 0.0f;
                    dk30Var.c1 = 0.0f;
                    dk30Var.d1 = 0.0f;
                    dk30Var.e1 = 0.0f;
                }
                dk30Var.g1 = false;
                dk30Var.k1 = 0L;
                dk30Var.l1 = 0L;
                dk30Var.m1 = 0L;
                dk30Var.o1 = null;
                dk30Var.p1.clear();
                return rih1.a;
            case 5:
                g2z g2zVar = (g2z) this.b;
                ((kt91) g2zVar.a).k(new er91((fs91) null, ((dg30) g2zVar.b).getString(2131953437, (String) this.c), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1.a;
            case 6:
                return new kpg0((xpw) ((iq30) this.b).a.invoke((oud) this.c), gq30.h);
            case 7:
                return new xzq((tyq) ((du30) this.b).a.invoke((oud) this.c), gq30.W0);
            case 8:
                z940 z940Var = (z940) this.b;
                String str = (String) ((ba40) this.c).b.invoke(z940Var.a);
                return Double.valueOf(((str == null || (dA0 = nhc1.a0(str)) == null) ? 0.0d : dA0.doubleValue()) / z940Var.d);
            case 9:
                pg40 pg40Var = (pg40) this.b;
                fn31.T(pg40Var.d, (o8n) null, 0, new h210(pg40Var, (nmu0) this.c, (lnm) null, (byte) 24), 3);
                return rih1.a;
            case 10:
                ((tu40) this.b).e.setValue((Object) null);
                ((Function0) this.c).invoke();
                return rih1.a;
            case 11:
                ((xz40) this.b).c.c((slc0) this.c);
                return rih1.a;
            case 12:
                vx40 vx40Var = (vx40) this.b;
                i8h1 i8h1Var = (i8h1) ((xep) vx40Var.b).get();
                x6h1 x6h1VarC = ((h4l0) vx40Var.c).b.c();
                x6h1VarC.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) this.c).invoke(j000.d);
                return rih1.a;
            case 13:
                ro30 ro30Var = (ro30) this.b;
                i8h1 i8h1Var2 = (i8h1) ((xep) ro30Var.b).get();
                ksk0 ksk0Var = (ksk0) ro30Var.c;
                x6h1 x6h1VarC2 = ksk0Var.c.c();
                x6h1VarC2.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                String str2 = nik1.f4.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str2 == null) {
                    str2 = "";
                }
                ((iu30) this.c).invoke(new l100(i8h1Var2.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA2, ksk0Var.b, System.currentTimeMillis()), (xj61) null)));
                return rih1.a;
            case 14:
                ((iu30) this.b).invoke(((jqi0) this.c).c);
                return rih1.a;
            case 15:
                ((iu30) this.b).invoke(((dji0) this.c).b);
                return rih1.a;
            case 16:
                return ((iir) this.b).h((String) this.c).map(zi20.e).map(aj20.e).onErrorComplete();
            case 17:
                xtb0 xtb0Var = (xtb0) this.b;
                qtb0 qtb0Var = (qtb0) o7h.s0(xtb0Var.h().l);
                return new l2d0(((b8f1) this.c).c.s(), ((err0) xtb0Var.e.c).s() == 0 && u890.j(qtb0Var != null ? qtb0Var.l : null, "list_ux_platform_header"));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (((s460) this.b).d != null) {
                    ((iu30) this.c).invoke(p460.a);
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((iu30) ((qxx0) this.b).f).invoke((cpa1) this.c);
                return rih1.a;
            case 20:
                ((iu30) ((qxx0) this.b).f).invoke((jz3) this.c);
                return rih1.a;
            case 21:
                ((iu30) this.b).invoke(new na60(((ab60) this.c).b.h.a));
                return rih1.a;
            case 22:
                ((iu30) this.b).invoke((id01) this.c);
                return rih1.a;
            case 23:
                return f7p1.p(((ResolvedHome) this.b).p().p(), (pv00) this.c);
            case 24:
                fn31.T((c9n) this.b, (o8n) null, 0, new no70((xx3) this.c, (lnm) null, (byte) 0), 3);
                return rih1.a;
            case 25:
                yr70 yr70Var = (yr70) this.b;
                if (yr70Var.h) {
                    ((zrg) ((ng20) this.c).b).b(yr70Var.b, yr70Var.c);
                }
                return rih1.a;
            case 26:
                ((iu30) this.b).invoke(((yr70) this.c).i);
                return rih1.a;
            case 27:
                gx70 gx70Var = (gx70) this.b;
                i8h1 i8h1Var3 = gx70Var.a;
                ksk0 ksk0Var2 = gx70Var.b;
                ksk0Var2.getClass();
                x6h1 x6h1VarC3 = ksk0Var2.c.c();
                x6h1VarC3.i.add(new a7h1("back", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                b7x b7xVar2 = b7x.a;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_hide", 1, b7xVar2), y6h1VarA3, ksk0Var2.b, System.currentTimeMillis()), (xj61) null);
                ppo1.q((cir0) this.c);
                return rih1.a;
            case 28:
                ((iu30) this.b).invoke(new rx70((RectF) ((p811) this.c).a));
                return rih1.a;
            default:
                ((iu30) this.b).invoke(l180.a);
                ((q180) this.c).a.invoke();
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hs20(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
