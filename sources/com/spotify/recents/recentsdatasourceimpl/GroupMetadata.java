package com.spotify.recents.recentsdatasourceimpl;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.h290;
import p.ir40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.rn50;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class GroupMetadata extends h implements v2j0 {
    private static final GroupMetadata DEFAULT_INSTANCE;
    public static final int ENTITY_URIS_FIELD_NUMBER = 2;
    public static final int FILTERED_COUNT_FIELD_NUMBER = 4;
    public static final int GROUP_NAME_FIELD_NUMBER = 5;
    public static final int ITEMS_COUNT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int USER_URIS_FIELD_NUMBER = 3;
    private int itemsCount_;
    private qng0 filteredCount_ = qng0.b;
    private h290 entityUris_ = h.emptyProtobufList();
    private h290 userUris_ = h.emptyProtobufList();
    private String groupName_ = "";

    static {
        GroupMetadata groupMetadata = new GroupMetadata();
        DEFAULT_INSTANCE = groupMetadata;
        h.registerDefaultInstance(GroupMetadata.class, groupMetadata);
    }

    private GroupMetadata() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static GroupMetadata s(byte[] bArr) {
        return (GroupMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0002\u0000\u0001\u0004\u0002Ț\u0003Ț\u00042\u0005Ȉ", new Object[]{"itemsCount_", "entityUris_", "userUris_", "filteredCount_", rn50.a, "groupName_"});
        }
        if (iOrdinal == 3) {
            return new GroupMetadata();
        }
        if (iOrdinal == 4) {
            return new ir40((byte) 29);
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
        synchronized (GroupMetadata.class) {
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

    public final int getItemsCount() {
        return this.itemsCount_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.entityUris_;
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.filteredCount_);
    }

    public final String q() {
        return this.groupName_;
    }

    public final h290 r() {
        return this.userUris_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
