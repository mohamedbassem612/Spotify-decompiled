package p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uo31 implements td41 {
    public static final bma1 b;
    public static final bma1 c;
    public static final bma1 d;
    public static final bma1 e;
    public static final bma1 f;
    public static final bma1 g;
    public static final bma1 h;
    public static final bma1 i;
    public static final bma1 j;
    public static final bma1 k;
    public static final bma1 l;
    public static final bma1 m;
    public final /* synthetic */ ozb1 a;

    static {
        j7c0.a.getClass();
        b = i7c0.b;
        nbc nbcVar = bma1.b;
        c = nbcVar.u("YourLibraryX.sortOption");
        d = nbcVar.u("YourLibraryX.sortOption.artist");
        e = nbcVar.u("YourLibraryX.sortOption.album");
        f = nbcVar.u("YourLibraryX.sortOption.playlist");
        g = nbcVar.u("YourLibraryX.sortOption.podcast");
        h = nbcVar.u("YourLibraryX.sortOption.book");
        i = nbcVar.u("YourLibraryX.sortOption.downloaded");
        j = nbcVar.u("YourLibraryX.sortOption.tag");
        k = nbcVar.u("YourLibraryX.sortOption.event");
        l = nbcVar.u("YourLibraryX.sortOption.author");
        m = nbcVar.u("YourLibraryX.sortOption.course");
    }

    public uo31(Context context, ut71 ut71Var, evm1 evm1Var, j7c0 j7c0Var, String str, s4b1 s4b1Var) {
        as3 as3Var;
        m7c0 m7c0Var = (m7c0) j7c0Var;
        dma1 dma1VarA = m7c0Var.b.a(str);
        j7c0.a.getClass();
        int iOrdinal = m7c0Var.a(dma1VarA.e(i7c0.b, (String) null)).ordinal();
        if (iOrdinal == 0) {
            as3Var = as3.b;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                throw null;
            }
            as3Var = as3.c;
        }
        this.a = new ozb1(context, str, s4b1Var, as3Var, ut71Var, evm1Var, b);
    }

    @Override // p.td41
    public final List a(mml mmlVar, List list) {
        return this.a.a(mmlVar, list);
    }

    @Override // p.td41
    public final void b(as3 as3Var) {
        this.a.b(as3Var);
    }

    @Override // p.td41
    public final as3 c() {
        return this.a.c();
    }

    @Override // p.td41
    public final dia1 d(mml mmlVar, List list) {
        return this.a.d(mmlVar, list);
    }

    @Override // p.td41
    public final void e(dia1 dia1Var, mml mmlVar, List list) {
        this.a.e(dia1Var, mmlVar, list);
    }
}
