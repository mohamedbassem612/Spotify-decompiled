package com.spotify.your_library_esperanto.proto;

import com.google.protobuf.h;
import p.a53;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yy3;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class AlsoAvailableOfflineSuggestion extends h implements v2j0 {
    public static final int CACHED_DURATION_SECONDS_FIELD_NUMBER = 6;
    public static final int CACHED_PERCENTAGE_FIELD_NUMBER = 5;
    public static final int CACHED_TRACK_COUNT_FIELD_NUMBER = 3;
    private static final AlsoAvailableOfflineSuggestion DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TOTAL_TRACK_COUNT_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int cachedDurationSeconds_;
    private float cachedPercentage_;
    private int cachedTrackCount_;
    private YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity entity_;
    private int totalTrackCount_;
    private int type_;

    static {
        AlsoAvailableOfflineSuggestion alsoAvailableOfflineSuggestion = new AlsoAvailableOfflineSuggestion();
        DEFAULT_INSTANCE = alsoAvailableOfflineSuggestion;
        h.registerDefaultInstance(AlsoAvailableOfflineSuggestion.class, alsoAvailableOfflineSuggestion);
    }

    private AlsoAvailableOfflineSuggestion() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u0004\u0004\u0004\u0005\u0001\u0006\u0004", new Object[]{"bitField0_", "entity_", "type_", "cachedTrackCount_", "totalTrackCount_", "cachedPercentage_", "cachedDurationSeconds_"});
        }
        if (iOrdinal == 3) {
            return new AlsoAvailableOfflineSuggestion();
        }
        if (iOrdinal == 4) {
            return new a53(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (AlsoAvailableOfflineSuggestion.class) {
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

    public final int n() {
        return this.cachedDurationSeconds_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.cachedTrackCount_;
    }

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity p() {
        YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity = this.entity_;
        return yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity == null ? YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.r() : yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;
    }

    public final int q() {
        return this.totalTrackCount_;
    }

    public final yy3 r() {
        yy3 yy3Var;
        int i = this.type_;
        if (i == 0) {
            yy3Var = yy3.ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            yy3Var = yy3.ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_OFFLINE_BACKUP;
        } else if (i == 2) {
            yy3Var = yy3.ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_OFFLINE_ARTIST;
        } else if (i != 3) {
            yy3Var = i != 4 ? null : yy3.ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_CACHED_ALBUM;
        } else {
            yy3Var = yy3.ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_CACHED_PLAYLIST;
        }
        return yy3Var == null ? yy3.UNRECOGNIZED : yy3Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
