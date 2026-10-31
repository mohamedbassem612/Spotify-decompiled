package com.spotify.creativework.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lo11;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class Release extends h implements v2j0 {
    private static final Release DEFAULT_INSTANCE;
    public static final int PARENT_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int TRAITS_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private ParentInfo parent_;
    private ReleaseTraits traits_;
    private String uri_ = "";

    static {
        Release release = new Release();
        DEFAULT_INSTANCE = release;
        h.registerDefaultInstance(Release.class, release);
    }

    private Release() {
    }

    public static lo11 o() {
        return (lo11) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "uri_", "traits_", "parent_"});
        }
        if (iOrdinal == 3) {
            return new Release();
        }
        if (iOrdinal == 4) {
            return new lo11(DEFAULT_INSTANCE);
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
        synchronized (Release.class) {
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

    public final ParentInfo n() {
        ParentInfo parentInfo = this.parent_;
        return parentInfo == null ? ParentInfo.n() : parentInfo;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(ParentInfo parentInfo) {
        parentInfo.getClass();
        this.parent_ = parentInfo;
        this.bitField0_ |= 2;
    }

    public final void q(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
