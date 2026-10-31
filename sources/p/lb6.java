package p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lb6 implements oi51 {
    public final /* synthetic */ byte a;
    public final yyn b;
    public final avp c;
    public final xf4 d;

    public /* synthetic */ lb6(yyn yynVar, avp avpVar, xf4 xf4Var, byte b) {
        this.a = b;
        this.b = yynVar;
        this.c = avpVar;
        this.d = xf4Var;
    }

    public final void a(ji50 ji50Var, tcr0 tcr0Var) {
        byte b = this.a;
        avp avpVar = this.c;
        xf4 xf4Var = this.d;
        switch (b) {
            case 0:
                LinkedHashMap linkedHashMap = ji50Var.b;
                boolean zF = xf4Var.f();
                pp5 pp5Var = new pp5(this, tcr0Var, (byte) 5);
                Set set = ryn.a;
                t16 t16Var = t16.g;
                ad5 ad5Var = ad5.g;
                if (!zF) {
                    linkedHashMap.put(ger0.class, r4o1.Q(t16Var, set, pp5Var, ad5Var));
                } else {
                    linkedHashMap.put(ger0.class, new r3r(new xzq(avpVar.a(ji50Var.a, new y0(1, 1, 16, xf4Var.B(), false)), new tsm1(this, (byte) 23)), ad5Var, 4));
                }
                break;
            default:
                LinkedHashMap linkedHashMap2 = ji50Var.b;
                boolean zF2 = xf4Var.f();
                hj8 hj8Var = new hj8((Object) this, (Object) tcr0Var, (byte) 1);
                Set set2 = ryn.a;
                oc8 oc8Var = oc8.P0;
                tj8 tj8Var = tj8.g;
                linkedHashMap2.put(mer0.class, zF2 ? new r3r(new xzq(avpVar.a(ji50Var.a, new y0(1, 1, 20, false, false)), oc8.N0), tj8Var, 4) : r4o1.Q(oc8Var, set2, hj8Var, tj8Var));
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return ger0.class;
            default:
                return mer0.class;
        }
    }

    public final Set c() {
        byte b = this.a;
        kcr0 kcr0Var = kcr0.a;
        switch (b) {
            case 0:
                return Collections.singleton(new scr0(kcr0Var, t16.h));
            default:
                return Collections.singleton(new scr0(kcr0Var, oc8.Q0));
        }
    }
}
