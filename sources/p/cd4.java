package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cd4 implements pdy0 {
    public final boolean a;
    public final ad4 b;
    public final int c;
    public final bd4 d;
    public final int e;
    public final luk f;
    public final idd1 g = new idd1(new wb4(this, (byte) 14));

    public cd4(boolean z, ad4 ad4Var, int i, bd4 bd4Var, int i2, luk lukVar) {
        this.a = z;
        this.b = ad4Var;
        this.c = i;
        this.d = bd4Var;
        this.e = i2;
        this.f = lukVar;
    }

    public final boolean a() {
        cd4 cd4Var = (cd4) this.g.getValue();
        return cd4Var != null ? cd4Var.a() : this.a;
    }

    public final ad4 b() {
        ad4 ad4VarB;
        cd4 cd4Var = (cd4) this.g.getValue();
        return (cd4Var == null || (ad4VarB = cd4Var.b()) == null) ? this.b : ad4VarB;
    }

    public final int c() {
        cd4 cd4Var = (cd4) this.g.getValue();
        return cd4Var != null ? cd4Var.c() : this.c;
    }

    public final bd4 d() {
        bd4 bd4VarD;
        cd4 cd4Var = (cd4) this.g.getValue();
        return (cd4Var == null || (bd4VarD = cd4Var.d()) == null) ? this.d : bd4VarD;
    }

    public final int e() {
        cd4 cd4Var = (cd4) this.g.getValue();
        return cd4Var != null ? cd4Var.e() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("enable", "android-device-predictability-playback-trigger", a());
        String str = b().a;
        ad4[] ad4VarArrValues = ad4.values();
        ArrayList arrayList = new ArrayList(ad4VarArrValues.length);
        for (ad4 ad4Var : ad4VarArrValues) {
            arrayList.add(ad4Var.a);
        }
        fpb fpbVar2 = new fpb("minimum_displayable_confidence_score", "android-device-predictability-playback-trigger", str, arrayList);
        fpb fpbVar3 = new fpb("smart_control_nudge_auto_dismiss_timeout_ms", "android-device-predictability-playback-trigger", c(), 0, 60000);
        String str2 = d().a;
        bd4[] bd4VarArrValues = bd4.values();
        ArrayList arrayList2 = new ArrayList(bd4VarArrValues.length);
        for (bd4 bd4Var : bd4VarArrValues) {
            arrayList2.add(bd4Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, new fpb("target_surface", "android-device-predictability-playback-trigger", str2, arrayList2), new fpb("trigger_delay_ms", "android-device-predictability-playback-trigger", e(), 0, 30000));
    }
}
