package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ps5 {
    public static qs5 a(PlayerState playerState, yqg yqgVar) {
        int i;
        String str;
        gu5 gu5Var;
        if (playerState == null) {
            return qs5.k;
        }
        if (playerState.options().repeatingTrack()) {
            i = 1;
        } else {
            i = playerState.options().repeatingContext() ? 2 : 0;
        }
        icu0 icu0Var = new icu0(playerState.restrictions().disallowSkippingNextReasons().isEmpty(), playerState.restrictions().disallowSkippingPrevReasons().isEmpty() || playerState.restrictions().disallowSeekingReasons().isEmpty(), playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty(), playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty(), playerState.restrictions().disallowTogglingShuffleReasons().isEmpty(), playerState.restrictions().disallowSeekingReasons().isEmpty());
        ybu0 ybu0Var = new ybu0(i, playerState.options().shufflingContext());
        nq5 nq5Var = cv5.Companion;
        String strContextUri = playerState.contextUri();
        nq5Var.getClass();
        String strA = nq5.a(strContextUri);
        String str2 = (String) playerState.contextMetadata().get("context_description");
        if (str2 == null) {
            str2 = "";
        }
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        long jLongValue = ((Number) playerState.duration().e(0L)).longValue();
        if (contextTrack == null) {
            str = str2;
            gu5Var = null;
        } else {
            String str3 = (String) contextTrack.metadata().get("artist_name");
            if (str3 == null) {
                str3 = "";
            }
            String str4 = (String) contextTrack.metadata().get("artist_uri");
            if (str4 == null) {
                str4 = "";
            }
            aq5 aq5Var = new aq5(str3, str4);
            ArrayList arrayList = new ArrayList();
            String str5 = (String) contextTrack.metadata().get("artist_name");
            String str6 = (String) contextTrack.metadata().get("artist_uri");
            int i2 = 1;
            while (str5 != null && str6 != null) {
                String str7 = str2;
                arrayList.add(new aq5(str5, str6));
                Locale locale = Locale.ROOT;
                String str8 = String.format(locale, "artist_name:%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                ArrayList arrayList2 = arrayList;
                String str9 = String.format(locale, "artist_uri:%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                str5 = (String) contextTrack.metadata().get(str8);
                str6 = (String) contextTrack.metadata().get(str9);
                i2++;
                arrayList = arrayList2;
                str2 = str7;
            }
            ArrayList arrayList3 = arrayList;
            str = str2;
            String str10 = (String) contextTrack.metadata().get("album_title");
            if (str10 == null) {
                str10 = "";
            }
            String str11 = (String) contextTrack.metadata().get("album_uri");
            if (str11 == null) {
                str11 = "";
            }
            up5 up5Var = new up5(str10, str11);
            Boolean boolValueOf = Boolean.valueOf(Boolean.parseBoolean((String) contextTrack.metadata().get("collection.in_collection")));
            Long lValueOf = Long.valueOf(jLongValue);
            String str12 = (String) contextTrack.metadata().get("title");
            String str13 = str12 == null ? "" : str12;
            String strUri = contextTrack.uri();
            String strUid = contextTrack.uid();
            cv5.Companion.getClass();
            String strB = nq5.b(contextTrack);
            Set set = s4b1.f;
            gu5Var = new gu5(aq5Var, arrayList3, up5Var, boolValueOf, lValueOf, str13, strUri, strUid, strB, Boolean.valueOf(uic.x(contextTrack.uri()).c == blc0.Pg), Boolean.valueOf(l4o1.P(contextTrack)));
        }
        return new qs5(strA, str, gu5Var, Boolean.valueOf(playerState.isPaused()), Float.valueOf((float) ((Number) playerState.playbackSpeed().e(Double.valueOf(0.0d))).doubleValue()), (Long) playerState.position(yqgVar != null ? yqgVar.b() : 0L).e(0L), ybu0Var, icu0Var);
    }

    public final nma0 serializer() {
        return os5.a;
    }
}
