package com.spotify.extendedmetadata.extensions.listmetadataimpl;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.ejb;
import p.fjb;
import p.ir40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class GrantableLevelsProto extends h implements v2j0 {
    public static final int BASE_FIELD_NUMBER = 1;
    private static final GrantableLevelsProto DEFAULT_INSTANCE;
    public static final int MEMBER_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private static final c290 base_converter_ = new ejb((byte) 12);
    private static final c290 member_converter_ = new fjb((byte) 12);
    private int baseMemoizedSerializedSize;
    private int memberMemoizedSerializedSize;
    private b290 base_ = h.emptyIntList();
    private b290 member_ = h.emptyIntList();

    static {
        GrantableLevelsProto grantableLevelsProto = new GrantableLevelsProto();
        DEFAULT_INSTANCE = grantableLevelsProto;
        h.registerDefaultInstance(GrantableLevelsProto.class, grantableLevelsProto);
    }

    private GrantableLevelsProto() {
    }

    public static GrantableLevelsProto p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002,", new Object[]{"base_", "member_"});
        }
        if (iOrdinal == 3) {
            return new GrantableLevelsProto();
        }
        if (iOrdinal == 4) {
            return new ir40((byte) 18);
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
        synchronized (GrantableLevelsProto.class) {
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final d290 o() {
        return new d290(this.base_, base_converter_);
    }

    public final d290 q() {
        return new d290(this.member_, member_converter_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
