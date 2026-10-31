package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zg7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AstroMember extends h implements v2j0 {
    public static final int ADD_MEMBER_FIELD_NUMBER = 5;
    public static final int CHANGE_DENOMINATION_FIELD_NUMBER = 6;
    private static final AstroMember DEFAULT_INSTANCE;
    public static final int DESCRIPTION_COLOR_FIELD_NUMBER = 8;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int IMAGE_URI_FIELD_NUMBER = 4;
    public static final int IS_CHILD_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REMOVE_MEMBER_FIELD_NUMBER = 3;
    private Action addMember_;
    private int bitField0_;
    private Action changeDenomination_;
    private boolean isChild_;
    private Action removeMember_;
    private String name_ = "";
    private String description_ = "";
    private String imageUri_ = "";
    private String descriptionColor_ = "";

    static {
        AstroMember astroMember = new AstroMember();
        DEFAULT_INSTANCE = astroMember;
        h.registerDefaultInstance(AstroMember.class, astroMember);
    }

    private AstroMember() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001\u0006ဉ\u0002\u0007\u0007\bለ\u0003", new Object[]{"bitField0_", "name_", "description_", "removeMember_", "imageUri_", "addMember_", "changeDenomination_", "isChild_", "descriptionColor_"});
        }
        if (iOrdinal == 3) {
            return new AstroMember();
        }
        if (iOrdinal == 4) {
            return new zg7(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (AstroMember.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final Action n() {
        Action action = this.addMember_;
        return action == null ? Action.o() : action;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Action o() {
        Action action = this.changeDenomination_;
        return action == null ? Action.o() : action;
    }

    public final String p() {
        return this.descriptionColor_;
    }

    public final String q() {
        return this.imageUri_;
    }

    public final boolean r() {
        return this.isChild_;
    }

    public final Action s() {
        Action action = this.removeMember_;
        return action == null ? Action.o() : action;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
