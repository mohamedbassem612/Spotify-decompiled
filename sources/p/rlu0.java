package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PlayerOptionOverrides$Builder;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rlu0 {
    public final PlayOrigin a;

    public rlu0(lik1 lik1Var, a690 a690Var) {
        this.a = PlayOrigin.builder("playlist-recommended").referrerIdentifier(a690Var.a.getName()).viewUri(lik1Var.a).build();
    }

    public final PreparePlayOptions a(Integer num) {
        PreparePlayOptions.Builder builderSkipTo = PreparePlayOptions.builder().skipTo(SkipToTrack.fromIndices(Long.valueOf(num != null ? num.intValue() : 0L), 0L));
        PlayerOptionOverrides$Builder playerOptionOverrides$BuilderBuilder = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        return builderSkipTo.playerOptionsOverride(playerOptionOverrides$BuilderBuilder.repeatingContext(bool).repeatingTrack(bool).shufflingContext(bool).build()).build();
    }

    public final Context b(String str, List list) {
        Context.Builder builder = Context.builder(str);
        ContextPage.Builder builder2 = ContextPage.builder();
        List listD1 = o7h.d1(list, 6);
        ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
        Iterator it = listD1.iterator();
        while (it.hasNext()) {
            arrayList.add(ContextTrack.builder(((p111) it.next()).b).build());
        }
        return builder.pages(Collections.singletonList(builder2.tracks(arrayList).build())).build();
    }
}
