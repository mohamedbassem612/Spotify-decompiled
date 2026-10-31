package com.spotify.messages;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.f9h1;
import p.g9h1;
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
public final class UbiProd1ImpressionSegment extends h implements v2j0 {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 10;
    public static final int APP_VISIT_INDEX_FIELD_NUMBER = 11;
    public static final int CLIENT_DEBUG_METADATA_FIELD_NUMBER = 5;
    private static final UbiProd1ImpressionSegment DEFAULT_INSTANCE;
    public static final int DWELL_TIME_MS_FIELD_NUMBER = 3;
    public static final int ELEMENT_PATH_NAMES_FIELD_NUMBER = 6;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 1;
    public static final int PAGE_PRESENTATION_ID_FIELD_NUMBER = 9;
    public static final int PAGE_VISIT_ID_FIELD_NUMBER = 8;
    public static final int PARENT_PATH_NAMES_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int SEGMENT_INDEX_FIELD_NUMBER = 2;
    public static final int UBI_EVENT_CREATION_TIMESTAMP_FIELD_NUMBER = 4;
    private int appVisitIndex_;
    private int bitField0_;
    private long dwellTimeMs_;
    private int pagePresentationId_;
    private int segmentIndex_;
    private long ubiEventCreationTimestamp_;
    private qng0 clientDebugMetadata_ = qng0.b;
    private String impressionId_ = "";
    private h290 elementPathNames_ = h.emptyProtobufList();
    private h290 parentPathNames_ = h.emptyProtobufList();
    private String pageVisitId_ = "";
    private String appInstanceId_ = "";

    static {
        UbiProd1ImpressionSegment ubiProd1ImpressionSegment = new UbiProd1ImpressionSegment();
        DEFAULT_INSTANCE = ubiProd1ImpressionSegment;
        h.registerDefaultInstance(UbiProd1ImpressionSegment.class, ubiProd1ImpressionSegment);
    }

    private UbiProd1ImpressionSegment() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static f9h1 q() {
        return (f9h1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0001\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u00052\u0006\u001a\u0007\u001a\bဈ\u0004\tင\u0005\nဈ\u0006\u000bင\u0007", new Object[]{"bitField0_", "impressionId_", "segmentIndex_", "dwellTimeMs_", "ubiEventCreationTimestamp_", "clientDebugMetadata_", g9h1.a, "elementPathNames_", "parentPathNames_", "pageVisitId_", "pagePresentationId_", "appInstanceId_", "appVisitIndex_"});
        }
        if (iOrdinal == 3) {
            return new UbiProd1ImpressionSegment();
        }
        if (iOrdinal == 4) {
            return new f9h1(DEFAULT_INSTANCE);
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
        synchronized (UbiProd1ImpressionSegment.class) {
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
        h290 h290VarMutableCopy = this.elementPathNames_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.elementPathNames_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.parentPathNames_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.parentPathNames_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final qng0 p() {
        qng0 qng0Var = this.clientDebugMetadata_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.clientDebugMetadata_ = qng0VarH;
        return qng0VarH;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.appInstanceId_ = str;
    }

    public final void s(int i) {
        this.bitField0_ |= 128;
        this.appVisitIndex_ = i;
    }

    public final void t(long j) {
        this.bitField0_ |= 4;
        this.dwellTimeMs_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 1;
        this.impressionId_ = str;
    }

    public final void v(int i) {
        this.bitField0_ |= 32;
        this.pagePresentationId_ = i;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.pageVisitId_ = str;
    }

    public final void x(int i) {
        this.bitField0_ |= 2;
        this.segmentIndex_ = i;
    }

    public final void y(long j) {
        this.bitField0_ |= 8;
        this.ubiEventCreationTimestamp_ = j;
    }
}
