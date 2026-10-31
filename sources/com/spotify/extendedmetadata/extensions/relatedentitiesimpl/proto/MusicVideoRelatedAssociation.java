package com.spotify.extendedmetadata.extensions.relatedentitiesimpl.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.jf40;
import p.ljj0;
import p.pvc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class MusicVideoRelatedAssociation extends h implements v2j0 {
    private static final MusicVideoRelatedAssociation DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RELATION_METADATA_FIELD_NUMBER = 2;
    private static final c290 relationMetadata_converter_ = new pvc((byte) 16);
    private int relationMetadataMemoizedSerializedSize;
    private b290 relationMetadata_ = h.emptyIntList();

    static {
        MusicVideoRelatedAssociation musicVideoRelatedAssociation = new MusicVideoRelatedAssociation();
        DEFAULT_INSTANCE = musicVideoRelatedAssociation;
        h.registerDefaultInstance(MusicVideoRelatedAssociation.class, musicVideoRelatedAssociation);
    }

    private MusicVideoRelatedAssociation() {
    }

    public static MusicVideoRelatedAssociation n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002,", new Object[]{"relationMetadata_"});
        }
        if (iOrdinal == 3) {
            return new MusicVideoRelatedAssociation();
        }
        if (iOrdinal == 4) {
            return new ljj0(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (MusicVideoRelatedAssociation.class) {
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

    public final d290 o() {
        return new d290(this.relationMetadata_, relationMetadata_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
