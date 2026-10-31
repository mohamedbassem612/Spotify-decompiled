package com.spotify.show_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.ShowCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowOfflineStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicy;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.t160;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class HeaderPolicy extends h implements v2j0 {
    private static final HeaderPolicy DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_COLLECTION_POLICY_FIELD_NUMBER = 3;
    public static final int SHOW_OFFLINE_STATE_POLICY_FIELD_NUMBER = 4;
    public static final int SHOW_PLAYED_STATE_POLICY_FIELD_NUMBER = 2;
    public static final int SHOW_POLICY_FIELD_NUMBER = 1;
    private int bitField0_;
    private ShowCollectionDecorationPolicy showCollectionPolicy_;
    private ShowOfflineStateDecorationPolicy showOfflineStatePolicy_;
    private ShowPlayedStateDecorationPolicy showPlayedStatePolicy_;
    private ShowDecorationPolicy showPolicy_;

    static {
        HeaderPolicy headerPolicy = new HeaderPolicy();
        DEFAULT_INSTANCE = headerPolicy;
        h.registerDefaultInstance(HeaderPolicy.class, headerPolicy);
    }

    private HeaderPolicy() {
    }

    public static t160 n() {
        return (t160) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "showPolicy_", "showPlayedStatePolicy_", "showCollectionPolicy_", "showOfflineStatePolicy_"});
        }
        if (iOrdinal == 3) {
            return new HeaderPolicy();
        }
        if (iOrdinal == 4) {
            return new t160(DEFAULT_INSTANCE);
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
        synchronized (HeaderPolicy.class) {
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

    public final void o(ShowCollectionDecorationPolicy showCollectionDecorationPolicy) {
        this.showCollectionPolicy_ = showCollectionDecorationPolicy;
        this.bitField0_ |= 4;
    }

    public final void p(ShowOfflineStateDecorationPolicy showOfflineStateDecorationPolicy) {
        this.showOfflineStatePolicy_ = showOfflineStateDecorationPolicy;
        this.bitField0_ |= 8;
    }

    public final void q(ShowPlayedStateDecorationPolicy showPlayedStateDecorationPolicy) {
        showPlayedStateDecorationPolicy.getClass();
        this.showPlayedStatePolicy_ = showPlayedStateDecorationPolicy;
        this.bitField0_ |= 2;
    }

    public final void r(ShowDecorationPolicy showDecorationPolicy) {
        showDecorationPolicy.getClass();
        this.showPolicy_ = showDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
