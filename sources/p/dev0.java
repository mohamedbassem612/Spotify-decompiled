package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class dev0 extends tv30 implements vu30 {
    public static final dev0 a = new dev0(2, cev0.class, "shouldAnimatePopularReleasesUpdate", "shouldAnimatePopularReleasesUpdate(Lcom/spotify/creator/creatorpage/popularreleases/PopularReleasesProjection;Lcom/spotify/creator/creatorpage/popularreleases/PopularReleasesProjection;)Z", 1);

    public final Object invoke(Object obj, Object obj2) {
        String str;
        hev0 hev0Var = (hev0) obj;
        hev0 hev0Var2 = (hev0) obj2;
        boolean z = true;
        if (!hev0Var.equals(hev0Var2) && (hev0Var.c || hev0Var2.c || ((str = hev0Var.a) != null && !u890.j(str, hev0Var2.a)))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
