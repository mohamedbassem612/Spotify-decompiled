package com.spotify.campfire.trustedcircles.impl.proto;

import com.google.protobuf.h;
import java.util.List;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.dgb;
import p.jf40;
import p.ne90;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sug1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class TrustedUser extends h implements v2j0 {
    private static final TrustedUser DEFAULT_INSTANCE;
    public static final int EXTENDED_FIELD_NUMBER = 5;
    public static final int INVITE_STATUS_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int REASONS_FIELD_NUMBER = 4;
    public static final int TRUST_SCORE_FIELD_NUMBER = 3;
    public static final int USERNAME_FIELD_NUMBER = 2;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private static final c290 reasons_converter_ = new dgb((byte) 28);
    private boolean extended_;
    private int inviteStatus_;
    private int reasonsMemoizedSerializedSize;
    private int trustScore_;
    private Object user_;
    private int userCase_ = 0;
    private b290 reasons_ = h.emptyIntList();

    static {
        TrustedUser trustedUser = new TrustedUser();
        DEFAULT_INSTANCE = trustedUser;
        h.registerDefaultInstance(TrustedUser.class, trustedUser);
    }

    private TrustedUser() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003\u0004\u0004,\u0005\u0007\u0006\f", new Object[]{"user_", "userCase_", "trustScore_", "reasons_", "extended_", "inviteStatus_"});
        }
        if (iOrdinal == 3) {
            return new TrustedUser();
        }
        if (iOrdinal == 4) {
            return new sug1(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (TrustedUser.class) {
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

    public final String getUsername() {
        return this.userCase_ == 2 ? (String) this.user_ : "";
    }

    public final ne90 n() {
        ne90 ne90Var;
        int i = this.inviteStatus_;
        if (i == 0) {
            ne90Var = ne90.INVITE_STATUS_UNSPECIFIED;
        } else if (i == 1) {
            ne90Var = ne90.INVITE_STATUS_NONE;
        } else if (i != 2) {
            ne90Var = i != 3 ? null : ne90.INVITE_STATUS_RECEIVED;
        } else {
            ne90Var = ne90.INVITE_STATUS_SENT;
        }
        return ne90Var == null ? ne90.UNRECOGNIZED : ne90Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final List o() {
        return new d290(this.reasons_, reasons_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
