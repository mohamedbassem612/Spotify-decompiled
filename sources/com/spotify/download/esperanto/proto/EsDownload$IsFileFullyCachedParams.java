package com.spotify.download.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vmz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EsDownload$IsFileFullyCachedParams extends h implements v2j0 {
    private static final EsDownload$IsFileFullyCachedParams DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESSIVE_FILE_FIELD_NUMBER = 1;
    public static final int SEGMENT_FILE_FIELD_NUMBER = 2;
    private int fileCase_ = 0;
    private Object file_;

    public static final class ProgressiveFileParams extends h implements v2j0 {
        private static final ProgressiveFileParams DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        static {
            ProgressiveFileParams progressiveFileParams = new ProgressiveFileParams();
            DEFAULT_INSTANCE = progressiveFileParams;
            h.registerDefaultInstance(ProgressiveFileParams.class, progressiveFileParams);
        }

        private ProgressiveFileParams() {
        }

        public static b n() {
            return (b) DEFAULT_INSTANCE.createBuilder();
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
            }
            if (iOrdinal == 3) {
                return new ProgressiveFileParams();
            }
            if (iOrdinal == 4) {
                return new b(DEFAULT_INSTANCE);
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
            synchronized (ProgressiveFileParams.class) {
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
            str.getClass();
            this.url_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class SegmentFileParams extends h implements v2j0 {
        public static final int CONTENT_FORM_FIELD_NUMBER = 2;
        private static final SegmentFileParams DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int URL_PATH_FIELD_NUMBER = 1;
        private int contentForm_;
        private String urlPath_ = "";

        static {
            SegmentFileParams segmentFileParams = new SegmentFileParams();
            DEFAULT_INSTANCE = segmentFileParams;
            h.registerDefaultInstance(SegmentFileParams.class, segmentFileParams);
        }

        private SegmentFileParams() {
        }

        public static c n() {
            return (c) DEFAULT_INSTANCE.createBuilder();
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"urlPath_", "contentForm_"});
            }
            if (iOrdinal == 3) {
                return new SegmentFileParams();
            }
            if (iOrdinal == 4) {
                return new c(DEFAULT_INSTANCE);
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
            synchronized (SegmentFileParams.class) {
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

        public final void o(vmz vmzVar) {
            this.contentForm_ = vmzVar.getNumber();
        }

        public final void p(String str) {
            str.getClass();
            this.urlPath_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EsDownload$IsFileFullyCachedParams esDownload$IsFileFullyCachedParams = new EsDownload$IsFileFullyCachedParams();
        DEFAULT_INSTANCE = esDownload$IsFileFullyCachedParams;
        h.registerDefaultInstance(EsDownload$IsFileFullyCachedParams.class, esDownload$IsFileFullyCachedParams);
    }

    private EsDownload$IsFileFullyCachedParams() {
    }

    public static a n() {
        return (a) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"file_", "fileCase_", ProgressiveFileParams.class, SegmentFileParams.class});
        }
        if (iOrdinal == 3) {
            return new EsDownload$IsFileFullyCachedParams();
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
        synchronized (EsDownload$IsFileFullyCachedParams.class) {
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

    public final void o(ProgressiveFileParams progressiveFileParams) {
        progressiveFileParams.getClass();
        this.file_ = progressiveFileParams;
        this.fileCase_ = 1;
    }

    public final void p(SegmentFileParams segmentFileParams) {
        segmentFileParams.getClass();
        this.file_ = segmentFileParams;
        this.fileCase_ = 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
