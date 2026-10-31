package com.spotify.mobius;

import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.internal_util.Throwables;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class LoggingUpdate<M, E, F> implements Update<M, E, F> {
    public final Update a;
    public final MobiusLoop.Logger b;

    public LoggingUpdate(Update update, MobiusLoop.Logger logger) {
        Preconditions.b(update);
        this.a = update;
        Preconditions.b(logger);
        this.b = logger;
    }

    @Override // com.spotify.mobius.Update
    public final Next a(Object obj, Object obj2) {
        MobiusLoop.Logger logger = this.b;
        logger.d(obj, obj2);
        try {
            Next nextA = this.a.a(obj, obj2);
            logger.a(obj, obj2, nextA);
            return nextA;
        } catch (Exception e) {
            logger.b(obj, obj2, e);
            Throwables.a(e);
            throw null;
        }
    }
}
