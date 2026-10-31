package com.spotify.extendedmetadata.extensions.displaysegmentsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ljj0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class MusicAndTalkDecoration extends h implements v2j0 {
    public static final int CAN_UPSELL_FIELD_NUMBER = 1;
    private static final MusicAndTalkDecoration DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private boolean canUpsell_;

    static {
        MusicAndTalkDecoration musicAndTalkDecoration = new MusicAndTalkDecoration();
        DEFAULT_INSTANCE = musicAndTalkDecoration;
        h.registerDefaultInstance(MusicAndTalkDecoration.class, musicAndTalkDecoration);
    }

    private MusicAndTalkDecoration() {
    }

    public static MusicAndTalkDecoration n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"canUpsell_"});
        }
        if (iOrdinal == 3) {
            return new MusicAndTalkDecoration();
        }
        if (iOrdinal == 4) {
            return new ljj0(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (MusicAndTalkDecoration.class) {
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

    public final boolean getCanUpsell() {
        return this.canUpsell_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
