package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f3v0 implements it80 {
    public static final blc0[] b = {blc0.PODCAST_CHARTS_ROOT, blc0.PODCAST_CHARTS_REGIONS, blc0.PODCAST_CHARTS_CATEGORIES_REGION, blc0.PODCAST_CHARTS_CHART_CHART_TYPE_REGION, blc0.PODCAST_CHARTS_REGION, blc0.PODCAST_CHARTS_CHART_CATEGORY_REGION_CATEGORY};
    public final ay4 a;

    public f3v0(ay4 ay4Var) {
        this.a = ay4Var;
    }

    @Override // p.it80
    public final void a(ajq0 ajq0Var) {
        if (this.a.a()) {
            return;
        }
        for (blc0 blc0Var : b) {
            ajq0Var.K(blc0Var, l1d.m("Podcast charts route for ", blc0Var.name()), new pjq0(blc0Var, (byte) 19));
        }
    }
}
