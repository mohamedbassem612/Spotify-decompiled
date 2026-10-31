package com.spotify.idj.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.ljj0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class MicPermissionPageResponse extends h implements v2j0 {
    public static final int BODY_SECTIONS_FIELD_NUMBER = 3;
    public static final int CANCEL_BUTTON_LOCALIZED_TEXT_FIELD_NUMBER = 5;
    public static final int CONFIRM_BUTTON_LOCALIZED_TEXT_FIELD_NUMBER = 4;
    public static final int CONTENT_TITLE_LOCALIZED_TEXT_FIELD_NUMBER = 2;
    private static final MicPermissionPageResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TOP_IMAGE_URI_FIELD_NUMBER = 1;
    private String topImageUri_ = "";
    private String contentTitleLocalizedText_ = "";
    private h290 bodySections_ = h.emptyProtobufList();
    private String confirmButtonLocalizedText_ = "";
    private String cancelButtonLocalizedText_ = "";

    static {
        MicPermissionPageResponse micPermissionPageResponse = new MicPermissionPageResponse();
        DEFAULT_INSTANCE = micPermissionPageResponse;
        h.registerDefaultInstance(MicPermissionPageResponse.class, micPermissionPageResponse);
    }

    private MicPermissionPageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005Ȉ", new Object[]{"topImageUri_", "contentTitleLocalizedText_", "bodySections_", BodySection.class, "confirmButtonLocalizedText_", "cancelButtonLocalizedText_"});
        }
        if (iOrdinal == 3) {
            return new MicPermissionPageResponse();
        }
        if (iOrdinal == 4) {
            return new ljj0(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (MicPermissionPageResponse.class) {
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
        return this.bodySections_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.cancelButtonLocalizedText_;
    }

    public final String p() {
        return this.confirmButtonLocalizedText_;
    }

    public final String q() {
        return this.contentTitleLocalizedText_;
    }

    public final String r() {
        return this.topImageUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
