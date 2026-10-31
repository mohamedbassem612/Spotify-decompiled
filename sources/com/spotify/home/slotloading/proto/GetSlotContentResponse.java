package com.spotify.home.slotloading.proto;

import com.google.protobuf.h;
import com.spotify.casita.v1.resolved.EagerlyLoadedTraits;
import com.spotify.casita.v1.resolved.ResponseInfo;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sp40;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class GetSlotContentResponse extends h implements v2j0 {
    private static final GetSlotContentResponse DEFAULT_INSTANCE;
    public static final int EAGERLY_LOADED_TRAITS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int RESPONSE_ID_FIELD_NUMBER = 3;
    public static final int RESPONSE_INFO_FIELD_NUMBER = 5;
    public static final int SECTIONS_FIELD_NUMBER = 1;
    public static final int SLOT_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private EagerlyLoadedTraits eagerlyLoadedTraits_;
    private ResponseInfo responseInfo_;
    private int slotType_;
    private h290 sections_ = h.emptyProtobufList();
    private String responseId_ = "";

    static {
        GetSlotContentResponse getSlotContentResponse = new GetSlotContentResponse();
        DEFAULT_INSTANCE = getSlotContentResponse;
        h.registerDefaultInstance(GetSlotContentResponse.class, getSlotContentResponse);
    }

    private GetSlotContentResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001c\u0002\f\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "sections_", "slotType_", "responseId_", "eagerlyLoadedTraits_", "responseInfo_"});
        }
        if (iOrdinal == 3) {
            return new GetSlotContentResponse();
        }
        if (iOrdinal == 4) {
            return new sp40(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (GetSlotContentResponse.class) {
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

    public final EagerlyLoadedTraits n() {
        EagerlyLoadedTraits eagerlyLoadedTraits = this.eagerlyLoadedTraits_;
        return eagerlyLoadedTraits == null ? EagerlyLoadedTraits.o() : eagerlyLoadedTraits;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ResponseInfo o() {
        ResponseInfo responseInfo = this.responseInfo_;
        return responseInfo == null ? ResponseInfo.o() : responseInfo;
    }

    public final h290 p() {
        return this.sections_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
