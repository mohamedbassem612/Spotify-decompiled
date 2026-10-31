package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d4e extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4e(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ilo1.B(((i4e) obj).b, guo1.B());
            case 1:
                return (cxc) obj;
            case 2:
                i3h i3hVar = (i3h) obj;
                ltm1 ltm1Var = i3hVar.b;
                Context context = i3hVar.a;
                ltm1Var.getClass();
                return ltm1.d(context);
            case 3:
                return ((c4n0) obj).getViewUri().a;
            case 4:
                g0i g0iVar = (g0i) obj;
                return new dt30(g0iVar.f, new d0i(g0iVar, (byte) 1));
            case 5:
                return ((tdk) obj).P0.y();
            case 6:
                p3l p3lVar = (p3l) obj;
                luk lukVar = p3lVar.U;
                if (lukVar != null) {
                    return (p3l) lukVar.e(new c44(p3lVar, (byte) 11));
                }
                return null;
            case 7:
                return (maa) ((etl) obj).b.invoke();
            case 8:
                return Integer.valueOf(((List) obj).size());
            case 9:
                CoverScreenWidgetProvider coverScreenWidgetProvider = (CoverScreenWidgetProvider) obj;
                return coverScreenWidgetProvider.f.a(new j3m(coverScreenWidgetProvider, (byte) 24));
            case 10:
                ((knn) obj).a.e();
                return rih1Var;
            case 11:
                ((gvo) obj).h("");
                return rih1Var;
            case 12:
                gdr gdrVar = (gdr) obj;
                bma1 bma1Var = gdr.c;
                if (((fdr) gdrVar.b().b) != fdr.b) {
                    hma1 hma1VarEdit = gdrVar.a.edit();
                    hma1VarEdit.f(gdr.c);
                    hma1VarEdit.f(gdr.d);
                    hma1VarEdit.g();
                }
                return rih1Var;
            case 13:
                ((x2e) obj).a();
                return rih1Var;
            case 14:
                return ilo1.B(((fpr) obj).d, guo1.B());
            case 15:
                return (owh0) ((p7s) obj).a.get();
            case 16:
                return x74.G(tjq.f((tjq) obj).u().getContext(), 2131231590);
            case 17:
                v8w0 v8w0VarB = v8w0.b(LayoutInflater.from((Context) obj));
                v8w0VarB.a().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                v9w0 v9w0VarQ = b2u.q(v8w0VarB.a());
                Collections.addAll(v9w0VarQ.d, v8w0VarB.b);
                v9w0VarQ.a();
                return v8w0VarB;
            case 18:
                q8n q8nVar = ((hks) obj).d;
                j0d1 j0d1VarB = guo1.B();
                q8nVar.getClass();
                return ilo1.B(q8nVar, j0d1VarB);
            case 19:
                h98.a((h98) obj).b.u0(0);
                return rih1Var;
            case 20:
                es41 es41Var = (es41) obj;
                if (es41Var.f.s() != Integer.MAX_VALUE && es41Var.a.s() >= es41Var.f.s()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 21:
                return (lou) ((ynb0) obj).get();
            case 22:
                z1v z1vVar = (z1v) obj;
                MobiusLoop mobiusLoop = z1vVar.b;
                if (mobiusLoop == null) {
                    u890.C("loop");
                    throw null;
                }
                mmr0 mmr0VarR = bin.r(mobiusLoop);
                Disposable disposable = (Disposable) mmr0VarR.a;
                wen0 wen0Var = (wen0) mmr0VarR.b;
                z1vVar.c = disposable;
                return wen0Var;
            case 23:
                ((rm70) obj).C(null);
                return rih1Var;
            case 24:
                gbx gbxVar = (gbx) obj;
                return new epo(gbxVar.c, new n70(gbxVar, (byte) 1));
            case 25:
                ryx ryxVar = (ryx) obj;
                d3j0 d3j0VarD = ryxVar.d();
                if (d3j0VarD != null) {
                    return new k6w0(p4j0.a, d3j0VarD, new ro8(ryxVar, (lnm) null, (byte) 9));
                }
                return null;
            case 26:
                return (ft71) obj;
            case 27:
                return ((lly) obj).e;
            case 28:
                return new trc0(((uvy) obj).d, (g3d0) null, w7x.a, false, new rrc0(Collections.singleton(dlc0.t)), hqz0.a, (prc0) null, 0, (List) null, 458);
            default:
                return ((c7z) obj).j.a();
        }
    }
}
