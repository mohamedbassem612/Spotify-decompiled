package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mht0 implements Function {
    public final /* synthetic */ wht0 a;

    public mht0(wht0 wht0Var) {
        this.a = wht0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v6, types: [p.b7x] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        ?? P;
        j380 j380VarMetadata;
        wxt0 wxt0Var = (wxt0) obj;
        PlayerState playerState = wxt0Var.d;
        List list = wxt0Var.b;
        Objects.toString(list);
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((y6b1) it.next()).toString());
        }
        Context.Builder builder = Context.builder(wxt0Var.a.toString());
        j380 j380VarContextMetadata = playerState.contextMetadata();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : j380VarContextMetadata.entrySet()) {
            if (!u890.j((String) entry.getKey(), "end_of_context_action")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Context.Builder builderMetadata = builder.metadata(sqg0.P(linkedHashMap, oqn1.n("end_of_context_action", "pause")));
        ContextPage.Builder builder2 = ContextPage.builder();
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ContextTrack.Builder builder3 = ContextTrack.builder((String) it2.next());
            ContextTrack contextTrack = (ContextTrack) playerState.track().h();
            if (contextTrack == null || (j380VarMetadata = contextTrack.metadata()) == null) {
                P = 0;
            } else {
                P = new LinkedHashMap();
                for (Map.Entry entry2 : j380VarMetadata.entrySet()) {
                    if (u890.j((String) entry2.getKey(), "live.deeplink_url")) {
                        P.put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            if (P == 0) {
                P = b7x.a;
            }
            Long l = t2p1.l(playerState);
            if (l != null) {
                P = sqg0.P(P, oqn1.n("start_timestamp", String.valueOf(l.longValue())));
            }
            arrayList2.add(builder3.metadata((Map) P).build());
        }
        Context contextBuild = builderMetadata.pages(k4p1.x(builder2.tracks(arrayList2).build())).restrictions(wht0.b()).build();
        long j = wxt0Var.c;
        contextBuild.getClass();
        return this.a.a(j, contextBuild);
    }
}
