package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jd4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final id4 f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final luk k;
    public final idd1 l = new idd1(new wb4(this, (byte) 17));

    public jd4(int i, boolean z, boolean z2, int i2, int i3, id4 id4Var, int i4, int i5, int i6, int i7, luk lukVar) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = id4Var;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.k = lukVar;
    }

    public final jd4 a() {
        return (jd4) this.l.getValue();
    }

    public final int b() {
        jd4 jd4VarA = a();
        return jd4VarA != null ? jd4VarA.b() : this.a;
    }

    public final boolean c() {
        jd4 jd4VarA = a();
        return jd4VarA != null ? jd4VarA.c() : this.b;
    }

    public final boolean d() {
        jd4 jd4VarA = a();
        return jd4VarA != null ? jd4VarA.d() : this.c;
    }

    public final int e() {
        jd4 jd4VarA = a();
        return jd4VarA != null ? jd4VarA.e() : this.d;
    }

    public final int f() {
        jd4 jd4VarA = a();
        return jd4VarA != null ? jd4VarA.f() : this.e;
    }

    public final id4 g() {
        id4 id4VarG;
        jd4 jd4VarA = a();
        return (jd4VarA == null || (id4VarG = jd4VarA.g()) == null) ? this.f : id4VarG;
    }

    public final int h() {
        jd4 jd4VarA = a();
        return jd4VarA != null ? jd4VarA.h() : this.g;
    }

    public final int i() {
        jd4 jd4VarA = a();
        return jd4VarA != null ? jd4VarA.i() : this.h;
    }

    public final int j() {
        jd4 jd4VarA = a();
        return jd4VarA != null ? jd4VarA.j() : this.i;
    }

    public final int k() {
        jd4 jd4VarA = a();
        return jd4VarA != null ? jd4VarA.k() : this.j;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("device_stabilization_debounce_ms", "android-device-suggestion-provider", b(), 0, 10000);
        fpb fpbVar2 = new fpb("enable_mobius_loop", "android-device-suggestion-provider", c());
        fpb fpbVar3 = new fpb("enable_proactive_ml_requests", "android-device-suggestion-provider", d());
        fpb fpbVar4 = new fpb("explicit_request_device_wait_timeout_ms", "android-device-suggestion-provider", e(), 1000, 60000);
        fpb fpbVar5 = new fpb("external_audio_output_temporary_hiding_duration_ms", "android-device-suggestion-provider", f(), 0, 86400000);
        String str = g().a;
        id4[] id4VarArrValues = id4.values();
        ArrayList arrayList = new ArrayList(id4VarArrValues.length);
        for (id4 id4Var : id4VarArrValues) {
            arrayList.add(id4Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, new fpb("ml_based_device_suggestion_source", "android-device-suggestion-provider", str, arrayList), new fpb("ml_request_debounce_window_ms", "android-device-suggestion-provider", h(), 0, 10000), new fpb("ml_request_throttle_window_ms", "android-device-suggestion-provider", i(), 0, 86400000), new fpb("moved_away_from_device_temporary_hiding_duration_ms", "android-device-suggestion-provider", j(), 0, 86400000), new fpb("non_suggested_other_device_temporary_hiding_duration_ms", "android-device-suggestion-provider", k(), 0, 86400000));
    }
}
