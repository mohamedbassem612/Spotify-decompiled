package com.spotify.connect.smartcontrol.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u6l;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ConnectSmartControlLifecycleEvent extends h implements v2j0 {
    private static final ConnectSmartControlLifecycleEvent DEFAULT_INSTANCE;
    public static final int INSTRUMENTATION_ID_FIELD_NUMBER = 5;
    public static final int INSTRUMENTATION_REASON_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SMART_CONTROL_ID_FIELD_NUMBER = 1;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int STATUS_REASON_FIELD_NUMBER = 7;
    public static final int VARIANT_TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String smartControlId_ = "";
    private String status_ = "";
    private String variantType_ = "";
    private String sourceType_ = "";
    private String instrumentationId_ = "";
    private String instrumentationReason_ = "";
    private String statusReason_ = "";

    static {
        ConnectSmartControlLifecycleEvent connectSmartControlLifecycleEvent = new ConnectSmartControlLifecycleEvent();
        DEFAULT_INSTANCE = connectSmartControlLifecycleEvent;
        h.registerDefaultInstance(ConnectSmartControlLifecycleEvent.class, connectSmartControlLifecycleEvent);
    }

    private ConnectSmartControlLifecycleEvent() {
    }

    public static u6l n() {
        return (u6l) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "smartControlId_", "status_", "variantType_", "sourceType_", "instrumentationId_", "instrumentationReason_", "statusReason_"});
        }
        if (iOrdinal == 3) {
            return new ConnectSmartControlLifecycleEvent();
        }
        if (iOrdinal == 4) {
            return new u6l(DEFAULT_INSTANCE);
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
        synchronized (ConnectSmartControlLifecycleEvent.class) {
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

    public final void o(String str) {
        this.bitField0_ |= 16;
        this.instrumentationId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 32;
        this.instrumentationReason_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.smartControlId_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 8;
        this.sourceType_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 64;
        this.statusReason_ = str;
    }

    public final void setStatus(String str) {
        this.bitField0_ |= 2;
        this.status_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 4;
        this.variantType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
