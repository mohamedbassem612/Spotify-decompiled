package com.spotify.corex.reading.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ReadSpan extends h implements v2j0 {
    private static final ReadSpan DEFAULT_INSTANCE;
    public static final int LINKS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 4;
    public static final int SECTIONS_FIELD_NUMBER = 3;
    public static final int SUB_NAME_FIELD_NUMBER = 8;
    public static final int SUB_URI_FIELD_NUMBER = 2;
    public static final int TIMELINE_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private PaginationLinks links_;
    private Progress progress_;
    private Timeline timeline_;
    private String uri_ = "";
    private String subUri_ = "";
    private h290 sections_ = h.emptyProtobufList();
    private String name_ = "";
    private String subName_ = "";

    static {
        ReadSpan readSpan = new ReadSpan();
        DEFAULT_INSTANCE = readSpan;
        h.registerDefaultInstance(ReadSpan.class, readSpan);
    }

    private ReadSpan() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ReadSpan t(byte[] bArr) {
        return (ReadSpan) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u001b\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007Ȉ\bȈ", new Object[]{"bitField0_", "uri_", "subUri_", "sections_", Section.class, "progress_", "timeline_", "links_", "name_", "subName_"});
        }
        if (iOrdinal == 3) {
            return new ReadSpan();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (ReadSpan.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final PaginationLinks n() {
        PaginationLinks paginationLinks = this.links_;
        return paginationLinks == null ? PaginationLinks.n() : paginationLinks;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Progress o() {
        Progress progress = this.progress_;
        return progress == null ? Progress.n() : progress;
    }

    public final h290 p() {
        return this.sections_;
    }

    public final String q() {
        return this.subName_;
    }

    public final String r() {
        return this.subUri_;
    }

    public final Timeline s() {
        Timeline timeline = this.timeline_;
        return timeline == null ? Timeline.n() : timeline;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
