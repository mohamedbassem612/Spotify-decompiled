package p;

import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j4f1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4f1(wxl wxlVar, v3h1 v3h1Var, e4h1 e4h1Var, dp5 dp5Var) {
        super(0);
        this.a = (byte) 25;
        this.b = wxlVar;
    }

    public final Object invoke() {
        byte b = this.a;
        fgm1 fgm1Var = fgm1.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((gaa0) obj).d((CancellationException) null);
                return rih1Var;
            case 1:
                return (Float) ((iyd) obj).f.getValue();
            case 2:
                ((xcf1) obj).i.a(fgm1Var);
                return rih1Var;
            case 3:
                gdf1 gdf1Var = (gdf1) obj;
                if (gdf1Var.g()) {
                    gdf1Var.c.f();
                }
                return rih1Var;
            case 4:
                xdf1 xdf1Var = (xdf1) obj;
                return new nef1(xdf1Var.a, xdf1Var.b, xdf1Var.c, xdf1Var.d, xdf1Var.e, xdf1Var.f, xdf1Var.g, xdf1Var.t, xdf1Var.i, xdf1Var.X);
            case 5:
                try {
                    int i = hu50.a;
                    return gu50.a.F(((kjf1) obj).a, nne.a).toString();
                } catch (Throwable th) {
                    Logger.e(th, "Error generating pseudo random id for track", new Object[0]);
                    return "";
                }
            case 6:
                Parcelable parcelable = ((ujf1) obj).O0().getParcelable("key-view-data");
                if (parcelable != null) {
                    return (xjf1) parcelable;
                }
                hhg1.n("Required value was null.");
                return null;
            case 7:
                return (i8h1) ((kly0) ((im0) obj).h).get();
            case 8:
                return (qzh) ((xnf1) obj).a.get();
            case 9:
                return yoi1.i(new jha1(((rsf1) obj).N.k(), (byte) 18), o6x.a);
            case 10:
                return (i8h1) ((mtf1) obj).g.get();
            case 11:
                ux3 ux3Var = ((uvf1) obj).h;
                if (ux3Var != null) {
                    return t5p1.j(ux3Var.b(), 3);
                }
                return null;
            case 12:
                qtt0 qtt0Var = ((jyf1) obj).h;
                if (qtt0Var != null && qtt0Var != qtt0.b && qtt0Var != qtt0.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                return ((j7h1) obj).a;
            case 14:
                obl1 obl1Var = (obl1) ((h680) obj).b;
                obl1Var.f.a();
                obl1Var.e = BehaviorSubject.f();
                return rih1Var;
            case 15:
                return flo1.l(((lu51) obj).b, guo1.B());
            case 16:
                return (i8h1) ((hsq) ((dlg1) obj).a).get();
            case 17:
                return new laa1((rb3) obj);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new xv81((apz0) obj);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new kpg0((xpw) ((d82) obj).d.get(), zdg1.e1);
            case 20:
                bvm bvmVar = (bvm) obj;
                return new kpg0((d511) bvmVar.d, new ymg1(bvmVar, (byte) 4));
            case 21:
                ((kjs) obj).b.invoke(am91.a);
                return rih1Var;
            case 22:
                return flo1.l(guo1.B(), ((kxg1) obj).h);
            case 23:
                ((xgm1) ((vh6) obj).h).a(fgm1Var);
                return rih1Var;
            case 24:
                ((xgm1) ((rb90) obj).g).a(fgm1Var);
                return rih1Var;
            case 25:
                bpb1 bpb1Var = ((wxl) obj).b;
                bpb1Var.m((Object) null, Integer.valueOf(((Number) bpb1Var.getValue()).intValue() + 1));
                return rih1Var;
            case 26:
                hce1 hce1Var = (hce1) obj;
                return Boolean.valueOf((((hrr0) hce1Var.b).getValue() == null && ((hrr0) hce1Var.c).getValue() == null) ? false : true);
            case 27:
                return ((ttm0) ((j5h1) obj).a.get()).c(true);
            case 28:
                eah1 eah1Var = (eah1) obj;
                return d5p1.r(hu20.e((mr20) eah1Var.c.invoke(), new afb1((lnm) null, eah1Var, (byte) 8)), smo1.e(eah1Var.b), new alb1(0L, Long.MAX_VALUE), 1);
            default:
                fah1 fah1Var = (fah1) obj;
                return d5p1.r(hu20.e((mr20) fah1Var.b.invoke(), new afb1((lnm) null, fah1Var, (byte) 9)), smo1.e(fah1Var.a), new alb1(0L, Long.MAX_VALUE), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4f1(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }
}
