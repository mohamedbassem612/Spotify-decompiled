package com.spotify.pushkatokens.v1.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.ru4;
import p.s2j0;
import p.s8;
import p.su4;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class AndroidNotificationPermissions extends h implements v2j0 {
    public static final int CHANNELS_FIELD_NUMBER = 2;
    private static final AndroidNotificationPermissions DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 1;
    private h290 channels_ = h.emptyProtobufList();
    private int permission_;

    static {
        AndroidNotificationPermissions androidNotificationPermissions = new AndroidNotificationPermissions();
        DEFAULT_INSTANCE = androidNotificationPermissions;
        h.registerDefaultInstance(AndroidNotificationPermissions.class, androidNotificationPermissions);
    }

    private AndroidNotificationPermissions() {
    }

    public static su4 o() {
        return (su4) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"permission_", "channels_", AndroidNotificationChannel.class});
        }
        if (iOrdinal == 3) {
            return new AndroidNotificationPermissions();
        }
        if (iOrdinal == 4) {
            return new su4(DEFAULT_INSTANCE);
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
        synchronized (AndroidNotificationPermissions.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.channels_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.channels_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(ru4 ru4Var) {
        this.permission_ = ru4Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
