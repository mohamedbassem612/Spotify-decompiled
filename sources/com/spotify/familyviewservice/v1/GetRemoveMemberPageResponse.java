package com.spotify.familyviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.io40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetRemoveMemberPageResponse extends h implements v2j0 {
    public static final int ACTIONS_FIELD_NUMBER = 4;
    public static final int BENEFITS_FIELD_NUMBER = 3;
    private static final GetRemoveMemberPageResponse DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int EXPIRATION_DESCRIPTION_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private RemoveMemberBenefits benefits_;
    private int bitField0_;
    private String title_ = "";
    private String description_ = "";
    private h290 actions_ = h.emptyProtobufList();
    private String expirationDescription_ = "";

    static {
        GetRemoveMemberPageResponse getRemoveMemberPageResponse = new GetRemoveMemberPageResponse();
        DEFAULT_INSTANCE = getRemoveMemberPageResponse;
        h.registerDefaultInstance(GetRemoveMemberPageResponse.class, getRemoveMemberPageResponse);
    }

    private GetRemoveMemberPageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u001b\u0005ለ\u0001", new Object[]{"bitField0_", "title_", "description_", "benefits_", "actions_", RemoveMemberAction.class, "expirationDescription_"});
        }
        if (iOrdinal == 3) {
            return new GetRemoveMemberPageResponse();
        }
        if (iOrdinal == 4) {
            return new io40(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (GetRemoveMemberPageResponse.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final h290 n() {
        return this.actions_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final RemoveMemberBenefits o() {
        RemoveMemberBenefits removeMemberBenefits = this.benefits_;
        return removeMemberBenefits == null ? RemoveMemberBenefits.o() : removeMemberBenefits;
    }

    public final String p() {
        return this.expirationDescription_;
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
