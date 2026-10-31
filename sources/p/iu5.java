package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iu5 {
    public static ju5 a(PlayerState playerState) {
        ArrayList arrayListF = playerState != null ? new xpv0((byte) 16).f(playerState, new ota1(), true, (sp91) null, false, new ghh0(false, b7x.a, false, false, false, ktl.a, false, false), false, (wqg) null, false) : z6x.a;
        vgh0 vgh0Var = vgh0.b;
        if (playerState != null) {
            spq0 spq0VarTrack = playerState.track();
            if (spq0VarTrack.c()) {
                ContextTrack contextTrack = (ContextTrack) spq0VarTrack.b();
                j380 j380VarMetadata = contextTrack.metadata();
                String str = (String) j380VarMetadata.get("album_title");
                if (str == null) {
                    str = "";
                }
                String str2 = (String) j380VarMetadata.get("album_uri");
                if (str2 == null) {
                    str2 = "";
                }
                up5 up5Var = new up5(str, str2);
                String str3 = (String) j380VarMetadata.get("artist_name");
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = (String) j380VarMetadata.get("artist_uri");
                if (str4 == null) {
                    str4 = "";
                }
                aq5 aq5Var = new aq5(str3, str4);
                String str5 = (String) j380VarMetadata.get("album_track_number");
                Integer numValueOf = Integer.valueOf((int) ((Number) playerState.duration().e(0L)).longValue());
                String str6 = (String) j380VarMetadata.get("title");
                String str7 = str6 != null ? str6 : "";
                Integer numValueOf2 = Integer.valueOf(str5 != null ? Integer.parseInt(str5) : 0);
                String strUri = contextTrack.uri();
                ahh0 ahh0Var = ahh0.d;
                Boolean boolValueOf = Boolean.valueOf(arrayListF.contains(ahh0Var));
                Boolean boolValueOf2 = Boolean.valueOf(arrayListF.contains(ahh0Var) || arrayListF.contains(hgh0.d));
                Boolean boolValueOf3 = Boolean.valueOf(arrayListF.contains(zgh0.e));
                Boolean boolValueOf4 = Boolean.valueOf(arrayListF.contains(rgh0.a));
                Boolean boolValueOf5 = Boolean.valueOf(arrayListF.contains(tgh0.a));
                lgh0 lgh0Var = lgh0.a;
                Boolean boolValueOf6 = Boolean.valueOf(arrayListF.contains(lgh0Var) || arrayListF.contains(vgh0Var));
                Boolean boolValueOf7 = Boolean.valueOf(arrayListF.contains(lgh0Var) || arrayListF.contains(vgh0Var));
                cv5.Companion.getClass();
                return new ju5(up5Var, aq5Var, numValueOf, str7, numValueOf2, "track", strUri, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, nq5.b(contextTrack));
            }
        }
        return ju5.u;
    }

    public final nma0 serializer() {
        return hu5.a;
    }
}
