package com.spotify.libs.connect.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.oe9;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class BLECharacteristicState extends h implements v2j0 {
    public static final int ADVERTISING_READ_FAILURE_COUNT_FIELD_NUMBER = 6;
    public static final int ADVERTISING_READ_SUCCESS_COUNT_FIELD_NUMBER = 5;
    public static final int ADVERTISING_WRITE_FAILURE_COUNT_FIELD_NUMBER = 8;
    public static final int ADVERTISING_WRITE_SUCCESS_COUNT_FIELD_NUMBER = 7;
    private static final BLECharacteristicState DEFAULT_INSTANCE;
    public static final int END_DATE_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int SCANNING_READ_FAILURE_COUNT_FIELD_NUMBER = 2;
    public static final int SCANNING_READ_SUCCESS_COUNT_FIELD_NUMBER = 1;
    public static final int SCANNING_WRITE_FAILURE_COUNT_FIELD_NUMBER = 4;
    public static final int SCANNING_WRITE_SUCCESS_COUNT_FIELD_NUMBER = 3;
    public static final int START_DATE_FIELD_NUMBER = 9;
    private int advertisingReadFailureCount_;
    private int advertisingReadSuccessCount_;
    private int advertisingWriteFailureCount_;
    private int advertisingWriteSuccessCount_;
    private int bitField0_;
    private int scanningReadFailureCount_;
    private int scanningReadSuccessCount_;
    private int scanningWriteFailureCount_;
    private int scanningWriteSuccessCount_;
    private String startDate_ = "";
    private String endDate_ = "";

    static {
        BLECharacteristicState bLECharacteristicState = new BLECharacteristicState();
        DEFAULT_INSTANCE = bLECharacteristicState;
        h.registerDefaultInstance(BLECharacteristicState.class, bLECharacteristicState);
    }

    private BLECharacteristicState() {
    }

    public static oe9 n() {
        return (oe9) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဈ\b\nဈ\t", new Object[]{"bitField0_", "scanningReadSuccessCount_", "scanningReadFailureCount_", "scanningWriteSuccessCount_", "scanningWriteFailureCount_", "advertisingReadSuccessCount_", "advertisingReadFailureCount_", "advertisingWriteSuccessCount_", "advertisingWriteFailureCount_", "startDate_", "endDate_"});
        }
        if (iOrdinal == 3) {
            return new BLECharacteristicState();
        }
        if (iOrdinal == 4) {
            return new oe9(DEFAULT_INSTANCE);
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
        synchronized (BLECharacteristicState.class) {
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

    public final void o() {
        this.bitField0_ |= 32;
        this.advertisingReadFailureCount_ = 0;
    }

    public final void p() {
        this.bitField0_ |= 16;
        this.advertisingReadSuccessCount_ = 0;
    }

    public final void q(int i) {
        this.bitField0_ |= 128;
        this.advertisingWriteFailureCount_ = i;
    }

    public final void r(int i) {
        this.bitField0_ |= 64;
        this.advertisingWriteSuccessCount_ = i;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.endDate_ = str;
    }

    public final void t(int i) {
        this.bitField0_ |= 2;
        this.scanningReadFailureCount_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(int i) {
        this.bitField0_ |= 1;
        this.scanningReadSuccessCount_ = i;
    }

    public final void v(int i) {
        this.bitField0_ |= 8;
        this.scanningWriteFailureCount_ = i;
    }

    public final void w(int i) {
        this.bitField0_ |= 4;
        this.scanningWriteSuccessCount_ = i;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.startDate_ = str;
    }
}
