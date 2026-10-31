package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class RetrieveLatestNodeRequest extends h implements RetrieveLatestNodeRequestOrBuilder {
    private static final RetrieveLatestNodeRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PRECONDITION_FIELD_NUMBER = 3;
    public static final int SORT_ORDER_FIELD_NUMBER = 1;
    private int bitField0_;
    private int limit_;
    private Precondition precondition_;
    private int sortOrder_;

    static {
        RetrieveLatestNodeRequest retrieveLatestNodeRequest = new RetrieveLatestNodeRequest();
        DEFAULT_INSTANCE = retrieveLatestNodeRequest;
        h.registerDefaultInstance(RetrieveLatestNodeRequest.class, retrieveLatestNodeRequest);
    }

    private RetrieveLatestNodeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimit() {
        this.bitField0_ &= -3;
        this.limit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrecondition() {
        this.precondition_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSortOrder() {
        this.bitField0_ &= -2;
        this.sortOrder_ = 0;
    }

    public static RetrieveLatestNodeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrecondition(Precondition precondition) {
        precondition.getClass();
        Precondition precondition2 = this.precondition_;
        if (precondition2 == null || precondition2 == Precondition.getDefaultInstance()) {
            this.precondition_ = precondition;
        } else {
            this.precondition_ = (Precondition) Precondition.newBuilder(this.precondition_).mergeFrom(precondition).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RetrieveLatestNodeRequest parseDelimitedFrom(InputStream inputStream) {
        return (RetrieveLatestNodeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveLatestNodeRequest parseFrom(ByteBuffer byteBuffer) {
        return (RetrieveLatestNodeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimit(int i) {
        this.bitField0_ |= 2;
        this.limit_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrecondition(Precondition precondition) {
        precondition.getClass();
        this.precondition_ = precondition;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder_ = sortOrder.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortOrderValue(int i) {
        this.bitField0_ |= 1;
        this.sortOrder_ = i;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "sortOrder_", "limit_", "precondition_"});
        }
        if (iOrdinal == 3) {
            return new RetrieveLatestNodeRequest();
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
        synchronized (RetrieveLatestNodeRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public int getLimit() {
        return this.limit_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public Precondition getPrecondition() {
        Precondition precondition = this.precondition_;
        return precondition == null ? Precondition.getDefaultInstance() : precondition;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public SortOrder getSortOrder() {
        SortOrder sortOrderForNumber = SortOrder.forNumber(this.sortOrder_);
        return sortOrderForNumber == null ? SortOrder.UNRECOGNIZED : sortOrderForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public int getSortOrderValue() {
        return this.sortOrder_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public boolean hasLimit() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public boolean hasPrecondition() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public boolean hasSortOrder() {
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

    public static final class Builder extends g implements RetrieveLatestNodeRequestOrBuilder {
        private Builder() {
            super(RetrieveLatestNodeRequest.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.g, p.r2j0
        public /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        @Override // com.google.protobuf.g, p.r2j0
        public /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: clear */
        public /* bridge */ /* synthetic */ r2j0 mo0clear() {
            return mo0clear();
        }

        public Builder clearLimit() {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).clearLimit();
            return this;
        }

        public Builder clearPrecondition() {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).clearPrecondition();
            return this;
        }

        public Builder clearSortOrder() {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).clearSortOrder();
            return this;
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo3clone() {
            return super.mo1clone();
        }

        @Override // com.google.protobuf.g, p.v2j0
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public int getLimit() {
            return ((RetrieveLatestNodeRequest) this.instance).getLimit();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public Precondition getPrecondition() {
            return ((RetrieveLatestNodeRequest) this.instance).getPrecondition();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public SortOrder getSortOrder() {
            return ((RetrieveLatestNodeRequest) this.instance).getSortOrder();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public int getSortOrderValue() {
            return ((RetrieveLatestNodeRequest) this.instance).getSortOrderValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public boolean hasLimit() {
            return ((RetrieveLatestNodeRequest) this.instance).hasLimit();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public boolean hasPrecondition() {
            return ((RetrieveLatestNodeRequest) this.instance).hasPrecondition();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public boolean hasSortOrder() {
            return ((RetrieveLatestNodeRequest) this.instance).hasSortOrder();
        }

        @Override // com.google.protobuf.g, p.r8
        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        @Override // com.google.protobuf.g, p.r8, p.r2j0
        public /* bridge */ /* synthetic */ r8 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergePrecondition(Precondition precondition) {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).mergePrecondition(precondition);
            return this;
        }

        public Builder setLimit(int i) {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).setLimit(i);
            return this;
        }

        public Builder setPrecondition(Precondition.Builder builder) {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).setPrecondition((Precondition) builder.build());
            return this;
        }

        public Builder setSortOrder(SortOrder sortOrder) {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).setSortOrder(sortOrder);
            return this;
        }

        public Builder setSortOrderValue(int i) {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).setSortOrderValue(i);
            return this;
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ r8 mo2clone() {
            return super.mo1clone();
        }

        @Override // com.google.protobuf.g, p.r8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ r8 mo4mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo4mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ r2j0 mo2clone() {
            return super.mo1clone();
        }

        @Override // com.google.protobuf.g, p.r8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ r8 mo5mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mo5mergeFrom(bArr, i, i2, uz00Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super.mergeFrom(inputStream, uz00Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super.mergeFrom(phcVar);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super.mergeFrom(phcVar, uz00Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super.mergeFrom(lwgVar);
        }

        @Override // com.google.protobuf.g, p.r2j0
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        @Override // p.r8, p.r2j0
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super.mergeFrom(s2j0Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super.mergeFrom(bArr);
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ r2j0 mo4mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo4mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ r2j0 mo5mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mo5mergeFrom(bArr, i, i2, uz00Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super.mergeFrom(bArr, uz00Var);
        }

        public Builder setPrecondition(Precondition precondition) {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).setPrecondition(precondition);
            return this;
        }
    }

    public static Builder newBuilder(RetrieveLatestNodeRequest retrieveLatestNodeRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(retrieveLatestNodeRequest);
    }

    public static RetrieveLatestNodeRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (RetrieveLatestNodeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RetrieveLatestNodeRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (RetrieveLatestNodeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static RetrieveLatestNodeRequest parseFrom(phc phcVar) {
        return (RetrieveLatestNodeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static RetrieveLatestNodeRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (RetrieveLatestNodeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static RetrieveLatestNodeRequest parseFrom(byte[] bArr) {
        return (RetrieveLatestNodeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RetrieveLatestNodeRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (RetrieveLatestNodeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static RetrieveLatestNodeRequest parseFrom(InputStream inputStream) {
        return (RetrieveLatestNodeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveLatestNodeRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (RetrieveLatestNodeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RetrieveLatestNodeRequest parseFrom(lwg lwgVar) {
        return (RetrieveLatestNodeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static RetrieveLatestNodeRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (RetrieveLatestNodeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
