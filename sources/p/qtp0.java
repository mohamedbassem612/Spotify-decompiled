package p;

import com.spotify.offline_esperanto.proto.EsOffline;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qtp0 implements xpw {
    public final yqg a;
    public final vpp0 b;
    public final js20 c;
    public final eih1 d = new eih1();
    public final psw e;

    public qtp0(yqg yqgVar, vpp0 vpp0Var) {
        this.a = yqgVar;
        this.b = vpp0Var;
        this.c = x3p1.m(new sii0(yoi1.g(vpp0Var.c(EsOffline.GetContextsRequest.p())), this, (byte) 25), mmp0.Z0, new otp0(2), (o8n) null, (iu30) null, 24);
        j2i j2iVar = new j2i(-1629485210, new aso0(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
