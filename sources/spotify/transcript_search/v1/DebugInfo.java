package spotify.transcript_search.v1;

import com.google.protobuf.h;
import p.bf40;
import p.g7r;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class DebugInfo extends h implements v2j0 {
    private static final DebugInfo DEFAULT_INSTANCE;
    public static final int FIRST_PLAYBACK_SEGMENT_FIELD_NUMBER = 3;
    public static final int MATCHED_TEXT_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String firstPlaybackSegment_ = "";
    private String matchedText_ = "";

    static {
        DebugInfo debugInfo = new DebugInfo();
        DEFAULT_INSTANCE = debugInfo;
        h.registerDefaultInstance(DebugInfo.class, debugInfo);
    }

    private DebugInfo() {
    }

    public static DebugInfo n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ለ\u0000\u0004ለ\u0001", new Object[]{"bitField0_", "firstPlaybackSegment_", "matchedText_"});
        }
        if (iOrdinal == 3) {
            return new DebugInfo();
        }
        if (iOrdinal == 4) {
            return new g7r(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (DebugInfo.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.firstPlaybackSegment_;
    }

    public final String p() {
        return this.matchedText_;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
