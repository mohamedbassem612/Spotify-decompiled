package p;

import com.spotify.gander.v2.proto.BlockFollowerAction;
import com.spotify.gander.v2.proto.DeleteNotificationAction;
import com.spotify.gander.v2.proto.RemoveFollowerAction;
import com.spotify.gander.v2.proto.SecondaryAction;
import com.spotify.gander.v2.proto.SetPlaylistPrivateAction;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fiy0 implements nma0 {
    public static final fiy0 a = new fiy0();
    public static final j661 b = omo1.j("com.spotify.gander.v2.proto.SecondaryAction", new h661[0]);

    public final Object deserialize(dar darVar) {
        String strG;
        String strG2;
        String strG3;
        String strG4;
        String strG5;
        uga0 uga0VarL = fga0.l(((bga0) darVar).m());
        wd51 wd51VarR = SecondaryAction.r();
        ega0 ega0Var = (ega0) uga0VarL.get("removeFollower");
        if (ega0Var != null) {
            uga0 uga0VarL2 = fga0.l(ega0Var);
            v621 v621VarP = RemoveFollowerAction.p();
            ega0 ega0Var2 = (ega0) uga0VarL2.get("username");
            if (ega0Var2 != null && (strG5 = fga0.g(fga0.m(ega0Var2))) != null) {
                v621VarP.q(strG5);
            }
            ega0 ega0Var3 = (ega0) uga0VarL2.get("userDisplayName");
            if (ega0Var3 != null && (strG4 = fga0.g(fga0.m(ega0Var3))) != null) {
                v621VarP.n(strG4);
            }
            wd51VarR.r(v621VarP.build());
        }
        ega0 ega0Var4 = (ega0) uga0VarL.get("blockFollower");
        if (ega0Var4 != null) {
            uga0 uga0VarL3 = fga0.l(ega0Var4);
            j6b j6bVarP = BlockFollowerAction.p();
            ega0 ega0Var5 = (ega0) uga0VarL3.get("username");
            if (ega0Var5 != null && (strG3 = fga0.g(fga0.m(ega0Var5))) != null) {
                j6bVarP.q(strG3);
            }
            ega0 ega0Var6 = (ega0) uga0VarL3.get("userDisplayName");
            if (ega0Var6 != null && (strG2 = fga0.g(fga0.m(ega0Var6))) != null) {
                j6bVarP.n(strG2);
            }
            wd51VarR.n(j6bVarP.build());
        }
        ega0 ega0Var7 = (ega0) uga0VarL.get("setPlaylistPrivate");
        if (ega0Var7 != null) {
            uga0 uga0VarL4 = fga0.l(ega0Var7);
            pl61 pl61VarO = SetPlaylistPrivateAction.o();
            ega0 ega0Var8 = (ega0) uga0VarL4.get("playlistUri");
            if (ega0Var8 != null && (strG = fga0.g(fga0.m(ega0Var8))) != null) {
                pl61VarO.n(strG);
            }
            wd51VarR.s(pl61VarO.build());
        }
        ega0 ega0Var9 = (ega0) uga0VarL.get("deleteNotification");
        if (ega0Var9 != null) {
            fga0.l(ega0Var9);
            wd51VarR.q((DeleteNotificationAction) DeleteNotificationAction.n().build());
        }
        return wd51VarR.build();
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        SecondaryAction secondaryAction = (SecondaryAction) obj;
        jga0 jga0Var = (jga0) uaxVar;
        vga0 vga0Var = new vga0();
        int iN = secondaryAction.n();
        int i = iN == 0 ? -1 : diy0.a[l1d.C(iN)];
        if (i == 1) {
            j9k1.B(vga0Var, "removeFollower", new eiy0(secondaryAction, (byte) 0));
        } else if (i == 2) {
            j9k1.B(vga0Var, "blockFollower", new eiy0(secondaryAction, (byte) 1));
        } else if (i == 3) {
            j9k1.B(vga0Var, "setPlaylistPrivate", new eiy0(secondaryAction, (byte) 2));
        } else if (i == 4) {
            vga0Var.b("deleteNotification", new uga0(new LinkedHashMap()));
        } else if (i != 5) {
            eg.o();
            return;
        }
        jga0Var.R(vga0Var.a());
    }
}
