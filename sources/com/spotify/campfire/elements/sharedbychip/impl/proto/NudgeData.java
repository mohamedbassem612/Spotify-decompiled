package com.spotify.campfire.elements.sharedbychip.impl.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.fin0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class NudgeData extends h implements v2j0 {
    private static final NudgeData DEFAULT_INSTANCE;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 4;
    public static final int NODE_PATH_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SHARED_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int SHARE_INITIATOR_USERNAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp sharedTimestamp_;
    private String shareInitiatorUsername_ = "";
    private String nodePathId_ = "";
    private String hierarchyId_ = "";

    static {
        NudgeData nudgeData = new NudgeData();
        DEFAULT_INSTANCE = nudgeData;
        h.registerDefaultInstance(NudgeData.class, nudgeData);
    }

    private NudgeData() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ", new Object[]{"bitField0_", "shareInitiatorUsername_", "nodePathId_", "sharedTimestamp_", "hierarchyId_"});
        }
        if (iOrdinal == 3) {
            return new NudgeData();
        }
        if (iOrdinal == 4) {
            return new fin0(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (NudgeData.class) {
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

    public final String getNodePathId() {
        return this.nodePathId_;
    }

    public final String n() {
        return this.shareInitiatorUsername_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Timestamp o() {
        Timestamp timestamp = this.sharedTimestamp_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
