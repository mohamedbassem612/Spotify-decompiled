package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.osh;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CommonMessages$LoggingParams extends h implements v2j0 {
    public static final int COMMAND_ID_FIELD_NUMBER = 5;
    public static final int COMMAND_INITIATED_TIME_FIELD_NUMBER = 1;
    public static final int COMMAND_RECEIVED_TIME_FIELD_NUMBER = 2;
    private static final CommonMessages$LoggingParams DEFAULT_INSTANCE;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 6;
    public static final int INTERACTION_IDS_FIELD_NUMBER = 4;
    public static final int PAGE_INSTANCE_IDS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private long commandInitiatedTime_;
    private long commandReceivedTime_;
    private h290 pageInstanceIds_ = h.emptyProtobufList();
    private h290 interactionIds_ = h.emptyProtobufList();
    private String commandId_ = "";
    private String featureIdentifier_ = "";

    static {
        CommonMessages$LoggingParams commonMessages$LoggingParams = new CommonMessages$LoggingParams();
        DEFAULT_INSTANCE = commonMessages$LoggingParams;
        h.registerDefaultInstance(CommonMessages$LoggingParams.class, commonMessages$LoggingParams);
    }

    private CommonMessages$LoggingParams() {
    }

    public static osh o() {
        return (osh) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003Ț\u0004Ț\u0005ለ\u0002\u0006ለ\u0003", new Object[]{"bitField0_", "commandInitiatedTime_", "commandReceivedTime_", "pageInstanceIds_", "interactionIds_", "commandId_", "featureIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new CommonMessages$LoggingParams();
        }
        if (iOrdinal == 4) {
            return new osh(DEFAULT_INSTANCE);
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
        synchronized (CommonMessages$LoggingParams.class) {
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

    public final void n(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.interactionIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.interactionIds_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.commandId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
