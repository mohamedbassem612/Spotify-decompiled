package com.spotify.extendedmetadata.extensions.playtraitimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ets0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class PlayTrait extends h implements v2j0 {
    private static final PlayTrait DEFAULT_INSTANCE;
    public static final int LIMITED_PLAY_CONTEXT_FIELD_NUMBER = 1;
    public static final int LIMITED_SEQUENCE_QUERY_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private LimitedPlayContext limitedPlayContext_;
    private LimitedSequenceQuery limitedSequenceQuery_;

    static {
        PlayTrait playTrait = new PlayTrait();
        DEFAULT_INSTANCE = playTrait;
        h.registerDefaultInstance(PlayTrait.class, playTrait);
    }

    private PlayTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PlayTrait q(byte[] bArr) {
        return (PlayTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "limitedPlayContext_", "limitedSequenceQuery_"});
        }
        if (iOrdinal == 3) {
            return new PlayTrait();
        }
        if (iOrdinal == 4) {
            return new ets0((byte) 22);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (PlayTrait.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final LimitedPlayContext o() {
        LimitedPlayContext limitedPlayContext = this.limitedPlayContext_;
        return limitedPlayContext == null ? LimitedPlayContext.o() : limitedPlayContext;
    }

    public final LimitedSequenceQuery p() {
        LimitedSequenceQuery limitedSequenceQuery = this.limitedSequenceQuery_;
        return limitedSequenceQuery == null ? LimitedSequenceQuery.p() : limitedSequenceQuery;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
