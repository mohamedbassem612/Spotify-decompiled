package com.spotify.cosmos.util.policy.proto;

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
public final class ShowCollectionDecorationPolicy extends h implements ShowCollectionDecorationPolicyOrBuilder {
    private static final ShowCollectionDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_IN_COLLECTION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private boolean isInCollection_;

    static {
        ShowCollectionDecorationPolicy showCollectionDecorationPolicy = new ShowCollectionDecorationPolicy();
        DEFAULT_INSTANCE = showCollectionDecorationPolicy;
        h.registerDefaultInstance(ShowCollectionDecorationPolicy.class, showCollectionDecorationPolicy);
    }

    private ShowCollectionDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInCollection() {
        this.isInCollection_ = false;
    }

    public static ShowCollectionDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ShowCollectionDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (ShowCollectionDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowCollectionDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (ShowCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInCollection(boolean z) {
        this.isInCollection_ = z;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isInCollection_"});
        }
        if (iOrdinal == 3) {
            return new ShowCollectionDecorationPolicy();
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
        synchronized (ShowCollectionDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.policy.proto.ShowCollectionDecorationPolicyOrBuilder
    public boolean getIsInCollection() {
        return this.isInCollection_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ShowCollectionDecorationPolicy showCollectionDecorationPolicy) {
        return DEFAULT_INSTANCE.createBuilder(showCollectionDecorationPolicy);
    }

    public static ShowCollectionDecorationPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowCollectionDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowCollectionDecorationPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ShowCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ShowCollectionDecorationPolicy parseFrom(phc phcVar) {
        return (ShowCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ShowCollectionDecorationPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (ShowCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ShowCollectionDecorationPolicy parseFrom(byte[] bArr) {
        return (ShowCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowCollectionDecorationPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ShowCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ShowCollectionDecorationPolicy parseFrom(InputStream inputStream) {
        return (ShowCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowCollectionDecorationPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowCollectionDecorationPolicy parseFrom(lwg lwgVar) {
        return (ShowCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ShowCollectionDecorationPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ShowCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
