package com.spotify.mobius.extras.patterns;

import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class InnerEffectHandlers {

    /* JADX INFO: renamed from: com.spotify.mobius.extras.patterns.InnerEffectHandlers$2, reason: invalid class name */
    class AnonymousClass2 implements InnerEffectHandler<Object, Object, Object> {
        public final /* synthetic */ Function a;

        public AnonymousClass2(Function function) {
            this.a = function;
        }
    }

    public static InnerEffectHandler a(Function function) {
        return new AnonymousClass2(function);
    }
}
