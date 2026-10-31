package com.spotify.kidsentitybanning.banning.v1;

import com.google.protobuf.h;
import p.bf40;
import p.goh1;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class UpdateBanStatusRequest extends h implements v2j0 {
    private static final UpdateBanStatusRequest DEFAULT_INSTANCE;
    public static final int DESIRED_CHILD_BAN_STATUS_FIELD_NUMBER = 3;
    public static final int ENTITY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String entity_ = "";
    private h290 desiredChildBanStatus_ = h.emptyProtobufList();

    static {
        UpdateBanStatusRequest updateBanStatusRequest = new UpdateBanStatusRequest();
        DEFAULT_INSTANCE = updateBanStatusRequest;
        h.registerDefaultInstance(UpdateBanStatusRequest.class, updateBanStatusRequest);
    }

    private UpdateBanStatusRequest() {
    }

    public static goh1 o() {
        return (goh1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ȉ\u0003\u001b", new Object[]{"entity_", "desiredChildBanStatus_", ChildBanStatus.class});
        }
        if (iOrdinal == 3) {
            return new UpdateBanStatusRequest();
        }
        if (iOrdinal == 4) {
            return new goh1(DEFAULT_INSTANCE);
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
        synchronized (UpdateBanStatusRequest.class) {
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

    public final void n(ChildBanStatus childBanStatus) {
        childBanStatus.getClass();
        h290 h290VarMutableCopy = this.desiredChildBanStatus_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.desiredChildBanStatus_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(childBanStatus);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.entity_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
