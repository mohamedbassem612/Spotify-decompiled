package com.spotify.familyviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nc40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GenAlphaManagedSettings extends h implements v2j0 {
    public static final int ALLOW_CONNECT_FIELD_NUMBER = 5;
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 3;
    public static final int ALLOW_VIDEO_CONTENT_FIELD_NUMBER = 4;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 2;
    private static final GenAlphaManagedSettings DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private boolean allowConnect_;
    private boolean allowExplicitContent_;
    private boolean allowVideoContent_;
    private int bitField0_;
    private String displayName_ = "";
    private String dateOfBirth_ = "";

    static {
        GenAlphaManagedSettings genAlphaManagedSettings = new GenAlphaManagedSettings();
        DEFAULT_INSTANCE = genAlphaManagedSettings;
        h.registerDefaultInstance(GenAlphaManagedSettings.class, genAlphaManagedSettings);
    }

    private GenAlphaManagedSettings() {
    }

    public static nc40 n() {
        return (nc40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "displayName_", "dateOfBirth_", "allowExplicitContent_", "allowVideoContent_", "allowConnect_"});
        }
        if (iOrdinal == 3) {
            return new GenAlphaManagedSettings();
        }
        if (iOrdinal == 4) {
            return new nc40(DEFAULT_INSTANCE);
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
        synchronized (GenAlphaManagedSettings.class) {
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
        str.getClass();
        this.bitField0_ |= 1;
        this.displayName_ = str;
    }

    public final void setAllowConnect(boolean z) {
        this.bitField0_ |= 16;
        this.allowConnect_ = z;
    }

    public final void setAllowExplicitContent(boolean z) {
        this.bitField0_ |= 4;
        this.allowExplicitContent_ = z;
    }

    public final void setAllowVideoContent(boolean z) {
        this.bitField0_ |= 8;
        this.allowVideoContent_ = z;
    }

    public final void setDateOfBirth(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.dateOfBirth_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
