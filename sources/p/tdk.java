package p;

import android.content.res.Resources;
import com.spotify.concertcampaignview.v1.CampaignActionResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tdk implements tyq {
    public final j6d N0;
    public final y1t0 O0;
    public final q3c P0;
    public final Resources Q0;
    public final ic9 R0;
    public final d0r S0;
    public final idd1 T0 = new idd1(new d4e(this, (byte) 5));
    public final bpb1 U0 = gio1.b((Object) null);
    public final o3r V0;
    public final js20 W0;
    public final boolean X;
    public z0e X0;
    public final boolean Y;
    public b30 Y0;
    public final tck Z;
    public final ia00 Z0;
    public final gw70 a;
    public final qdk a1;
    public final lzn0 b;
    public final psw b1;
    public final dg8 c;
    public final rm5 d;
    public final kt91 e;
    public final yqg f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public tdk(gw70 gw70Var, lzn0 lzn0Var, dg8 dg8Var, rm5 rm5Var, kt91 kt91Var, yqg yqgVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, tck tckVar, j6d j6dVar, y1t0 y1t0Var, q3c q3cVar, Resources resources, ic9 ic9Var, d0r d0rVar) {
        this.a = gw70Var;
        this.b = lzn0Var;
        this.c = dg8Var;
        this.d = rm5Var;
        this.e = kt91Var;
        this.f = yqgVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.t = z4;
        this.X = z5;
        this.Y = z6;
        this.Z = tckVar;
        this.N0 = j6dVar;
        this.O0 = y1t0Var;
        this.P0 = q3cVar;
        this.Q0 = resources;
        this.R0 = ic9Var;
        this.S0 = d0rVar;
        jd11 jd11Var = rc11.a;
        this.V0 = w3p1.j(new l4r(new xv00(jd11Var.b(xkk1.class)), 2, c6k.V0, new j4r(xj.W0), c6k.W0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, c6k.X0, new j4r(c6k.P0), c6k.Y0), new l4r(new xv00(jd11Var.b(m6k.class)), 1, c6k.d1, new j4r(c6k.Q0), c6k.e1), new l4r(new xv00(jd11Var.b(ydk.class)), 2, c6k.Z0, new j4r(c6k.R0), c6k.a1), new l4r(new xv00(jd11Var.b(eek.class)), 1, rdk.b, new j4r(c6k.S0), rdk.c), new l4r(new xv00(jd11Var.b(jek.class)), 2, c6k.b1, new j4r(c6k.T0), c6k.c1), odk.a);
        this.W0 = x3p1.n(new s20(this, (byte) 5), c6k.O0, new boj(this, (byte) 16), (o8n) null, new ndk(this, (byte) 1), 8);
        this.Z0 = n3o1.q(this).a(h40.h, c9k.f);
        this.a1 = new qdk(this, (byte) 0);
        j2i j2iVarJ = apo.j(434351046, new rxg(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.b1 = new psw(j2iVarJ, (byte) 0);
    }

    public final rqw a() {
        return this.a1;
    }

    public final jsw c() {
        return this.b1;
    }

    @Override // p.wul1
    public final d0r e() {
        return this.S0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(hdk hdkVar, xck xckVar, tqw tqwVar, onm onmVar) {
        pdk pdkVar;
        if (onmVar instanceof pdk) {
            pdkVar = (pdk) onmVar;
            int i = pdkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdkVar.c = i - Integer.MIN_VALUE;
            } else {
                pdkVar = new pdk(this, onmVar);
            }
        } else {
            pdkVar = new pdk(this, onmVar);
        }
        Object objW = pdkVar.a;
        int i2 = pdkVar.c;
        kt91 kt91Var = this.e;
        bpb1 bpb1Var = this.U0;
        try {
            if (i2 == 0) {
                hm5.M(objW);
                int iOrdinal = xckVar.ordinal();
                lzn0 lzn0Var = this.b;
                if (iOrdinal == 0 || iOrdinal == 1) {
                    hqn1.r(hdkVar.getUri(), tqwVar, lzn0Var);
                } else if (iOrdinal == 2) {
                    Boolean boolM = yah0.m(true);
                    bpb1Var.getClass();
                    bpb1Var.m(null, boolM);
                    rm5 rm5Var = this.d;
                    String uri = hdkVar.getUri();
                    pdkVar.c = 1;
                    objW = rm5Var.w(uri, pdkVar);
                    d9n d9nVar = d9n.a;
                    if (objW == d9nVar) {
                        return d9nVar;
                    }
                } else if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        hqn1.r(sok.o(hdkVar), tqwVar, lzn0Var);
                    } else if (iOrdinal != 5) {
                        eg.o();
                        return null;
                    }
                }
                return rih1.a;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objW);
            CampaignActionResponse campaignActionResponse = (CampaignActionResponse) objW;
            if (campaignActionResponse.getMessage().length() > 0) {
                kt91Var.k(k4k.q(campaignActionResponse.getMessage()).c());
            }
        } catch (Exception e) {
            Boolean boolM2 = yah0.m(false);
            bpb1Var.getClass();
            bpb1Var.m(null, boolM2);
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to join waitlist";
            }
            kt91Var.k(k4k.q(message).c());
        }
        return rih1.a;
    }

    public final mqw getBehavior() {
        return this.W0;
    }

    @Override // p.wul1
    public final f4r getData() {
        return this.V0;
    }
}
