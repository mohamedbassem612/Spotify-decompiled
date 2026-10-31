package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.em40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetDenominationSelectionResponse extends h implements v2j0 {
    private static final GetDenominationSelectionResponse DEFAULT_INSTANCE;
    public static final int LIST_AND_SECTIONS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int layoutCase_ = 0;
    private Object layout_;

    static {
        GetDenominationSelectionResponse getDenominationSelectionResponse = new GetDenominationSelectionResponse();
        DEFAULT_INSTANCE = getDenominationSelectionResponse;
        h.registerDefaultInstance(GetDenominationSelectionResponse.class, getDenominationSelectionResponse);
    }

    private GetDenominationSelectionResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"layout_", "layoutCase_", DenominationSelectionWithListAndSections.class});
        }
        if (iOrdinal == 3) {
            return new GetDenominationSelectionResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (GetDenominationSelectionResponse.class) {
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

    public final int n() {
        int i = this.layoutCase_;
        if (i != 0) {
            return i != 1 ? 0 : 1;
        }
        return 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final DenominationSelectionWithListAndSections o() {
        return this.layoutCase_ == 1 ? (DenominationSelectionWithListAndSections) this.layout_ : DenominationSelectionWithListAndSections.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
