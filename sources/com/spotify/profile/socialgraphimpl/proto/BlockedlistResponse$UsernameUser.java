package com.spotify.profile.socialgraphimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class BlockedlistResponse$UsernameUser extends h implements v2j0 {
    private static final BlockedlistResponse$UsernameUser DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private long timestamp_;
    private String username_ = "";

    static {
        BlockedlistResponse$UsernameUser blockedlistResponse$UsernameUser = new BlockedlistResponse$UsernameUser();
        DEFAULT_INSTANCE = blockedlistResponse$UsernameUser;
        h.registerDefaultInstance(BlockedlistResponse$UsernameUser.class, blockedlistResponse$UsernameUser);
    }

    private BlockedlistResponse$UsernameUser() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "username_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new BlockedlistResponse$UsernameUser();
        }
        if (iOrdinal == 4) {
            return new lka(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (BlockedlistResponse$UsernameUser.class) {
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

    public final String getUsername() {
        return this.username_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
