package p;

import com.spotify.gander.v2.proto.SecondaryAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eiy0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SecondaryAction b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eiy0(SecondaryAction secondaryAction, byte b) {
        super(1);
        this.a = b;
        this.b = secondaryAction;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        SecondaryAction secondaryAction = this.b;
        switch (b) {
            case 0:
                vga0 vga0Var = (vga0) obj;
                j9k1.A(vga0Var, "username", secondaryAction.p().getUsername());
                j9k1.A(vga0Var, "userDisplayName", secondaryAction.p().o());
                break;
            case 1:
                vga0 vga0Var2 = (vga0) obj;
                j9k1.A(vga0Var2, "username", secondaryAction.o().getUsername());
                j9k1.A(vga0Var2, "userDisplayName", secondaryAction.o().o());
                break;
            default:
                j9k1.A((vga0) obj, "playlistUri", secondaryAction.q().getPlaylistUri());
                break;
        }
        return rih1Var;
    }
}
