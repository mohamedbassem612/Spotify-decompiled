package com.spotify.prefetch_esperanto.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.eoz;
import p.er80;
import p.i9;
import p.ioz;
import p.jf40;
import p.loz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uic;
import p.ulc;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsMediaPrefetch$SegmentProfileSelectionConfig extends h implements v2j0 {
    private static final EsMediaPrefetch$SegmentProfileSelectionConfig DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SUPPORTED_ENCRYPTION_SCHEMES_FIELD_NUMBER = 1;
    public static final int SUPPORTED_VIDEO_CODECS_FIELD_NUMBER = 2;
    public static final int VIDEO_CODECS_ARE_PRIORITY_ORDERED_FIELD_NUMBER = 3;
    private static final c290 supportedEncryptionSchemes_converter_ = new uic((byte) 9);
    private static final c290 supportedVideoCodecs_converter_ = new ulc((byte) 9);
    private int supportedEncryptionSchemesMemoizedSerializedSize;
    private int supportedVideoCodecsMemoizedSerializedSize;
    private boolean videoCodecsArePriorityOrdered_;
    private b290 supportedEncryptionSchemes_ = h.emptyIntList();
    private b290 supportedVideoCodecs_ = h.emptyIntList();

    static {
        EsMediaPrefetch$SegmentProfileSelectionConfig esMediaPrefetch$SegmentProfileSelectionConfig = new EsMediaPrefetch$SegmentProfileSelectionConfig();
        DEFAULT_INSTANCE = esMediaPrefetch$SegmentProfileSelectionConfig;
        h.registerDefaultInstance(EsMediaPrefetch$SegmentProfileSelectionConfig.class, esMediaPrefetch$SegmentProfileSelectionConfig);
    }

    private EsMediaPrefetch$SegmentProfileSelectionConfig() {
    }

    public static ioz p() {
        return (ioz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001,\u0002,\u0003\u0007", new Object[]{"supportedEncryptionSchemes_", "supportedVideoCodecs_", "videoCodecsArePriorityOrdered_"});
        }
        if (iOrdinal == 3) {
            return new EsMediaPrefetch$SegmentProfileSelectionConfig();
        }
        if (iOrdinal == 4) {
            return new ioz(DEFAULT_INSTANCE);
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
        synchronized (EsMediaPrefetch$SegmentProfileSelectionConfig.class) {
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

    public final void n(eoz eozVar) {
        b290 b290VarMutableCopy = this.supportedEncryptionSchemes_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.supportedEncryptionSchemes_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(eozVar.getNumber());
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(loz lozVar) {
        b290 b290VarMutableCopy = this.supportedVideoCodecs_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.supportedVideoCodecs_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(lozVar.getNumber());
    }

    public final void q(boolean z) {
        this.videoCodecsArePriorityOrdered_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
