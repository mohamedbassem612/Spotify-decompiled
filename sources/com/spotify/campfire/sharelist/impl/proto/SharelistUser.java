package com.spotify.campfire.sharelist.impl.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.gii1;
import p.jf40;
import p.qf51;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vhc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SharelistUser extends h implements v2j0 {
    public static final int AGENT_URI_FIELD_NUMBER = 8;
    private static final SharelistUser DEFAULT_INSTANCE;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 5;
    public static final int HIERARCHY_REFERENCE_FIELD_NUMBER = 7;
    public static final int IS_ENABLED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    public static final int SECTION_FIELD_NUMBER = 6;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_STATUS_FIELD_NUMBER = 4;
    private static final c290 reason_converter_ = new vhc((byte) 24);
    private int bitField0_;
    private HierarchyReference hierarchyReference_;
    private boolean isEnabled_;
    private int reasonMemoizedSerializedSize;
    private int section_;
    private int userStatus_;
    private String username_ = "";
    private b290 reason_ = h.emptyIntList();
    private String hierarchyId_ = "";
    private String agentUri_ = "";

    public static final class HierarchyReference extends h implements v2j0 {
        private static final HierarchyReference DEFAULT_INSTANCE;
        public static final int HIERARCHY_EXISTS_FIELD_NUMBER = 2;
        public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
        public static final int IS_ACTIVE_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER;
        private boolean hierarchyExists_;
        private String hierarchyId_ = "";
        private boolean isActive_;

        static {
            HierarchyReference hierarchyReference = new HierarchyReference();
            DEFAULT_INSTANCE = hierarchyReference;
            h.registerDefaultInstance(HierarchyReference.class, hierarchyReference);
        }

        private HierarchyReference() {
        }

        public static HierarchyReference n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"hierarchyId_", "hierarchyExists_", "isActive_"});
            }
            if (iOrdinal == 3) {
                return new HierarchyReference();
            }
            if (iOrdinal == 4) {
                return new d(DEFAULT_INSTANCE);
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
            synchronized (HierarchyReference.class) {
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

        public final boolean o() {
            return this.hierarchyExists_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SharelistUser sharelistUser = new SharelistUser();
        DEFAULT_INSTANCE = sharelistUser;
        h.registerDefaultInstance(SharelistUser.class, sharelistUser);
    }

    private SharelistUser() {
    }

    public static SharelistUser n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003,\u0004\f\u0005ለ\u0000\u0006\f\u0007ဉ\u0001\bለ\u0002", new Object[]{"bitField0_", "username_", "isEnabled_", "reason_", "userStatus_", "hierarchyId_", "section_", "hierarchyReference_", "agentUri_"});
        }
        if (iOrdinal == 3) {
            return new SharelistUser();
        }
        if (iOrdinal == 4) {
            return new c(DEFAULT_INSTANCE);
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
        synchronized (SharelistUser.class) {
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

    public final String getAgentUri() {
        return this.agentUri_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getUsername() {
        return this.username_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final HierarchyReference o() {
        HierarchyReference hierarchyReference = this.hierarchyReference_;
        return hierarchyReference == null ? HierarchyReference.n() : hierarchyReference;
    }

    public final boolean p() {
        return this.isEnabled_;
    }

    public final int q() {
        return this.reason_.size();
    }

    public final d290 r() {
        return new d290(this.reason_, reason_converter_);
    }

    public final qf51 s() {
        qf51 qf51Var;
        int i = this.section_;
        if (i == 0) {
            qf51Var = qf51.SECTION_UNSPECIFIED;
        } else if (i != 1) {
            qf51Var = i != 2 ? null : qf51.SECTION_SUGGESTED;
        } else {
            qf51Var = qf51.SECTION_ACTIVE;
        }
        return qf51Var == null ? qf51.UNRECOGNIZED : qf51Var;
    }

    public final gii1 t() {
        gii1 gii1Var;
        int i = this.userStatus_;
        if (i == 0) {
            gii1Var = gii1.USER_STATUS_UNSPECIFIED;
        } else if (i == 1) {
            gii1Var = gii1.USER_STATUS_ACTIVE;
        } else if (i == 2) {
            gii1Var = gii1.USER_STATUS_SUGGESTED_BUT_DISABLED;
        } else if (i != 3) {
            gii1Var = i != 4 ? null : gii1.USER_STATUS_NOT_ACCEPTED;
        } else {
            gii1Var = gii1.USER_STATUS_SUGGESTED;
        }
        return gii1Var == null ? gii1.UNRECOGNIZED : gii1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }
}
