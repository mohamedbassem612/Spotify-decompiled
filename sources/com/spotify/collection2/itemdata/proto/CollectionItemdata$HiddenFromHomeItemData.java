package com.spotify.collection2.itemdata.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CollectionItemdata$HiddenFromHomeItemData extends h implements v2j0 {
    private static final CollectionItemdata$HiddenFromHomeItemData DEFAULT_INSTANCE;
    public static final int HIDDEN_FROM_SECTION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 hiddenFromSection_ = h.emptyProtobufList();

    public static final class HiddenFromSection extends h implements v2j0 {
        private static final HiddenFromSection DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SECTION_NAME_FIELD_NUMBER = 1;
        public static final int UPDATED_AT_FIELD_NUMBER = 2;
        private int bitField0_;
        private String sectionName_ = "";
        private Timestamp updatedAt_;

        static {
            HiddenFromSection hiddenFromSection = new HiddenFromSection();
            DEFAULT_INSTANCE = hiddenFromSection;
            h.registerDefaultInstance(HiddenFromSection.class, hiddenFromSection);
        }

        private HiddenFromSection() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "sectionName_", "updatedAt_"});
            }
            if (iOrdinal == 3) {
                return new HiddenFromSection();
            }
            if (iOrdinal == 4) {
                return new b(DEFAULT_INSTANCE);
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
            synchronized (HiddenFromSection.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        CollectionItemdata$HiddenFromHomeItemData collectionItemdata$HiddenFromHomeItemData = new CollectionItemdata$HiddenFromHomeItemData();
        DEFAULT_INSTANCE = collectionItemdata$HiddenFromHomeItemData;
        h.registerDefaultInstance(CollectionItemdata$HiddenFromHomeItemData.class, collectionItemdata$HiddenFromHomeItemData);
    }

    private CollectionItemdata$HiddenFromHomeItemData() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"hiddenFromSection_", HiddenFromSection.class});
        }
        if (iOrdinal == 3) {
            return new CollectionItemdata$HiddenFromHomeItemData();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (CollectionItemdata$HiddenFromHomeItemData.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
