package com.spotify.messages;

import p.bf40;
import p.dqy0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PuffinFiltersUsage extends com.google.protobuf.h implements v2j0 {
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 8;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 4;
    public static final int CONTENT_URI_FIELD_NUMBER = 5;
    private static final PuffinFiltersUsage DEFAULT_INSTANCE;
    public static final int EXTERNALIZATION_ENABLED_FIELD_NUMBER = 2;
    public static final int FORMAT_FIELD_NUMBER = 7;
    public static final int HEADPHONE_IDENTIFIER_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int SPECIFIC_ENABLED_FIELD_NUMBER = 1;
    public static final int SPECIFIC_ENABLED_REVISION_FIELD_NUMBER = 6;
    public static final int SPECIFIC_FILTER_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean externalizationEnabled_;
    private int format_;
    private int specificEnabledRevision_;
    private boolean specificEnabled_;
    private String specificFilterId_ = "";
    private String contentType_ = "";
    private String contentUri_ = "";
    private String connectionType_ = "";
    private String headphoneIdentifier_ = "";

    static {
        PuffinFiltersUsage puffinFiltersUsage = new PuffinFiltersUsage();
        DEFAULT_INSTANCE = puffinFiltersUsage;
        com.google.protobuf.h.registerDefaultInstance(PuffinFiltersUsage.class, puffinFiltersUsage);
    }

    private PuffinFiltersUsage() {
    }

    public static dqy0 n() {
        return (dqy0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007င\u0006\bဈ\u0007\tဈ\b", new Object[]{"bitField0_", "specificEnabled_", "externalizationEnabled_", "specificFilterId_", "contentType_", "contentUri_", "specificEnabledRevision_", "format_", "connectionType_", "headphoneIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new PuffinFiltersUsage();
        }
        if (iOrdinal == 4) {
            return new dqy0(DEFAULT_INSTANCE);
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
        synchronized (PuffinFiltersUsage.class) {
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
        this.bitField0_ |= 128;
        this.connectionType_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 8;
        this.contentType_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.contentUri_ = str;
    }

    public final void r(boolean z) {
        this.bitField0_ |= 2;
        this.externalizationEnabled_ = z;
    }

    public final void s(int i) {
        this.bitField0_ |= 64;
        this.format_ = i;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.headphoneIdentifier_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(boolean z) {
        this.bitField0_ |= 1;
        this.specificEnabled_ = z;
    }

    public final void v(int i) {
        this.bitField0_ |= 32;
        this.specificEnabledRevision_ = i;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.specificFilterId_ = str;
    }
}
