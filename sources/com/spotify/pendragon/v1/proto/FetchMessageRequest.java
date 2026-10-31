package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.pz10;
import p.qvg1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FetchMessageRequest extends h implements v2j0 {
    private static final FetchMessageRequest DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int NATIVE_COMPONENT_VERSION_FIELD_NUMBER = 7;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PURCHASE_ALLOWED_FIELD_NUMBER = 6;
    public static final int TRIGGER_PATTERNS_FIELD_NUMBER = 3;
    public static final int TRIGGER_TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 4;
    private int bitField0_;
    private int nativeComponentVersion_;
    private boolean purchaseAllowed_;
    private int triggerType_;
    private String locale_ = "";
    private h290 triggerPatterns_ = h.emptyProtobufList();
    private String uri_ = "";
    private String opportunityId_ = "";

    static {
        FetchMessageRequest fetchMessageRequest = new FetchMessageRequest();
        DEFAULT_INSTANCE = fetchMessageRequest;
        h.registerDefaultInstance(FetchMessageRequest.class, fetchMessageRequest);
    }

    private FetchMessageRequest() {
    }

    public static pz10 o() {
        return (pz10) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003Ț\u0004Ȉ\u0005Ȉ\u0006ဇ\u0000\u0007\u0004", new Object[]{"bitField0_", "locale_", "triggerType_", "triggerPatterns_", "uri_", "opportunityId_", "purchaseAllowed_", "nativeComponentVersion_"});
        }
        if (iOrdinal == 3) {
            return new FetchMessageRequest();
        }
        if (iOrdinal == 4) {
            return new pz10(DEFAULT_INSTANCE);
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
        synchronized (FetchMessageRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.triggerPatterns_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.triggerPatterns_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.locale_ = str;
    }

    public final void q() {
        this.nativeComponentVersion_ = 2;
    }

    public final void r(String str) {
        str.getClass();
        this.opportunityId_ = str;
    }

    public final void s(boolean z) {
        this.bitField0_ |= 1;
        this.purchaseAllowed_ = z;
    }

    public final void t(qvg1 qvg1Var) {
        this.triggerType_ = qvg1Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.uri_ = str;
    }
}
