package p;

import com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ggv0 {
    public final gn0 a;
    public final wei1 b;
    public final ve01 c;

    public ggv0(gn0 gn0Var, wei1 wei1Var, c9n c9nVar) {
        this.a = gn0Var;
        this.b = wei1Var;
        this.c = d5p1.r(rqt0.u(new ht20(hu20.e(rqt0.u(new c1v0(wei1Var.b, (byte) 5)), new gg00(this, (lnm) null, (byte) 6)), new egv0(2, (lnm) null, (byte) 0))), c9nVar, new alb1(5000L, 0L), 1);
    }

    public final lt20 a(oei1 oei1Var, int i, boolean z) {
        nn0 nn0VarN = AdDetectionOuterClass.SubscribeUserToCanonicalTimestampRequest.n();
        nn0VarN.n(oei1Var.a);
        nn0VarN.s(i);
        nn0VarN.q(oei1Var.b);
        nn0VarN.r();
        AdDetectionOuterClass.SubscribeUserToCanonicalTimestampRequest subscribeUserToCanonicalTimestampRequestBuild = nn0VarN.build();
        subscribeUserToCanonicalTimestampRequestBuild.getClass();
        return new lt20(new iib(new zfv0(new ht20(yoi1.g(this.a.callStream("spotify.ad_detection.impl.ad_detection_proto.AdDetection", "SubscribeUserToCanonicalTimestamp", subscribeUserToCanonicalTimestampRequestBuild).map(s9w.d)), new cy9(oei1Var, i, z, (lnm) null)), oei1Var, i, z), new agv0(oei1Var, i, z, null), (byte) 6), new ob00(3, (lnm) null, (byte) 22), (byte) 0);
    }
}
