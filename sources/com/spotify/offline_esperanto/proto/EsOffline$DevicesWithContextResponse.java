package com.spotify.offline_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EsOffline$DevicesWithContextResponse extends h implements v2j0 {
    private static final EsOffline$DevicesWithContextResponse DEFAULT_INSTANCE;
    public static final int DEVICEWITHCONTEXT_FIELD_NUMBER = 1;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private h290 deviceWithContext_ = h.emptyProtobufList();
    private long error_;

    public static final class DeviceWithContext extends h implements v2j0 {
        public static final int CONTEXT_FIELD_NUMBER = 3;
        private static final DeviceWithContext DEFAULT_INSTANCE;
        public static final int DEVICE_FIELD_NUMBER = 1;
        public static final int IS_SUPPORTED_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private EsOffline.Context context_;
        private EsOffline$Device device_;
        private boolean isSupported_;

        static {
            DeviceWithContext deviceWithContext = new DeviceWithContext();
            DEFAULT_INSTANCE = deviceWithContext;
            h.registerDefaultInstance(DeviceWithContext.class, deviceWithContext);
        }

        private DeviceWithContext() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003ဉ\u0001", new Object[]{"bitField0_", "device_", "isSupported_", "context_"});
            }
            if (iOrdinal == 3) {
                return new DeviceWithContext();
            }
            if (iOrdinal == 4) {
                return new b(DEFAULT_INSTANCE);
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
            synchronized (DeviceWithContext.class) {
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

        public final EsOffline.Context n() {
            EsOffline.Context context = this.context_;
            return context == null ? EsOffline.Context.o() : context;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final EsOffline$Device o() {
            EsOffline$Device esOffline$Device = this.device_;
            return esOffline$Device == null ? EsOffline$Device.p() : esOffline$Device;
        }

        public final boolean p() {
            return this.isSupported_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EsOffline$DevicesWithContextResponse esOffline$DevicesWithContextResponse = new EsOffline$DevicesWithContextResponse();
        DEFAULT_INSTANCE = esOffline$DevicesWithContextResponse;
        h.registerDefaultInstance(EsOffline$DevicesWithContextResponse.class, esOffline$DevicesWithContextResponse);
    }

    private EsOffline$DevicesWithContextResponse() {
    }

    public static EsOffline$DevicesWithContextResponse p(byte[] bArr) {
        return (EsOffline$DevicesWithContextResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"deviceWithContext_", DeviceWithContext.class, "error_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$DevicesWithContextResponse();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (EsOffline$DevicesWithContextResponse.class) {
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

    public final h290 n() {
        return this.deviceWithContext_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.error_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
