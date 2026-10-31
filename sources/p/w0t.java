package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w0t {
    public static final bma1 g;
    public static final bma1 h;
    public static final bma1 i;
    public final a820 a;
    public final Context b;
    public final ut71 c;
    public final String d;
    public final z0t e;
    public final idd1 f = new idd1(new ots(this, (byte) 12));

    static {
        nbc nbcVar = bma1.b;
        g = nbcVar.u("YourLibraryX.rememberedFilters");
        h = nbcVar.u("YourLibraryX.rememberedTagId");
        i = nbcVar.u("YourLibraryX.rememberedTagName");
    }

    public w0t(a820 a820Var, Context context, ut71 ut71Var, String str, z0t z0tVar) {
        this.a = a820Var;
        this.b = context;
        this.c = ut71Var;
        this.d = str;
        this.e = z0tVar;
    }

    public final dma1 a() {
        return (dma1) this.f.getValue();
    }

    public final boolean b() {
        if (this.e.a.l()) {
            dma1 dma1VarA = a();
            hy11.i0.getClass();
            if (dma1VarA.h(gy11.b, false)) {
                return true;
            }
        }
        return false;
    }
}
