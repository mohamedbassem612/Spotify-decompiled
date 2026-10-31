package com.spotify.automix.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass;
import com.spotify.automix.proto.TransitionOuterClass$VolumeStyleCurves;
import p.bf40;
import p.h290;
import p.jf40;
import p.jlz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAutomix$GetVolumeStylesForVolumeStyleIdResponse extends h implements v2j0 {
    private static final EsAutomix$GetVolumeStylesForVolumeStyleIdResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_SEMANTICS_FIELD_NUMBER = 2;
    public static final int VOLUME_STYLES_FIELD_NUMBER = 1;
    private h290 volumeStyles_ = h.emptyProtobufList();
    private h290 valueSemantics_ = h.emptyProtobufList();

    static {
        EsAutomix$GetVolumeStylesForVolumeStyleIdResponse esAutomix$GetVolumeStylesForVolumeStyleIdResponse = new EsAutomix$GetVolumeStylesForVolumeStyleIdResponse();
        DEFAULT_INSTANCE = esAutomix$GetVolumeStylesForVolumeStyleIdResponse;
        h.registerDefaultInstance(EsAutomix$GetVolumeStylesForVolumeStyleIdResponse.class, esAutomix$GetVolumeStylesForVolumeStyleIdResponse);
    }

    private EsAutomix$GetVolumeStylesForVolumeStyleIdResponse() {
    }

    public static EsAutomix$GetVolumeStylesForVolumeStyleIdResponse p(byte[] bArr) {
        return (EsAutomix$GetVolumeStylesForVolumeStyleIdResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"volumeStyles_", TransitionOuterClass$VolumeStyleCurves.class, "valueSemantics_", AutomationValueSemanticsOuterClass.AutomationValueSemantics.class});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$GetVolumeStylesForVolumeStyleIdResponse();
        }
        if (iOrdinal == 4) {
            return new jlz(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (EsAutomix$GetVolumeStylesForVolumeStyleIdResponse.class) {
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
        return this.valueSemantics_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.volumeStyles_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
