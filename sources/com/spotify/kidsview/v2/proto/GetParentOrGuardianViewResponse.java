package com.spotify.kidsview.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.io40;
import p.jf40;
import p.peg0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetParentOrGuardianViewResponse extends h implements v2j0 {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 1;
    private static final GetParentOrGuardianViewResponse DEFAULT_INSTANCE;
    public static final int PARENT_OR_GUARDIAN_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int UNLINK_ACTION_FIELD_NUMBER = 3;
    private int accountType_;
    private int bitField0_;
    private ParentOrGuardian parentOrGuardian_;
    private UnlinkAction unlinkAction_;

    static {
        GetParentOrGuardianViewResponse getParentOrGuardianViewResponse = new GetParentOrGuardianViewResponse();
        DEFAULT_INSTANCE = getParentOrGuardianViewResponse;
        h.registerDefaultInstance(GetParentOrGuardianViewResponse.class, getParentOrGuardianViewResponse);
    }

    private GetParentOrGuardianViewResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "accountType_", "parentOrGuardian_", "unlinkAction_"});
        }
        if (iOrdinal == 3) {
            return new GetParentOrGuardianViewResponse();
        }
        if (iOrdinal == 4) {
            return new io40(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (GetParentOrGuardianViewResponse.class) {
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

    public final peg0 n() {
        peg0 peg0Var;
        int i = this.accountType_;
        if (i == 0) {
            peg0Var = peg0.MANAGED_ACCOUNT_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            peg0Var = i != 2 ? null : peg0.MANAGED_ACCOUNT_TYPE_TEEN;
        } else {
            peg0Var = peg0.MANAGED_ACCOUNT_TYPE_CHILD;
        }
        return peg0Var == null ? peg0.UNRECOGNIZED : peg0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ParentOrGuardian o() {
        ParentOrGuardian parentOrGuardian = this.parentOrGuardian_;
        return parentOrGuardian == null ? ParentOrGuardian.n() : parentOrGuardian;
    }

    public final UnlinkAction p() {
        UnlinkAction unlinkAction = this.unlinkAction_;
        return unlinkAction == null ? UnlinkAction.p() : unlinkAction;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
