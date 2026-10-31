package p;

import androidx.media3.common.util.GlUtil;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class aya implements qoj1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dya b;

    public /* synthetic */ aya(dya dyaVar, byte b) {
        this.a = b;
        this.b = dyaVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    @Override // p.qoj1
    public final void run() throws GlUtil.GlException {
        byte b = this.a;
        dya dyaVar = this.b;
        switch (b) {
            case 0:
                if (!dyaVar.e.isEmpty()) {
                    dyaVar.X = true;
                } else {
                    dos dosVar = dyaVar.h;
                    dosVar.getClass();
                    dosVar.a();
                    x8r.a();
                }
                break;
            case 1:
                dyaVar.t++;
                dyaVar.Q();
                break;
            default:
                ss40 ss40Var = dyaVar.i;
                if (ss40Var != null) {
                    ss40Var.a();
                }
                dyaVar.e.clear();
                break;
        }
    }
}
