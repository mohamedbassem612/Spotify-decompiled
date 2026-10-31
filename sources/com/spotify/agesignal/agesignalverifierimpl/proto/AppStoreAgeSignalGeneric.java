package com.spotify.agesignal.agesignalverifierimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xw5;
import p.yw5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AppStoreAgeSignalGeneric extends h implements v2j0 {
    public static final int DATA_FIELD_NUMBER = 3;
    private static final AppStoreAgeSignalGeneric DEFAULT_INSTANCE;
    public static final int GENERIC_EVENT_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private qng0 data_ = qng0.b;
    private String spotifyId_ = "";
    private String genericEventId_ = "";

    static {
        AppStoreAgeSignalGeneric appStoreAgeSignalGeneric = new AppStoreAgeSignalGeneric();
        DEFAULT_INSTANCE = appStoreAgeSignalGeneric;
        h.registerDefaultInstance(AppStoreAgeSignalGeneric.class, appStoreAgeSignalGeneric);
    }

    private AppStoreAgeSignalGeneric() {
    }

    public static xw5 n() {
        return (xw5) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u00032", new Object[]{"bitField0_", "spotifyId_", "genericEventId_", "data_", yw5.a});
        }
        if (iOrdinal == 3) {
            return new AppStoreAgeSignalGeneric();
        }
        if (iOrdinal == 4) {
            return new xw5(DEFAULT_INSTANCE);
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
        synchronized (AppStoreAgeSignalGeneric.class) {
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

    public final qng0 internalGetMutableData() {
        qng0 qng0Var = this.data_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.data_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.genericEventId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.spotifyId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
