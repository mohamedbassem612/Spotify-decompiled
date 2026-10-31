package com.spotify.lexicon.dj.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.p2o;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class DJPersona extends h implements v2j0 {
    private static final DJPersona DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static final int INTERACTIVITY_JUMP_FIELD_NUMBER = 6;
    public static final int INTERACTIVITY_TITLE_FIELD_NUMBER = 5;
    public static final int LANGUAGE_NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PERSONA_ID_FIELD_NUMBER = 4;
    public static final int PERSONA_NAME_FIELD_NUMBER = 3;
    public static final int SWITCH_TO_LABEL_FIELD_NUMBER = 8;
    public static final int UP_NEXT_DESCRIPTION_FIELD_NUMBER = 7;
    private String displayName_ = "";
    private String languageName_ = "";
    private String personaName_ = "";
    private String personaId_ = "";
    private String interactivityTitle_ = "";
    private String interactivityJump_ = "";
    private String upNextDescription_ = "";
    private String switchToLabel_ = "";

    static {
        DJPersona dJPersona = new DJPersona();
        DEFAULT_INSTANCE = dJPersona;
        h.registerDefaultInstance(DJPersona.class, dJPersona);
    }

    private DJPersona() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"displayName_", "languageName_", "personaName_", "personaId_", "interactivityTitle_", "interactivityJump_", "upNextDescription_", "switchToLabel_"});
        }
        if (iOrdinal == 3) {
            return new DJPersona();
        }
        if (iOrdinal == 4) {
            return new p2o(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (DJPersona.class) {
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
        return this.interactivityJump_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.interactivityTitle_;
    }

    public final String p() {
        return this.languageName_;
    }

    public final String q() {
        return this.personaId_;
    }

    public final String r() {
        return this.personaName_;
    }

    public final String s() {
        return this.switchToLabel_;
    }

    public final String t() {
        return this.upNextDescription_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
