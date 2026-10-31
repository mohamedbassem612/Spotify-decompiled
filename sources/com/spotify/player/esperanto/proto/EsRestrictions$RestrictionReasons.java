package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.zqz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsRestrictions$RestrictionReasons extends h implements v2j0 {
    private static final EsRestrictions$RestrictionReasons DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REASONS_FIELD_NUMBER = 1;
    private h290 reasons_ = h.emptyProtobufList();

    static {
        EsRestrictions$RestrictionReasons esRestrictions$RestrictionReasons = new EsRestrictions$RestrictionReasons();
        DEFAULT_INSTANCE = esRestrictions$RestrictionReasons;
        h.registerDefaultInstance(EsRestrictions$RestrictionReasons.class, esRestrictions$RestrictionReasons);
    }

    private EsRestrictions$RestrictionReasons() {
    }

    public static EsRestrictions$RestrictionReasons p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static zqz r() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"reasons_"});
        }
        if (iOrdinal == 3) {
            return new EsRestrictions$RestrictionReasons();
        }
        if (iOrdinal == 4) {
            return new zqz();
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
        synchronized (EsRestrictions$RestrictionReasons.class) {
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

    public final void o(Iterable iterable) {
        h290 h290VarMutableCopy = this.reasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.reasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final List q() {
        return this.reasons_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
