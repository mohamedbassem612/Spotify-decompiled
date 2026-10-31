package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.em40;
import p.gct0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetInviteMembersViewResponse extends h implements v2j0 {
    public static final int ADD_KID_ACTION_SUBTITLE_FIELD_NUMBER = 11;
    public static final int ADD_KID_ACTION_TITLE_FIELD_NUMBER = 10;
    public static final int CAN_ADD_KIDS_FIELD_NUMBER = 9;
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final GetInviteMembersViewResponse DEFAULT_INSTANCE;
    public static final int HEADER_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int HEADER_TITLE_FIELD_NUMBER = 4;
    public static final int INVITE_LINK_FIELD_NUMBER = 5;
    public static final int INVITE_MEMBERS_ACTION_SUBTITLE_FIELD_NUMBER = 7;
    public static final int INVITE_MEMBERS_ACTION_TITLE_FIELD_NUMBER = 6;
    public static final int PAGE_TITLE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_TYPE_FIELD_NUMBER = 12;
    public static final int SHARE_CONTEXT_FIELD_NUMBER = 8;
    private int bitField0_;
    private boolean canAddKids_;
    private int planType_;
    private ShareContext shareContext_;
    private String color_ = "";
    private String pageTitle_ = "";
    private String headerImageUrl_ = "";
    private String headerTitle_ = "";
    private String inviteLink_ = "";
    private String inviteMembersActionTitle_ = "";
    private String inviteMembersActionSubtitle_ = "";
    private String addKidActionTitle_ = "";
    private String addKidActionSubtitle_ = "";

    static {
        GetInviteMembersViewResponse getInviteMembersViewResponse = new GetInviteMembersViewResponse();
        DEFAULT_INSTANCE = getInviteMembersViewResponse;
        h.registerDefaultInstance(GetInviteMembersViewResponse.class, getInviteMembersViewResponse);
    }

    private GetInviteMembersViewResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0000\t\u0007\nȈ\u000bȈ\f\f", new Object[]{"bitField0_", "color_", "pageTitle_", "headerImageUrl_", "headerTitle_", "inviteLink_", "inviteMembersActionTitle_", "inviteMembersActionSubtitle_", "shareContext_", "canAddKids_", "addKidActionTitle_", "addKidActionSubtitle_", "planType_"});
        }
        if (iOrdinal == 3) {
            return new GetInviteMembersViewResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (GetInviteMembersViewResponse.class) {
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

    public final String n() {
        return this.addKidActionSubtitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.addKidActionTitle_;
    }

    public final boolean p() {
        return this.canAddKids_;
    }

    public final String q() {
        return this.color_;
    }

    public final String r() {
        return this.headerImageUrl_;
    }

    public final String s() {
        return this.headerTitle_;
    }

    public final String t() {
        return this.inviteLink_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.inviteMembersActionSubtitle_;
    }

    public final String v() {
        return this.inviteMembersActionTitle_;
    }

    public final gct0 w() {
        gct0 gct0VarA = gct0.a(this.planType_);
        return gct0VarA == null ? gct0.i : gct0VarA;
    }

    public final ShareContext x() {
        ShareContext shareContext = this.shareContext_;
        return shareContext == null ? ShareContext.n() : shareContext;
    }
}
