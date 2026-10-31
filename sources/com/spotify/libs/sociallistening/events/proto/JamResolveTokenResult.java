package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.a1a0;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class JamResolveTokenResult extends h implements v2j0 {
    public static final int CORRELATION_ID_FIELD_NUMBER = 4;
    private static final JamResolveTokenResult DEFAULT_INSTANCE;
    public static final int DISCOVERY_METHODS_FIELD_NUMBER = 2;
    public static final int ERROR_CATEGORY_FIELD_NUMBER = 6;
    public static final int ERROR_DATA_FIELD_NUMBER = 5;
    public static final int JOIN_TOKEN_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TOKENS_FIELD_NUMBER = 1;
    private int bitField0_;
    private h290 tokens_ = h.emptyProtobufList();
    private h290 discoveryMethods_ = h.emptyProtobufList();
    private String joinToken_ = "";
    private String correlationId_ = "";
    private String errorData_ = "";
    private String errorCategory_ = "";

    static {
        JamResolveTokenResult jamResolveTokenResult = new JamResolveTokenResult();
        DEFAULT_INSTANCE = jamResolveTokenResult;
        h.registerDefaultInstance(JamResolveTokenResult.class, jamResolveTokenResult);
    }

    private JamResolveTokenResult() {
    }

    public static a1a0 p() {
        return (a1a0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u001a\u0002\u001a\u0003ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဈ\u0003", new Object[]{"bitField0_", "tokens_", "discoveryMethods_", "joinToken_", "correlationId_", "errorData_", "errorCategory_"});
        }
        if (iOrdinal == 3) {
            return new JamResolveTokenResult();
        }
        if (iOrdinal == 4) {
            return new a1a0(DEFAULT_INSTANCE);
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
        synchronized (JamResolveTokenResult.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.discoveryMethods_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.discoveryMethods_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.tokens_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.tokens_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.correlationId_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 8;
        this.errorCategory_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 4;
        this.errorData_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.joinToken_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
