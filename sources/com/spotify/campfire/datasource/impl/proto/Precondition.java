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
public final class Precondition extends h implements PreconditionOrBuilder {
    private static final Precondition DEFAULT_INSTANCE;
    public static final int MIN_REVISION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Revision minRevision_;

    static {
        Precondition precondition = new Precondition();
        DEFAULT_INSTANCE = precondition;
        h.registerDefaultInstance(Precondition.class, precondition);
    }

    private Precondition() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinRevision() {
        this.minRevision_ = null;
        this.bitField0_ &= -2;
    }

    public static Precondition getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMinRevision(Revision revision) {
        revision.getClass();
        Revision revision2 = this.minRevision_;
        if (revision2 == null || revision2 == Revision.getDefaultInstance()) {
            this.minRevision_ = revision;
        } else {
            this.minRevision_ = Revision.newBuilder(this.minRevision_).mergeFrom(revision).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Precondition parseDelimitedFrom(InputStream inputStream) {
        return (Precondition) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Precondition parseFrom(ByteBuffer byteBuffer) {
        return (Precondition) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinRevision(Revision revision) {
        revision.getClass();
        this.minRevision_ = revision;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "minRevision_"});
        }
        if (iOrdinal == 3) {
            return new Precondition();
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
        synchronized (Precondition.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.PreconditionOrBuilder
    public Revision getMinRevision() {
        Revision revision = this.minRevision_;
        return revision == null ? Revision.getDefaultInstance() : revision;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.PreconditionOrBuilder
    public boolean hasMinRevision() {
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

    public static Builder newBuilder(Precondition precondition) {
        return DEFAULT_INSTANCE.createBuilder(precondition);
    }

    public static Precondition parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Precondition) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Precondition parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Precondition) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Precondition parseFrom(phc phcVar) {
        return (Precondition) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Precondition parseFrom(phc phcVar, uz00 uz00Var) {
        return (Precondition) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static Precondition parseFrom(byte[] bArr) {
        return (Precondition) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Precondition parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Precondition) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Precondition parseFrom(InputStream inputStream) {
        return (Precondition) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Precondition parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Precondition) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Precondition parseFrom(lwg lwgVar) {
        return (Precondition) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Precondition parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Precondition) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
