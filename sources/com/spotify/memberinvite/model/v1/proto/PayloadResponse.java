package com.spotify.memberinvite.model.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class PayloadResponse extends h implements v2j0 {
    private static final PayloadResponse DEFAULT_INSTANCE;
    public static final int INVITE_LINK_FIELD_NUMBER = 2;
    public static final int INVITE_MEMBERS_ACTION_TITLE_FIELD_NUMBER = 3;
    public static final int INVITE_MEMBERS_DESCRIPTION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_CONTEXT_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ShareContext shareContext_;
    private String title_ = "";
    private String inviteLink_ = "";
    private String inviteMembersActionTitle_ = "";
    private String inviteMembersDescription_ = "";

    static {
        PayloadResponse payloadResponse = new PayloadResponse();
        DEFAULT_INSTANCE = payloadResponse;
        h.registerDefaultInstance(PayloadResponse.class, payloadResponse);
    }

    private PayloadResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000", new Object[]{"bitField0_", "title_", "inviteLink_", "inviteMembersActionTitle_", "inviteMembersDescription_", "shareContext_"});
        }
        if (iOrdinal == 3) {
            return new PayloadResponse();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (PayloadResponse.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.inviteLink_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.inviteMembersActionTitle_;
    }

    public final String p() {
        return this.inviteMembersDescription_;
    }

    public final ShareContext q() {
        ShareContext shareContext = this.shareContext_;
        return shareContext == null ? ShareContext.n() : shareContext;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
