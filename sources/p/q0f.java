package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q0f extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s0f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0f(s0f s0fVar, byte b) {
        super(1);
        this.a = b;
        this.b = s0fVar;
    }

    public final Object invoke(Object obj) {
        mr20 huzVar;
        switch (this.a) {
            case 0:
                vjd0 vjd0Var = this.b.e;
                String str = ((whf) obj).a;
                synchronized (vjd0Var.h) {
                    try {
                        huzVar = vjd0Var.i ? (mr20) vjd0Var.g.computeIfAbsent(str, new d4k(vjd0Var, (byte) 5)) : new huz((Object) null, (byte) 10);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new fu20(new ht20(new nwd(huzVar, (byte) 2), new sd0(2, (lnm) null, (byte) 18)), new pid(this.b, (lnm) null, (byte) 6), (byte) 1);
            case 1:
                return axo1.p(new u3f((ibf) null, z6x.a), (whf) obj, new qka(1, this.b, s0f.class, "disclaimerRow", "disclaimerRow(Lcom/spotify/liveroom/listeningpartychat/ChatPartyPhase;)Lcom/spotify/liveroom/listeningpartychat/ChatRowUiState;", 0, (byte) 20));
            default:
                ((qtr) obj).b(new ep0(this.b, (lnm) null, (byte) 11));
                return rih1.a;
        }
    }
}
