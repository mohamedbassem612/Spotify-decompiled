package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.j4l;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ConsentCard extends h implements v2j0 {
    public static final int ACCEPT_BUTTON_FIELD_NUMBER = 4;
    private static final ConsentCard DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REJECT_BUTTON_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private Action acceptButton_;
    private int bitField0_;
    private Action rejectButton_;
    private int type_;
    private String title_ = "";
    private String description_ = "";

    static {
        ConsentCard consentCard = new ConsentCard();
        DEFAULT_INSTANCE = consentCard;
        h.registerDefaultInstance(ConsentCard.class, consentCard);
    }

    private ConsentCard() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "type_", "title_", "description_", "acceptButton_", "rejectButton_"});
        }
        if (iOrdinal == 3) {
            return new ConsentCard();
        }
        if (iOrdinal == 4) {
            return new j4l(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (ConsentCard.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
