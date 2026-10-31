package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class owh implements kwh {
    public final gw70 a;
    public final p2o0 b;
    public final zhy c;
    public final woa d;
    public final kma e;
    public final zrg f;
    public final js20 g;
    public final rqw h;
    public final psw i;

    public owh(gw70 gw70Var, p2o0 p2o0Var, zhy zhyVar, woa woaVar, kma kmaVar, zrg zrgVar, pwh pwhVar) {
        this.a = gw70Var;
        this.b = p2o0Var;
        this.c = zhyVar;
        this.d = woaVar;
        this.e = kmaVar;
        this.f = zrgVar;
        Flowable flowable = (Flowable) ((b2p) p2o0Var.d).get();
        vbm[] vbmVarArr = q601.a;
        kge kgeVar = new kge(flowable);
        iac0 iac0Var = (iac0) p2o0Var.b;
        u9c0 u9c0VarQ = cto1.q(iac0Var);
        sua suaVar = ey71.a;
        this.g = x3p1.m(d5p1.t(h5p1.s(d5p1.t(kgeVar, u9c0VarQ, suaVar, ""), d5p1.t(new kge((Flowable) ((b2p) p2o0Var.e).get()), cto1.q(iac0Var), suaVar, 0L), (bpb1) p2o0Var.f, new vyd(4, null)), cto1.q(iac0Var), suaVar, new tyd(0, z6x.a, true)), ovh.g, gsh.g, (o8n) null, new mwh(this, (byte) 0), 8);
        this.h = pwhVar.a(this);
        j2i j2iVar = new j2i(639556479, new rxg(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(iwh iwhVar, lnm lnmVar) {
        nwh nwhVar;
        Object value;
        if (lnmVar instanceof nwh) {
            nwhVar = (nwh) lnmVar;
            int i = nwhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nwhVar.d = i - Integer.MIN_VALUE;
            } else {
                nwhVar = new nwh(this, lnmVar);
            }
        } else {
            nwhVar = new nwh(this, lnmVar);
        }
        Object obj = nwhVar.b;
        int i2 = nwhVar.d;
        p2o0 p2o0Var = this.b;
        if (i2 == 0) {
            hm5.M(obj);
            String str = iwhVar.a;
            nwhVar.a = iwhVar;
            nwhVar.d = 1;
            Object objY = p2o0Var.Y(str, nwhVar);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iwhVar = nwhVar.a;
            hm5.M(obj);
        }
        if (iwhVar.c) {
            bpb1 bpb1Var = (bpb1) p2o0Var.f;
            do {
                value = bpb1Var.getValue();
            } while (!bpb1Var.k(value, uyd.a((uyd) value, null, null, false, 11)));
        }
        return rih1.a;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
