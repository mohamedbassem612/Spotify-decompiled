package p;

import com.spotify.cosmos.rxrouter.RxRouter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lkp implements jly0 {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lkp(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // p.kly0
    public final Object get() {
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                mkp mkpVar = (mkp) obj;
                nkp nkpVar = mkpVar.a;
                if (z) {
                    if (z) {
                        return new kkp(this);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                mxr mxrVarA = mkpVar.a();
                byp bypVarF = nkpVar.f();
                tq90 tq90VarD = nkpVar.d();
                i3b i3bVar = new i3b(nkpVar.a(), (byte) 6);
                b0a0 b0a0VarD = mkpVar.b.d();
                c8o.l(b0a0VarD);
                return new res(mxrVarA, bypVarF, tq90VarD, i3bVar, b0a0VarD);
            case 1:
                cyp cypVar = (cyp) obj;
                if (!z) {
                    return sdl.q((RxRouter) cypVar.c.get());
                }
                if (z) {
                    return rx31.s(cypVar.a.B(), cypVar.b);
                }
                jah.e(z ? 1 : 0);
                return null;
            default:
                daq daqVar = (daq) obj;
                if (!z) {
                    return new ve4(true, (luk) daqVar.L1.get());
                }
                if (z) {
                    return new u9e((dma1) daqVar.C1.get());
                }
                jah.e(z ? 1 : 0);
                return null;
        }
    }
}
