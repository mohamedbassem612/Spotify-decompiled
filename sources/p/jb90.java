package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class jb90 {
    public static final pq20 a(SceneTemplate.IntroTrackContent.Card1.FlipSegment flipSegment) {
        int iN = flipSegment.n();
        int i = iN == 0 ? -1 : ib90.a[l1d.C(iN)];
        if (i == 1) {
            return new oq20(flipSegment.p().o(), flipSegment.p().p());
        }
        if (i != 2) {
            return null;
        }
        return new nq20(flipSegment.o());
    }
}
