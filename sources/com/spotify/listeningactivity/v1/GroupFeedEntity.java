package com.spotify.listeningactivity.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.ir40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class GroupFeedEntity extends h implements v2j0 {
    public static final int CONVERSATION_URI_FIELD_NUMBER = 2;
    private static final GroupFeedEntity DEFAULT_INSTANCE;
    public static final int MEMBERS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String name_ = "";
    private String conversationUri_ = "";
    private h290 members_ = h.emptyProtobufList();

    static {
        GroupFeedEntity groupFeedEntity = new GroupFeedEntity();
        DEFAULT_INSTANCE = groupFeedEntity;
        h.registerDefaultInstance(GroupFeedEntity.class, groupFeedEntity);
    }

    private GroupFeedEntity() {
    }

    public static GroupFeedEntity o() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"name_", "conversationUri_", "members_", GroupMember.class});
        }
        if (iOrdinal == 3) {
            return new GroupFeedEntity();
        }
        if (iOrdinal == 4) {
            return new ir40(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (GroupFeedEntity.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String n() {
        return this.conversationUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 p() {
        return this.members_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
