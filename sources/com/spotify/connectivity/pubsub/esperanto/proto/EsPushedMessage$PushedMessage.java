package com.spotify.connectivity.pubsub.esperanto.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.h290;
import p.jf40;
import p.pqz;
import p.qng0;
import p.qnz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsPushedMessage$PushedMessage extends h implements v2j0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 3;
    private static final EsPushedMessage$PushedMessage DEFAULT_INSTANCE;
    public static final int IDENT_FIELD_NUMBER = 1;
    public static final int KEY_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PAYLOADS_FIELD_NUMBER = 2;
    private int bitField0_;
    private EsIdent$Ident ident_;
    private EsKey$Key key_;
    private qng0 attributes_ = qng0.b;
    private h290 payloads_ = h.emptyProtobufList();

    static {
        EsPushedMessage$PushedMessage esPushedMessage$PushedMessage = new EsPushedMessage$PushedMessage();
        DEFAULT_INSTANCE = esPushedMessage$PushedMessage;
        h.registerDefaultInstance(EsPushedMessage$PushedMessage.class, esPushedMessage$PushedMessage);
    }

    private EsPushedMessage$PushedMessage() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsPushedMessage$PushedMessage r(byte[] bArr) {
        return (EsPushedMessage$PushedMessage) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0001\u0000\u0001ဉ\u0000\u0002\u001c\u00032\u0004ဉ\u0001", new Object[]{"bitField0_", "ident_", "payloads_", "attributes_", pqz.a, "key_"});
        }
        if (iOrdinal == 3) {
            return new EsPushedMessage$PushedMessage();
        }
        if (iOrdinal == 4) {
            return new qnz(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (EsPushedMessage$PushedMessage.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final Map n() {
        return Collections.unmodifiableMap(this.attributes_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EsIdent$Ident o() {
        EsIdent$Ident esIdent$Ident = this.ident_;
        return esIdent$Ident == null ? EsIdent$Ident.n() : esIdent$Ident;
    }

    public final EsKey$Key p() {
        EsKey$Key esKey$Key = this.key_;
        return esKey$Key == null ? EsKey$Key.n() : esKey$Key;
    }

    public final h290 q() {
        return this.payloads_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
