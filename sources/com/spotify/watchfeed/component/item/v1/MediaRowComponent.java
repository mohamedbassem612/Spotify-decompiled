package com.spotify.watchfeed.component.item.v1;

import com.spotify.watchfeed.component.model.v1.proto.MediaItem;
import p.bf40;
import p.eog0;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MediaRowComponent extends com.google.protobuf.h implements v2j0 {
    private static final MediaRowComponent DEFAULT_INSTANCE;
    public static final int MEDIA_ITEMS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 mediaItems_ = com.google.protobuf.h.emptyProtobufList();

    static {
        MediaRowComponent mediaRowComponent = new MediaRowComponent();
        DEFAULT_INSTANCE = mediaRowComponent;
        com.google.protobuf.h.registerDefaultInstance(MediaRowComponent.class, mediaRowComponent);
    }

    private MediaRowComponent() {
    }

    public static MediaRowComponent o(phc phcVar) {
        return (MediaRowComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"mediaItems_", MediaItem.class});
        }
        if (iOrdinal == 3) {
            return new MediaRowComponent();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (MediaRowComponent.class) {
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
        return this.mediaItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
