package com.spotify.automix.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass;
import com.spotify.automix.proto.TransitionOuterClass$FilterFxStyleCurves;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAutomix$GetFilterFxStylesForFilterFxStyleIdResponse extends h implements v2j0 {
    private static final EsAutomix$GetFilterFxStylesForFilterFxStyleIdResponse DEFAULT_INSTANCE;
    public static final int FILTER_FX_STYLES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_SEMANTICS_FIELD_NUMBER = 2;
    private h290 filterFxStyles_ = h.emptyProtobufList();
    private h290 valueSemantics_ = h.emptyProtobufList();

    static {
        EsAutomix$GetFilterFxStylesForFilterFxStyleIdResponse esAutomix$GetFilterFxStylesForFilterFxStyleIdResponse = new EsAutomix$GetFilterFxStylesForFilterFxStyleIdResponse();
        DEFAULT_INSTANCE = esAutomix$GetFilterFxStylesForFilterFxStyleIdResponse;
        h.registerDefaultInstance(EsAutomix$GetFilterFxStylesForFilterFxStyleIdResponse.class, esAutomix$GetFilterFxStylesForFilterFxStyleIdResponse);
    }

    private EsAutomix$GetFilterFxStylesForFilterFxStyleIdResponse() {
    }

    public static EsAutomix$GetFilterFxStylesForFilterFxStyleIdResponse p(byte[] bArr) {
        return (EsAutomix$GetFilterFxStylesForFilterFxStyleIdResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"filterFxStyles_", TransitionOuterClass$FilterFxStyleCurves.class, "valueSemantics_", AutomationValueSemanticsOuterClass.AutomationValueSemantics.class});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$GetFilterFxStylesForFilterFxStyleIdResponse();
        }
        if (iOrdinal == 4) {
            return new rdz(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (EsAutomix$GetFilterFxStylesForFilterFxStyleIdResponse.class) {
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

    public final h290 n() {
        return this.filterFxStyles_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.valueSemantics_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
