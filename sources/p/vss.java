package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vss implements tss {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mxr b;
    public final /* synthetic */ int c;

    public /* synthetic */ vss(mxr mxrVar, int i, byte b) {
        this.a = b;
        this.b = mxrVar;
        this.c = i;
    }

    public final void a(ContextTrack contextTrack) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        int i = this.c;
        mxr mxrVar = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) mxrVar.a;
                wqk0 wqk0Var = (wqk0) mxrVar.b;
                x6h1 x6h1VarC = wqk0Var.c.c();
                x6h1VarC.i.add(new a7h1("playback_speed_quick_option", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String strUri = contextTrack.uri();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (strUri == null) {
                    strUri = "";
                }
                mmr0 mmr0Var = new mmr0("currently_played_item", strUri);
                String strValueOf = String.valueOf(i);
                i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("set_playback_speed", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0(ContextTrack$Metadata.KEY_PLAYBACK_SPEED, strValueOf != null ? strValueOf : "")})), y6h1VarA, wqk0Var.b, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                i8h1 i8h1Var2 = (i8h1) mxrVar.a;
                wqk0 wqk0Var2 = (wqk0) mxrVar.b;
                x6h1 x6h1VarC2 = wqk0Var2.c.c();
                x6h1VarC2.i.add(new a7h1("playback_speed_selector", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                String strUri2 = contextTrack.uri();
                z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                if (strUri2 == null) {
                    strUri2 = "";
                }
                mmr0 mmr0Var2 = new mmr0("currently_played_item", strUri2);
                String strValueOf2 = String.valueOf(i);
                i8h1Var2.m(new w7h1("", "", z7h1Var2, new x7h1("set_playback_speed", 1, sqg0.J(new mmr0[]{mmr0Var2, new mmr0(ContextTrack$Metadata.KEY_PLAYBACK_SPEED, strValueOf2 != null ? strValueOf2 : "")})), y6h1VarA2, wqk0Var2.b, System.currentTimeMillis()), (xj61) null);
                break;
        }
    }
}
