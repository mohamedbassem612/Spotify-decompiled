package com.spotify.watchfeed.component.item.v1.proto;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class GenericContextMenuButtonComponent extends h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 6;
    private static final GenericContextMenuButtonComponent DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    public static final int ITEMS_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String entityUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String imageUrl_ = "";
    private h290 items_ = h.emptyProtobufList();
    private String accessibilityText_ = "";

    static {
        GenericContextMenuButtonComponent genericContextMenuButtonComponent = new GenericContextMenuButtonComponent();
        DEFAULT_INSTANCE = genericContextMenuButtonComponent;
        h.registerDefaultInstance(GenericContextMenuButtonComponent.class, genericContextMenuButtonComponent);
    }

    private GenericContextMenuButtonComponent() {
    }

    public static GenericContextMenuButtonComponent o(phc phcVar) {
        return (GenericContextMenuButtonComponent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u001b\u0006Ȉ", new Object[]{"entityUri_", "title_", "subtitle_", "imageUrl_", "items_", Any.class, "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new GenericContextMenuButtonComponent();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (GenericContextMenuButtonComponent.class) {
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

    public final String getEntityUri() {
        return this.entityUri_;
    }

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final List getItemsList() {
        return this.items_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
