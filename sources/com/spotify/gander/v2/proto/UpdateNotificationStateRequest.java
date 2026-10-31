package com.spotify.gander.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.nth1;
import p.oth1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class UpdateNotificationStateRequest extends h implements v2j0 {
    private static final UpdateNotificationStateRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int STORAGE_IDS_FIELD_NUMBER = 1;
    private int state_;
    private h290 storageIds_ = h.emptyProtobufList();

    static {
        UpdateNotificationStateRequest updateNotificationStateRequest = new UpdateNotificationStateRequest();
        DEFAULT_INSTANCE = updateNotificationStateRequest;
        h.registerDefaultInstance(UpdateNotificationStateRequest.class, updateNotificationStateRequest);
    }

    private UpdateNotificationStateRequest() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static nth1 q() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\f", new Object[]{"storageIds_", "state_"});
        }
        if (iOrdinal == 3) {
            return new UpdateNotificationStateRequest();
        }
        if (iOrdinal == 4) {
            return new nth1();
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
        synchronized (UpdateNotificationStateRequest.class) {
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

    public final void o(Iterable iterable) {
        h290 h290VarMutableCopy = this.storageIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.storageIds_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void p(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.storageIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.storageIds_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void r(oth1 oth1Var) {
        this.state_ = oth1Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
