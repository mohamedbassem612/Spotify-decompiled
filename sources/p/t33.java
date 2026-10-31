package p;

import com.spotify.messages.AddToPlaylist;
import com.spotify.messages.CreatePlaylist;
import com.spotify.playlist.ai.creation.v2.PlaylistSavedRequest;
import io.reactivex.rxjava3.functions.Action;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t33 implements Action {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ g23 b;
    public final /* synthetic */ axu0 c;
    public final /* synthetic */ String d;

    public t33(g23 g23Var, axu0 axu0Var, String str) {
        this.b = g23Var;
        this.c = axu0Var;
        this.d = str;
    }

    public final void run() {
        byte b = this.a;
        String str = this.d;
        axu0 axu0Var = this.c;
        g23 g23Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = axu0Var.b;
                String str2 = axu0Var.f.a;
                String strI = xcg1.i(str2, ":", axu0Var.d);
                b6y b6yVar = (b6y) g23Var.b;
                ton tonVarN = CreatePlaylist.n();
                tonVarN.r(str2);
                tonVarN.q(strI);
                if (str.length() != 0) {
                    tonVarN.n(str);
                }
                b6yVar.a.a(tonVarN.build());
                if (!arrayList.isEmpty()) {
                    rn1 rn1VarO = AddToPlaylist.o();
                    rn1VarO.n(arrayList);
                    rn1VarO.q(true);
                    rn1VarO.t(str2);
                    rn1VarO.s(strI);
                    if (str.length() != 0) {
                        rn1VarO.r(str);
                    }
                    b6yVar.a.a(rn1VarO.build());
                }
                break;
            default:
                j23 j23Var = (c23) g23Var.d;
                String str3 = axu0Var.d;
                r23 r23Var = j23Var.a;
                PlaylistSavedRequest.Builder builderNewBuilder = PlaylistSavedRequest.newBuilder();
                builderNewBuilder.setMessageId(str3);
                builderNewBuilder.setPlaylistUri(str);
                r23Var.c(builderNewBuilder.build()).ignoreElement();
                break;
        }
    }

    public t33(axu0 axu0Var, g23 g23Var, String str) {
        this.c = axu0Var;
        this.b = g23Var;
        this.d = str;
    }
}
