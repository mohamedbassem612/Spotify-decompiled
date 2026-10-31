package com.spotify.userinteractivityservice.usercomments.v1.proto;

import com.google.protobuf.h;
import p.a301;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ReactionsRow extends h implements v2j0 {
    private static final ReactionsRow DEFAULT_INSTANCE;
    public static final int HIGHLIGHTED_REACTIONS_FIELD_NUMBER = 4;
    public static final int NUMBER_OF_REACTIONS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TOP_REACTION_UNICODE_FIELD_NUMBER = 1;
    public static final int USERS_REACTION_UNICODE_FIELD_NUMBER = 3;
    private int numberOfReactions_;
    private h290 topReactionUnicode_ = h.emptyProtobufList();
    private String usersReactionUnicode_ = "";
    private h290 highlightedReactions_ = h.emptyProtobufList();

    static {
        ReactionsRow reactionsRow = new ReactionsRow();
        DEFAULT_INSTANCE = reactionsRow;
        h.registerDefaultInstance(ReactionsRow.class, reactionsRow);
    }

    private ReactionsRow() {
    }

    public static ReactionsRow n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ț\u0002\u0004\u0003Ȉ\u0004\u001b", new Object[]{"topReactionUnicode_", "numberOfReactions_", "usersReactionUnicode_", "highlightedReactions_", ReactionListDisplay.class});
        }
        if (iOrdinal == 3) {
            return new ReactionsRow();
        }
        if (iOrdinal == 4) {
            return new a301(DEFAULT_INSTANCE);
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
        synchronized (ReactionsRow.class) {
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

    public final h290 o() {
        return this.highlightedReactions_;
    }

    public final int p() {
        return this.numberOfReactions_;
    }

    public final h290 q() {
        return this.topReactionUnicode_;
    }

    public final String r() {
        return this.usersReactionUnicode_;
    }

    public final void s(int i) {
        this.numberOfReactions_ = i;
    }

    public final void t(String str) {
        this.usersReactionUnicode_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
