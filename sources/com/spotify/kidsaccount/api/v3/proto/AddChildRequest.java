package com.spotify.kidsaccount.api.v3.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dd1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class AddChildRequest extends h implements v2j0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 1;
    private static final AddChildRequest DEFAULT_INSTANCE;
    public static final int PARENTAL_CONSENT_SESSION_ID_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PIN_FIELD_NUMBER = 3;
    public static final int PROFILE_FIELD_NUMBER = 2;
    private ChildAttributes attributes_;
    private int bitField0_;
    private ChildProfile profile_;
    private String pin_ = "";
    private String parentalConsentSessionId_ = "";

    static {
        AddChildRequest addChildRequest = new AddChildRequest();
        DEFAULT_INSTANCE = addChildRequest;
        h.registerDefaultInstance(AddChildRequest.class, addChildRequest);
    }

    private AddChildRequest() {
    }

    public static dd1 n() {
        return (dd1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "attributes_", "profile_", "pin_", "parentalConsentSessionId_"});
        }
        if (iOrdinal == 3) {
            return new AddChildRequest();
        }
        if (iOrdinal == 4) {
            return new dd1(DEFAULT_INSTANCE);
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
        synchronized (AddChildRequest.class) {
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

    public final void o(ChildAttributes childAttributes) {
        childAttributes.getClass();
        this.attributes_ = childAttributes;
        this.bitField0_ |= 1;
    }

    public final void p(String str) {
        this.bitField0_ |= 4;
        this.pin_ = str;
    }

    public final void q(ChildProfile childProfile) {
        childProfile.getClass();
        this.profile_ = childProfile;
        this.bitField0_ |= 2;
    }

    public final void setParentalConsentSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.parentalConsentSessionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
