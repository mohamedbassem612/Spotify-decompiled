package com.spotify.mobius;

import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.internal_util.Throwables;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class LoggingInit<M, F> implements Init<M, F> {
    public final Init a;
    public final MobiusLoop.Logger b;

    public LoggingInit(Init init, MobiusLoop.Logger logger) {
        Preconditions.b(init);
        this.a = init;
        Preconditions.b(logger);
        this.b = logger;
    }

    @Override // com.spotify.mobius.Init
    public final First e0(Object obj) {
        MobiusLoop.Logger logger = this.b;
        logger.e(obj);
        try {
            First firstE0 = this.a.e0(obj);
            logger.c(obj, firstE0);
            return firstE0;
        } catch (Exception e) {
            logger.f(obj, e);
            Throwables.a(e);
            throw null;
        }
    }
}
