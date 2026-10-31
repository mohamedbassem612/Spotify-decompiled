package p;

import android.os.Bundle;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o4u extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4u(u601 u601Var, iu30 iu30Var, Object obj, ysw yswVar) {
        super(1);
        this.a = (byte) 6;
        this.b = u601Var;
        this.e = iu30Var;
        this.c = obj;
        this.d = yswVar;
    }

    public final Object invoke(Object obj) {
        long jV;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                AtomicReference atomicReference = (AtomicReference) obj5;
                Object obj6 = atomicReference.get();
                q4u q4uVar = (q4u) obj3;
                if (!q4uVar.b || ((Boolean) ((vu30) obj2).invoke(obj6, obj)).booleanValue()) {
                    ((iu30) obj4).invoke(obj);
                    q4uVar.b = true;
                }
                atomicReference.set(obj);
                return rih1Var;
            case 1:
                return new sj4((Function0) obj5, (ven0) obj3, (ven0) obj2, (c9n) obj4, (byte) 2);
            case 2:
                kd31 kd31Var = (kd31) obj;
                ft71 ft71Var = (ft71) obj5;
                tob1 tob1Var = (tob1) obj3;
                kd31Var.b(ft71Var.a(tob1Var != null ? ((Number) tob1Var.getValue()).floatValue() : 1.0f));
                tob1 tob1Var2 = (tob1) obj2;
                float fB = ft71Var.b(tob1Var2 != null ? ((Number) tob1Var2.getValue()).floatValue() : 1.0f);
                kd31Var.q(fB);
                kd31Var.r(fB);
                tob1 tob1Var3 = (tob1) obj4;
                if (tob1Var3 != null) {
                    jV = ((ofg1) tob1Var3.getValue()).a;
                } else {
                    int i = ofg1.c;
                    jV = wpb1.v();
                }
                kd31Var.A(ft71Var.d(jV));
                return rih1Var;
            case 3:
                fhk0.a((ven0) obj3);
                c921.y((c9n) obj5, (o8n) null, 0, new k1e0((bgn0) obj2, (jgn0) obj, (tbr0) obj4, (lnm) null, (byte) 13), 3);
                return rih1Var;
            case 4:
                ((l811) obj5).a = true;
                gon0.d((gon0) obj3, (vnn0) obj2, (Bundle) obj4, (hnn0) obj);
                return rih1Var;
            case 5:
                air0 air0Var = (air0) obj5;
                ((ven0) obj2).setValue(air0Var.d());
                dcr0 dcr0Var = (dcr0) obj3;
                ((ven0) obj4).setValue(dcr0Var.e());
                air0Var.a();
                dcr0Var.a();
                return rih1Var;
            default:
                FrameLayout frameLayout = (FrameLayout) obj;
                xhk1.f(frameLayout, (u601) obj5);
                frameLayout.setTag(2131428154, (iu30) obj4);
                ((isw) frameLayout.getTag(2131428153)).a(obj3, (ysw) obj2);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4u(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
