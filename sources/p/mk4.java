package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mk4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final lk4 d;
    public final int e;
    public final int f;
    public final boolean g;
    public final luk h;
    public final idd1 i = new idd1(new gk4(this, (byte) 3));

    public mk4(int i, boolean z, boolean z2, lk4 lk4Var, int i2, int i3, boolean z3, luk lukVar) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = lk4Var;
        this.e = i2;
        this.f = i3;
        this.g = z3;
        this.h = lukVar;
    }

    public final int a() {
        mk4 mk4VarB = b();
        return mk4VarB != null ? mk4VarB.a() : this.a;
    }

    public final mk4 b() {
        return (mk4) this.i.getValue();
    }

    public final boolean c() {
        mk4 mk4VarB = b();
        return mk4VarB != null ? mk4VarB.c() : this.b;
    }

    public final boolean d() {
        mk4 mk4VarB = b();
        return mk4VarB != null ? mk4VarB.d() : this.c;
    }

    public final lk4 e() {
        lk4 lk4VarE;
        mk4 mk4VarB = b();
        return (mk4VarB == null || (lk4VarE = mk4VarB.e()) == null) ? this.d : lk4VarE;
    }

    public final int f() {
        mk4 mk4VarB = b();
        return mk4VarB != null ? mk4VarB.f() : this.e;
    }

    public final int g() {
        mk4 mk4VarB = b();
        return mk4VarB != null ? mk4VarB.g() : this.f;
    }

    public final boolean h() {
        mk4 mk4VarB = b();
        return mk4VarB != null ? mk4VarB.h() : this.g;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("coroutine_timeout_period_ms", "android-google-device-suggestions", a(), 0, 30000);
        fpb fpbVar2 = new fpb("enable_feature", "android-google-device-suggestions", c());
        fpb fpbVar3 = new fpb("enable_google_device_suggestions_source", "android-google-device-suggestions", d());
        String str = e().a;
        lk4[] lk4VarArrValues = lk4.values();
        ArrayList arrayList = new ArrayList(lk4VarArrValues.length);
        for (lk4 lk4Var : lk4VarArrValues) {
            arrayList.add(lk4Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, new fpb("minimum_displayable_confidence_score", "android-google-device-suggestions", str, arrayList), new fpb("suggestion_cache_ttl_ms", "android-google-device-suggestions", f(), 0, 600000), new fpb("suggestion_request_timeout_ms", "android-google-device-suggestions", g(), 0, 50000), new fpb("use_spotify_device_suggestion_as_fallback", "android-google-device-suggestions", h()));
    }
}
