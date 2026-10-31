package com.spotify.pses.v1.proto;

import android.os.Build;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yqt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class DeviceInformation extends h implements v2j0 {
    public static final int BRAND_FIELD_NUMBER = 2;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 5;
    public static final int DATE_TIME_FIELD_NUMBER = 6;
    private static final DeviceInformation DEFAULT_INSTANCE;
    public static final int MODEL_FIELD_NUMBER = 3;
    public static final int OS_VERSION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RAM_FIELD_NUMBER = 4;
    private int ram_;
    private String osVersion_ = "";
    private String brand_ = "";
    private String model_ = "";
    private String connectionType_ = "";
    private String dateTime_ = "";

    static {
        DeviceInformation deviceInformation = new DeviceInformation();
        DEFAULT_INSTANCE = deviceInformation;
        h.registerDefaultInstance(DeviceInformation.class, deviceInformation);
    }

    private DeviceInformation() {
    }

    public static yqt n() {
        return (yqt) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ", new Object[]{"osVersion_", "brand_", "model_", "ram_", "connectionType_", "dateTime_"});
        }
        if (iOrdinal == 3) {
            return new DeviceInformation();
        }
        if (iOrdinal == 4) {
            return new yqt(DEFAULT_INSTANCE);
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
        synchronized (DeviceInformation.class) {
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
        String str = Build.BRAND;
        str.getClass();
        this.brand_ = str;
    }

    public final void p(String str) {
        this.connectionType_ = str;
    }

    public final void q(String str) {
        this.dateTime_ = str;
    }

    public final void r() {
        String str = Build.MODEL;
        str.getClass();
        this.model_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    public final void t(int i) {
        this.ram_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
