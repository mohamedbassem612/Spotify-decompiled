package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hm40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class GetConversationStartersRequest extends h implements v2j0 {
    private static final GetConversationStartersRequest DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_FIELD_NUMBER = 5;
    public static final int EXPERIENCE_NAME_FIELD_NUMBER = 2;
    public static final int GROUP_CONVERSATION_STARTERS_FIELD_NUMBER = 4;
    public static final int INPUT_TYPE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PERSONA_FIELD_NUMBER = 7;
    public static final int USER_CONTEXT_FIELD_NUMBER = 1;
    public static final int VARIANT_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean groupConversationStarters_;
    private UserContext userContext_;
    private String experienceName_ = "";
    private String variant_ = "";
    private String entrypoint_ = "";
    private String inputType_ = "";
    private String persona_ = "";

    static {
        GetConversationStartersRequest getConversationStartersRequest = new GetConversationStartersRequest();
        DEFAULT_INSTANCE = getConversationStartersRequest;
        h.registerDefaultInstance(GetConversationStartersRequest.class, getConversationStartersRequest);
    }

    private GetConversationStartersRequest() {
    }

    public static hm40 o() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ለ\u0001\u0004\u0007\u0005ለ\u0002\u0006ለ\u0003\u0007ለ\u0004", new Object[]{"bitField0_", "userContext_", "experienceName_", "variant_", "groupConversationStarters_", "entrypoint_", "inputType_", "persona_"});
        }
        if (iOrdinal == 3) {
            return new GetConversationStartersRequest();
        }
        if (iOrdinal == 4) {
            return new hm40();
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
        synchronized (GetConversationStartersRequest.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.bitField0_ |= 4;
        this.entrypoint_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.experienceName_ = str;
    }

    public final void r(boolean z) {
        this.groupConversationStarters_ = z;
    }

    public final void s(String str) {
        this.bitField0_ |= 8;
        this.inputType_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 16;
        this.persona_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(UserContext userContext) {
        this.userContext_ = userContext;
        this.bitField0_ |= 1;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.variant_ = str;
    }
}
