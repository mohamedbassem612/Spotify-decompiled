package com.spotify.campfire.sharelist.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SharelistGroup extends h implements v2j0 {
    private static final SharelistGroup DEFAULT_INSTANCE;
    public static final int GROUP_NAME_FIELD_NUMBER = 1;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String groupName_ = "";
    private h290 username_ = h.emptyProtobufList();
    private String hierarchyId_ = "";

    static {
        SharelistGroup sharelistGroup = new SharelistGroup();
        DEFAULT_INSTANCE = sharelistGroup;
        h.registerDefaultInstance(SharelistGroup.class, sharelistGroup);
    }

    private SharelistGroup() {
    }

    public static SharelistGroup n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ለ\u0000\u0003Ț\u0004ለ\u0001", new Object[]{"bitField0_", "groupName_", "username_", "hierarchyId_"});
        }
        if (iOrdinal == 3) {
            return new SharelistGroup();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (SharelistGroup.class) {
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

    public final String getHierarchyId() {
        return this.hierarchyId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.groupName_;
    }

    public final h290 p() {
        return this.username_;
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
