package p;

import com.spotify.player.model.ContextTrack;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uss implements tss {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mxr b;

    public /* synthetic */ uss(mxr mxrVar, byte b) {
        this.a = b;
        this.b = mxrVar;
    }

    public final void a(ContextTrack contextTrack) {
        byte b = this.a;
        mxr mxrVar = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) mxrVar.a;
                wqk0 wqk0Var = (wqk0) mxrVar.b;
                x6h1 x6h1VarC = wqk0Var.c.c();
                x6h1VarC.i.add(new a7h1("dismiss_area", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, wqk0Var.b, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                ((i8h1) mxrVar.a).f(((wqk0) mxrVar.b).e(), (Set) null);
                break;
        }
    }
}
