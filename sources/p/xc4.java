package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xc4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final vc4 c;
    public final int d;
    public final wc4 e;
    public final luk f;
    public final idd1 g = new idd1(new wb4(this, (byte) 11));

    public xc4(int i, boolean z, vc4 vc4Var, int i2, wc4 wc4Var, luk lukVar) {
        this.a = i;
        this.b = z;
        this.c = vc4Var;
        this.d = i2;
        this.e = wc4Var;
        this.f = lukVar;
    }

    public final int a() {
        xc4 xc4Var = (xc4) this.g.getValue();
        return xc4Var != null ? xc4Var.a() : this.a;
    }

    public final boolean b() {
        xc4 xc4Var = (xc4) this.g.getValue();
        return xc4Var != null ? xc4Var.b() : this.b;
    }

    public final vc4 c() {
        vc4 vc4VarC;
        xc4 xc4Var = (xc4) this.g.getValue();
        return (xc4Var == null || (vc4VarC = xc4Var.c()) == null) ? this.c : vc4VarC;
    }

    public final int d() {
        xc4 xc4Var = (xc4) this.g.getValue();
        return xc4Var != null ? xc4Var.d() : this.d;
    }

    public final wc4 e() {
        wc4 wc4VarE;
        xc4 xc4Var = (xc4) this.g.getValue();
        return (xc4Var == null || (wc4VarE = xc4Var.e()) == null) ? this.e : wc4VarE;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("device_wait_timeout_ms", "android-device-predictability-app-startup-trigger", a(), 0, 30000);
        fpb fpbVar2 = new fpb("enable", "android-device-predictability-app-startup-trigger", b());
        String str = c().a;
        vc4[] vc4VarArrValues = vc4.values();
        ArrayList arrayList = new ArrayList(vc4VarArrValues.length);
        for (vc4 vc4Var : vc4VarArrValues) {
            arrayList.add(vc4Var.a);
        }
        fpb fpbVar3 = new fpb("minimum_displayable_confidence_score", "android-device-predictability-app-startup-trigger", str, arrayList);
        fpb fpbVar4 = new fpb("smart_control_nudge_auto_dismiss_timeout_ms", "android-device-predictability-app-startup-trigger", d(), 0, 60000);
        String str2 = e().a;
        wc4[] wc4VarArrValues = wc4.values();
        ArrayList arrayList2 = new ArrayList(wc4VarArrValues.length);
        for (wc4 wc4Var : wc4VarArrValues) {
            arrayList2.add(wc4Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, fpbVar4, new fpb("target_surface", "android-device-predictability-app-startup-trigger", str2, arrayList2));
    }
}
