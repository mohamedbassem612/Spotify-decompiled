package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oy1 {
    public final /* synthetic */ byte a;
    public final aas b;
    public final b7r0 c;
    public final dg30 d;
    public final q8n e;

    public oy1(b7r0 b7r0Var, aas aasVar, dg30 dg30Var, q8n q8nVar) {
        this.a = (byte) 4;
        this.c = b7r0Var;
        this.b = aasVar;
        this.d = dg30Var;
        this.e = q8nVar;
    }

    public jhm a(String str) {
        return new jhm("queue_play_next_album", rrx.c, (fhm) null, 2131954417, (String) null, false, (tm81) null, new ihm(new ygm(1), new ghm(ent0.i, new atp0(str, (byte) 25)), new aft0(this, str, (byte) 7)), 244);
    }

    public jhm b(lik1 lik1Var, List list) {
        switch (this.a) {
            case 2:
                return new jhm("queue_play_next_track", rrx.c, (fhm) null, 2131954417, (String) null, false, (tm81) null, new ihm(new ygm(1), new ghm(ent0.t, new fot0(list, lik1Var, (byte) 0)), new aft0(this, list, (byte) 8)), 244);
            default:
                return new jhm("queue_track", vjx.c, (fhm) null, 2131954321, (String) null, false, (tm81) null, new ihm(new ygm(1), new ghm(v9z0.W0, new fot0(list, lik1Var, (byte) 1)), new j3y0(this, list, (byte) 9)), 244);
        }
    }

    public /* synthetic */ oy1(aas aasVar, b7r0 b7r0Var, dg30 dg30Var, q8n q8nVar, byte b) {
        this.a = b;
        this.b = aasVar;
        this.c = b7r0Var;
        this.d = dg30Var;
        this.e = q8nVar;
    }
}
