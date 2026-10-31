package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ozb implements h0r0 {
    public final kyj a;
    public final j0c b;
    public final ezb c;
    public final h0c d;
    public final w7q0 e;
    public final y4q0 f;
    public final v1q0 g;
    public final ldj0 h;
    public final q8n i;
    public MessageResponseToken j;
    public final bpb1 k;
    public final bpb1 l;
    public final cbr0 m;

    public ozb(los losVar, kyj kyjVar, j0c j0cVar, ezb ezbVar, h0c h0cVar, w7q0 w7q0Var, y4q0 y4q0Var, v1q0 v1q0Var, ldj0 ldj0Var, q8n q8nVar) {
        this.a = kyjVar;
        this.b = j0cVar;
        this.c = ezbVar;
        this.d = h0cVar;
        this.e = w7q0Var;
        this.f = y4q0Var;
        this.g = v1q0Var;
        this.h = ldj0Var;
        this.i = q8nVar;
        Boolean bool = Boolean.FALSE;
        this.k = gio1.b(bool);
        this.l = gio1.b(bool);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.m = new cbr0(new dbr0[]{new bn70(yon1.c2(), nik1.M1, (nar0) null), new s9h1(14, true, false, false), new t1r0(true), new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, losVar, false, true, false, (nsm0) null, 3925)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.m;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-398983960, new jzb(this), true), new dx81(new mzb(this), new nzb(this), bbn.Z, iub.f));
    }
}
