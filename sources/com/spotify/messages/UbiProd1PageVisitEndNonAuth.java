package com.spotify.messages;

import p.bf40;
import p.h290;
import p.jf40;
import p.q9h1;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.r9h1;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class UbiProd1PageVisitEndNonAuth extends com.google.protobuf.h implements v2j0 {
    public static final int CLIENT_DEBUG_METADATA_FIELD_NUMBER = 6;
    public static final int CLIENT_TIMEZONE_FIELD_NUMBER = 4;
    private static final UbiProd1PageVisitEndNonAuth DEFAULT_INSTANCE;
    public static final int END_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int ERRORS_FIELD_NUMBER = 7;
    public static final int PAGE_PRESENTATION_ID_FIELD_NUMBER = 2;
    public static final int PAGE_VISIT_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SCENE_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private long endTimestamp_;
    private int pagePresentationId_;
    private qng0 clientDebugMetadata_ = qng0.b;
    private String pageVisitId_ = "";
    private String clientTimezone_ = "";
    private String sceneId_ = "";
    private h290 errors_ = com.google.protobuf.h.emptyProtobufList();

    static {
        UbiProd1PageVisitEndNonAuth ubiProd1PageVisitEndNonAuth = new UbiProd1PageVisitEndNonAuth();
        DEFAULT_INSTANCE = ubiProd1PageVisitEndNonAuth;
        com.google.protobuf.h.registerDefaultInstance(UbiProd1PageVisitEndNonAuth.class, ubiProd1PageVisitEndNonAuth);
    }

    private UbiProd1PageVisitEndNonAuth() {
    }

    public static q9h1 n() {
        return (q9h1) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u00062\u0007\u001a", new Object[]{"bitField0_", "pageVisitId_", "pagePresentationId_", "endTimestamp_", "clientTimezone_", "sceneId_", "clientDebugMetadata_", r9h1.a, "errors_"});
        }
        if (iOrdinal == 3) {
            return new UbiProd1PageVisitEndNonAuth();
        }
        if (iOrdinal == 4) {
            return new q9h1(DEFAULT_INSTANCE);
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
        synchronized (UbiProd1PageVisitEndNonAuth.class) {
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
        this.bitField0_ |= 8;
        this.clientTimezone_ = str;
    }

    public final void p(long j) {
        this.bitField0_ |= 4;
        this.endTimestamp_ = j;
    }

    public final void q(int i) {
        this.bitField0_ |= 2;
        this.pagePresentationId_ = i;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.pageVisitId_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 16;
        this.sceneId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
