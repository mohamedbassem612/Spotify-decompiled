package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uca;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class BasicModal extends h implements v2j0 {
    public static final int ACCESSORYCONTENT_FIELD_NUMBER = 1;
    public static final int BODY_TEXT_FIELD_NUMBER = 3;
    private static final BasicModal DEFAULT_INSTANCE;
    public static final int HEADLINE_TEXT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private AccessoryContent accessoryContent_;
    private int bitField0_;
    private String headlineText_ = "";
    private String bodyText_ = "";

    static {
        BasicModal basicModal = new BasicModal();
        DEFAULT_INSTANCE = basicModal;
        h.registerDefaultInstance(BasicModal.class, basicModal);
    }

    private BasicModal() {
    }

    public static BasicModal p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"bitField0_", "accessoryContent_", "headlineText_", "bodyText_"});
        }
        if (iOrdinal == 3) {
            return new BasicModal();
        }
        if (iOrdinal == 4) {
            return new uca(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (BasicModal.class) {
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

    public final AccessoryContent n() {
        AccessoryContent accessoryContent = this.accessoryContent_;
        return accessoryContent == null ? AccessoryContent.p() : accessoryContent;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.bodyText_;
    }

    public final String q() {
        return this.headlineText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
