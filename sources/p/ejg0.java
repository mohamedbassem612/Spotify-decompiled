package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ejg0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gjg0 b;

    public /* synthetic */ ejg0(gjg0 gjg0Var, byte b) {
        this.a = b;
        this.b = gjg0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        gjg0 gjg0Var = this.b;
        switch (b) {
            case 0:
                uw0 uw0Var = gjg0Var.a;
                a1r0.i((a1r0) uw0Var.d, "spotify:internal:puffin-setup-autodetect", (String) null, pzm.g("puffin_setup_flow_should_resume_music_when_exiting_flow", ((yig0) obj).c), 2);
                break;
            case 1:
                uw0 uw0Var2 = gjg0Var.a;
                a1r0.i((a1r0) uw0Var2.d, "spotify:internal:puffin-intro", (String) null, pzm.g("puffin_setup_flow_should_resume_music_when_exiting_flow", ((zig0) obj).c), 2);
                break;
            default:
                uw0 uw0Var3 = gjg0Var.a;
                a1r0.i((a1r0) uw0Var3.d, "spotify:internal:puffin-onboarding", (String) null, pzm.g("puffin_setup_flow_should_resume_music_when_exiting_flow", ((ajg0) obj).c), 2);
                break;
        }
    }
}
