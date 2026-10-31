package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sjq implements jly0 {
    public final daq a;
    public final wtp b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public sjq(daq daqVar, wtp wtpVar, int i) {
        this.a = daqVar;
        this.b = wtpVar;
        this.c = i;
    }

    @Override // p.kly0
    public final Object get() {
        daq daqVar = this.a;
        wtp wtpVar = this.b;
        boolean z = this.c;
        if (!z) {
            return new xh71(wtpVar.v(), (qfb0) daqVar.Ag.get(), (a1r0) ((jly0) wtpVar.b).get(), (q8n) daqVar.w1.get());
        }
        if (z) {
            return new c1r0(wtpVar.v(), (mwn0) daqVar.Wd.get());
        }
        jah.e(z ? 1 : 0);
        return null;
    }
}
