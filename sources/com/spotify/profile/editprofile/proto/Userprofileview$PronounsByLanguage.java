package com.spotify.profile.editprofile.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Userprofileview$PronounsByLanguage extends h implements v2j0 {
    private static final Userprofileview$PronounsByLanguage DEFAULT_INSTANCE;
    public static final int LANGUAGE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PRONOUNS_FIELD_NUMBER = 2;
    private String language_ = "";
    private h290 pronouns_ = h.emptyProtobufList();

    static {
        Userprofileview$PronounsByLanguage userprofileview$PronounsByLanguage = new Userprofileview$PronounsByLanguage();
        DEFAULT_INSTANCE = userprofileview$PronounsByLanguage;
        h.registerDefaultInstance(Userprofileview$PronounsByLanguage.class, userprofileview$PronounsByLanguage);
    }

    private Userprofileview$PronounsByLanguage() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"language_", "pronouns_"});
        }
        if (iOrdinal == 3) {
            return new Userprofileview$PronounsByLanguage();
        }
        if (iOrdinal == 4) {
            return new s8i1(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (Userprofileview$PronounsByLanguage.class) {
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

    public final String getLanguage() {
        return this.language_;
    }

    public final h290 n() {
        return this.pronouns_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
