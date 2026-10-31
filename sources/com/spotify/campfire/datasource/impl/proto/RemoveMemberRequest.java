package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class RemoveMemberRequest extends h implements RemoveMemberRequestOrBuilder {
    private static final RemoveMemberRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REMOVE_MEMBER_FIELD_NUMBER = 1;
    private int bitField0_;
    private RemoveMember removeMember_;

    static {
        RemoveMemberRequest removeMemberRequest = new RemoveMemberRequest();
        DEFAULT_INSTANCE = removeMemberRequest;
        h.registerDefaultInstance(RemoveMemberRequest.class, removeMemberRequest);
    }

    private RemoveMemberRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveMember() {
        this.removeMember_ = null;
        this.bitField0_ &= -2;
    }

    public static RemoveMemberRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoveMember(RemoveMember removeMember) {
        removeMember.getClass();
        RemoveMember removeMember2 = this.removeMember_;
        if (removeMember2 == null || removeMember2 == RemoveMember.getDefaultInstance()) {
            this.removeMember_ = removeMember;
        } else {
            this.removeMember_ = RemoveMember.newBuilder(this.removeMember_).mergeFrom(removeMember).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RemoveMemberRequest parseDelimitedFrom(InputStream inputStream) {
        return (RemoveMemberRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RemoveMemberRequest parseFrom(ByteBuffer byteBuffer) {
        return (RemoveMemberRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveMember(RemoveMember removeMember) {
        removeMember.getClass();
        this.removeMember_ = removeMember;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "removeMember_"});
        }
        if (iOrdinal == 3) {
            return new RemoveMemberRequest();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
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
        synchronized (RemoveMemberRequest.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RemoveMemberRequestOrBuilder
    public RemoveMember getRemoveMember() {
        RemoveMember removeMember = this.removeMember_;
        return removeMember == null ? RemoveMember.getDefaultInstance() : removeMember;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RemoveMemberRequestOrBuilder
    public boolean hasRemoveMember() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(RemoveMemberRequest removeMemberRequest) {
        return DEFAULT_INSTANCE.createBuilder(removeMemberRequest);
    }

    public static RemoveMemberRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (RemoveMemberRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RemoveMemberRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (RemoveMemberRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static RemoveMemberRequest parseFrom(phc phcVar) {
        return (RemoveMemberRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static RemoveMemberRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (RemoveMemberRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static RemoveMemberRequest parseFrom(byte[] bArr) {
        return (RemoveMemberRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RemoveMemberRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (RemoveMemberRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static RemoveMemberRequest parseFrom(InputStream inputStream) {
        return (RemoveMemberRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RemoveMemberRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (RemoveMemberRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RemoveMemberRequest parseFrom(lwg lwgVar) {
        return (RemoveMemberRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static RemoveMemberRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (RemoveMemberRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
