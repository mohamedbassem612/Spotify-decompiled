package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.fin0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class NotInterestedOption extends h implements v2j0 {
    private static final NotInterestedOption DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_MESSAGE_FIELD_NUMBER = 4;
    public static final int TARGET_URIS_FIELD_NUMBER = 3;
    public static final int UBI_IDENTIFIER_FIELD_NUMBER = 2;
    private String message_ = "";
    private String ubiIdentifier_ = "";
    private h290 targetUris_ = h.emptyProtobufList();
    private String successMessage_ = "";

    static {
        NotInterestedOption notInterestedOption = new NotInterestedOption();
        DEFAULT_INSTANCE = notInterestedOption;
        h.registerDefaultInstance(NotInterestedOption.class, notInterestedOption);
    }

    private NotInterestedOption() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"message_", "ubiIdentifier_", "targetUris_", "successMessage_"});
        }
        if (iOrdinal == 3) {
            return new NotInterestedOption();
        }
        if (iOrdinal == 4) {
            return new fin0(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (NotInterestedOption.class) {
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
