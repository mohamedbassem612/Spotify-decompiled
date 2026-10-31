package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kxo {
    public final /* synthetic */ jwo a;

    public kxo(jwo jwoVar) {
        this.a = jwoVar;
    }

    public final ix1 a(pia1 pia1Var) {
        oql oqlVar = (oql) this.a.b;
        Context context = (Context) ((mx1) oqlVar.b).a.get();
        c8o.l(context);
        ox1 ox1Var = new ox1(context);
        xfx xfxVar = (xfx) ((mx1) oqlVar.b).b.get();
        c8o.l(xfxVar);
        return new ix1(ox1Var, new zfx(xfxVar.c, (byte) 23), pia1Var);
    }
}
