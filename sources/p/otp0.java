package p;

import com.google.protobuf.Timestamp;
import com.spotify.offline_esperanto.proto.EsOffline$OfflineLicenseInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class otp0 extends hab0 implements vu30 {
    public final Object invoke(Object obj, Object obj2) {
        Timestamp timestampO;
        Timestamp timestampP;
        EsOffline$OfflineLicenseInfo.Expiry expiry = ((mtp0) obj2).a;
        ngv ngvVar = ngv.d;
        jfv jfvVar = null;
        jfv jfvVar2 = (expiry == null || (timestampP = expiry.p()) == null) ? null : new jfv(fdg1.l0((timestampP.q() * 1000) + ((long) (timestampP.p() / 1000000)), ngvVar));
        if (expiry != null && (timestampO = expiry.o()) != null) {
            jfvVar = new jfv(fdg1.l0((timestampO.q() * 1000) + ((long) (timestampO.p() / 1000000)), ngvVar));
        }
        return new ntp0(jfvVar2, jfvVar);
    }
}
