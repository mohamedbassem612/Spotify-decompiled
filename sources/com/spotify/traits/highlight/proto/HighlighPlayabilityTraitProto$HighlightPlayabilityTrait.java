package com.spotify.traits.highlight.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class HighlighPlayabilityTraitProto$HighlightPlayabilityTrait extends h implements v2j0 {
    private static final HighlighPlayabilityTraitProto$HighlightPlayabilityTrait DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 1;
    public static final int PARENT_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SEGMENT_BEGINNING_MILLIS_FIELD_NUMBER = 3;
    public static final int SEGMENT_END_MILLIS_FIELD_NUMBER = 4;
    private boolean isPlayable_;
    private String parentUri_ = "";
    private int segmentBeginningMillis_;
    private int segmentEndMillis_;

    static {
        HighlighPlayabilityTraitProto$HighlightPlayabilityTrait highlighPlayabilityTraitProto$HighlightPlayabilityTrait = new HighlighPlayabilityTraitProto$HighlightPlayabilityTrait();
        DEFAULT_INSTANCE = highlighPlayabilityTraitProto$HighlightPlayabilityTrait;
        h.registerDefaultInstance(HighlighPlayabilityTraitProto$HighlightPlayabilityTrait.class, highlighPlayabilityTraitProto$HighlightPlayabilityTrait);
    }

    private HighlighPlayabilityTraitProto$HighlightPlayabilityTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static HighlighPlayabilityTraitProto$HighlightPlayabilityTrait r(byte[] bArr) {
        return (HighlighPlayabilityTraitProto$HighlightPlayabilityTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003\u0004\u0004\u0004", new Object[]{"isPlayable_", "parentUri_", "segmentBeginningMillis_", "segmentEndMillis_"});
        }
        if (iOrdinal == 3) {
            return new HighlighPlayabilityTraitProto$HighlightPlayabilityTrait();
        }
        if (iOrdinal == 4) {
            return new m660((byte) 3);
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
        synchronized (HighlighPlayabilityTraitProto$HighlightPlayabilityTrait.class) {
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean getIsPlayable() {
        return this.isPlayable_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.parentUri_;
    }

    public final int p() {
        return this.segmentBeginningMillis_;
    }

    public final int q() {
        return this.segmentEndMillis_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
