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
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class RetrieveNodeRequest extends h implements RetrieveNodeRequestOrBuilder {
    private static final RetrieveNodeRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 10;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    public static final int NEXT_LIMIT_FIELD_NUMBER = 4;
    public static final int NODE_PATH_ID_FIELD_NUMBER = 2;
    public static final int PAGE_SIZE_FIELD_NUMBER = 9;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PRECONDITION_FIELD_NUMBER = 6;
    public static final int PREV_LIMIT_FIELD_NUMBER = 3;
    public static final int SHARE_MESSAGE_URI_FIELD_NUMBER = 7;
    public static final int SORT_ORDER_FIELD_NUMBER = 5;
    private int bitField0_;
    private Filter filter_;
    private int nextLimit_;
    private int pageSize_;
    private Precondition precondition_;
    private int prevLimit_;
    private int sortOrder_;
    private String hierarchyId_ = "";
    private String nodePathId_ = "";
    private String shareMessageUri_ = "";
    private String pageToken_ = "";

    static {
        RetrieveNodeRequest retrieveNodeRequest = new RetrieveNodeRequest();
        DEFAULT_INSTANCE = retrieveNodeRequest;
        h.registerDefaultInstance(RetrieveNodeRequest.class, retrieveNodeRequest);
    }

    private RetrieveNodeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilter() {
        this.filter_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextLimit() {
        this.nextLimit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodePathId() {
        this.nodePathId_ = getDefaultInstance().getNodePathId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageSize() {
        this.pageSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageToken() {
        this.pageToken_ = getDefaultInstance().getPageToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrecondition() {
        this.precondition_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrevLimit() {
        this.prevLimit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareMessageUri() {
        this.bitField0_ &= -5;
        this.shareMessageUri_ = getDefaultInstance().getShareMessageUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSortOrder() {
        this.bitField0_ &= -2;
        this.sortOrder_ = 0;
    }

    public static RetrieveNodeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFilter(Filter filter) {
        filter.getClass();
        Filter filter2 = this.filter_;
        if (filter2 == null || filter2 == Filter.getDefaultInstance()) {
            this.filter_ = filter;
        } else {
            this.filter_ = Filter.newBuilder(this.filter_).mergeFrom(filter).buildPartial();
        }
        this.bitField0_ |= 8;
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
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RetrieveNodeRequest parseDelimitedFrom(InputStream inputStream) {
        return (RetrieveNodeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveNodeRequest parseFrom(ByteBuffer byteBuffer) {
        return (RetrieveNodeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilter(Filter filter) {
        filter.getClass();
        this.filter_ = filter;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyId(String str) {
        str.getClass();
        this.hierarchyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.hierarchyId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextLimit(int i) {
        this.nextLimit_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodePathId(String str) {
        str.getClass();
        this.nodePathId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodePathIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.nodePathId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageSize(int i) {
        this.pageSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageToken(String str) {
        str.getClass();
        this.pageToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageTokenBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.pageToken_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrecondition(Precondition precondition) {
        precondition.getClass();
        this.precondition_ = precondition;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrevLimit(int i) {
        this.prevLimit_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareMessageUri(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.shareMessageUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareMessageUriBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.shareMessageUri_ = phcVar.v();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005ဌ\u0000\u0006ဉ\u0001\u0007ለ\u0002\bȈ\t\u0004\nဉ\u0003", new Object[]{"bitField0_", "hierarchyId_", "nodePathId_", "prevLimit_", "nextLimit_", "sortOrder_", "precondition_", "shareMessageUri_", "pageToken_", "pageSize_", "filter_"});
        }
        if (iOrdinal == 3) {
            return new RetrieveNodeRequest();
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
        synchronized (RetrieveNodeRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public Filter getFilter() {
        Filter filter = this.filter_;
        return filter == null ? Filter.getDefaultInstance() : filter;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public phc getHierarchyIdBytes() {
        return phc.i(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public int getNextLimit() {
        return this.nextLimit_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public String getNodePathId() {
        return this.nodePathId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public phc getNodePathIdBytes() {
        return phc.i(this.nodePathId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public int getPageSize() {
        return this.pageSize_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public String getPageToken() {
        return this.pageToken_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public phc getPageTokenBytes() {
        return phc.i(this.pageToken_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public Precondition getPrecondition() {
        Precondition precondition = this.precondition_;
        return precondition == null ? Precondition.getDefaultInstance() : precondition;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public int getPrevLimit() {
        return this.prevLimit_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public String getShareMessageUri() {
        return this.shareMessageUri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public phc getShareMessageUriBytes() {
        return phc.i(this.shareMessageUri_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public SortOrder getSortOrder() {
        SortOrder sortOrderForNumber = SortOrder.forNumber(this.sortOrder_);
        return sortOrderForNumber == null ? SortOrder.UNRECOGNIZED : sortOrderForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public int getSortOrderValue() {
        return this.sortOrder_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public boolean hasFilter() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public boolean hasPrecondition() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public boolean hasShareMessageUri() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
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

    public static Builder newBuilder(RetrieveNodeRequest retrieveNodeRequest) {
        return DEFAULT_INSTANCE.createBuilder(retrieveNodeRequest);
    }

    public static RetrieveNodeRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (RetrieveNodeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RetrieveNodeRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (RetrieveNodeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static RetrieveNodeRequest parseFrom(phc phcVar) {
        return (RetrieveNodeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static RetrieveNodeRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (RetrieveNodeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static RetrieveNodeRequest parseFrom(byte[] bArr) {
        return (RetrieveNodeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RetrieveNodeRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (RetrieveNodeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static RetrieveNodeRequest parseFrom(InputStream inputStream) {
        return (RetrieveNodeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveNodeRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (RetrieveNodeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RetrieveNodeRequest parseFrom(lwg lwgVar) {
        return (RetrieveNodeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static RetrieveNodeRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (RetrieveNodeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
