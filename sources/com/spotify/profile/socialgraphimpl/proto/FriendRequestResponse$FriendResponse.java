package com.spotify.profile.socialgraphimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ia20;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yn11;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class FriendRequestResponse$FriendResponse extends h implements v2j0 {
    public static final int CHAT_URI_FIELD_NUMBER = 1;
    private static final FriendRequestResponse$FriendResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RELATION_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String chatUri_ = "";
    private int relationType_;

    static {
        FriendRequestResponse$FriendResponse friendRequestResponse$FriendResponse = new FriendRequestResponse$FriendResponse();
        DEFAULT_INSTANCE = friendRequestResponse$FriendResponse;
        h.registerDefaultInstance(FriendRequestResponse$FriendResponse.class, friendRequestResponse$FriendResponse);
    }

    private FriendRequestResponse$FriendResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "chatUri_", "relationType_"});
        }
        if (iOrdinal == 3) {
            return new FriendRequestResponse$FriendResponse();
        }
        if (iOrdinal == 4) {
            return new ia20(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (FriendRequestResponse$FriendResponse.class) {
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

    public final String getChatUri() {
        return this.chatUri_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final yn11 n() {
        yn11 yn11Var;
        switch (this.relationType_) {
            case 0:
                yn11Var = yn11.RELATION_TYPE_UNDEFINED;
                break;
            case 1:
                yn11Var = yn11.RELATION_TYPE_IS_FOLLOWING;
                break;
            case 2:
                yn11Var = yn11.RELATION_TYPE_IS_FOLLOWED_BY;
                break;
            case 3:
                yn11Var = yn11.RELATION_TYPE_IS_BLOCKING;
                break;
            case 4:
                yn11Var = yn11.RELATION_TYPE_IS_BLOCKED_BY;
                break;
            case 5:
                yn11Var = yn11.RELATION_TYPE_FRIEND_REQUEST_SENT;
                break;
            case 6:
                yn11Var = yn11.RELATION_TYPE_FRIEND_REQUEST_RECEIVED;
                break;
            case 7:
                yn11Var = yn11.RELATION_TYPE_IS_FRIEND;
                break;
            default:
                yn11Var = null;
                break;
        }
        return yn11Var == null ? yn11.UNRECOGNIZED : yn11Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
