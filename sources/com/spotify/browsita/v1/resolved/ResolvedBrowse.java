package com.spotify.browsita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.eu21;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ResolvedBrowse extends h implements v2j0 {
    private static final ResolvedBrowse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESPONSE_INFO_FIELD_NUMBER = 2;
    public static final int STRUCTURE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ResponseInfo responseInfo_;
    private BrowseStructure structure_;

    static {
        ResolvedBrowse resolvedBrowse = new ResolvedBrowse();
        DEFAULT_INSTANCE = resolvedBrowse;
        h.registerDefaultInstance(ResolvedBrowse.class, resolvedBrowse);
    }

    private ResolvedBrowse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "structure_", "responseInfo_"});
        }
        if (iOrdinal == 3) {
            return new ResolvedBrowse();
        }
        if (iOrdinal == 4) {
            return new eu21(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (ResolvedBrowse.class) {
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

    public final ResponseInfo n() {
        ResponseInfo responseInfo = this.responseInfo_;
        return responseInfo == null ? ResponseInfo.n() : responseInfo;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final BrowseStructure o() {
        BrowseStructure browseStructure = this.structure_;
        return browseStructure == null ? BrowseStructure.n() : browseStructure;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
