package com.spotify.mdata.cosmos.proto;

import com.google.protobuf.h;
import p.ac90;
import p.bf40;
import p.h290;
import p.hz00;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class InvalidateCacheRequest extends h implements v2j0 {
    private static final InvalidateCacheRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    public static final int EXTENSION_KIND_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 entityUri_ = h.emptyProtobufList();
    private int extensionKind_;

    static {
        InvalidateCacheRequest invalidateCacheRequest = new InvalidateCacheRequest();
        DEFAULT_INSTANCE = invalidateCacheRequest;
        h.registerDefaultInstance(InvalidateCacheRequest.class, invalidateCacheRequest);
    }

    private InvalidateCacheRequest() {
    }

    public static ac90 p() {
        return (ac90) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002Ț", new Object[]{"extensionKind_", "entityUri_"});
        }
        if (iOrdinal == 3) {
            return new InvalidateCacheRequest();
        }
        if (iOrdinal == 4) {
            return new ac90(DEFAULT_INSTANCE);
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
        synchronized (InvalidateCacheRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.entityUri_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.entityUri_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        h290 h290VarMutableCopy = this.entityUri_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.entityUri_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void setExtensionKind(hz00 hz00Var) {
        this.extensionKind_ = hz00Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
