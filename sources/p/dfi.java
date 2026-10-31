package p;

import android.app.Activity;
import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dfi extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dfi(byte b, Object obj, iu30 iu30Var) {
        super(0);
        this.a = b;
        this.c = obj;
        this.b = iu30Var;
    }

    public final Object invoke() {
        brb brbVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ikl iklVar = (ikl) obj;
                ((iu30) obj2).invoke(new tym1(iklVar.a, iklVar.b.e));
                return rih1Var;
            case 1:
                Context context = (Context) obj2;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    Logger.g("XDeviceInstall: clicked", new Object[0]);
                    fn31.T((c9n) obj, (o8n) null, 0, new wt(activity, (lnm) null, (byte) 24), 3);
                }
                return rih1Var;
            case 2:
                ((iu30) obj2).invoke(new dlt(((flt) obj).b));
                return rih1Var;
            case 3:
                ((iu30) obj2).invoke(u9x.a);
                ((w9x) obj).c.invoke();
                return rih1Var;
            case 4:
                ((iu30) obj2).invoke(new vpy((tpy) obj));
                return rih1Var;
            case 5:
                b0z b0zVar = (b0z) obj;
                p60 p60Var = b0zVar.b;
                ((iu30) obj2).invoke(new a0z(p60Var.l, b0zVar.a, p60Var.e));
                return rih1Var;
            case 6:
                brbVar = ((vo10) obj) instanceof so10 ? go10.a : null;
                if (brbVar != null) {
                    ((iu30) obj2).invoke(brbVar);
                }
                return rih1Var;
            case 7:
                ((iu30) obj2).invoke(((fc30) obj).b ? ec30.b : ec30.a);
                return rih1Var;
            case 8:
                ((iu30) obj2).invoke((sr30) obj);
                return rih1Var;
            case 9:
                ((iu30) obj2).invoke(new lf40(((mf40) obj).a));
                return rih1Var;
            case 10:
                if (((nl50) obj) instanceof kl50) {
                    ((iu30) obj2).invoke(zk50.a);
                }
                return rih1Var;
            case 11:
                p0a0 p0a0Var = (p0a0) ((q0a0) obj);
                ((iu30) obj2).invoke(new j0a0(p0a0Var.b, p0a0Var.d));
                return rih1Var;
            case 12:
                ((iu30) obj2).invoke(new c6a0(!((d6a0) obj).a));
                return rih1Var;
            case 13:
                iu30 iu30Var = (iu30) obj2;
                brb brbVar2 = ((qec0) obj).b;
                brbVar = brbVar2 instanceof brb ? brbVar2 : null;
                iu30Var.invoke((brbVar == null || !brbVar.c) ? pec0.a : pec0.b);
                return rih1Var;
            case 14:
                ((iu30) obj2).invoke(new ieg0(!((a0g) obj).c));
                return rih1Var;
            case 15:
                iu30 iu30Var2 = (iu30) obj2;
                int iOrdinal = ((obk0) obj).c.ordinal();
                lbk0 lbk0Var = lbk0.b;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        lbk0Var = lbk0.a;
                    } else if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                }
                iu30Var2.invoke(lbk0Var);
                return rih1Var;
            case 16:
                ((iu30) obj2).invoke(new rao0(((sao0) obj).a));
                return rih1Var;
            case 17:
                ((iu30) obj2).invoke(((ggo0) obj).b ? fgo0.b : fgo0.a);
                return rih1Var;
            case 18:
                ((iu30) obj2).invoke(new vus0(((yus0) obj).f));
                return rih1Var;
            case 19:
                ((iu30) obj2).invoke(new yev0(((bfv0) obj).c));
                return rih1Var;
            case 20:
                oc31 oc31Var = (oc31) obj;
                ((iu30) obj2).invoke(new nc31(oc31Var.a, oc31Var.b));
                return rih1Var;
            case 21:
                y7e1 y7e1Var = (y7e1) obj2;
                h4e1 h4e1VarH = y7e1Var.h();
                try {
                    h4e1VarH.k(0, h4e1VarH.c.length(), "");
                    y7e1Var.a(h4e1VarH);
                    y7e1Var.c();
                    ((rb51) obj).c.invoke();
                    return rih1Var;
                } catch (Throwable th) {
                    y7e1Var.c();
                    throw th;
                }
            case 22:
                ((iu30) obj2).invoke(new ak51(((ck51) obj).d));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((iu30) obj2).invoke(((wt51) obj).a ? ut51.a : ut51.b);
                return rih1Var;
            case 24:
                ((iu30) obj2).invoke(((bd61) obj).e ? zc61.b : zc61.a);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((iu30) obj2).invoke(new s591(((t591) obj).a));
                return rih1Var;
            case 26:
                iu30 iu30Var3 = (iu30) obj2;
                if (((kva1) obj).b) {
                    iu30Var3.invoke(jva1.b);
                } else {
                    iu30Var3.invoke(jva1.a);
                }
                return rih1Var;
            case 27:
                iu30 iu30Var4 = (iu30) obj2;
                if (((l0b1) obj).a) {
                    iu30Var4.invoke(j0b1.a);
                } else {
                    iu30Var4.invoke(i0b1.a);
                }
                return rih1Var;
            case 28:
                String str = ((y0b1) obj).b.a;
                if (str != null) {
                    ((iu30) obj2).invoke(new w0b1(str));
                }
                return rih1Var;
            default:
                ((iu30) obj2).invoke(((swb1) obj).b ? owb1.a : pwb1.a);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dfi(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
