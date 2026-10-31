package com.spotify.musicquizservice.v1;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdh1;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class LocalizedString extends com.google.protobuf.h implements v2j0 {
    private static final LocalizedString DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int key_;
    private String value_ = "";

    static {
        LocalizedString localizedString = new LocalizedString();
        DEFAULT_INSTANCE = localizedString;
        com.google.protobuf.h.registerDefaultInstance(LocalizedString.class, localizedString);
    }

    private LocalizedString() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"key_", "value_"});
        }
        if (iOrdinal == 3) {
            return new LocalizedString();
        }
        if (iOrdinal == 4) {
            return new uid0(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (LocalizedString.class) {
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

    public final String getValue() {
        return this.value_;
    }

    public final rdh1 n() {
        rdh1 rdh1Var;
        switch (this.key_) {
            case 0:
                rdh1Var = rdh1.UI_STRING_KEY_UNSPECIFIED;
                break;
            case 1:
                rdh1Var = rdh1.PREHEADLINE;
                break;
            case 2:
                rdh1Var = rdh1.HEADLINE;
                break;
            case 3:
                rdh1Var = rdh1.TITLE;
                break;
            case 4:
                rdh1Var = rdh1.PRIMARY_BUTTON;
                break;
            case 5:
                rdh1Var = rdh1.EXPLANATION_TEXT;
                break;
            case 6:
                rdh1Var = rdh1.MARKER;
                break;
            case 7:
                rdh1Var = rdh1.SUB_MARKER;
                break;
            case 8:
                rdh1Var = rdh1.SOURCES;
                break;
            case 9:
                rdh1Var = rdh1.OTHER;
                break;
            case 10:
                rdh1Var = rdh1.POSITIVE_MESSAGE;
                break;
            case 11:
                rdh1Var = rdh1.NEGATIVE_MESSAGE;
                break;
            case 12:
                rdh1Var = rdh1.COMPLETION_BUTTON;
                break;
            case 13:
                rdh1Var = rdh1.SECONDARY_BUTTON;
                break;
            case 14:
                rdh1Var = rdh1.ROUND_NAME;
                break;
            case 15:
                rdh1Var = rdh1.COMPLETION_TIME_LABEL;
                break;
            case 16:
                rdh1Var = rdh1.SHARE_TEXT;
                break;
            default:
                rdh1Var = null;
                break;
        }
        return rdh1Var == null ? rdh1.UNRECOGNIZED : rdh1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
