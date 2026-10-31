package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jf8;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AvailablePersona extends h implements v2j0 {
    private static final AvailablePersona DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int LANGUAGE_TAG_FIELD_NUMBER = 3;
    public static final int LOCALE_TAG_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PERSONA_ID_FIELD_NUMBER = 1;
    public static final int PREVIEW_URL_FIELD_NUMBER = 5;
    private int bitField0_;
    private String personaId_ = "";
    private String displayName_ = "";
    private String languageTag_ = "";
    private String localeTag_ = "";
    private String previewUrl_ = "";

    static {
        AvailablePersona availablePersona = new AvailablePersona();
        DEFAULT_INSTANCE = availablePersona;
        h.registerDefaultInstance(AvailablePersona.class, availablePersona);
    }

    private AvailablePersona() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ለ\u0000", new Object[]{"bitField0_", "personaId_", "displayName_", "languageTag_", "localeTag_", "previewUrl_"});
        }
        if (iOrdinal == 3) {
            return new AvailablePersona();
        }
        if (iOrdinal == 4) {
            return new jf8(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (AvailablePersona.class) {
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

    public final String getDisplayName() {
        return this.displayName_;
    }

    public final String n() {
        return this.languageTag_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.localeTag_;
    }

    public final String p() {
        return this.personaId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
