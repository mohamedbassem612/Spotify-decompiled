package com.spotify.messages;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.e7h1;
import p.f7h1;
import p.h290;
import p.i9;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class UbiExpr2PageView extends h implements v2j0 {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 26;
    public static final int APP_VISIT_INDEX_FIELD_NUMBER = 27;
    public static final int BRANCHING_SOURCE_PAGE_INSTANCE_ID_FIELD_NUMBER = 25;
    public static final int CLIENT_DEBUG_METADATA_FIELD_NUMBER = 16;
    public static final int CLIENT_TIMEZONE_FIELD_NUMBER = 15;
    private static final UbiExpr2PageView DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 3;
    public static final int ERRORS_DETECTED_FIELD_NUMBER = 24;
    public static final int ERRORS_FIELD_NUMBER = 11;
    public static final int FEATURE_FIELD_NUMBER = 28;
    public static final int FROM_ENTITY_URI_FIELD_NUMBER = 7;
    public static final int FROM_NAVIGATIONAL_ROOT_FIELD_NUMBER = 8;
    public static final int FROM_PAGE_ID_FIELD_NUMBER = 6;
    public static final int FROM_PAGE_INSTANCE_ID_FIELD_NUMBER = 5;
    public static final int NAVIGATIONAL_ROOT_FIELD_NUMBER = 4;
    public static final int NAVIGATION_REASON_FIELD_NUMBER = 9;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 29;
    public static final int PAGE_ID_FIELD_NUMBER = 2;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 1;
    public static final int PAGE_PRESENTATION_ID_FIELD_NUMBER = 17;
    private static volatile qzr0 PARSER = null;
    public static final int PATH_IDS_FIELD_NUMBER = 20;
    public static final int PATH_NAMES_FIELD_NUMBER = 18;
    public static final int PATH_POS_FIELD_NUMBER = 19;
    public static final int PATH_REASONS_FIELD_NUMBER = 22;
    public static final int PATH_SPECIFICATION_VERSIONS_FIELD_NUMBER = 23;
    public static final int PATH_URIS_FIELD_NUMBER = 21;
    public static final int PREVIOUS_INTERACTION_IDS_FIELD_NUMBER = 10;
    public static final int REPORTED_CLIENT_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int SCENE_ID_FIELD_NUMBER = 14;
    public static final int TRANSITION_START_TIMESTAMP_FIELD_NUMBER = 13;
    private int appVisitIndex_;
    private int bitField0_;
    private int pagePresentationId_;
    private long reportedClientTimestamp_;
    private long transitionStartTimestamp_;
    private qng0 clientDebugMetadata_ = qng0.b;
    private String pageInstanceId_ = "";
    private String pageId_ = "";
    private String entityUri_ = "";
    private String navigationalRoot_ = "";
    private String fromPageInstanceId_ = "";
    private String fromPageId_ = "";
    private String fromEntityUri_ = "";
    private String fromNavigationalRoot_ = "";
    private String navigationReason_ = "";
    private h290 previousInteractionIds_ = h.emptyProtobufList();
    private h290 errors_ = h.emptyProtobufList();
    private String sceneId_ = "";
    private String clientTimezone_ = "";
    private h290 pathNames_ = h.emptyProtobufList();
    private h290 pathPos_ = h.emptyProtobufList();
    private h290 pathIds_ = h.emptyProtobufList();
    private h290 pathUris_ = h.emptyProtobufList();
    private h290 pathReasons_ = h.emptyProtobufList();
    private h290 pathSpecificationVersions_ = h.emptyProtobufList();
    private h290 errorsDetected_ = h.emptyProtobufList();
    private String branchingSourcePageInstanceId_ = "";
    private String appInstanceId_ = "";
    private String feature_ = "";
    private String pageIdentifier_ = "";

    static {
        UbiExpr2PageView ubiExpr2PageView = new UbiExpr2PageView();
        DEFAULT_INSTANCE = ubiExpr2PageView;
        h.registerDefaultInstance(UbiExpr2PageView.class, ubiExpr2PageView);
    }

    private UbiExpr2PageView() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static e7h1 w() {
        return (e7h1) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.clientTimezone_ = str;
    }

    public final void B(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.entityUri_ = str;
    }

    public final void C(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.fromEntityUri_ = str;
    }

    public final void D(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.fromNavigationalRoot_ = str;
    }

    public final void E(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.fromPageId_ = str;
    }

    public final void F(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.fromPageInstanceId_ = str;
    }

    public final void G(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.navigationReason_ = str;
    }

    public final void H(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.navigationalRoot_ = str;
    }

    public final void I(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.pageId_ = str;
    }

    public final void J(String str) {
        this.bitField0_ |= 262144;
        this.pageIdentifier_ = str;
    }

    public final void K(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.pageInstanceId_ = str;
    }

    public final void L(int i) {
        this.bitField0_ |= 8192;
        this.pagePresentationId_ = i;
    }

    public final void M(String str) {
        this.bitField0_ |= 2048;
        this.sceneId_ = str;
    }

    public final void N(long j) {
        this.bitField0_ |= 1024;
        this.transitionStartTimestamp_ = j;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001d\u0000\u0001\u0001\u001d\u001d\u0001\t\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\n\u001a\u000b\u001a\fဂ\t\rဂ\n\u000eဈ\u000b\u000fဈ\f\u00102\u0011င\r\u0012\u001a\u0013\u001a\u0014\u001a\u0015\u001a\u0016\u001a\u0017\u001a\u0018\u001a\u0019ဈ\u000e\u001aဈ\u000f\u001bင\u0010\u001cဈ\u0011\u001dဈ\u0012", new Object[]{"bitField0_", "pageInstanceId_", "pageId_", "entityUri_", "navigationalRoot_", "fromPageInstanceId_", "fromPageId_", "fromEntityUri_", "fromNavigationalRoot_", "navigationReason_", "previousInteractionIds_", "errors_", "reportedClientTimestamp_", "transitionStartTimestamp_", "sceneId_", "clientTimezone_", "clientDebugMetadata_", f7h1.a, "pagePresentationId_", "pathNames_", "pathPos_", "pathIds_", "pathUris_", "pathReasons_", "pathSpecificationVersions_", "errorsDetected_", "branchingSourcePageInstanceId_", "appInstanceId_", "appVisitIndex_", "feature_", "pageIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new UbiExpr2PageView();
        }
        if (iOrdinal == 4) {
            return new e7h1(DEFAULT_INSTANCE);
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
        synchronized (UbiExpr2PageView.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.errorsDetected_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.errorsDetected_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.previousInteractionIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.previousInteractionIds_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final void p(String str) {
        h290 h290VarMutableCopy = this.pathIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.pathIds_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void q(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.pathNames_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.pathNames_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void r(String str) {
        h290 h290VarMutableCopy = this.pathPos_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.pathPos_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void s(String str) {
        h290 h290VarMutableCopy = this.pathReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.pathReasons_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void t(String str) {
        h290 h290VarMutableCopy = this.pathSpecificationVersions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.pathSpecificationVersions_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        h290 h290VarMutableCopy = this.pathUris_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.pathUris_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final qng0 v() {
        qng0 qng0Var = this.clientDebugMetadata_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.clientDebugMetadata_ = qng0VarH;
        return qng0VarH;
    }

    public final void x(String str) {
        this.bitField0_ |= 32768;
        this.appInstanceId_ = str;
    }

    public final void y(int i) {
        this.bitField0_ |= 65536;
        this.appVisitIndex_ = i;
    }

    public final void z(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.branchingSourcePageInstanceId_ = str;
    }
}
