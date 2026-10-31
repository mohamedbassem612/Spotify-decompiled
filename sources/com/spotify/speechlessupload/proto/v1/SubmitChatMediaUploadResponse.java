package com.spotify.speechlessupload.proto.v1;

import com.google.protobuf.h;
import com.spotify.campfire.datasource.impl.proto.HierarchyIdentifier;
import com.spotify.campfire.datasource.impl.proto.NodeIdentifier;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zlc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SubmitChatMediaUploadResponse extends h implements v2j0 {
    private static final SubmitChatMediaUploadResponse DEFAULT_INSTANCE;
    public static final int HIERARCHY_IDENTIFIER_FIELD_NUMBER = 3;
    public static final int NODE_IDENTIFIER_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int UPLOAD_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private HierarchyIdentifier hierarchyIdentifier_;
    private NodeIdentifier nodeIdentifier_;
    private h290 uploadIds_ = h.emptyProtobufList();

    static {
        SubmitChatMediaUploadResponse submitChatMediaUploadResponse = new SubmitChatMediaUploadResponse();
        DEFAULT_INSTANCE = submitChatMediaUploadResponse;
        h.registerDefaultInstance(SubmitChatMediaUploadResponse.class, submitChatMediaUploadResponse);
    }

    private SubmitChatMediaUploadResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002Ț\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "uploadIds_", "hierarchyIdentifier_", "nodeIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new SubmitChatMediaUploadResponse();
        }
        if (iOrdinal == 4) {
            return new zlc1(DEFAULT_INSTANCE);
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
        synchronized (SubmitChatMediaUploadResponse.class) {
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

    public final NodeIdentifier getNodeIdentifier() {
        NodeIdentifier nodeIdentifier = this.nodeIdentifier_;
        return nodeIdentifier == null ? NodeIdentifier.getDefaultInstance() : nodeIdentifier;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
