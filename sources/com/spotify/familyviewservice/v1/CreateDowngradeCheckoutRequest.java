package com.spotify.familyviewservice.v1;

import com.google.protobuf.h;
import p.akn;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CreateDowngradeCheckoutRequest extends h implements v2j0 {
    private static final CreateDowngradeCheckoutRequest DEFAULT_INSTANCE;
    public static final int MEMBER_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REMOVE_SEAT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String memberId_ = "";
    private boolean removeSeat_;

    static {
        CreateDowngradeCheckoutRequest createDowngradeCheckoutRequest = new CreateDowngradeCheckoutRequest();
        DEFAULT_INSTANCE = createDowngradeCheckoutRequest;
        h.registerDefaultInstance(CreateDowngradeCheckoutRequest.class, createDowngradeCheckoutRequest);
    }

    private CreateDowngradeCheckoutRequest() {
    }

    public static akn o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "memberId_", "removeSeat_"});
        }
        if (iOrdinal == 3) {
            return new CreateDowngradeCheckoutRequest();
        }
        if (iOrdinal == 4) {
            return new akn();
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
        synchronized (CreateDowngradeCheckoutRequest.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(boolean z) {
        this.bitField0_ |= 2;
        this.removeSeat_ = z;
    }

    public final void setMemberId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.memberId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
