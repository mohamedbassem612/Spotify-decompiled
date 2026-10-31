package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.eog0;
import p.hqi0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Member extends h implements v2j0 {
    public static final int CHILD_DETAILS_URI_FIELD_NUMBER = 12;
    public static final int CHILD_ID_FIELD_NUMBER = 7;
    public static final int COLOR_SET_FIELD_NUMBER = 9;
    private static final Member DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPIRATION_DESCRIPTION_FIELD_NUMBER = 11;
    public static final int IMAGE_URI_FIELD_NUMBER = 4;
    public static final int IS_CURRENT_MEMBER_FIELD_NUMBER = 1;
    public static final int MEMBER_DETAILS_URI_FIELD_NUMBER = 8;
    public static final int MEMBER_TYPE_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REGULAR_MEMBER_DETAILS_URI_FIELD_NUMBER = 13;
    public static final int REMOVE_MEMBER_URI_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean isCurrentMember_;
    private int memberType_;
    private String name_ = "";
    private String description_ = "";
    private String imageUri_ = "";
    private String removeMemberUri_ = "";
    private String childId_ = "";
    private String memberDetailsUri_ = "";
    private String colorSet_ = "";
    private String expirationDescription_ = "";
    private String childDetailsUri_ = "";
    private String regularMemberDetailsUri_ = "";

    static {
        Member member = new Member();
        DEFAULT_INSTANCE = member;
        h.registerDefaultInstance(Member.class, member);
    }

    private Member() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f\u0006Ȉ\u0007Ȉ\bȈ\tȈ\u000bለ\u0000\fለ\u0001\rለ\u0002", new Object[]{"bitField0_", "isCurrentMember_", "name_", "description_", "imageUri_", "memberType_", "removeMemberUri_", "childId_", "memberDetailsUri_", "colorSet_", "expirationDescription_", "childDetailsUri_", "regularMemberDetailsUri_"});
        }
        if (iOrdinal == 3) {
            return new Member();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (Member.class) {
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

    public final String getChildId() {
        return this.childId_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDescription() {
        return this.description_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String n() {
        return this.childDetailsUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.expirationDescription_;
    }

    public final String p() {
        return this.imageUri_;
    }

    public final boolean q() {
        return this.isCurrentMember_;
    }

    public final String r() {
        return this.memberDetailsUri_;
    }

    public final hqi0 s() {
        hqi0 hqi0Var;
        int i = this.memberType_;
        if (i == 0) {
            hqi0Var = hqi0.MEMBER;
        } else if (i == 1) {
            hqi0Var = hqi0.MANAGER;
        } else if (i != 2) {
            hqi0Var = i != 3 ? null : hqi0.KID_V2;
        } else {
            hqi0Var = hqi0.KID;
        }
        return hqi0Var == null ? hqi0.UNRECOGNIZED : hqi0Var;
    }

    public final String t() {
        return this.regularMemberDetailsUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.removeMemberUri_;
    }
}
