package com.spotify.player.esperanto.proto;

import com.spotify.stream_reporting_attribution.proto.StreamReportingAttributionOuterClass;
import p.bf40;
import p.coz;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsLoggingParams$LoggingParams extends com.google.protobuf.h implements v2j0 {
    public static final int COMMAND_ID_FIELD_NUMBER = 6;
    public static final int COMMAND_INITIATED_TIME_FIELD_NUMBER = 1;
    public static final int COMMAND_RECEIVED_TIME_FIELD_NUMBER = 2;
    private static final EsLoggingParams$LoggingParams DEFAULT_INSTANCE;
    public static final int DEVICE_IDENTIFIER_FIELD_NUMBER = 5;
    public static final int INTERACTION_IDS_FIELD_NUMBER = 4;
    public static final int PAGE_INSTANCE_IDS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STREAM_REPORTING_ATTRIBUTION_FIELD_NUMBER = 7;
    private int bitField0_;
    private EsOptional.OptionalInt64 commandInitiatedTime_;
    private EsOptional.OptionalInt64 commandReceivedTime_;
    private StreamReportingAttributionOuterClass.StreamReportingAttribution streamReportingAttribution_;
    private h290 pageInstanceIds_ = com.google.protobuf.h.emptyProtobufList();
    private h290 interactionIds_ = com.google.protobuf.h.emptyProtobufList();
    private String deviceIdentifier_ = "";
    private String commandId_ = "";

    static {
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = new EsLoggingParams$LoggingParams();
        DEFAULT_INSTANCE = esLoggingParams$LoggingParams;
        com.google.protobuf.h.registerDefaultInstance(EsLoggingParams$LoggingParams.class, esLoggingParams$LoggingParams);
    }

    private EsLoggingParams$LoggingParams() {
    }

    public static EsLoggingParams$LoggingParams p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static coz r() {
        return (coz) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ț\u0004Ț\u0005Ȉ\u0006ለ\u0002\u0007ဉ\u0003", new Object[]{"bitField0_", "commandInitiatedTime_", "commandReceivedTime_", "pageInstanceIds_", "interactionIds_", "deviceIdentifier_", "commandId_", "streamReportingAttribution_"});
        }
        if (iOrdinal == 3) {
            return new EsLoggingParams$LoggingParams();
        }
        if (iOrdinal == 4) {
            return new coz(DEFAULT_INSTANCE);
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
        synchronized (EsLoggingParams$LoggingParams.class) {
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
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.interactionIds_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.pageInstanceIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.pageInstanceIds_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final h290 q() {
        return this.interactionIds_;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.commandId_ = str;
    }

    public final void t(EsOptional.OptionalInt64 optionalInt64) {
        optionalInt64.getClass();
        this.commandInitiatedTime_ = optionalInt64;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(StreamReportingAttributionOuterClass.StreamReportingAttribution streamReportingAttribution) {
        streamReportingAttribution.getClass();
        this.streamReportingAttribution_ = streamReportingAttribution;
        this.bitField0_ |= 8;
    }
}
