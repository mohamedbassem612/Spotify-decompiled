package com.spotify.pushkatokens.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hd4;
import p.jf40;
import p.kax;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y15;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class AndroidDeviceState extends h implements v2j0 {
    private static final AndroidDeviceState DEFAULT_INSTANCE;
    public static final int IS_HIBERNATED_FIELD_NUMBER = 3;
    public static final int NOTIFICATION_PERMISSIONS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int STANDBY_BUCKET_FIELD_NUMBER = 2;
    private int bitField0_;
    private int isHibernated_;
    private AndroidNotificationPermissions notificationPermissions_;
    private int standbyBucket_;

    static {
        AndroidDeviceState androidDeviceState = new AndroidDeviceState();
        DEFAULT_INSTANCE = androidDeviceState;
        h.registerDefaultInstance(AndroidDeviceState.class, androidDeviceState);
    }

    private AndroidDeviceState() {
    }

    public static hd4 n() {
        return (hd4) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\f", new Object[]{"bitField0_", "notificationPermissions_", "standbyBucket_", "isHibernated_"});
        }
        if (iOrdinal == 3) {
            return new AndroidDeviceState();
        }
        if (iOrdinal == 4) {
            return new hd4(DEFAULT_INSTANCE);
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
        synchronized (AndroidDeviceState.class) {
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

    public final void o(kax kaxVar) {
        this.isHibernated_ = kaxVar.getNumber();
    }

    public final void p(AndroidNotificationPermissions androidNotificationPermissions) {
        androidNotificationPermissions.getClass();
        this.notificationPermissions_ = androidNotificationPermissions;
        this.bitField0_ |= 1;
    }

    public final void q(y15 y15Var) {
        this.standbyBucket_ = y15Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
