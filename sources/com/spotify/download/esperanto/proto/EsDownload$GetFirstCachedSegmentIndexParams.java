package com.spotify.download.esperanto.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.anz;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.vmz;
import p.wmz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EsDownload$GetFirstCachedSegmentIndexParams extends h implements v2j0 {
    public static final int CONTENT_FORM_FIELD_NUMBER = 3;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 2;
    private static final EsDownload$GetFirstCachedSegmentIndexParams DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int URL_PATHS_FIELD_NUMBER = 1;
    private int contentForm_;
    private int contentType_;
    private h290 urlPaths_ = h.emptyProtobufList();

    static {
        EsDownload$GetFirstCachedSegmentIndexParams esDownload$GetFirstCachedSegmentIndexParams = new EsDownload$GetFirstCachedSegmentIndexParams();
        DEFAULT_INSTANCE = esDownload$GetFirstCachedSegmentIndexParams;
        h.registerDefaultInstance(EsDownload$GetFirstCachedSegmentIndexParams.class, esDownload$GetFirstCachedSegmentIndexParams);
    }

    private EsDownload$GetFirstCachedSegmentIndexParams() {
    }

    public static anz o() {
        return (anz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002\f\u0003\f", new Object[]{"urlPaths_", "contentType_", "contentForm_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$GetFirstCachedSegmentIndexParams();
        }
        if (iOrdinal == 4) {
            return new anz(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$GetFirstCachedSegmentIndexParams.class) {
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
        h290 h290VarMutableCopy = this.urlPaths_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.urlPaths_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(vmz vmzVar) {
        this.contentForm_ = vmzVar.getNumber();
    }

    public final void q(wmz wmzVar) {
        this.contentType_ = wmzVar.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
