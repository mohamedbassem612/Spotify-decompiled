package com.spotify.mobius.coroutines;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p.bbc;
import p.bhn0;
import p.lnm;
import p.onm;
import p.r261;
import p.tka0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/spotify/mobius/coroutines/CoroutinesSubtypeEffectHandlerBuilder;", "", "F", "E", "<init>", "()V", "EffectHandler", "EffectsHandler", "mobius-coroutines"}, k = 1, mv = {1, 9, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class CoroutinesSubtypeEffectHandlerBuilder<F, E> {
    public final LinkedHashMap a = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/mobius/coroutines/CoroutinesSubtypeEffectHandlerBuilder$EffectHandler;", "F", "E", "", "mobius-coroutines"}, k = 1, mv = {1, 9, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public interface EffectHandler<F, E> {
        Object a(Object obj, r261 r261Var, onm onmVar);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/mobius/coroutines/CoroutinesSubtypeEffectHandlerBuilder$EffectsHandler;", "F", "E", "", "mobius-coroutines"}, k = 1, mv = {1, 9, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public interface EffectsHandler<F, E> {
        Object a(bbc bbcVar, r261 r261Var, lnm lnmVar);
    }

    public final void a(tka0 tka0Var, EffectsHandler effectsHandler) {
        if (((EffectsHandler) this.a.put(tka0Var, effectsHandler)) == null) {
            return;
        }
        bhn0.B(tka0Var.r(), "Trying to add more than one handler for the effect ");
    }
}
