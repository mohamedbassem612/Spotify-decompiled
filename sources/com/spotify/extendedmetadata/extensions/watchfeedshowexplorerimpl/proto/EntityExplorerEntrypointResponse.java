package com.spotify.extendedmetadata.extensions.watchfeedshowexplorerimpl.proto;

import com.google.protobuf.h;
import com.spotify.watchfeedextensions.component.item.v1.EntityExplorerButtonComponent;
import com.spotify.watchfeedextensions.component.item.v1.EntityExplorerHeaderComponent;
import com.spotify.watchfeedextensions.component.item.v1.InlineEntityExplorerRowComponent;
import com.spotify.watchfeedextensions.component.item.v1.PlaylistExplorerButtonComponent;
import com.spotify.watchfeedextensions.component.item.v1.PlaylistExplorerCardComponent;
import p.bf40;
import p.c8x;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EntityExplorerEntrypointResponse extends h implements v2j0 {
    private static final EntityExplorerEntrypointResponse DEFAULT_INSTANCE;
    public static final int ENTITY_EXPLORER_BUTTON_FIELD_NUMBER = 3;
    public static final int ENTITY_EXPLORER_HEADER_FIELD_NUMBER = 4;
    public static final int INLINE_ENTITY_EXPLORER_ROW_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_EXPLORER_BUTTON_FIELD_NUMBER = 2;
    public static final int PLAYLIST_EXPLORER_CARD_FIELD_NUMBER = 1;
    private int payloadCase_ = 0;
    private Object payload_;

    static {
        EntityExplorerEntrypointResponse entityExplorerEntrypointResponse = new EntityExplorerEntrypointResponse();
        DEFAULT_INSTANCE = entityExplorerEntrypointResponse;
        h.registerDefaultInstance(EntityExplorerEntrypointResponse.class, entityExplorerEntrypointResponse);
    }

    private EntityExplorerEntrypointResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EntityExplorerEntrypointResponse x(byte[] bArr) {
        return (EntityExplorerEntrypointResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"payload_", "payloadCase_", PlaylistExplorerCardComponent.class, PlaylistExplorerButtonComponent.class, EntityExplorerButtonComponent.class, EntityExplorerHeaderComponent.class, InlineEntityExplorerRowComponent.class});
        }
        if (iOrdinal == 3) {
            return new EntityExplorerEntrypointResponse();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (EntityExplorerEntrypointResponse.class) {
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

    public final EntityExplorerButtonComponent n() {
        return this.payloadCase_ == 3 ? (EntityExplorerButtonComponent) this.payload_ : EntityExplorerButtonComponent.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EntityExplorerHeaderComponent o() {
        return this.payloadCase_ == 4 ? (EntityExplorerHeaderComponent) this.payload_ : EntityExplorerHeaderComponent.n();
    }

    public final InlineEntityExplorerRowComponent p() {
        return this.payloadCase_ == 5 ? (InlineEntityExplorerRowComponent) this.payload_ : InlineEntityExplorerRowComponent.o();
    }

    public final PlaylistExplorerButtonComponent q() {
        return this.payloadCase_ == 2 ? (PlaylistExplorerButtonComponent) this.payload_ : PlaylistExplorerButtonComponent.o();
    }

    public final PlaylistExplorerCardComponent r() {
        return this.payloadCase_ == 1 ? (PlaylistExplorerCardComponent) this.payload_ : PlaylistExplorerCardComponent.o();
    }

    public final boolean s() {
        return this.payloadCase_ == 3;
    }

    public final boolean t() {
        return this.payloadCase_ == 4;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.payloadCase_ == 5;
    }

    public final boolean v() {
        return this.payloadCase_ == 2;
    }

    public final boolean w() {
        return this.payloadCase_ == 1;
    }
}
