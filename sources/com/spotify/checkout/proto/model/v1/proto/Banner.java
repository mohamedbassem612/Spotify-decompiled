package com.spotify.checkout.proto.model.v1.proto;

import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.u4a;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class Banner extends com.google.protobuf.h implements v2j0 {
    public static final int COLORSET_FIELD_NUMBER = 2;
    private static final Banner DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int MESSAGES_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String header_ = "";
    private String colorSet_ = "";
    private h290 messages_ = com.google.protobuf.h.emptyProtobufList();

    static {
        Banner banner = new Banner();
        DEFAULT_INSTANCE = banner;
        com.google.protobuf.h.registerDefaultInstance(Banner.class, banner);
    }

    private Banner() {
    }

    public static Banner o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static u4a q() {
        return (u4a) DEFAULT_INSTANCE.createBuilder();
    }

    public final void addAllMessages(Iterable iterable) {
        h290 h290VarMutableCopy = this.messages_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.messages_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ለ\u0000\u0002Ȉ\u0003Ț", new Object[]{"bitField0_", "header_", "colorSet_", "messages_"});
        }
        if (iOrdinal == 3) {
            return new Banner();
        }
        if (iOrdinal == 4) {
            return new u4a(DEFAULT_INSTANCE);
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
        synchronized (Banner.class) {
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

    public final List getMessagesList() {
        return this.messages_;
    }

    public final String n() {
        return this.colorSet_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.header_;
    }

    public final void r() {
        this.colorSet_ = "positive";
    }

    public final void s() {
        this.bitField0_ |= 1;
        this.header_ = "Banner header";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
