package com.spotify.your_library_esperanto.proto;

import com.google.protobuf.h;
import p.a53;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class AlsoAvailableOfflineData extends h implements v2j0 {
    private static final AlsoAvailableOfflineData DEFAULT_INSTANCE;
    public static final int FILTER_AUGMENTATION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SUGGESTIONS_FIELD_NUMBER = 1;
    private int bitField0_;
    private YourLibraryConfig.YourLibraryFilters filterAugmentation_;
    private h290 suggestions_ = h.emptyProtobufList();

    static {
        AlsoAvailableOfflineData alsoAvailableOfflineData = new AlsoAvailableOfflineData();
        DEFAULT_INSTANCE = alsoAvailableOfflineData;
        h.registerDefaultInstance(AlsoAvailableOfflineData.class, alsoAvailableOfflineData);
    }

    private AlsoAvailableOfflineData() {
    }

    public static AlsoAvailableOfflineData n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "suggestions_", AlsoAvailableOfflineSuggestion.class, "filterAugmentation_"});
        }
        if (iOrdinal == 3) {
            return new AlsoAvailableOfflineData();
        }
        if (iOrdinal == 4) {
            return new a53(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (AlsoAvailableOfflineData.class) {
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

    public final h290 o() {
        return this.suggestions_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
