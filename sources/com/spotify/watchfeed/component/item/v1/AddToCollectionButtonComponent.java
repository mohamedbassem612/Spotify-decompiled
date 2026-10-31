package com.spotify.watchfeed.component.item.v1;

import p.bf40;
import p.dw0;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class AddToCollectionButtonComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_ADDED_TEXT_FIELD_NUMBER = 3;
    public static final int ACCESSIBILITY_NOT_ADDED_TEXT_FIELD_NUMBER = 2;
    private static final AddToCollectionButtonComponent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_URI_OVERRIDE_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";
    private String accessibilityNotAddedText_ = "";
    private String accessibilityAddedText_ = "";
    private String playlistUriOverride_ = "";

    static {
        AddToCollectionButtonComponent addToCollectionButtonComponent = new AddToCollectionButtonComponent();
        DEFAULT_INSTANCE = addToCollectionButtonComponent;
        com.google.protobuf.h.registerDefaultInstance(AddToCollectionButtonComponent.class, addToCollectionButtonComponent);
    }

    private AddToCollectionButtonComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static AddToCollectionButtonComponent q(phc phcVar) {
        return (AddToCollectionButtonComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"uri_", "accessibilityNotAddedText_", "accessibilityAddedText_", "playlistUriOverride_"});
        }
        if (iOrdinal == 3) {
            return new AddToCollectionButtonComponent();
        }
        if (iOrdinal == 4) {
            return new dw0(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (AddToCollectionButtonComponent.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final String n() {
        return this.accessibilityAddedText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.accessibilityNotAddedText_;
    }

    public final String p() {
        return this.playlistUriOverride_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
