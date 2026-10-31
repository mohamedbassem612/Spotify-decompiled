package com.spotify.messages;

import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.m9h1;
import p.n9h1;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class UbiProd1PageVisitChangeNonAuth extends com.google.protobuf.h implements v2j0 {
    public static final int CHANGE_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int CLIENT_DEBUG_METADATA_FIELD_NUMBER = 15;
    public static final int CLIENT_TIMEZONE_FIELD_NUMBER = 13;
    private static final UbiProd1PageVisitChangeNonAuth DEFAULT_INSTANCE;
    public static final int ERRORS_FIELD_NUMBER = 16;
    public static final int FEATURE_FIELD_NUMBER = 17;
    public static final int NAVIGATION_REASON_FIELD_NUMBER = 11;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 18;
    public static final int PAGE_ID_FIELD_NUMBER = 4;
    public static final int PAGE_PRESENTATION_ID_FIELD_NUMBER = 2;
    public static final int PAGE_VISIT_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PATH_IDS_FIELD_NUMBER = 7;
    public static final int PATH_NAMES_FIELD_NUMBER = 5;
    public static final int PATH_POS_FIELD_NUMBER = 6;
    public static final int PATH_REASONS_FIELD_NUMBER = 9;
    public static final int PATH_SPECIFICATION_VERSIONS_FIELD_NUMBER = 10;
    public static final int PATH_URIS_FIELD_NUMBER = 8;
    public static final int PREVIOUS_PAGE_PRESENTATION_ID_FIELD_NUMBER = 3;
    public static final int SCENE_ID_FIELD_NUMBER = 14;
    private int bitField0_;
    private long changeTimestamp_;
    private int pagePresentationId_;
    private int previousPagePresentationId_;
    private qng0 clientDebugMetadata_ = qng0.b;
    private String pageVisitId_ = "";
    private String pageId_ = "";
    private h290 pathNames_ = com.google.protobuf.h.emptyProtobufList();
    private h290 pathPos_ = com.google.protobuf.h.emptyProtobufList();
    private h290 pathIds_ = com.google.protobuf.h.emptyProtobufList();
    private h290 pathUris_ = com.google.protobuf.h.emptyProtobufList();
    private h290 pathReasons_ = com.google.protobuf.h.emptyProtobufList();
    private h290 pathSpecificationVersions_ = com.google.protobuf.h.emptyProtobufList();
    private String navigationReason_ = "";
    private String clientTimezone_ = "";
    private String sceneId_ = "";
    private h290 errors_ = com.google.protobuf.h.emptyProtobufList();
    private String feature_ = "";
    private String pageIdentifier_ = "";

    static {
        UbiProd1PageVisitChangeNonAuth ubiProd1PageVisitChangeNonAuth = new UbiProd1PageVisitChangeNonAuth();
        DEFAULT_INSTANCE = ubiProd1PageVisitChangeNonAuth;
        com.google.protobuf.h.registerDefaultInstance(UbiProd1PageVisitChangeNonAuth.class, ubiProd1PageVisitChangeNonAuth);
    }

    private UbiProd1PageVisitChangeNonAuth() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static m9h1 t() {
        return (m9h1) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.pageVisitId_ = str;
    }

    public final void B(int i) {
        this.bitField0_ |= 4;
        this.previousPagePresentationId_ = i;
    }

    public final void C(String str) {
        this.bitField0_ |= 128;
        this.sceneId_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0001\u0007\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005\u001a\u0006\u001a\u0007\u001a\b\u001a\t\u001a\n\u001a\u000bဈ\u0004\fဂ\u0005\rဈ\u0006\u000eဈ\u0007\u000f2\u0010\u001a\u0011ဈ\b\u0012ဈ\t", new Object[]{"bitField0_", "pageVisitId_", "pagePresentationId_", "previousPagePresentationId_", "pageId_", "pathNames_", "pathPos_", "pathIds_", "pathUris_", "pathReasons_", "pathSpecificationVersions_", "navigationReason_", "changeTimestamp_", "clientTimezone_", "sceneId_", "clientDebugMetadata_", n9h1.a, "errors_", "feature_", "pageIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new UbiProd1PageVisitChangeNonAuth();
        }
        if (iOrdinal == 4) {
            return new m9h1(DEFAULT_INSTANCE);
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
        synchronized (UbiProd1PageVisitChangeNonAuth.class) {
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
        h290 h290VarMutableCopy = this.pathIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.pathIds_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.pathNames_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.pathNames_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void p(String str) {
        h290 h290VarMutableCopy = this.pathPos_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.pathPos_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void q(String str) {
        h290 h290VarMutableCopy = this.pathReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.pathReasons_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void r(String str) {
        h290 h290VarMutableCopy = this.pathSpecificationVersions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.pathSpecificationVersions_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void s(String str) {
        h290 h290VarMutableCopy = this.pathUris_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.pathUris_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(long j) {
        this.bitField0_ |= 32;
        this.changeTimestamp_ = j;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.clientTimezone_ = str;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.navigationReason_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.pageId_ = str;
    }

    public final void y(String str) {
        this.bitField0_ |= 512;
        this.pageIdentifier_ = str;
    }

    public final void z(int i) {
        this.bitField0_ |= 2;
        this.pagePresentationId_ = i;
    }
}
