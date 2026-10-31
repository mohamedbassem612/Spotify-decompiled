package com.spotify.passkeys.v1;

import com.google.protobuf.h;
import p.bf40;
import p.gtq0;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class PasskeyUser extends h implements v2j0 {
    private static final PasskeyUser DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private phc id_ = phc.b;
    private String name_ = "";
    private String displayName_ = "";

    static {
        PasskeyUser passkeyUser = new PasskeyUser();
        DEFAULT_INSTANCE = passkeyUser;
        h.registerDefaultInstance(PasskeyUser.class, passkeyUser);
    }

    private PasskeyUser() {
    }

    public static PasskeyUser n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003Ȉ", new Object[]{"id_", "name_", "displayName_"});
        }
        if (iOrdinal == 3) {
            return new PasskeyUser();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (PasskeyUser.class) {
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

    public final String getDisplayName() {
        return this.displayName_;
    }

    public final String getName() {
        return this.name_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final phc o() {
        return this.id_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
