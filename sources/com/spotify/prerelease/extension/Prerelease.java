package com.spotify.prerelease.extension;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lyv0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Prerelease extends h implements v2j0 {
    public static final int ALBUM_FIELD_NUMBER = 3;
    private static final Prerelease DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PREMIUM_EARLY_ACCESS_FIELD_NUMBER = 4;
    public static final int RELEASE_TIME_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private Album album_;
    private int bitField0_;
    private boolean premiumEarlyAccess_;
    private Timestamp releaseTime_;
    private String uri_ = "";

    static {
        Prerelease prerelease = new Prerelease();
        DEFAULT_INSTANCE = prerelease;
        h.registerDefaultInstance(Prerelease.class, prerelease);
    }

    private Prerelease() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Prerelease q(byte[] bArr) {
        return (Prerelease) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007", new Object[]{"bitField0_", "uri_", "releaseTime_", "album_", "premiumEarlyAccess_"});
        }
        if (iOrdinal == 3) {
            return new Prerelease();
        }
        if (iOrdinal == 4) {
            return new lyv0(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (Prerelease.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final Album n() {
        Album album = this.album_;
        return album == null ? Album.o() : album;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.premiumEarlyAccess_;
    }

    public final Timestamp p() {
        Timestamp timestamp = this.releaseTime_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
