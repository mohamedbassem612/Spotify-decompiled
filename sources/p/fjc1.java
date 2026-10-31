package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.encoreconsumermobile.elements.loadingdots.ThreeDotsLoaderView;
import com.spotify.encoreconsumermobile.elements.thumb.ThumbButtonView;
import com.spotify.scrollsita.v1.Section;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fjc1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fjc1(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        hzx m231Var;
        long j;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gjc1 gjc1Var = (gjc1) obj;
                return ((q940) gjc1Var.a.get()).a(gjc1Var.b).b(p7h.M(new m9d0[]{sc41.b, sc41.k, sc41.j, sc41.n, sc41.l, sc41.m}));
            case 1:
                Context context = (Context) ((a0q) ((k2q) ((gsq) ((ka3) obj).d).a.b).b).a.x1.a;
                c8o.l(context);
                return new kpg0(new sdv0((byte) 1, context.getResources().getConfiguration().getLayoutDirection() == 1), ljc1.c);
            case 2:
                return new kpg0((xpw) ((dqg) obj).e.get(), ljc1.d);
            case 3:
                return (i8h1) ((qmc1) obj).a.get();
            case 4:
                csc1 csc1Var = (csc1) obj;
                lzn0 lzn0Var = csc1Var.b;
                if (lzn0Var.j(csc1Var.a)) {
                    lzn0Var.e();
                } else {
                    csc1Var.c.l();
                }
                return rih1Var;
            case 5:
                uw0 uw0Var = (uw0) obj;
                ((f2g1) uw0Var.X).b((String) uw0Var.g, (vtc1) uw0Var.O0);
                return rih1Var;
            case 6:
                return (dma1) ((vvc1) obj).c.blockingGet();
            case 7:
                x6h1 x6h1VarC = ((p6m0) obj).b.c();
                x6h1VarC.i.add(new a7h1("listening_data_available_tooltip", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
            case 8:
                Context context2 = ((b0d1) obj).a.a;
                try {
                    sw9 sw9Var = new sw9(context2.getApplicationContext());
                    sw9Var.H();
                    m231Var = hzx.a(context2.getApplicationContext(), "com.spotify.super-connect-pairing", sw9Var.v(), fzx.b, gzx.b);
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                return (SharedPreferences) (m231Var instanceof m231 ? null : m231Var);
            case 9:
                return ((teo0) ((d520) obj).g).create();
            case 10:
                return hvp0.b((hvp0) ((ne) obj).a);
            case 11:
                uhd1 uhd1Var = (uhd1) obj;
                return Integer.valueOf(uhd1Var.a.indexOf(uhd1Var.c.getValue()));
            case 12:
                mmr0 mmr0Var = (mmr0) mpd1.b.get(((lpd1) obj).a);
                if (mmr0Var == null) {
                    mmr0Var = mpd1.a;
                }
                return v8r.q(mmr0Var);
            case 13:
                wvd1 wvd1Var = (wvd1) obj;
                luk lukVar = wvd1Var.b;
                if (lukVar != null) {
                    return lukVar.e(new e4n0(wvd1Var, (byte) 19));
                }
                return null;
            case 14:
                return (i8h1) ((hsq) ((lvc1) obj).b).get();
            case 15:
                return new xzq((jd6) ((fb3) obj).c, vxd1.Y0);
            case 16:
                lcc.z((eae1) obj, AndroidCompositionLocals_androidKt.b);
                return rih1Var;
            case 17:
                ((zqf) obj).invoke();
                return rih1Var;
            case 18:
                int iOrdinal = ((q061) obj).ordinal();
                if (iOrdinal == 0) {
                    uwr uwrVar = cbx.a;
                    j = ((vex) zex.a.e).f;
                } else if (iOrdinal == 1) {
                    uwr uwrVar2 = cbx.a;
                    j = ((vex) zex.a.e).b;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    j = u7h.j;
                }
                return new u7h(j);
            case 19:
                ((cde1) obj).a();
                return rih1Var;
            case 20:
                cdf0 cdf0VarA = bqn1.A(((ThreeDotsLoaderView) obj).getContext(), 2131886099);
                cdf0VarA.x(1);
                cdf0VarA.w(-1);
                return cdf0VarA;
            case 21:
                ThumbButtonView thumbButtonView = (ThumbButtonView) obj;
                thumbButtonView.n(thumbButtonView.e);
                return rih1Var;
            case 22:
                return Uri.parse(((aie1) obj).a);
            case 23:
                fke1 fke1Var = (fke1) obj;
                long jB = fke1Var.e1.b();
                float f = fke1Var.T0 * fke1Var.f1;
                boolean z = fke1Var.X0 > 0 && Math.abs(fke1Var.W0) > ((float) fke1Var.X0) * fke1Var.S0;
                boolean z2 = Math.abs(qui1.d(jB)) > f;
                if (z || z2) {
                    float f2 = fke1Var.W0 >= 0.0f ? 90.0f : -90.0f;
                    xab1 xab1Var = fke1Var.a1;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    fke1Var.a1 = fn31.T(fke1Var.v1(), (o8n) null, 0, new xb5(fke1Var, f2, new l811(), (lnm) null, (byte) 2), 3);
                } else {
                    fke1Var.W0 = 0.0f;
                    xab1 xab1Var2 = fke1Var.a1;
                    if (xab1Var2 != null) {
                        xab1Var2.d((CancellationException) null);
                    }
                    fke1Var.a1 = fn31.T(fke1Var.v1(), (o8n) null, 0, new eke1(fke1Var, null, (byte) 0), 3);
                }
                return rih1Var;
            case 24:
                x6h1 x6h1VarC2 = ((r6m0) obj).a.c();
                x6h1VarC2.i.add(new a7h1("listening_data_available_tooltip", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 25:
                cm0 cm0Var = (cm0) obj;
                return new pre1((lsq) cm0Var.d, (msq) cm0Var.e, (auq) cm0Var.f, (buq) cm0Var.g, (cuq) cm0Var.h, (duq) cm0Var.i, (xtq) cm0Var.t, (fhi1) cm0Var.X);
            case 26:
                ((mim1) ((jye1) obj).d).invoke();
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((mye1) obj).e.invoke();
                return rih1Var;
            case 28:
                Function0 function0 = (Function0) ((kkz0) obj).b;
                if (function0 != null) {
                    function0.invoke();
                }
                return rih1Var;
            default:
                bpb1 bpb1Var = ((e0f1) obj).a;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, nog1.a);
                return rih1Var;
        }
    }
}
