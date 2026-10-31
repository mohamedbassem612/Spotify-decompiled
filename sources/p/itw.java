package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class itw extends hab0 implements Function0 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ cv30 i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itw(ldp0 ldp0Var, ldp0 ldp0Var2, ldp0 ldp0Var3, ldp0 ldp0Var4, ldp0 ldp0Var5, ldp0 ldp0Var6, ldp0 ldp0Var7, ldp0 ldp0Var8, ldp0 ldp0Var9, ldp0 ldp0Var10) {
        super(0);
        this.b = ldp0Var;
        this.c = ldp0Var2;
        this.d = ldp0Var3;
        this.e = ldp0Var4;
        this.f = ldp0Var5;
        this.g = ldp0Var6;
        this.h = ldp0Var7;
        this.i = ldp0Var8;
        this.t = ldp0Var9;
        this.X = ldp0Var10;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.X;
        Object obj2 = this.t;
        ldp0 ldp0Var = this.i;
        ldp0 ldp0Var2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                ven0 ven0Var = (ven0) obj2;
                q811 q811Var = (q811) obj7;
                q811 q811Var2 = (q811) obj6;
                q811 q811Var3 = (q811) obj8;
                Object obj9 = q811Var3.a;
                boolean z = false;
                boolean z2 = (obj9 == null || obj9 == obj4) ? false : true;
                Object obj10 = q811Var.a;
                if (obj10 != null && !obj10.equals(q811Var2.a)) {
                    z = true;
                }
                if ((z2 || z) && !((guj) ven0Var.getValue()).b.w()) {
                    Object value = ((ven0) obj).getValue();
                    guj gujVar = (guj) ven0Var.getValue();
                    int iB = ((px20) obj3).b();
                    Object obj11 = ((q811) obj5).a;
                    if (obj11 == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    otw.f(value, gujVar, iB, (ztw) obj11, (op80) q811Var2.a, (String) ldp0Var2, (iu30) ldp0Var);
                }
                q811Var3.a = obj4;
                q811Var.a = q811Var2.a;
                return rih1.a;
            default:
                Flowable flowable = (Flowable) ((ldp0) obj8).invoke();
                Scheduler scheduler = (Scheduler) ((ldp0) obj7).invoke();
                Scheduler scheduler2 = (Scheduler) ((ldp0) obj6).invoke();
                Scheduler scheduler3 = (Scheduler) ((ldp0) obj5).invoke();
                gw70 gw70Var = (gw70) ((ldp0) obj4).invoke();
                Context context = (Context) ((ldp0) obj3).invoke();
                xs80 xs80Var = (xs80) ldp0Var2.invoke();
                i8h1 i8h1Var = (i8h1) ldp0Var.invoke();
                ((ldp0) obj2).invoke();
                return ern1.o(new ywv0(flowable, scheduler, scheduler2, scheduler3, gw70Var, context, xs80Var, i8h1Var, (luk) ((ldp0) obj).invoke()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itw(q811 q811Var, Object obj, q811 q811Var2, q811 q811Var3, px20 px20Var, q811 q811Var4, String str, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2) {
        super(0);
        this.b = q811Var;
        this.f = obj;
        this.c = q811Var2;
        this.d = q811Var3;
        this.g = px20Var;
        this.e = q811Var4;
        this.h = str;
        this.i = iu30Var;
        this.t = ven0Var;
        this.X = ven0Var2;
    }
}
