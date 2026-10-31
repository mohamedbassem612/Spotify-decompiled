package com.spotify.profile.socialgraphimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class BlockedlistResponse$RelationsUsernameResponse extends h implements v2j0 {
    private static final BlockedlistResponse$RelationsUsernameResponse DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int USERS_FIELD_NUMBER = 1;
    private int bitField0_;
    private h290 users_ = h.emptyProtobufList();
    private String nextPageToken_ = "";

    static {
        BlockedlistResponse$RelationsUsernameResponse blockedlistResponse$RelationsUsernameResponse = new BlockedlistResponse$RelationsUsernameResponse();
        DEFAULT_INSTANCE = blockedlistResponse$RelationsUsernameResponse;
        h.registerDefaultInstance(BlockedlistResponse$RelationsUsernameResponse.class, blockedlistResponse$RelationsUsernameResponse);
    }

    private BlockedlistResponse$RelationsUsernameResponse() {
    }

    public static BlockedlistResponse$RelationsUsernameResponse n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ለ\u0000", new Object[]{"bitField0_", "users_", BlockedlistResponse$UsernameUser.class, "nextPageToken_"});
        }
        if (iOrdinal == 3) {
            return new BlockedlistResponse$RelationsUsernameResponse();
        }
        if (iOrdinal == 4) {
            return new lka(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (BlockedlistResponse$RelationsUsernameResponse.class) {
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

    public final String getNextPageToken() {
        return this.nextPageToken_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.users_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
