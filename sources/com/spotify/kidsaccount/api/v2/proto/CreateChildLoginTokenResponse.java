package com.spotify.kidsaccount.api.v2.proto;

import com.google.protobuf.Int32Value;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jjn;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class CreateChildLoginTokenResponse extends h implements v2j0 {
    public static final int CHILD_COLOR_FIELD_NUMBER = 4;
    public static final int CHILD_NAME_FIELD_NUMBER = 3;
    public static final int CHILD_USERNAME_FIELD_NUMBER = 2;
    private static final CreateChildLoginTokenResponse DEFAULT_INSTANCE;
    public static final int IS_FREE_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private Int32Value childColor_;
    private boolean isFree_;
    private String token_ = "";
    private String childUsername_ = "";
    private String childName_ = "";

    static {
        CreateChildLoginTokenResponse createChildLoginTokenResponse = new CreateChildLoginTokenResponse();
        DEFAULT_INSTANCE = createChildLoginTokenResponse;
        h.registerDefaultInstance(CreateChildLoginTokenResponse.class, createChildLoginTokenResponse);
    }

    private CreateChildLoginTokenResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005\u0007", new Object[]{"bitField0_", "token_", "childUsername_", "childName_", "childColor_", "isFree_"});
        }
        if (iOrdinal == 3) {
            return new CreateChildLoginTokenResponse();
        }
        if (iOrdinal == 4) {
            return new jjn(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (CreateChildLoginTokenResponse.class) {
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

    public final boolean getIsFree() {
        return this.isFree_;
    }

    public final Int32Value n() {
        Int32Value int32Value = this.childColor_;
        return int32Value == null ? Int32Value.o() : int32Value;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.childName_;
    }

    public final String p() {
        return this.childUsername_;
    }

    public final String q() {
        return this.token_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
