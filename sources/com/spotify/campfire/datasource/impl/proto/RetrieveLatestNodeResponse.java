package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class RetrieveLatestNodeResponse extends h implements RetrieveLatestNodeResponseOrBuilder {
    private static final RetrieveLatestNodeResponse DEFAULT_INSTANCE;
    public static final int LATEST_NODE_RESPONSE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 latestNodeResponse_ = h.emptyProtobufList();

    static {
        RetrieveLatestNodeResponse retrieveLatestNodeResponse = new RetrieveLatestNodeResponse();
        DEFAULT_INSTANCE = retrieveLatestNodeResponse;
        h.registerDefaultInstance(RetrieveLatestNodeResponse.class, retrieveLatestNodeResponse);
    }

    private RetrieveLatestNodeResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLatestNodeResponse(Iterable<? extends LatestNodeResponse> iterable) {
        ensureLatestNodeResponseIsMutable();
        s8.addAll(iterable, this.latestNodeResponse_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLatestNodeResponse(LatestNodeResponse latestNodeResponse) {
        latestNodeResponse.getClass();
        ensureLatestNodeResponseIsMutable();
        this.latestNodeResponse_.add(latestNodeResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatestNodeResponse() {
        this.latestNodeResponse_ = h.emptyProtobufList();
    }

    private void ensureLatestNodeResponseIsMutable() {
        h290 h290Var = this.latestNodeResponse_;
        if (((i9) h290Var).a) {
            return;
        }
        this.latestNodeResponse_ = h.mutableCopy(h290Var);
    }

    public static RetrieveLatestNodeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RetrieveLatestNodeResponse parseDelimitedFrom(InputStream inputStream) {
        return (RetrieveLatestNodeResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveLatestNodeResponse parseFrom(ByteBuffer byteBuffer) {
        return (RetrieveLatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLatestNodeResponse(int i) {
        ensureLatestNodeResponseIsMutable();
        this.latestNodeResponse_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatestNodeResponse(int i, LatestNodeResponse latestNodeResponse) {
        latestNodeResponse.getClass();
        ensureLatestNodeResponseIsMutable();
        this.latestNodeResponse_.set(i, latestNodeResponse);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"latestNodeResponse_", LatestNodeResponse.class});
        }
        if (iOrdinal == 3) {
            return new RetrieveLatestNodeResponse();
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
        synchronized (RetrieveLatestNodeResponse.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeResponseOrBuilder
    public LatestNodeResponse getLatestNodeResponse(int i) {
        return (LatestNodeResponse) this.latestNodeResponse_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeResponseOrBuilder
    public int getLatestNodeResponseCount() {
        return this.latestNodeResponse_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeResponseOrBuilder
    public List<LatestNodeResponse> getLatestNodeResponseList() {
        return this.latestNodeResponse_;
    }

    public LatestNodeResponseOrBuilder getLatestNodeResponseOrBuilder(int i) {
        return (LatestNodeResponseOrBuilder) this.latestNodeResponse_.get(i);
    }

    public List<? extends LatestNodeResponseOrBuilder> getLatestNodeResponseOrBuilderList() {
        return this.latestNodeResponse_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(RetrieveLatestNodeResponse retrieveLatestNodeResponse) {
        return DEFAULT_INSTANCE.createBuilder(retrieveLatestNodeResponse);
    }

    public static RetrieveLatestNodeResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (RetrieveLatestNodeResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RetrieveLatestNodeResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (RetrieveLatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static RetrieveLatestNodeResponse parseFrom(phc phcVar) {
        return (RetrieveLatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static RetrieveLatestNodeResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (RetrieveLatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLatestNodeResponse(int i, LatestNodeResponse latestNodeResponse) {
        latestNodeResponse.getClass();
        ensureLatestNodeResponseIsMutable();
        this.latestNodeResponse_.add(i, latestNodeResponse);
    }

    public static RetrieveLatestNodeResponse parseFrom(byte[] bArr) {
        return (RetrieveLatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RetrieveLatestNodeResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (RetrieveLatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static RetrieveLatestNodeResponse parseFrom(InputStream inputStream) {
        return (RetrieveLatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveLatestNodeResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (RetrieveLatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RetrieveLatestNodeResponse parseFrom(lwg lwgVar) {
        return (RetrieveLatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static RetrieveLatestNodeResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (RetrieveLatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
