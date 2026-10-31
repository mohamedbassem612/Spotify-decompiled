package com.spotify.libraryimportservice.tmm;

import com.google.protobuf.h;
import p.bf40;
import p.f8a;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sp40;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class GetTransferResultsBannerResponse extends h implements v2j0 {
    public static final int BANNER_TYPE_FIELD_NUMBER = 1;
    public static final int BODY_FIELD_NUMBER = 3;
    public static final int CLOSE_BUTTON_VISIBLE_FIELD_NUMBER = 7;
    private static final GetTransferResultsBannerResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 4;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TRANSFER_ID_FIELD_NUMBER = 6;
    private int bannerType_;
    private int bitField0_;
    private boolean closeButtonVisible_;
    private CTA primaryButton_;
    private CTA secondaryButton_;
    private String title_ = "";
    private h290 body_ = h.emptyProtobufList();
    private String transferId_ = "";

    static {
        GetTransferResultsBannerResponse getTransferResultsBannerResponse = new GetTransferResultsBannerResponse();
        DEFAULT_INSTANCE = getTransferResultsBannerResponse;
        h.registerDefaultInstance(GetTransferResultsBannerResponse.class, getTransferResultsBannerResponse);
    }

    private GetTransferResultsBannerResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u001b\u0004ဉ\u0000\u0005ဉ\u0001\u0006Ȉ\u0007\u0007", new Object[]{"bitField0_", "bannerType_", "title_", "body_", BannerBody.class, "primaryButton_", "secondaryButton_", "transferId_", "closeButtonVisible_"});
        }
        if (iOrdinal == 3) {
            return new GetTransferResultsBannerResponse();
        }
        if (iOrdinal == 4) {
            return new sp40(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (GetTransferResultsBannerResponse.class) {
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

    public final f8a n() {
        f8a f8aVarA = f8a.a(this.bannerType_);
        return f8aVarA == null ? f8a.N0 : f8aVarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.body_;
    }

    public final boolean p() {
        return this.closeButtonVisible_;
    }

    public final CTA q() {
        CTA cta = this.primaryButton_;
        return cta == null ? CTA.o() : cta;
    }

    public final CTA r() {
        CTA cta = this.secondaryButton_;
        return cta == null ? CTA.o() : cta;
    }

    public final String s() {
        return this.transferId_;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 2) != 0;
    }
}
