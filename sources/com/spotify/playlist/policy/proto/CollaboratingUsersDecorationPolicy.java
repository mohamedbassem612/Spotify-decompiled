package com.spotify.playlist.policy.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.oxg;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollaboratingUsersDecorationPolicy extends h implements v2j0 {
    public static final int COLLABORATOR_FIELD_NUMBER = 3;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final CollaboratingUsersDecorationPolicy DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private CollaboratorPolicy collaborator_;
    private boolean count_;
    private int limit_;

    static {
        CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy = new CollaboratingUsersDecorationPolicy();
        DEFAULT_INSTANCE = collaboratingUsersDecorationPolicy;
        h.registerDefaultInstance(CollaboratingUsersDecorationPolicy.class, collaboratingUsersDecorationPolicy);
    }

    private CollaboratingUsersDecorationPolicy() {
    }

    public static oxg p() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "count_", "limit_", "collaborator_"});
        }
        if (iOrdinal == 3) {
            return new CollaboratingUsersDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new oxg();
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
        synchronized (CollaboratingUsersDecorationPolicy.class) {
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

    public final CollaboratorPolicy o() {
        CollaboratorPolicy collaboratorPolicy = this.collaborator_;
        return collaboratorPolicy == null ? CollaboratorPolicy.n() : collaboratorPolicy;
    }

    public final void q(CollaboratorPolicy collaboratorPolicy) {
        collaboratorPolicy.getClass();
        this.collaborator_ = collaboratorPolicy;
        this.bitField0_ |= 1;
    }

    public final void r() {
        this.count_ = true;
    }

    public final void s(int i) {
        this.limit_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
