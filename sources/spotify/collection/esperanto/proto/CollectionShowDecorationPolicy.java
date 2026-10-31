package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.ShowCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicy;
import p.bf40;
import p.c7h;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollectionShowDecorationPolicy extends h implements v2j0 {
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 3;
    public static final int DECORATED_FIELD_NUMBER = 4;
    private static final CollectionShowDecorationPolicy DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYED_STATE_POLICY_FIELD_NUMBER = 2;
    public static final int SHOW_POLICY_FIELD_NUMBER = 1;
    private int bitField0_;
    private ShowCollectionDecorationPolicy collectionPolicy_;
    private boolean decorated_;
    private ShowPlayedStateDecorationPolicy playedStatePolicy_;
    private ShowDecorationPolicy showPolicy_;

    static {
        CollectionShowDecorationPolicy collectionShowDecorationPolicy = new CollectionShowDecorationPolicy();
        DEFAULT_INSTANCE = collectionShowDecorationPolicy;
        h.registerDefaultInstance(CollectionShowDecorationPolicy.class, collectionShowDecorationPolicy);
    }

    private CollectionShowDecorationPolicy() {
    }

    public static c7h n() {
        return (c7h) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0007", new Object[]{"bitField0_", "showPolicy_", "playedStatePolicy_", "collectionPolicy_", "decorated_"});
        }
        if (iOrdinal == 3) {
            return new CollectionShowDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new c7h(DEFAULT_INSTANCE);
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
        synchronized (CollectionShowDecorationPolicy.class) {
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
        showCollectionDecorationPolicy.getClass();
        this.collectionPolicy_ = showCollectionDecorationPolicy;
        this.bitField0_ |= 4;
    }

    public final void p() {
        this.decorated_ = true;
    }

    public final void q(ShowPlayedStateDecorationPolicy showPlayedStateDecorationPolicy) {
        showPlayedStateDecorationPolicy.getClass();
        this.playedStatePolicy_ = showPlayedStateDecorationPolicy;
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
