package p;

import com.spotify.creativework.v1.Release;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vld1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Release b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vld1(Release release, byte b) {
        super(1);
        this.a = b;
        this.b = release;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Release release = this.b;
        switch (b) {
            case 0:
                return release;
            case 1:
                release.getClass();
                return release;
            case 2:
                release.getClass();
                return release;
            case 3:
                return release;
            case 4:
                return release;
            case 5:
                return new kk51(release.n().getUri());
            default:
                return release;
        }
    }
}
