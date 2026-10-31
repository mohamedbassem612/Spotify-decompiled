package p;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wjq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ wjq(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final iis a(Context context, Function0 function0, Function0 function1) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                yjq yjqVar = (yjq) ((ywp) jly0Var).c;
                String string = ((rww0) yjqVar.c).O0().getString("extra_feature_identifier");
                if (string == null) {
                    string = "UNKNOWN";
                }
                String str = string;
                sww0 sww0Var = (sww0) yjqVar.d;
                xfx xfxVar = (xfx) sww0Var.d.get();
                c8o.l(xfxVar);
                af10 af10Var = (af10) sww0Var.a.get();
                c8o.l(af10Var);
                dgx dgxVar = new dgx(xfxVar.g, af10Var, (byte) 1);
                xfx xfxVar2 = (xfx) sww0Var.d.get();
                c8o.l(xfxVar2);
                Activity activity = (Activity) sww0Var.b.a;
                c8o.l(activity);
                nfx nfxVar = new nfx(xfxVar2.g, activity.getWindow(), (byte) 3);
                xfx xfxVar3 = (xfx) sww0Var.d.get();
                c8o.l(xfxVar3);
                af10 af10Var2 = (af10) sww0Var.a.get();
                c8o.l(af10Var2);
                dgx dgxVar2 = new dgx(xfxVar3.g, af10Var2, (byte) 0);
                xfx xfxVar4 = (xfx) sww0Var.d.get();
                c8o.l(xfxVar4);
                af10 af10Var3 = (af10) sww0Var.a.get();
                c8o.l(af10Var3);
                return new iis(context, function0, function1, str, dgxVar, nfxVar, dgxVar2, new dgx(xfxVar4.g, af10Var3, (byte) 2));
            default:
                byp bypVar = (byp) ((ywp) jly0Var).c;
                String str2 = ((m0x0) bypVar.c).e;
                c8o.m(str2);
                k0x0 k0x0Var = (k0x0) bypVar.b;
                xfx xfxVar5 = (xfx) k0x0Var.g.get();
                c8o.l(xfxVar5);
                af10 af10Var4 = (af10) k0x0Var.d.get();
                c8o.l(af10Var4);
                dgx dgxVar3 = new dgx(xfxVar5.g, af10Var4, (byte) 1);
                xfx xfxVar6 = (xfx) k0x0Var.g.get();
                c8o.l(xfxVar6);
                Activity activity2 = (Activity) k0x0Var.e.a;
                c8o.l(activity2);
                nfx nfxVar2 = new nfx(xfxVar6.g, activity2.getWindow(), (byte) 3);
                xfx xfxVar7 = (xfx) k0x0Var.g.get();
                c8o.l(xfxVar7);
                af10 af10Var5 = (af10) k0x0Var.d.get();
                c8o.l(af10Var5);
                dgx dgxVar4 = new dgx(xfxVar7.g, af10Var5, (byte) 0);
                xfx xfxVar8 = (xfx) k0x0Var.g.get();
                c8o.l(xfxVar8);
                af10 af10Var6 = (af10) k0x0Var.d.get();
                c8o.l(af10Var6);
                return new iis(context, function0, function1, str2, dgxVar3, nfxVar2, dgxVar4, new dgx(xfxVar8.g, af10Var6, (byte) 2));
        }
    }
}
