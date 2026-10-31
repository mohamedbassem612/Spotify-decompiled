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
public final class AddMembersRequest extends h implements AddMembersRequestOrBuilder {
    public static final int ADD_MEMBERS_FIELD_NUMBER = 1;
    private static final AddMembersRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private AddMembers addMembers_;
    private int bitField0_;

    static {
        AddMembersRequest addMembersRequest = new AddMembersRequest();
        DEFAULT_INSTANCE = addMembersRequest;
        h.registerDefaultInstance(AddMembersRequest.class, addMembersRequest);
    }

    private AddMembersRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddMembers() {
        this.addMembers_ = null;
        this.bitField0_ &= -2;
    }

    public static AddMembersRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddMembers(AddMembers addMembers) {
        addMembers.getClass();
        AddMembers addMembers2 = this.addMembers_;
        if (addMembers2 == null || addMembers2 == AddMembers.getDefaultInstance()) {
            this.addMembers_ = addMembers;
        } else {
            this.addMembers_ = AddMembers.newBuilder(this.addMembers_).mergeFrom(addMembers).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AddMembersRequest parseDelimitedFrom(InputStream inputStream) {
        return (AddMembersRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddMembersRequest parseFrom(ByteBuffer byteBuffer) {
        return (AddMembersRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddMembers(AddMembers addMembers) {
        addMembers.getClass();
        this.addMembers_ = addMembers;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "addMembers_"});
        }
        if (iOrdinal == 3) {
            return new AddMembersRequest();
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
        synchronized (AddMembersRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.AddMembersRequestOrBuilder
    public AddMembers getAddMembers() {
        AddMembers addMembers = this.addMembers_;
        return addMembers == null ? AddMembers.getDefaultInstance() : addMembers;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddMembersRequestOrBuilder
    public boolean hasAddMembers() {
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

    public static Builder newBuilder(AddMembersRequest addMembersRequest) {
        return DEFAULT_INSTANCE.createBuilder(addMembersRequest);
    }

    public static AddMembersRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (AddMembersRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AddMembersRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (AddMembersRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static AddMembersRequest parseFrom(phc phcVar) {
        return (AddMembersRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static AddMembersRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (AddMembersRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static AddMembersRequest parseFrom(byte[] bArr) {
        return (AddMembersRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AddMembersRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (AddMembersRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static AddMembersRequest parseFrom(InputStream inputStream) {
        return (AddMembersRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddMembersRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (AddMembersRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AddMembersRequest parseFrom(lwg lwgVar) {
        return (AddMembersRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static AddMembersRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (AddMembersRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
