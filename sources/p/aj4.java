package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aj4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final zi4 f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final luk n;
    public final idd1 o = new idd1(new sh4(this, (byte) 21));

    public aj4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, zi4 zi4Var, boolean z6, boolean z7, int i, int i2, int i3, int i4, boolean z8, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = zi4Var;
        this.g = z6;
        this.h = z7;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = z8;
        this.n = lukVar;
    }

    public final boolean a() {
        aj4 aj4VarG = g();
        return aj4VarG != null ? aj4VarG.a() : this.a;
    }

    public final boolean b() {
        aj4 aj4VarG = g();
        return aj4VarG != null ? aj4VarG.b() : this.b;
    }

    public final boolean c() {
        aj4 aj4VarG = g();
        return aj4VarG != null ? aj4VarG.c() : this.c;
    }

    public final boolean d() {
        aj4 aj4VarG = g();
        return aj4VarG != null ? aj4VarG.d() : this.d;
    }

    public final boolean e() {
        aj4 aj4VarG = g();
        return aj4VarG != null ? aj4VarG.e() : this.e;
    }

    public final zi4 f() {
        zi4 zi4VarF;
        aj4 aj4VarG = g();
        return (aj4VarG == null || (zi4VarF = aj4VarG.f()) == null) ? this.f : zi4VarF;
    }

    public final aj4 g() {
        return (aj4) this.o.getValue();
    }

    public final boolean h() {
        aj4 aj4VarG = g();
        return aj4VarG != null ? aj4VarG.h() : this.g;
    }

    public final boolean i() {
        aj4 aj4VarG = g();
        return aj4VarG != null ? aj4VarG.i() : this.h;
    }

    public final int j() {
        aj4 aj4VarG = g();
        return aj4VarG != null ? aj4VarG.j() : this.i;
    }

    public final int k() {
        aj4 aj4VarG = g();
        return aj4VarG != null ? aj4VarG.k() : this.j;
    }

    public final int l() {
        aj4 aj4VarG = g();
        return aj4VarG != null ? aj4VarG.l() : this.k;
    }

    public final int m() {
        aj4 aj4VarG = g();
        return aj4VarG != null ? aj4VarG.m() : this.l;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("adaptive_buffering_enabled", "android-feature-video", a());
        fpb fpbVar2 = new fpb("core_fetch_data_source_enabled", "android-feature-video", b());
        fpb fpbVar3 = new fpb("core_fetch_data_source_enabled_for_audio_browse", "android-feature-video", c());
        fpb fpbVar4 = new fpb("core_fetch_data_source_enabled_for_canvas", "android-feature-video", d());
        fpb fpbVar5 = new fpb("core_fetch_data_source_enabled_for_watch_feed", "android-feature-video", e());
        String str = f().a;
        zi4[] zi4VarArrValues = zi4.values();
        ArrayList arrayList = new ArrayList(zi4VarArrValues.length);
        for (zi4 zi4Var : zi4VarArrValues) {
            arrayList.add(zi4Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, new fpb("core_segmented_fetch_data_source_enabled", "android-feature-video", str, arrayList), new fpb("playback_trait_offline_enabled", "android-feature-video", h()), new fpb("release_all_players_on_shutdown", "android-feature-video", i()), new fpb("video_ad_target_bitrate", "android-feature-video", j(), 0, 4000000), new fpb("video_download_bitrate", "android-feature-video", k(), 200000, 3000000), new fpb("video_download_max_resolution", "android-feature-video", l(), 0, 2160), new fpb("video_offline_license_redownload_threshold_days", "android-feature-video", m(), 0, 3650), new fpb("video_sai_enabled", "android-feature-video", n()));
    }

    public final boolean n() {
        aj4 aj4VarG = g();
        return aj4VarG != null ? aj4VarG.n() : this.m;
    }
}
