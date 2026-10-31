package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.cjj0;
import p.d290;
import p.dgb;
import p.ir40;
import p.jf40;
import p.nfb;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GrantableLevels extends h implements v2j0 {
    public static final int BASE_FIELD_NUMBER = 1;
    private static final GrantableLevels DEFAULT_INSTANCE;
    public static final int MEMBER_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private static final c290 base_converter_ = new nfb((byte) 12, false);
    private static final c290 member_converter_ = new dgb((byte) 12);
    private b290 base_ = h.emptyIntList();
    private b290 member_ = h.emptyIntList();

    static {
        GrantableLevels grantableLevels = new GrantableLevels();
        DEFAULT_INSTANCE = grantableLevels;
        h.registerDefaultInstance(GrantableLevels.class, grantableLevels);
    }

    private GrantableLevels() {
    }

    public static GrantableLevels o() {
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
            cjj0 cjj0Var = cjj0.l;
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001ࠞ\u0002ࠞ", new Object[]{"base_", cjj0Var, "member_", cjj0Var});
        }
        if (iOrdinal == 3) {
            return new GrantableLevels();
        }
        if (iOrdinal == 4) {
            return new ir40(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (GrantableLevels.class) {
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

    public final d290 n() {
        return new d290(this.base_, base_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final d290 p() {
        return new d290(this.member_, member_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
