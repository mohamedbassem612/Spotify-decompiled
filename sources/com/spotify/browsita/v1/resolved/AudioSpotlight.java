package com.spotify.browsita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.hw7;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AudioSpotlight extends h implements v2j0 {
    public static final int AD_METADATA_FIELD_NUMBER = 3;
    private static final AudioSpotlight DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEM_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_ENTITY_URI_FIELD_NUMBER = 4;
    private EmbeddedAdMetadata adMetadata_;
    private int bitField0_;
    private Heading heading_;
    private Item item_;
    private String previewEntityUri_ = "";

    static {
        AudioSpotlight audioSpotlight = new AudioSpotlight();
        DEFAULT_INSTANCE = audioSpotlight;
        h.registerDefaultInstance(AudioSpotlight.class, audioSpotlight);
    }

    private AudioSpotlight() {
    }

    public static AudioSpotlight o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ", new Object[]{"bitField0_", "heading_", "item_", "adMetadata_", "previewEntityUri_"});
        }
        if (iOrdinal == 3) {
            return new AudioSpotlight();
        }
        if (iOrdinal == 4) {
            return new hw7(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (AudioSpotlight.class) {
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

    public final EmbeddedAdMetadata n() {
        EmbeddedAdMetadata embeddedAdMetadata = this.adMetadata_;
        return embeddedAdMetadata == null ? EmbeddedAdMetadata.o() : embeddedAdMetadata;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Heading p() {
        Heading heading = this.heading_;
        return heading == null ? Heading.n() : heading;
    }

    public final Item q() {
        Item item = this.item_;
        return item == null ? Item.n() : item;
    }

    public final String r() {
        return this.previewEntityUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
