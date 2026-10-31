package com.spotify.profile.socialgraphimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dol;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.yn11;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ContainsRelationsResponse$ContainRelationsUsernameRequest extends h implements v2j0 {
    private static final ContainsRelationsResponse$ContainRelationsUsernameRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RELATION_TYPE_FIELD_NUMBER = 2;
    public static final int SOURCE_USERNAME_FIELD_NUMBER = 1;
    public static final int TARGET_USERNAMES_FIELD_NUMBER = 3;
    private int relationType_;
    private String sourceUsername_ = "";
    private h290 targetUsernames_ = h.emptyProtobufList();

    static {
        ContainsRelationsResponse$ContainRelationsUsernameRequest containsRelationsResponse$ContainRelationsUsernameRequest = new ContainsRelationsResponse$ContainRelationsUsernameRequest();
        DEFAULT_INSTANCE = containsRelationsResponse$ContainRelationsUsernameRequest;
        h.registerDefaultInstance(ContainsRelationsResponse$ContainRelationsUsernameRequest.class, containsRelationsResponse$ContainRelationsUsernameRequest);
    }

    private ContainsRelationsResponse$ContainRelationsUsernameRequest() {
    }

    public static dol n() {
        return (dol) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void addAllTargetUsernames(Iterable iterable) {
        h290 h290VarMutableCopy = this.targetUsernames_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.targetUsernames_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003Ț", new Object[]{"sourceUsername_", "relationType_", "targetUsernames_"});
        }
        if (iOrdinal == 3) {
            return new ContainsRelationsResponse$ContainRelationsUsernameRequest();
        }
        if (iOrdinal == 4) {
            return new dol(DEFAULT_INSTANCE);
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
        synchronized (ContainsRelationsResponse$ContainRelationsUsernameRequest.class) {
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

    public final void o(yn11 yn11Var) {
        this.relationType_ = yn11Var.getNumber();
    }

    public final void p(String str) {
        str.getClass();
        this.sourceUsername_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
