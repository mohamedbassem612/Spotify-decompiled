package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class RetrieveNodeRequest$Filter extends h implements RetrieveNodeRequest$FilterOrBuilder {
    private static final RetrieveNodeRequest$Filter DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int URI_KINDS_FIELD_NUMBER = 1;
    private h290 uriKinds_ = h.emptyProtobufList();

    static {
        RetrieveNodeRequest$Filter retrieveNodeRequest$Filter = new RetrieveNodeRequest$Filter();
        DEFAULT_INSTANCE = retrieveNodeRequest$Filter;
        h.registerDefaultInstance(RetrieveNodeRequest$Filter.class, retrieveNodeRequest$Filter);
    }

    private RetrieveNodeRequest$Filter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUriKinds(Iterable<String> iterable) {
        ensureUriKindsIsMutable();
        s8.addAll(iterable, this.uriKinds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUriKinds(String str) {
        str.getClass();
        ensureUriKindsIsMutable();
        this.uriKinds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUriKindsBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        ensureUriKindsIsMutable();
        this.uriKinds_.add(phcVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUriKinds() {
        this.uriKinds_ = h.emptyProtobufList();
    }

    private void ensureUriKindsIsMutable() {
        i9 i9Var = this.uriKinds_;
        if (i9Var.a) {
            return;
        }
        this.uriKinds_ = h.mutableCopy(i9Var);
    }

    public static RetrieveNodeRequest$Filter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RetrieveNodeRequest$Filter parseDelimitedFrom(InputStream inputStream) {
        return (RetrieveNodeRequest$Filter) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveNodeRequest$Filter parseFrom(ByteBuffer byteBuffer) {
        return (RetrieveNodeRequest$Filter) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriKinds(int i, String str) {
        str.getClass();
        ensureUriKindsIsMutable();
        this.uriKinds_.set(i, str);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"uriKinds_"});
        }
        if (iOrdinal == 3) {
            return new RetrieveNodeRequest$Filter();
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
        synchronized (RetrieveNodeRequest$Filter.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest$FilterOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest$FilterOrBuilder
    public String getUriKinds(int i) {
        return (String) this.uriKinds_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest$FilterOrBuilder
    public phc getUriKindsBytes(int i) {
        return phc.i((String) this.uriKinds_.get(i));
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest$FilterOrBuilder
    public int getUriKindsCount() {
        return this.uriKinds_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest$FilterOrBuilder
    public List<String> getUriKindsList() {
        return this.uriKinds_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements RetrieveNodeRequest$FilterOrBuilder {
        private Builder() {
            super(RetrieveNodeRequest$Filter.DEFAULT_INSTANCE);
        }

        public Builder addAllUriKinds(Iterable<String> iterable) {
            copyOnWrite();
            ((RetrieveNodeRequest$Filter) ((g) this).instance).addAllUriKinds(iterable);
            return this;
        }

        public Builder addUriKinds(String str) {
            copyOnWrite();
            ((RetrieveNodeRequest$Filter) ((g) this).instance).addUriKinds(str);
            return this;
        }

        public Builder addUriKindsBytes(phc phcVar) {
            copyOnWrite();
            ((RetrieveNodeRequest$Filter) ((g) this).instance).addUriKindsBytes(phcVar);
            return this;
        }

        public /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        public /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        public /* bridge */ /* synthetic */ r2j0 clear() {
            return clear();
        }

        public Builder clearUriKinds() {
            copyOnWrite();
            ((RetrieveNodeRequest$Filter) ((g) this).instance).clearUriKinds();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest$FilterOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest$FilterOrBuilder
        public String getUriKinds(int i) {
            return ((RetrieveNodeRequest$Filter) ((g) this).instance).getUriKinds(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest$FilterOrBuilder
        public phc getUriKindsBytes(int i) {
            return ((RetrieveNodeRequest$Filter) ((g) this).instance).getUriKindsBytes(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest$FilterOrBuilder
        public int getUriKindsCount() {
            return ((RetrieveNodeRequest$Filter) ((g) this).instance).getUriKindsCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest$FilterOrBuilder
        public List<String> getUriKindsList() {
            return Collections.unmodifiableList(((RetrieveNodeRequest$Filter) ((g) this).instance).getUriKindsList());
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m674mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setUriKinds(int i, String str) {
            copyOnWrite();
            ((RetrieveNodeRequest$Filter) ((g) this).instance).setUriKinds(i, str);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m673clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m675mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m672clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m676mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super/*p.r8*/.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super/*p.r8*/.mergeFrom(phcVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super/*p.r8*/.mergeFrom(lwgVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super/*p.r8*/.mergeFrom(s2j0Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super/*p.r8*/.mergeFrom(bArr);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }
    }

    public static Builder newBuilder(RetrieveNodeRequest$Filter retrieveNodeRequest$Filter) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(retrieveNodeRequest$Filter);
    }

    public static RetrieveNodeRequest$Filter parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (RetrieveNodeRequest$Filter) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RetrieveNodeRequest$Filter parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (RetrieveNodeRequest$Filter) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static RetrieveNodeRequest$Filter parseFrom(phc phcVar) {
        return (RetrieveNodeRequest$Filter) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static RetrieveNodeRequest$Filter parseFrom(phc phcVar, uz00 uz00Var) {
        return (RetrieveNodeRequest$Filter) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static RetrieveNodeRequest$Filter parseFrom(byte[] bArr) {
        return (RetrieveNodeRequest$Filter) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RetrieveNodeRequest$Filter parseFrom(byte[] bArr, uz00 uz00Var) {
        return (RetrieveNodeRequest$Filter) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static RetrieveNodeRequest$Filter parseFrom(InputStream inputStream) {
        return (RetrieveNodeRequest$Filter) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveNodeRequest$Filter parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (RetrieveNodeRequest$Filter) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RetrieveNodeRequest$Filter parseFrom(lwg lwgVar) {
        return (RetrieveNodeRequest$Filter) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static RetrieveNodeRequest$Filter parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (RetrieveNodeRequest$Filter) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
