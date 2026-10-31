package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t1r {
    public static final bma1 f;
    public static final bma1 g;
    public static final bma1 h;
    public static final bma1 i;
    public static final bma1 j;
    public final dma1 a;
    public final zia b = new zia();
    public final zia c = new zia();
    public final zia d = new zia();
    public final zia e = new zia();

    static {
        nbc nbcVar = bma1.b;
        f = nbcVar.u("data_saver_mode_user_enabled");
        g = nbcVar.u("data_saver_mode_include_android");
        h = nbcVar.u("data_saver_mode_android_enabled");
        i = nbcVar.u("data_saver_video_podcasts_audio_only_enabled");
        j = nbcVar.u("data_saver_mode:streaming_quality_user_value");
    }

    public t1r(dma1 dma1Var) {
        this.a = dma1Var;
    }

    public final zia a() {
        zia ziaVar = this.c;
        if (!ziaVar.c()) {
            ziaVar.accept(Boolean.valueOf(this.a.h(g, true)));
        }
        return ziaVar;
    }

    public final zia b() {
        zia ziaVar = this.b;
        if (!ziaVar.c()) {
            ziaVar.accept(Boolean.valueOf(this.a.h(f, false)));
        }
        return ziaVar;
    }

    public final zia c() {
        zia ziaVar = this.e;
        if (!ziaVar.c()) {
            ziaVar.accept(Boolean.valueOf(this.a.h(i, false)));
        }
        return ziaVar;
    }

    public final void d(boolean z) {
        hma1 hma1VarEdit = this.a.edit();
        hma1VarEdit.a(g, z);
        hma1VarEdit.g();
        this.c.accept(Boolean.valueOf(z));
    }

    public final void e(boolean z) {
        hma1 hma1VarEdit = this.a.edit();
        hma1VarEdit.a(f, z);
        hma1VarEdit.g();
        this.b.accept(Boolean.valueOf(z));
    }
}
