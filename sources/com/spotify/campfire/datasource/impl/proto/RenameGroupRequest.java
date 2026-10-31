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
public final class RenameGroupRequest extends h implements RenameGroupRequestOrBuilder {
    private static final RenameGroupRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RENAME_GROUP_FIELD_NUMBER = 1;
    private int bitField0_;
    private RenameGroup renameGroup_;

    static {
        RenameGroupRequest renameGroupRequest = new RenameGroupRequest();
        DEFAULT_INSTANCE = renameGroupRequest;
        h.registerDefaultInstance(RenameGroupRequest.class, renameGroupRequest);
    }

    private RenameGroupRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRenameGroup() {
        this.renameGroup_ = null;
        this.bitField0_ &= -2;
    }

    public static RenameGroupRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRenameGroup(RenameGroup renameGroup) {
        renameGroup.getClass();
        RenameGroup renameGroup2 = this.renameGroup_;
        if (renameGroup2 == null || renameGroup2 == RenameGroup.getDefaultInstance()) {
            this.renameGroup_ = renameGroup;
        } else {
            this.renameGroup_ = RenameGroup.newBuilder(this.renameGroup_).mergeFrom(renameGroup).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RenameGroupRequest parseDelimitedFrom(InputStream inputStream) {
        return (RenameGroupRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RenameGroupRequest parseFrom(ByteBuffer byteBuffer) {
        return (RenameGroupRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenameGroup(RenameGroup renameGroup) {
        renameGroup.getClass();
        this.renameGroup_ = renameGroup;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "renameGroup_"});
        }
        if (iOrdinal == 3) {
            return new RenameGroupRequest();
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
        synchronized (RenameGroupRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.RenameGroupRequestOrBuilder
    public RenameGroup getRenameGroup() {
        RenameGroup renameGroup = this.renameGroup_;
        return renameGroup == null ? RenameGroup.getDefaultInstance() : renameGroup;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RenameGroupRequestOrBuilder
    public boolean hasRenameGroup() {
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

    public static Builder newBuilder(RenameGroupRequest renameGroupRequest) {
        return DEFAULT_INSTANCE.createBuilder(renameGroupRequest);
    }

    public static RenameGroupRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (RenameGroupRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RenameGroupRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (RenameGroupRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static RenameGroupRequest parseFrom(phc phcVar) {
        return (RenameGroupRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static RenameGroupRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (RenameGroupRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static RenameGroupRequest parseFrom(byte[] bArr) {
        return (RenameGroupRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RenameGroupRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (RenameGroupRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static RenameGroupRequest parseFrom(InputStream inputStream) {
        return (RenameGroupRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RenameGroupRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (RenameGroupRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RenameGroupRequest parseFrom(lwg lwgVar) {
        return (RenameGroupRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static RenameGroupRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (RenameGroupRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
