package p;

import java.text.Collator;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bk50 implements tyq {
    public final d0r a;
    public final lp10 b;
    public final Collator c = Collator.getInstance();
    public final f4r d;
    public final js20 e;
    public final psw f;
    public final eih1 g;

    public bk50(d0r d0rVar, lp10 lp10Var) {
        this.a = d0rVar;
        this.b = lp10Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h4r(r850.Z0, kzd.a));
        this.d = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        this.e = x3p1.n(new ft30(1, this, bk50.class, "externalStateFlow", "externalStateFlow(Lcom/spotify/listeningactivity/elements/groupdetailsmembers/api/GroupDetailsMembersElement$Props;)Lkotlinx/coroutines/flow/Flow;", 0, (byte) 1), r850.X0, new c4z(2, this, bk50.class, "mapToState", "mapToState(Lcom/spotify/listeningactivity/elements/groupdetailsmembers/api/GroupDetailsMembersElement$Props;Ljava/util/List;)Lcom/spotify/listeningactivity/elements/groupdetailsmembers/api/GroupDetailsMembersElement$State;", 0, (byte) 11), (o8n) null, r850.Y0, 8);
        j2i j2iVar = new j2i(2027076517, new zq30(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
        this.g = new eih1();
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.f;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.e;
    }

    public final f4r getData() {
        return this.d;
    }
}
