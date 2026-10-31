package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zg7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AstroMemberCard extends h implements v2j0 {
    public static final int ADD_MEMBER_FIELD_NUMBER = 3;
    public static final int ASTRO_MEMBERS_FIELD_NUMBER = 2;
    private static final AstroMemberCard DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Action addMember_;
    private int bitField0_;
    private String title_ = "";
    private h290 astroMembers_ = h.emptyProtobufList();

    static {
        AstroMemberCard astroMemberCard = new AstroMemberCard();
        DEFAULT_INSTANCE = astroMemberCard;
        h.registerDefaultInstance(AstroMemberCard.class, astroMemberCard);
    }

    private AstroMemberCard() {
    }

    public static AstroMemberCard p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000", new Object[]{"bitField0_", "title_", "astroMembers_", AstroMember.class, "addMember_"});
        }
        if (iOrdinal == 3) {
            return new AstroMemberCard();
        }
        if (iOrdinal == 4) {
            return new zg7(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (AstroMemberCard.class) {
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

    public final Action n() {
        Action action = this.addMember_;
        return action == null ? Action.o() : action;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.astroMembers_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
