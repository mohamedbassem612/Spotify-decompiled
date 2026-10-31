package p;

import android.net.Uri;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.player.model.command.options.SkipToTrack$Builder;
import io.reactivex.rxjava3.functions.Function;
import j$.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wfs implements Function {
    public final /* synthetic */ j6v0 a;
    public final /* synthetic */ xfs b;
    public final /* synthetic */ j6v0 c;

    public wfs(j6v0 j6v0Var, xfs xfsVar, j6v0 j6v0Var2) {
        this.a = j6v0Var;
        this.b = xfsVar;
        this.c = j6v0Var2;
    }

    public final Object apply(Object obj) {
        ArrayList arrayList;
        Context context = (Context) obj;
        xfs xfsVar = this.b;
        tgt0 tgt0Var = xfsVar.b;
        SkipToTrack$Builder skipToTrack$BuilderPageIndex = SkipToTrack.builder().pageIndex(0L);
        j6v0 j6v0Var = this.a;
        String str = j6v0Var.b;
        PreparePlayOptions preparePlayOptionsA = qot0.a(skipToTrack$BuilderPageIndex.trackUri(str).trackIndex(0L).build(), j6v0Var.c, j6v0Var.f, false, 8);
        b380<ContextPage> b380Var = (b380) context.pages().h();
        if (b380Var != null) {
            arrayList = new ArrayList(q7h.U(b380Var, 10));
            for (ContextPage contextPage : b380Var) {
                b380 b380Var2 = (b380) contextPage.tracks().h();
                ArrayList arrayList2 = b380Var2 != null ? new ArrayList((Collection) b380Var2) : new ArrayList();
                if (!arrayList2.contains(ContextTrack.create(str))) {
                    arrayList2.add(ContextTrack.create(str));
                }
                arrayList.add(contextPage.toBuilder().tracks(arrayList2).build());
            }
        } else {
            arrayList = fg91.b;
        }
        Context contextBuild = context.toBuilder().pages(arrayList).build();
        contextBuild.getClass();
        PlayCommand.Builder builder = PlayCommand.builder(contextBuild, tgt0Var.a);
        builder.options(preparePlayOptionsA);
        builder.loggingParams(xfsVar.a(j6v0Var.d));
        PlayOrigin.Builder builder2 = tgt0Var.a.toBuilder();
        j6v0 j6v0Var2 = this.c;
        String str2 = j6v0Var2.b;
        Long l = j6v0Var2.e;
        Uri.Builder builderBuildUpon = Uri.parse(URLEncoder.encode(str2, StandardCharsets.UTF_8.name())).buildUpon();
        builderBuildUpon.appendQueryParameter("context", j6v0Var2.a);
        long j = j6v0Var2.c;
        if (j > 0) {
            builderBuildUpon.appendQueryParameter("t", String.valueOf(j));
        }
        if (l.longValue() > 0) {
            builderBuildUpon.appendQueryParameter("he", String.valueOf(l.longValue()));
        }
        builderBuildUpon.build();
        builder.playOrigin(builder2.viewUri(builderBuildUpon.toString()).build());
        return xfsVar.a.a(builder.build()).ignoreElement();
    }
}
