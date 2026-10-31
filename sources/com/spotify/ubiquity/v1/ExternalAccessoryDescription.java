package com.spotify.ubiquity.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.k210;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ExternalAccessoryDescription extends h implements v2j0 {
    public static final int CATEGORY_FIELD_NUMBER = 5;
    public static final int CLIENT_ID_FIELD_NUMBER = 2;
    public static final int COMPANY_FIELD_NUMBER = 6;
    private static final ExternalAccessoryDescription DEFAULT_INSTANCE;
    public static final int INTEGRATION_FIELD_NUMBER = 1;
    public static final int MODEL_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SENDER_ID_FIELD_NUMBER = 10;
    public static final int TRANSPORT_TYPE_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 8;
    private int bitField0_;
    private String integration_ = "";
    private String clientId_ = "";
    private String name_ = "";
    private String transportType_ = "";
    private String category_ = "";
    private String company_ = "";
    private String model_ = "";
    private String version_ = "";
    private String protocol_ = "";
    private String senderId_ = "";

    static {
        ExternalAccessoryDescription externalAccessoryDescription = new ExternalAccessoryDescription();
        DEFAULT_INSTANCE = externalAccessoryDescription;
        h.registerDefaultInstance(ExternalAccessoryDescription.class, externalAccessoryDescription);
    }

    private ExternalAccessoryDescription() {
    }

    public static k210 n() {
        return (k210) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t", new Object[]{"bitField0_", "integration_", "clientId_", "name_", "transportType_", "category_", "company_", "model_", "version_", "protocol_", "senderId_"});
        }
        if (iOrdinal == 3) {
            return new ExternalAccessoryDescription();
        }
        if (iOrdinal == 4) {
            return new k210(DEFAULT_INSTANCE);
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
        synchronized (ExternalAccessoryDescription.class) {
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
        this.category_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 8;
        this.transportType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
