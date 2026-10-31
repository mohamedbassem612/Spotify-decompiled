package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yj61;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SetCardConfigRequest extends h implements v2j0 {
    public static final int CARD_DATA_FIELD_NUMBER = 3;
    private static final SetCardConfigRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_FORMAT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private SetCardData cardData_;
    private String shareFormatId_ = "";
    private String entityUri_ = "";

    static {
        SetCardConfigRequest setCardConfigRequest = new SetCardConfigRequest();
        DEFAULT_INSTANCE = setCardConfigRequest;
        h.registerDefaultInstance(SetCardConfigRequest.class, setCardConfigRequest);
    }

    private SetCardConfigRequest() {
    }

    public static yj61 n() {
        return (yj61) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "shareFormatId_", "entityUri_", "cardData_"});
        }
        if (iOrdinal == 3) {
            return new SetCardConfigRequest();
        }
        if (iOrdinal == 4) {
            return new yj61(DEFAULT_INSTANCE);
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
        synchronized (SetCardConfigRequest.class) {
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

    public final void o(SetCardData setCardData) {
        setCardData.getClass();
        this.cardData_ = setCardData;
        this.bitField0_ |= 1;
    }

    public final void p(String str) {
        this.entityUri_ = str;
    }

    public final void q(String str) {
        this.shareFormatId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
