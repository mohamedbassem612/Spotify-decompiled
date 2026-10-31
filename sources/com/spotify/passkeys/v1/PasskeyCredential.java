package com.spotify.passkeys.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.gtq0;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xpv0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class PasskeyCredential extends h implements v2j0 {
    public static final int BACKUP_ELIGIBLE_FIELD_NUMBER = 7;
    public static final int BACKUP_STATE_FIELD_NUMBER = 8;
    public static final int CREATED_AT_FIELD_NUMBER = 3;
    public static final int CREDENTIAL_ID_FIELD_NUMBER = 1;
    private static final PasskeyCredential DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int LAST_USED_AT_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SIGN_COUNT_FIELD_NUMBER = 5;
    public static final int TRANSPORTS_FIELD_NUMBER = 6;
    private static final c290 transports_converter_ = new xpv0((byte) 17);
    private boolean backupEligible_;
    private boolean backupState_;
    private int bitField0_;
    private Timestamp createdAt_;
    private Timestamp lastUsedAt_;
    private int signCount_;
    private int transportsMemoizedSerializedSize;
    private phc credentialId_ = phc.b;
    private String displayName_ = "";
    private b290 transports_ = h.emptyIntList();

    static {
        PasskeyCredential passkeyCredential = new PasskeyCredential();
        DEFAULT_INSTANCE = passkeyCredential;
        h.registerDefaultInstance(PasskeyCredential.class, passkeyCredential);
    }

    private PasskeyCredential() {
    }

    public static PasskeyCredential n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\n\u0002ለ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u000b\u0006,\u0007\u0007\b\u0007", new Object[]{"bitField0_", "credentialId_", "displayName_", "createdAt_", "lastUsedAt_", "signCount_", "transports_", "backupEligible_", "backupState_"});
        }
        if (iOrdinal == 3) {
            return new PasskeyCredential();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (PasskeyCredential.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
