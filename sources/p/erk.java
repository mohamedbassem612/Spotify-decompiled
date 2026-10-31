package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class erk implements syq {
    public static final /* synthetic */ mma0[] i = {new cey0(erk.class, "dataPool", "getDataPool()Lcom/spotify/kodiak/dataloader/DataPool;", 0)};
    public final sp00 a;
    public final v1k b;
    public final boolean c;
    public final u3e0 d = o2p1.n();
    public final f4r e;
    public final js20 f;
    public final ia00 g;
    public final nsw h;

    public erk(sp00 sp00Var, v1k v1kVar, boolean z) {
        this.a = sp00Var;
        this.b = v1kVar;
        this.c = z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h4r(tqk.t, vpk.d));
        this.e = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        this.f = w3p1.q(new mwh(this, (byte) 27), tqk.i, yzj.R0, (o8n) null, (iu30) null, 24);
        this.g = n3o1.q(this).a(c9k.U0, c9k.V0);
        this.h = jch0.j(new zee(this, (byte) 26));
    }

    public final rqw a() {
        return this.g;
    }

    public final rsw c() {
        return this.h;
    }

    public final d0r e() {
        mma0 mma0Var = i[0];
        return this.d.a;
    }

    public final mqw getBehavior() {
        return this.f;
    }

    public final f4r getData() {
        return this.e;
    }
}
