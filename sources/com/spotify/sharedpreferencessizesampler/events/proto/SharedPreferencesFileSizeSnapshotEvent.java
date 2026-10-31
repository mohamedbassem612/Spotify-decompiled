package com.spotify.sharedpreferencessizesampler.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zt71;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SharedPreferencesFileSizeSnapshotEvent extends h implements v2j0 {
    public static final int ACTIVE_USER_ENTRY_COUNT_FIELD_NUMBER = 9;
    public static final int ACTIVE_USER_SIZE_BYTES_FIELD_NUMBER = 8;
    private static final SharedPreferencesFileSizeSnapshotEvent DEFAULT_INSTANCE;
    public static final int FILE_COUNT_FIELD_NUMBER = 1;
    public static final int GLOBAL_ENTRY_COUNT_FIELD_NUMBER = 4;
    public static final int GLOBAL_SIZE_BYTES_FIELD_NUMBER = 3;
    public static final int OTHER_FILE_COUNT_FIELD_NUMBER = 10;
    public static final int OTHER_MAX_SIZE_BYTES_FIELD_NUMBER = 12;
    public static final int OTHER_TOTAL_SIZE_BYTES_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int TOTAL_SIZE_BYTES_FIELD_NUMBER = 2;
    public static final int USER_FILE_COUNT_FIELD_NUMBER = 5;
    public static final int USER_MAX_SIZE_BYTES_FIELD_NUMBER = 7;
    public static final int USER_TOTAL_SIZE_BYTES_FIELD_NUMBER = 6;
    private int activeUserEntryCount_;
    private long activeUserSizeBytes_;
    private int bitField0_;
    private int fileCount_;
    private int globalEntryCount_;
    private long globalSizeBytes_;
    private int otherFileCount_;
    private long otherMaxSizeBytes_;
    private long otherTotalSizeBytes_;
    private long totalSizeBytes_;
    private int userFileCount_;
    private long userMaxSizeBytes_;
    private long userTotalSizeBytes_;

    static {
        SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = new SharedPreferencesFileSizeSnapshotEvent();
        DEFAULT_INSTANCE = sharedPreferencesFileSizeSnapshotEvent;
        h.registerDefaultInstance(SharedPreferencesFileSizeSnapshotEvent.class, sharedPreferencesFileSizeSnapshotEvent);
    }

    private SharedPreferencesFileSizeSnapshotEvent() {
    }

    public static zt71 n() {
        return (zt71) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tင\b\nင\t\u000bဂ\n\fဂ\u000b", new Object[]{"bitField0_", "fileCount_", "totalSizeBytes_", "globalSizeBytes_", "globalEntryCount_", "userFileCount_", "userTotalSizeBytes_", "userMaxSizeBytes_", "activeUserSizeBytes_", "activeUserEntryCount_", "otherFileCount_", "otherTotalSizeBytes_", "otherMaxSizeBytes_"});
        }
        if (iOrdinal == 3) {
            return new SharedPreferencesFileSizeSnapshotEvent();
        }
        if (iOrdinal == 4) {
            return new zt71(DEFAULT_INSTANCE);
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
        synchronized (SharedPreferencesFileSizeSnapshotEvent.class) {
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

    public final void o(int i) {
        this.bitField0_ |= 256;
        this.activeUserEntryCount_ = i;
    }

    public final void p(long j) {
        this.bitField0_ |= 128;
        this.activeUserSizeBytes_ = j;
    }

    public final void q(int i) {
        this.bitField0_ |= 1;
        this.fileCount_ = i;
    }

    public final void r(int i) {
        this.bitField0_ |= 8;
        this.globalEntryCount_ = i;
    }

    public final void s(long j) {
        this.bitField0_ |= 4;
        this.globalSizeBytes_ = j;
    }

    public final void t(int i) {
        this.bitField0_ |= 512;
        this.otherFileCount_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(long j) {
        this.bitField0_ |= 2048;
        this.otherMaxSizeBytes_ = j;
    }

    public final void v(long j) {
        this.bitField0_ |= 1024;
        this.otherTotalSizeBytes_ = j;
    }

    public final void w(long j) {
        this.bitField0_ |= 2;
        this.totalSizeBytes_ = j;
    }

    public final void x(int i) {
        this.bitField0_ |= 16;
        this.userFileCount_ = i;
    }

    public final void y(long j) {
        this.bitField0_ |= 64;
        this.userMaxSizeBytes_ = j;
    }

    public final void z(long j) {
        this.bitField0_ |= 32;
        this.userTotalSizeBytes_ = j;
    }
}
