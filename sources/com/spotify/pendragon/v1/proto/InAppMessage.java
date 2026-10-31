package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.d6j0;
import p.h290;
import p.jf40;
import p.np70;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class InAppMessage extends h implements v2j0 {
    public static final int CAPPING_FIELD_NUMBER = 5;
    public static final int CONTROL_FIELD_NUMBER = 6;
    public static final int CREATIVE_FIELD_NUMBER = 4;
    private static final InAppMessage DEFAULT_INSTANCE;
    public static final int END_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    public static final int MESSAGE_TYPE_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int TRIGGERS_FIELD_NUMBER = 7;
    public static final int UUID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Capping capping_;
    private boolean control_;
    private MessageCreative creative_;
    private long endTimestamp_;
    private long messageId_;
    private int messageType_;
    private String uuid_ = "";
    private h290 triggers_ = h.emptyProtobufList();

    static {
        InAppMessage inAppMessage = new InAppMessage();
        DEFAULT_INSTANCE = inAppMessage;
        h.registerDefaultInstance(InAppMessage.class, inAppMessage);
    }

    private InAppMessage() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static InAppMessage q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003ဂ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006\u0007\u0007\u001b\b\f", new Object[]{"bitField0_", "uuid_", "messageId_", "endTimestamp_", "creative_", "capping_", "control_", "triggers_", Trigger.class, "messageType_"});
        }
        if (iOrdinal == 3) {
            return new InAppMessage();
        }
        if (iOrdinal == 4) {
            return new np70((byte) 28);
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
        synchronized (InAppMessage.class) {
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

    public final Capping o() {
        Capping capping = this.capping_;
        return capping == null ? Capping.o() : capping;
    }

    public final MessageCreative p() {
        MessageCreative messageCreative = this.creative_;
        return messageCreative == null ? MessageCreative.r() : messageCreative;
    }

    public final long r() {
        return this.endTimestamp_;
    }

    public final long s() {
        return this.messageId_;
    }

    public final d6j0 t() {
        d6j0 d6j0Var;
        int i = this.messageType_;
        if (i != 0) {
            d6j0Var = i != 1 ? null : d6j0.TRANSACTIONAL;
        } else {
            d6j0Var = d6j0.MARKETING;
        }
        return d6j0Var == null ? d6j0.UNRECOGNIZED : d6j0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 u() {
        return this.triggers_;
    }

    public final String v() {
        return this.uuid_;
    }
}
