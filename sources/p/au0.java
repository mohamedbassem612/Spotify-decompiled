package p;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class au0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au0(Object obj, Object obj2, long j, byte b) {
        super(0);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                o2u0 o2u0Var = (o2u0) obj2;
                if (o2u0Var != null) {
                    ((uoa) obj).h(o2u0Var, new oot0(this.b, 0L, false, false, (hu7) null, (tne1) null, false, 254));
                }
                return rih1Var;
            case 1:
                ((Function0) obj2).invoke();
                ((iu30) obj).invoke(new vza(j));
                return rih1Var;
            case 2:
                fyg fygVar = (fyg) obj;
                ((iu30) obj2).invoke(new cyg(fygVar.b, fygVar.a, j));
                return rih1Var;
            case 3:
                vwm vwmVar = (vwm) obj;
                ((iu30) obj2).invoke(new swm(vwmVar.a, vwmVar.b, j));
                return rih1Var;
            case 4:
                ((vu30) obj2).invoke(((txm) obj).a, new u7h(j));
                return rih1Var;
            case 5:
                iu30 iu30Var = (iu30) obj;
                gmg0 gmg0Var = (gmg0) obj2;
                if (gmg0Var.k) {
                    String str = gmg0Var.a;
                    if (str != null) {
                        iu30Var.invoke(new amg0(str, j));
                    }
                } else {
                    iu30Var.invoke(bmg0.a);
                }
                return rih1Var;
            case 6:
                return Long.valueOf(((ima1) obj2).o().getLong(((bma1) obj).a, j));
            default:
                return Long.valueOf(((SharedPreferences) obj2).getLong((String) obj, j));
        }
    }
}
