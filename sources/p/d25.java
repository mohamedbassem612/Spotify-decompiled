package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d25 implements pdy0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final luk h;
    public final idd1 i = new idd1(new uz4(this, (byte) 26));

    public d25(int i, int i2, boolean z, boolean z2, int i3, int i4, int i5, luk lukVar) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = lukVar;
    }

    public final d25 a() {
        return (d25) this.i.getValue();
    }

    public final int b() {
        d25 d25VarA = a();
        return d25VarA != null ? d25VarA.b() : this.a;
    }

    public final int c() {
        d25 d25VarA = a();
        return d25VarA != null ? d25VarA.c() : this.b;
    }

    public final boolean d() {
        d25 d25VarA = a();
        return d25VarA != null ? d25VarA.d() : this.c;
    }

    public final boolean e() {
        d25 d25VarA = a();
        return d25VarA != null ? d25VarA.e() : this.d;
    }

    public final int f() {
        d25 d25VarA = a();
        return d25VarA != null ? d25VarA.f() : this.e;
    }

    public final int g() {
        d25 d25VarA = a();
        return d25VarA != null ? d25VarA.g() : this.f;
    }

    public final int h() {
        d25 d25VarA = a();
        return d25VarA != null ? d25VarA.h() : this.g;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("ng_poll_age_threshold_hours", "android-streamreporting-runtime-consumption-trigger-impl", b(), 0, 720), new fpb("ng_poll_age_window_hours", "android-streamreporting-runtime-consumption-trigger-impl", c(), 0, 720), new fpb("ng_poll_audiobook_filtering_enabled", "android-streamreporting-runtime-consumption-trigger-impl", d()), new fpb("ng_poll_dedup_enabled", "android-streamreporting-runtime-consumption-trigger-impl", e()), new fpb("ng_poll_min_ms_played", "android-streamreporting-runtime-consumption-trigger-impl", f(), 0, 3600000), new fpb("ng_poll_retry_count", "android-streamreporting-runtime-consumption-trigger-impl", g(), 0, 100), new fpb("ng_poll_retry_interval_seconds", "android-streamreporting-runtime-consumption-trigger-impl", h(), 0, 3600));
    }
}
