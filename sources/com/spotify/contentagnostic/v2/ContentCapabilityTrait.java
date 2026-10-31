package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.j4l;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ContentCapabilityTrait extends h implements v2j0 {
    private static final ContentCapabilityTrait DEFAULT_INSTANCE;
    public static final int DOWNLOADABILITY_FIELD_NUMBER = 2;
    public static final int LAYERABILITY_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int RATEABILITY_FIELD_NUMBER = 1;
    public static final int RECORDABILITY_FIELD_NUMBER = 3;
    public static final int WATCHABILITY_FIELD_NUMBER = 4;
    private int bitField0_;
    private Capability downloadability_;
    private Capability layerability_;
    private Capability rateability_;
    private Capability recordability_;
    private Capability watchability_;

    static {
        ContentCapabilityTrait contentCapabilityTrait = new ContentCapabilityTrait();
        DEFAULT_INSTANCE = contentCapabilityTrait;
        h.registerDefaultInstance(ContentCapabilityTrait.class, contentCapabilityTrait);
    }

    private ContentCapabilityTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ContentCapabilityTrait s(byte[] bArr) {
        return (ContentCapabilityTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0004", new Object[]{"bitField0_", "rateability_", "downloadability_", "recordability_", "watchability_", "layerability_"});
        }
        if (iOrdinal == 3) {
            return new ContentCapabilityTrait();
        }
        if (iOrdinal == 4) {
            return new j4l(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (ContentCapabilityTrait.class) {
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

    public final Capability n() {
        Capability capability = this.downloadability_;
        return capability == null ? Capability.n() : capability;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Capability o() {
        Capability capability = this.layerability_;
        return capability == null ? Capability.n() : capability;
    }

    public final Capability p() {
        Capability capability = this.rateability_;
        return capability == null ? Capability.n() : capability;
    }

    public final Capability q() {
        Capability capability = this.recordability_;
        return capability == null ? Capability.n() : capability;
    }

    public final Capability r() {
        Capability capability = this.watchability_;
        return capability == null ? Capability.n() : capability;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
