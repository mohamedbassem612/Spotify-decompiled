package com.spotify.gander.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.v621;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class RemoveFollowerAction extends h implements v2j0 {
    private static final RemoveFollowerAction DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_DISPLAY_NAME_FIELD_NUMBER = 2;
    private String username_ = "";
    private String userDisplayName_ = "";

    static {
        RemoveFollowerAction removeFollowerAction = new RemoveFollowerAction();
        DEFAULT_INSTANCE = removeFollowerAction;
        h.registerDefaultInstance(RemoveFollowerAction.class, removeFollowerAction);
    }

    private RemoveFollowerAction() {
    }

    public static RemoveFollowerAction n() {
        return DEFAULT_INSTANCE;
    }

    public static v621 p() {
        return (v621) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"username_", "userDisplayName_"});
        }
        if (iOrdinal == 3) {
            return new RemoveFollowerAction();
        }
        if (iOrdinal == 4) {
            return new v621(DEFAULT_INSTANCE);
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
        synchronized (RemoveFollowerAction.class) {
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

    public final String o() {
        return this.userDisplayName_;
    }

    public final void q(String str) {
        this.userDisplayName_ = str;
    }

    public final void r(String str) {
        this.username_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
