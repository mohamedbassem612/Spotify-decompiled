package p;

import android.content.Context;
import android.view.View;
import com.spotify.nowplaying.scroll.view.TouchBlockingFrameLayout;
import com.spotify.tap.spoton.SpotOnService;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ruz0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ruz0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void run() {
        Object value;
        xai1 xai1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                t01 t01Var = (t01) obj;
                ((lzn0) ((fsl) t01Var.u().i).g).e();
                n830 n830VarU = t01Var.u();
                ((kt91) ((fsl) n830VarU.i).e).k(new er91((fs91) null, ((Context) n830VarU.d).getString(2131960856), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            case 1:
                ((o101) obj).j.invoke();
                break;
            case 2:
                ((p501) obj).a.onNext(rih1Var);
                break;
            case 3:
                ((o401) obj).f.t();
                break;
            case 4:
                ((az11) obj).X.onNext(r020.a);
                break;
            case 5:
                ((ai21) obj).b.e();
                break;
            case 6:
                ffb0 ffb0Var = ((at21) obj).c;
                ffb0Var.d = true;
                dma1 dma1Var = ffb0Var.a;
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.b(gfb0.c, dma1Var.l(gfb0.a(), 0) + 1);
                hma1VarEdit.h();
                break;
            case 7:
                vb41 vb41Var = (vb41) obj;
                vb41Var.n = false;
                vb41Var.a();
                break;
            case 8:
                ((nf61) obj).a.onNext(rih1Var);
                break;
            case 9:
                xi61 xi61Var = (xi61) obj;
                dma1 dma1Var2 = xi61Var.d;
                qhn.a.getClass();
                String strE = dma1Var2.e(phn.b, (String) null);
                if (strE != null) {
                    bpb1 bpb1Var = xi61Var.h;
                    do {
                        value = bpb1Var.getValue();
                        xai1Var = (abi1) value;
                        if (u890.j(xai1Var, yai1.a)) {
                            xai1Var = new xai1(strE);
                        }
                    } while (!bpb1Var.k(value, xai1Var));
                }
                break;
            case 10:
                ((gk61) obj).b.a.onNext(fpy0.a);
                break;
            case 11:
                y281 y281Var = ((xx91) obj).k;
                ((BehaviorSubject) y281Var.b).onNext(new k5a1());
                break;
            case 12:
                SpotOnService spotOnService = (SpotOnService) obj;
                spotOnService.b().a();
                spotOnService.i = false;
                spotOnService.stopSelf();
                break;
            case 13:
                ((cn00) obj).a();
                break;
            case 14:
                ((nt21) ((g2x0) obj).b).i(1);
                break;
            case 15:
                ((ObservableEmitter) obj).onComplete();
                break;
            case 16:
                ((FlowableEmitter) obj).onComplete();
                break;
            case 17:
                hma1 hma1VarEdit2 = ((jcd1) obj).d.edit();
                xxy0.a.getClass();
                hma1VarEdit2.f(wxy0.b);
                hma1VarEdit2.g();
                break;
            case 18:
                ((los) ((yup0) obj).c).a(ixb.c);
                break;
            case 19:
                oyd1 oyd1Var = (oyd1) obj;
                oyd1Var.h2 = true;
                oyd1Var.dismiss();
                break;
            case 20:
                kt91 kt91Var = ((s9x) obj).d;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959442});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", 2131959442, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                if (!kt91Var.g()) {
                    kt91Var.o(er91Var);
                } else {
                    kt91Var.k(er91Var);
                }
                break;
            case 21:
                ((TouchBlockingFrameLayout) obj).a = false;
                break;
            case 22:
                g5p0.b(((nmh1) obj).c, (ou80) null, 3);
                break;
            case 23:
                g0l1 g0l1Var = (g0l1) obj;
                bih1 bih1Var = g0l1Var.a;
                Context context = g0l1Var.c;
                context.getClass();
                cir0 cir0Var = g0l1Var.d;
                cir0Var.getClass();
                g0l1Var.e = ((byf) bih1Var.b).a(context, cir0Var, (vjj0) bih1Var.c, vxf.b, true);
                break;
            case 24:
                ((h5l1) obj).t = true;
                break;
            default:
                ((ikl1) obj).d.c();
                break;
        }
    }
}
