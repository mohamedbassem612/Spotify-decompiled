package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class n031 extends faa {
    public n031(lnm lnmVar) {
        super(lnmVar);
        if (lnmVar == null || lnmVar.getContext() == o6x.a) {
            return;
        }
        hhg1.n("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // p.lnm
    public final o8n getContext() {
        return o6x.a;
    }
}
