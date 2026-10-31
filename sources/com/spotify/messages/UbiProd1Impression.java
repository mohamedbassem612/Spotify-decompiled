package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.d9h1;
import p.h290;
import p.i9;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class UbiProd1Impression extends h implements v2j0 {
    public static final int ANNOTATOR_CONFIGURATION_VERSION_FIELD_NUMBER = 15;
    public static final int ANNOTATOR_VERSION_FIELD_NUMBER = 14;
    public static final int APP_FIELD_NUMBER = 2;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 32;
    public static final int APP_VISIT_INDEX_FIELD_NUMBER = 33;
    public static final int CLIENT_DEBUG_METADATA_FIELD_NUMBER = 31;
    public static final int CLIENT_TIMEZONE_FIELD_NUMBER = 29;
    private static final UbiProd1Impression DEFAULT_INSTANCE;
    public static final int DWELL_TIME_MS_FIELD_NUMBER = 25;
    public static final int DWELL_TIME_START_TIMESTAMP_FIELD_NUMBER = 26;
    public static final int ELEMENT_PATH_IDS_FIELD_NUMBER = 5;
    public static final int ELEMENT_PATH_NAMES_FIELD_NUMBER = 3;
    public static final int ELEMENT_PATH_POS_FIELD_NUMBER = 4;
    public static final int ELEMENT_PATH_REASONS_FIELD_NUMBER = 7;
    public static final int ELEMENT_PATH_URIS_FIELD_NUMBER = 6;
    public static final int ERRORS_FIELD_NUMBER = 8;
    public static final int FEATURE_FIELD_NUMBER = 35;
    public static final int GENERATOR_VERSION_FIELD_NUMBER = 1;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 9;
    public static final int IS_VISIBLE_FOR_MIN_DURATION_FIELD_NUMBER = 30;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 36;
    public static final int PAGE_ID_FIELD_NUMBER = 28;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 10;
    public static final int PAGE_URI_FIELD_NUMBER = 23;
    public static final int PARENT_MODES_FIELD_NUMBER = 22;
    public static final int PARENT_PATH_IDS_FIELD_NUMBER = 18;
    public static final int PARENT_PATH_NAMES_FIELD_NUMBER = 16;
    public static final int PARENT_PATH_POS_FIELD_NUMBER = 17;
    public static final int PARENT_PATH_REASONS_FIELD_NUMBER = 20;
    public static final int PARENT_PATH_URIS_FIELD_NUMBER = 19;
    public static final int PARENT_SPECIFICATION_VERSIONS_FIELD_NUMBER = 21;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 13;
    public static final int PLAY_CONTEXT_URI_FIELD_NUMBER = 24;
    public static final int SOURCE_PATHS_FIELD_NUMBER = 34;
    public static final int SPECIFICATION_MODE_FIELD_NUMBER = 12;
    public static final int SPECIFICATION_VERSION_FIELD_NUMBER = 11;
    public static final int UBI_EVENT_CREATION_TIMESTAMP_FIELD_NUMBER = 27;
    private int appVisitIndex_;
    private int bitField0_;
    private long dwellTimeMs_;
    private long dwellTimeStartTimestamp_;
    private boolean isVisibleForMinDuration_;
    private long ubiEventCreationTimestamp_;
    private qng0 clientDebugMetadata_ = qng0.b;
    private String generatorVersion_ = "";
    private String app_ = "";
    private h290 elementPathNames_ = h.emptyProtobufList();
    private h290 elementPathPos_ = h.emptyProtobufList();
    private h290 elementPathIds_ = h.emptyProtobufList();
    private h290 elementPathUris_ = h.emptyProtobufList();
    private h290 elementPathReasons_ = h.emptyProtobufList();
    private h290 errors_ = h.emptyProtobufList();
    private String impressionId_ = "";
    private String pageInstanceId_ = "";
    private String specificationVersion_ = "";
    private String specificationMode_ = "";
    private String playbackId_ = "";
    private String annotatorVersion_ = "";
    private String annotatorConfigurationVersion_ = "";
    private h290 parentPathNames_ = h.emptyProtobufList();
    private h290 parentPathPos_ = h.emptyProtobufList();
    private h290 parentPathIds_ = h.emptyProtobufList();
    private h290 parentPathUris_ = h.emptyProtobufList();
    private h290 parentPathReasons_ = h.emptyProtobufList();
    private h290 parentSpecificationVersions_ = h.emptyProtobufList();
    private h290 parentModes_ = h.emptyProtobufList();
    private String pageUri_ = "";
    private String playContextUri_ = "";
    private String pageId_ = "";
    private String clientTimezone_ = "";
    private String appInstanceId_ = "";
    private h290 sourcePaths_ = h.emptyProtobufList();
    private String feature_ = "";
    private String pageIdentifier_ = "";

    static {
        UbiProd1Impression ubiProd1Impression = new UbiProd1Impression();
        DEFAULT_INSTANCE = ubiProd1Impression;
        h.registerDefaultInstance(UbiProd1Impression.class, ubiProd1Impression);
    }

    private UbiProd1Impression() {
    }

    public static a C() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final long A() {
        return this.dwellTimeStartTimestamp_;
    }

    public final qng0 B() {
        qng0 qng0Var = this.clientDebugMetadata_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.clientDebugMetadata_ = qng0VarH;
        return qng0VarH;
    }

    public final void D(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.annotatorConfigurationVersion_ = str;
    }

    public final void E(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.annotatorVersion_ = str;
    }

    public final void F(String str) {
        str.getClass();
        this.bitField0_ |= 131072;
        this.appInstanceId_ = str;
    }

    public final void G(int i) {
        this.bitField0_ |= 262144;
        this.appVisitIndex_ = i;
    }

    public final void H(String str) {
        this.bitField0_ |= 32768;
        this.clientTimezone_ = str;
    }

    public final void I(long j) {
        this.bitField0_ |= 2048;
        this.dwellTimeMs_ = j;
    }

    public final void J(long j) {
        this.bitField0_ |= 4096;
        this.dwellTimeStartTimestamp_ = j;
    }

    public final void K(String str) {
        this.bitField0_ |= 1;
        this.generatorVersion_ = str;
    }

    public final void L(String str) {
        this.bitField0_ |= 4;
        this.impressionId_ = str;
    }

    public final void M() {
        this.bitField0_ |= 65536;
        this.isVisibleForMinDuration_ = true;
    }

    public final void N(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.pageId_ = str;
    }

    public final void O(String str) {
        this.bitField0_ |= 1048576;
        this.pageIdentifier_ = str;
    }

    public final void P(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.pageInstanceId_ = str;
    }

    public final void Q(String str) {
        this.bitField0_ |= 512;
        this.pageUri_ = str;
    }

    public final void R(String str) {
        this.bitField0_ |= 1024;
        this.playContextUri_ = str;
    }

    public final void S(String str) {
        this.bitField0_ |= 64;
        this.playbackId_ = str;
    }

    public final void T() {
        this.bitField0_ |= 32;
        this.specificationMode_ = "default";
    }

    public final void U(String str) {
        this.bitField0_ |= 16;
        this.specificationVersion_ = str;
    }

    public final void V(long j) {
        this.bitField0_ |= 8192;
        this.ubiEventCreationTimestamp_ = j;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001$\u0000\u0001\u0001$$\u0001\u000e\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001a\u0005\u001a\u0006\u001a\u0007\u001a\b\u001a\tဈ\u0002\nဈ\u0003\u000bဈ\u0004\fဈ\u0005\rဈ\u0006\u000eဈ\u0007\u000fဈ\b\u0010\u001a\u0011\u001a\u0012\u001a\u0013\u001a\u0014\u001a\u0015\u001a\u0016\u001a\u0017ဈ\t\u0018ဈ\n\u0019ဂ\u000b\u001aဂ\f\u001bဂ\r\u001cဈ\u000e\u001dဈ\u000f\u001eဇ\u0010\u001f2 ဈ\u0011!င\u0012\"\u001b#ဈ\u0013$ဈ\u0014", new Object[]{"bitField0_", "generatorVersion_", "app_", "elementPathNames_", "elementPathPos_", "elementPathIds_", "elementPathUris_", "elementPathReasons_", "errors_", "impressionId_", "pageInstanceId_", "specificationVersion_", "specificationMode_", "playbackId_", "annotatorVersion_", "annotatorConfigurationVersion_", "parentPathNames_", "parentPathPos_", "parentPathIds_", "parentPathUris_", "parentPathReasons_", "parentSpecificationVersions_", "parentModes_", "pageUri_", "playContextUri_", "dwellTimeMs_", "dwellTimeStartTimestamp_", "ubiEventCreationTimestamp_", "pageId_", "clientTimezone_", "isVisibleForMinDuration_", "clientDebugMetadata_", d9h1.a, "appInstanceId_", "appVisitIndex_", "sourcePaths_", SourcePaths.class, "feature_", "pageIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new UbiProd1Impression();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (UbiProd1Impression.class) {
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
        h290 h290VarMutableCopy = this.elementPathIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.elementPathIds_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.elementPathNames_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.elementPathNames_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void p(String str) {
        h290 h290VarMutableCopy = this.elementPathPos_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.elementPathPos_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void q(String str) {
        h290 h290VarMutableCopy = this.elementPathReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.elementPathReasons_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void r(String str) {
        h290 h290VarMutableCopy = this.elementPathUris_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.elementPathUris_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void s(String str) {
        h290 h290VarMutableCopy = this.parentModes_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.parentModes_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void setApp(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.app_ = str;
    }

    public final void t(String str) {
        h290 h290VarMutableCopy = this.parentPathIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.parentPathIds_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.parentPathNames_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.parentPathNames_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void v(String str) {
        h290 h290VarMutableCopy = this.parentPathPos_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.parentPathPos_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void w(String str) {
        h290 h290VarMutableCopy = this.parentPathReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.parentPathReasons_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void x(String str) {
        h290 h290VarMutableCopy = this.parentPathUris_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.parentPathUris_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void y(String str) {
        h290 h290VarMutableCopy = this.parentSpecificationVersions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.parentSpecificationVersions_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void z(SourcePaths sourcePaths) {
        sourcePaths.getClass();
        h290 h290VarMutableCopy = this.sourcePaths_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.sourcePaths_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(sourcePaths);
    }
}
