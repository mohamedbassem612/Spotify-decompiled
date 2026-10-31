package p;

import android.app.Activity;
import android.content.Context;
import j$.time.Clock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jep {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ jep(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final jqd0 a(boolean z) {
        byte b = this.a;
        thq thqVar = this.b;
        switch (b) {
            case 0:
                f9p f9pVar = (f9p) ((lbp) thqVar).c;
                xfx xfxVar = (xfx) ((e7z) f9pVar.X).r.get();
                c8o.l(xfxVar);
                hjc hjcVar = new hjc(xfxVar.b, (byte) 25);
                Activity activityA = ((e7z) f9pVar.X).a();
                c8o.l(activityA);
                Clock clockSystemUTC = Clock.systemUTC();
                c8o.m(clockSystemUTC);
                mcv0 mcv0Var = new mcv0(clockSystemUTC);
                luk lukVarB = ((e7z) f9pVar.X).b();
                c8o.l(lukVarB);
                return new jqd0(hjcVar, new b2c(activityA, mcv0Var, new go4(false, false, false, lukVarB).a(), 2), z, (byte) 11);
            case 1:
                nwp nwpVar = (nwp) ((gbp) thqVar).c;
                hjc hjcVar2 = new hjc(((xfx) nwpVar.h.get()).b, (byte) 25);
                Context context = (Context) nwpVar.b.d;
                c8o.l(context);
                Clock clockSystemUTC2 = Clock.systemUTC();
                c8o.m(clockSystemUTC2);
                return new jqd0(hjcVar2, new b2c(context, new mcv0(clockSystemUTC2), new go4(false, false, false, (luk) nwpVar.g.get()).a(), 1), z, (byte) 11);
            default:
                v5q v5qVar = thqVar.c;
                hjc hjcVar3 = new hjc(((xfx) v5qVar.o1.get()).b, (byte) 25);
                daq daqVar = v5qVar.b;
                return new jqd0(hjcVar3, new b2c((Context) daqVar.x1.a, new mcv0((Clock) v5qVar.k9.get()), new go4(false, false, false, (luk) daqVar.L1.get()).a(), 1), z, (byte) 11);
        }
    }
}
