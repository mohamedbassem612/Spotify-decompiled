package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tdu extends hf30 {
    public boolean b;
    public final /* synthetic */ beu c;
    public final /* synthetic */ udu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdu(fka1 fka1Var, beu beuVar, udu uduVar) {
        super(fka1Var);
        this.c = beuVar;
        this.d = uduVar;
    }

    public final void close() {
        super.close();
        if (this.b) {
            return;
        }
        this.b = true;
        beu beuVar = this.c;
        udu uduVar = this.d;
        synchronized (beuVar) {
            int i = uduVar.h - 1;
            uduVar.h = i;
            if (i == 0 && uduVar.f) {
                beuVar.o(uduVar);
            }
        }
    }
}
