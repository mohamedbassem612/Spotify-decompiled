package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nla1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SourceReference extends h implements v2j0 {
    public static final int CAMPAIGN_URI_FIELD_NUMBER = 1;
    public static final int CONCERT_URI_FIELD_NUMBER = 2;
    private static final SourceReference DEFAULT_INSTANCE;
    public static final int OFFER_ID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PROVIDER_NAME_FIELD_NUMBER = 4;
    private int bitField0_;
    private String campaignUri_ = "";
    private String concertUri_ = "";
    private String offerId_ = "";
    private String providerName_ = "";

    static {
        SourceReference sourceReference = new SourceReference();
        DEFAULT_INSTANCE = sourceReference;
        h.registerDefaultInstance(SourceReference.class, sourceReference);
    }

    private SourceReference() {
    }

    public static SourceReference p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static nla1 v() {
        return (nla1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "campaignUri_", "concertUri_", "offerId_", "providerName_"});
        }
        if (iOrdinal == 3) {
            return new SourceReference();
        }
        if (iOrdinal == 4) {
            return new nla1(DEFAULT_INSTANCE);
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
        synchronized (SourceReference.class) {
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
        return this.campaignUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.concertUri_;
    }

    public final String q() {
        return this.offerId_;
    }

    public final String r() {
        return this.providerName_;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.campaignUri_ = str;
    }
}
