package com.spotify.contexts;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vz5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ApplicationAndroid extends h implements v2j0 {
    private static final ApplicationAndroid DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VERSION_CODE_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private long versionCode_;
    private String versionName_ = "";

    static {
        ApplicationAndroid applicationAndroid = new ApplicationAndroid();
        DEFAULT_INSTANCE = applicationAndroid;
        h.registerDefaultInstance(ApplicationAndroid.class, applicationAndroid);
    }

    private ApplicationAndroid() {
    }

    public static vz5 n() {
        return (vz5) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "versionName_", "versionCode_"});
        }
        if (iOrdinal == 3) {
            return new ApplicationAndroid();
        }
        if (iOrdinal == 4) {
            return new vz5(DEFAULT_INSTANCE);
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
        synchronized (ApplicationAndroid.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(long j) {
        this.bitField0_ |= 2;
        this.versionCode_ = j;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.versionName_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
