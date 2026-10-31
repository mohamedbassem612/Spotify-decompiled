package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mzb0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pzb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mzb0(pzb0 pzb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = pzb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pzb0 pzb0Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                eb80 eb80Var = pzb0Var.b;
                str.getClass();
                return eb80Var.t(str);
            default:
                ContextTrack contextTrack = (ContextTrack) obj;
                String strA0 = l4o1.a0(contextTrack, "context_uri");
                if (!pzb0Var.d.b(strA0 == null ? "" : strA0)) {
                    strA0 = null;
                }
                return strA0 == null ? contextTrack.uri() : strA0;
        }
    }
}
