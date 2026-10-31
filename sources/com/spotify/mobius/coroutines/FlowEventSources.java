package com.spotify.mobius.coroutines;

import com.spotify.mobius.EventSource;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import p.ezc;
import p.fns;
import p.h4p1;
import p.igu;
import p.lnm;
import p.mr20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/mobius/coroutines/FlowEventSources;", "", "Companion", "mobius-coroutines"}, k = 1, mv = {1, 9, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface FlowEventSources {
    public static final Companion a = Companion.a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/mobius/coroutines/FlowEventSources$Companion;", "", "<init>", "()V", "mobius-coroutines"}, k = 1, mv = {1, 9, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public static ezc a(EventSource eventSource) {
            return h4p1.f(new asFlow.1(eventSource, (lnm) null));
        }

        public static b b(Companion companion, mr20[] mr20VarArr) {
            fns fnsVar = igu.a;
            companion.getClass();
            return new b(fnsVar, mr20VarArr);
        }
    }
}
