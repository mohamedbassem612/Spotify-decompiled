package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.tgv0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class PostEventV2Request extends h implements v2j0 {
    public static final int CONTENT_URI_FIELD_NUMBER = 2;
    private static final PostEventV2Request DEFAULT_INSTANCE;
    public static final int DEMAND_STATUS_FIELD_NUMBER = 3;
    public static final int ELIGIBILITY_STATUS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 7;
    public static final int SLOT_ID_FIELD_NUMBER = 1;
    public static final int TRIGGER_ORIGIN_FIELD_NUMBER = 5;
    public static final int TRIGGER_STATES_FIELD_NUMBER = 6;
    private int bitField0_;
    private String slotId_ = "";
    private String contentUri_ = "";
    private String demandStatus_ = "";
    private String eligibilityStatus_ = "";
    private String triggerOrigin_ = "";
    private h290 triggerStates_ = h.emptyProtobufList();
    private String requestId_ = "";

    static {
        PostEventV2Request postEventV2Request = new PostEventV2Request();
        DEFAULT_INSTANCE = postEventV2Request;
        h.registerDefaultInstance(PostEventV2Request.class, postEventV2Request);
    }

    private PostEventV2Request() {
    }

    public static tgv0 o() {
        return (tgv0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ț\u0007ለ\u0000", new Object[]{"bitField0_", "slotId_", "contentUri_", "demandStatus_", "eligibilityStatus_", "triggerOrigin_", "triggerStates_", "requestId_"});
        }
        if (iOrdinal == 3) {
            return new PostEventV2Request();
        }
        if (iOrdinal == 4) {
            return new tgv0(DEFAULT_INSTANCE);
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
        synchronized (PostEventV2Request.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.triggerStates_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.triggerStates_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.contentUri_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.demandStatus_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.eligibilityStatus_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.requestId_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.slotId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.triggerOrigin_ = str;
    }
}
