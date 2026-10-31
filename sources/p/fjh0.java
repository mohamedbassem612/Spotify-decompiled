package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fjh0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hjh0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fjh0(hjh0 hjh0Var, byte b) {
        super(1);
        this.a = b;
        this.b = hjh0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hjh0 hjh0Var = this.b;
        switch (b) {
            case 0:
                spq0 spq0Var = (spq0) obj;
                uwt0 uwt0Var = hjh0Var.f;
                boolean zC = spq0Var.c();
                tau0 tau0Var = (tau0) uwt0Var.a.b;
                return !zC ? tau0Var.a().a(new g9u0("mediabutton-playbackcontrolcommandshandler", false)) : tau0Var.a().a(uwt0.d((PlayerState) spq0Var.b(), -15000));
            case 1:
                spq0 spq0Var2 = (spq0) obj;
                uwt0 uwt0Var2 = hjh0Var.f;
                boolean zC2 = spq0Var2.c();
                tau0 tau0Var2 = (tau0) uwt0Var2.a.b;
                return !zC2 ? tau0Var2.a().a(new g9u0("mediabutton-playbackcontrolcommandshandler", false)) : tau0Var2.a().a(uwt0.d((PlayerState) spq0Var2.b(), 15000));
            case 2:
                return hjh0Var.f.a((spq0) obj, new l9u0(), 15000);
            case 3:
                return hjh0Var.f.a((spq0) obj, new n9u0(), -15000);
            default:
                spq0 spq0Var3 = (spq0) obj;
                uwt0 uwt0Var3 = hjh0Var.f;
                boolean zC3 = spq0Var3.c();
                tau0 tau0Var3 = (tau0) uwt0Var3.a.b;
                if (zC3) {
                    return tau0Var3.a().a(((PlayerState) spq0Var3.b()).isPaused() ? new g9u0("mediabutton-playbackcontrolcommandshandler", false) : new d9u0("mediabutton-playbackcontrolcommandshandler", false));
                }
                return tau0Var3.a().a(new g9u0("mediabutton-playbackcontrolcommandshandler", false));
        }
    }
}
