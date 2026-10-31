package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.ShowCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rp01;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RecentlyPlayedShowDecorationPolicy extends h implements v2j0 {
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 2;
    private static final RecentlyPlayedShowDecorationPolicy DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_POLICY_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private ShowCollectionDecorationPolicy collectionPolicy_;
    private ShowDecorationPolicy showPolicy_;
    private boolean timestamp_;
    private boolean type_;

    static {
        RecentlyPlayedShowDecorationPolicy recentlyPlayedShowDecorationPolicy = new RecentlyPlayedShowDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedShowDecorationPolicy;
        h.registerDefaultInstance(RecentlyPlayedShowDecorationPolicy.class, recentlyPlayedShowDecorationPolicy);
    }

    private RecentlyPlayedShowDecorationPolicy() {
    }

    public static rp01 n() {
        return (rp01) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004\u0007\u0005\u0007", new Object[]{"bitField0_", "showPolicy_", "collectionPolicy_", "type_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedShowDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new rp01(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedShowDecorationPolicy.class) {
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

    public final void o(ShowDecorationPolicy showDecorationPolicy) {
        showDecorationPolicy.getClass();
        this.showPolicy_ = showDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void p() {
        this.timestamp_ = true;
    }

    public final void q() {
        this.type_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
