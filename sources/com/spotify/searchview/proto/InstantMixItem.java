package com.spotify.searchview.proto;

import p.bf40;
import p.h780;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class InstantMixItem extends com.google.protobuf.h implements v2j0 {
    private static final InstantMixItem DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 1;
    public static final int MESSAGEID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SESSIONID_FIELD_NUMBER = 2;
    private int bitField0_;
    private Entity entity_;
    private String sessionId_ = "";
    private String messageId_ = "";

    static {
        InstantMixItem instantMixItem = new InstantMixItem();
        DEFAULT_INSTANCE = instantMixItem;
        com.google.protobuf.h.registerDefaultInstance(InstantMixItem.class, instantMixItem);
    }

    private InstantMixItem() {
    }

    public static InstantMixItem n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"bitField0_", "entity_", "sessionId_", "messageId_"});
        }
        if (iOrdinal == 3) {
            return new InstantMixItem();
        }
        if (iOrdinal == 4) {
            return new h780(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (InstantMixItem.class) {
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

    public final String getMessageId() {
        return this.messageId_;
    }

    public final String getSessionId() {
        return this.sessionId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Entity o() {
        Entity entity = this.entity_;
        return entity == null ? Entity.u() : entity;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
