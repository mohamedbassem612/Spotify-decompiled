package com.spotify.kidsdatamigration.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ljj0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wrj0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class MigrationStatusPubsub extends h implements v2j0 {
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final MigrationStatusPubsub DEFAULT_INSTANCE;
    public static final int MIGRATION_ID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String childId_ = "";
    private String migrationId_ = "";
    private int status_;

    static {
        MigrationStatusPubsub migrationStatusPubsub = new MigrationStatusPubsub();
        DEFAULT_INSTANCE = migrationStatusPubsub;
        h.registerDefaultInstance(MigrationStatusPubsub.class, migrationStatusPubsub);
    }

    private MigrationStatusPubsub() {
    }

    public static MigrationStatusPubsub o(byte[] bArr) {
        return (MigrationStatusPubsub) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002\f\u0003Ȉ", new Object[]{"bitField0_", "childId_", "status_", "migrationId_"});
        }
        if (iOrdinal == 3) {
            return new MigrationStatusPubsub();
        }
        if (iOrdinal == 4) {
            return new ljj0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (MigrationStatusPubsub.class) {
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

    public final String getChildId() {
        return this.childId_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getMigrationId() {
        return this.migrationId_;
    }

    public final wrj0 n() {
        wrj0 wrj0Var;
        int i = this.status_;
        if (i == 0) {
            wrj0Var = wrj0.STATUS_UNSPECIFIED;
        } else if (i == 1) {
            wrj0Var = wrj0.STATUS_STARTED;
        } else if (i != 2) {
            wrj0Var = i != 3 ? null : wrj0.STATUS_FAILED;
        } else {
            wrj0Var = wrj0.STATUS_FINISHED;
        }
        return wrj0Var == null ? wrj0.UNRECOGNIZED : wrj0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
