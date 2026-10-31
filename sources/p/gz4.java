package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gz4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final int f;
    public final fz4 g;
    public final luk h;
    public final idd1 i = new idd1(new sx4(this, (byte) 22));

    public gz4(int i, boolean z, boolean z2, int i2, boolean z3, int i3, fz4 fz4Var, luk lukVar) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = z3;
        this.f = i3;
        this.g = fz4Var;
        this.h = lukVar;
    }

    public final gz4 a() {
        return (gz4) this.i.getValue();
    }

    public final int b() {
        gz4 gz4VarA = a();
        return gz4VarA != null ? gz4VarA.b() : this.a;
    }

    public final boolean c() {
        gz4 gz4VarA = a();
        return gz4VarA != null ? gz4VarA.c() : this.b;
    }

    public final boolean d() {
        gz4 gz4VarA = a();
        return gz4VarA != null ? gz4VarA.d() : this.c;
    }

    public final int e() {
        gz4 gz4VarA = a();
        return gz4VarA != null ? gz4VarA.e() : this.d;
    }

    public final boolean f() {
        gz4 gz4VarA = a();
        return gz4VarA != null ? gz4VarA.f() : this.e;
    }

    public final int g() {
        gz4 gz4VarA = a();
        return gz4VarA != null ? gz4VarA.g() : this.f;
    }

    public final fz4 h() {
        fz4 fz4VarH;
        gz4 gz4VarA = a();
        return (gz4VarA == null || (fz4VarH = gz4VarA.h()) == null) ? this.g : fz4VarH;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("device_proximity_time_threshold_ms", "android-proximity-detector", b(), 0, 86400000);
        fpb fpbVar2 = new fpb("enable_feature", "android-proximity-detector", c());
        fpb fpbVar3 = new fpb("include_user_match_unauthenticated_devices", "android-proximity-detector", d());
        fpb fpbVar4 = new fpb("on_foregrounded_rediscovery_time_threshold_ms", "android-proximity-detector", e(), 0, 86400000);
        fpb fpbVar5 = new fpb("write_pull_playback_notification_ble_characteristic", "android-proximity-detector", f());
        fpb fpbVar6 = new fpb("write_pull_playback_notification_ble_characteristic_interval_ms", "android-proximity-detector", g(), 0, 86400000);
        String str = h().a;
        fz4[] fz4VarArrValues = fz4.values();
        ArrayList arrayList = new ArrayList(fz4VarArrValues.length);
        for (fz4 fz4Var : fz4VarArrValues) {
            arrayList.add(fz4Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, fpbVar6, new fpb("write_pull_playback_notification_min_proximity_indicator", "android-proximity-detector", str, arrayList));
    }
}
