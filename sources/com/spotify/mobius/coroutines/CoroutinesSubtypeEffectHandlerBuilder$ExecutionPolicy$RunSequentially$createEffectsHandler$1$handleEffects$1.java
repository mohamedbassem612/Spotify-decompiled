package com.spotify.mobius.coroutines;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import p.onm;
import p.q8r;
import p.r261;
import p.uac;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@q8r(c = "com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1", f = "CoroutinesSubtypeEffectHandlerBuilder.kt", l = {317, 318}, m = "handleEffects")
@Metadata(k = 3, mv = {1, 9, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
final class CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1$handleEffects$1 extends onm {
    public Object a;
    public r261 b;
    public uac c;
    public /* synthetic */ Object d;
    public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1$handleEffects$1(CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1 coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1, onm onmVar) {
        super(onmVar);
        this.e = coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
