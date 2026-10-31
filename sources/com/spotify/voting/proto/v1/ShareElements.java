package com.spotify.voting.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ek61;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ShareElements extends h implements v2j0 {
    private static final ShareElements DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_BUTTON_ACCESSIBILITY_ACTION_FIELD_NUMBER = 6;
    public static final int SHARE_BUTTON_ACCESSIBILITY_TEXT_FIELD_NUMBER = 5;
    public static final int SHARE_BUTTON_TEXT_FIELD_NUMBER = 4;
    public static final int SHARE_ELEMENTS_FIELD_NUMBER = 1;
    public static final int SHARE_MESSAGE_TEXT_FIELD_NUMBER = 3;
    public static final int SHARE_URI_FIELD_NUMBER = 2;
    private h290 shareElements_ = h.emptyProtobufList();
    private String shareUri_ = "";
    private String shareMessageText_ = "";
    private String shareButtonText_ = "";
    private String shareButtonAccessibilityText_ = "";
    private String shareButtonAccessibilityAction_ = "";

    static {
        ShareElements shareElements = new ShareElements();
        DEFAULT_INSTANCE = shareElements;
        h.registerDefaultInstance(ShareElements.class, shareElements);
    }

    private ShareElements() {
    }

    public static ShareElements n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"shareElements_", ShareElement.class, "shareUri_", "shareMessageText_", "shareButtonText_", "shareButtonAccessibilityText_", "shareButtonAccessibilityAction_"});
        }
        if (iOrdinal == 3) {
            return new ShareElements();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (ShareElements.class) {
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

    public final String o() {
        return this.shareButtonAccessibilityAction_;
    }

    public final String p() {
        return this.shareButtonAccessibilityText_;
    }

    public final String q() {
        return this.shareButtonText_;
    }

    public final h290 r() {
        return this.shareElements_;
    }

    public final String s() {
        return this.shareMessageText_;
    }

    public final String t() {
        return this.shareUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
