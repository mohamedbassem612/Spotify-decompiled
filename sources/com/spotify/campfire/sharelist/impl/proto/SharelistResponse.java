package com.spotify.campfire.sharelist.impl.proto;

import com.google.protobuf.h;
import com.spotify.campfire.datasource.impl.proto.CreateGroupOptions;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zv71;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SharelistResponse extends h implements v2j0 {
    public static final int CREATE_GROUP_OPTIONS_FIELD_NUMBER = 4;
    private static final SharelistResponse DEFAULT_INSTANCE;
    public static final int GROUP_SIZE_LIMIT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SHARELIST_ITEM_FIELD_NUMBER = 1;
    public static final int SUGGESTIONS_DISABLED_FIELD_NUMBER = 3;
    private int bitField0_;
    private CreateGroupOptions createGroupOptions_;
    private int groupSizeLimit_;
    private h290 sharelistItem_ = h.emptyProtobufList();
    private boolean suggestionsDisabled_;

    static {
        SharelistResponse sharelistResponse = new SharelistResponse();
        DEFAULT_INSTANCE = sharelistResponse;
        h.registerDefaultInstance(SharelistResponse.class, sharelistResponse);
    }

    private SharelistResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003\u0007\u0004ဉ\u0001", new Object[]{"bitField0_", "sharelistItem_", SharelistItem.class, "groupSizeLimit_", "suggestionsDisabled_", "createGroupOptions_"});
        }
        if (iOrdinal == 3) {
            return new SharelistResponse();
        }
        if (iOrdinal == 4) {
            return new zv71(DEFAULT_INSTANCE);
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
        synchronized (SharelistResponse.class) {
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

    public final CreateGroupOptions getCreateGroupOptions() {
        CreateGroupOptions createGroupOptions = this.createGroupOptions_;
        return createGroupOptions == null ? CreateGroupOptions.getDefaultInstance() : createGroupOptions;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean hasCreateGroupOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    public final int n() {
        return this.groupSizeLimit_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.sharelistItem_;
    }

    public final boolean p() {
        return this.suggestionsDisabled_;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
