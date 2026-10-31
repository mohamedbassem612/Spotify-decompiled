package com.spotify.localfiles.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class QueryResult extends h implements QueryResultOrBuilder {
    private static final QueryResult DEFAULT_INSTANCE;
    public static final int FILES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 files_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.localfiles.proto.QueryResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[jf40.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        QueryResult queryResult = new QueryResult();
        DEFAULT_INSTANCE = queryResult;
        h.registerDefaultInstance(QueryResult.class, queryResult);
    }

    private QueryResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFiles(Iterable<? extends LocalFile> iterable) {
        ensureFilesIsMutable();
        s8.addAll(iterable, this.files_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFiles(LocalFile localFile) {
        localFile.getClass();
        ensureFilesIsMutable();
        this.files_.add(localFile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFiles() {
        this.files_ = h.emptyProtobufList();
    }

    private void ensureFilesIsMutable() {
        i9 i9Var = this.files_;
        if (i9Var.a) {
            return;
        }
        this.files_ = h.mutableCopy(i9Var);
    }

    public static QueryResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static QueryResult parseDelimitedFrom(InputStream inputStream) {
        return (QueryResult) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QueryResult parseFrom(ByteBuffer byteBuffer) {
        return (QueryResult) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFiles(int i) {
        ensureFilesIsMutable();
        this.files_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFiles(int i, LocalFile localFile) {
        localFile.getClass();
        ensureFilesIsMutable();
        this.files_.set(i, localFile);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"files_", LocalFile.class});
        }
        if (iOrdinal == 3) {
            return new QueryResult();
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
        synchronized (QueryResult.class) {
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

    @Override // com.spotify.localfiles.proto.QueryResultOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.localfiles.proto.QueryResultOrBuilder
    public LocalFile getFiles(int i) {
        return (LocalFile) this.files_.get(i);
    }

    @Override // com.spotify.localfiles.proto.QueryResultOrBuilder
    public int getFilesCount() {
        return this.files_.size();
    }

    @Override // com.spotify.localfiles.proto.QueryResultOrBuilder
    public List<LocalFile> getFilesList() {
        return this.files_;
    }

    public LocalFileOrBuilder getFilesOrBuilder(int i) {
        return (LocalFileOrBuilder) this.files_.get(i);
    }

    public List<? extends LocalFileOrBuilder> getFilesOrBuilderList() {
        return this.files_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements QueryResultOrBuilder {
        private Builder() {
            super(QueryResult.DEFAULT_INSTANCE);
        }

        public Builder addAllFiles(Iterable<? extends LocalFile> iterable) {
            copyOnWrite();
            ((QueryResult) ((g) this).instance).addAllFiles(iterable);
            return this;
        }

        public Builder addFiles(LocalFile.Builder builder) {
            copyOnWrite();
            ((QueryResult) ((g) this).instance).addFiles((LocalFile) builder.build());
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

        public Builder clearFiles() {
            copyOnWrite();
            ((QueryResult) ((g) this).instance).clearFiles();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.localfiles.proto.QueryResultOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.localfiles.proto.QueryResultOrBuilder
        public LocalFile getFiles(int i) {
            return ((QueryResult) ((g) this).instance).getFiles(i);
        }

        @Override // com.spotify.localfiles.proto.QueryResultOrBuilder
        public int getFilesCount() {
            return ((QueryResult) ((g) this).instance).getFilesCount();
        }

        @Override // com.spotify.localfiles.proto.QueryResultOrBuilder
        public List<LocalFile> getFilesList() {
            return Collections.unmodifiableList(((QueryResult) ((g) this).instance).getFilesList());
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m475mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder removeFiles(int i) {
            copyOnWrite();
            ((QueryResult) ((g) this).instance).removeFiles(i);
            return this;
        }

        public Builder setFiles(int i, LocalFile.Builder builder) {
            copyOnWrite();
            ((QueryResult) ((g) this).instance).setFiles(i, (LocalFile) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m474clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m476mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m473clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m477mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder addFiles(int i, LocalFile localFile) {
            copyOnWrite();
            ((QueryResult) ((g) this).instance).addFiles(i, localFile);
            return this;
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setFiles(int i, LocalFile localFile) {
            copyOnWrite();
            ((QueryResult) ((g) this).instance).setFiles(i, localFile);
            return this;
        }

        public Builder addFiles(LocalFile localFile) {
            copyOnWrite();
            ((QueryResult) ((g) this).instance).addFiles(localFile);
            return this;
        }

        public Builder addFiles(int i, LocalFile.Builder builder) {
            copyOnWrite();
            ((QueryResult) ((g) this).instance).addFiles(i, (LocalFile) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(QueryResult queryResult) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(queryResult);
    }

    public static QueryResult parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (QueryResult) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static QueryResult parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (QueryResult) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static QueryResult parseFrom(phc phcVar) {
        return (QueryResult) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static QueryResult parseFrom(phc phcVar, uz00 uz00Var) {
        return (QueryResult) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFiles(int i, LocalFile localFile) {
        localFile.getClass();
        ensureFilesIsMutable();
        this.files_.add(i, localFile);
    }

    public static QueryResult parseFrom(byte[] bArr) {
        return (QueryResult) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QueryResult parseFrom(byte[] bArr, uz00 uz00Var) {
        return (QueryResult) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static QueryResult parseFrom(InputStream inputStream) {
        return (QueryResult) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QueryResult parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (QueryResult) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static QueryResult parseFrom(lwg lwgVar) {
        return (QueryResult) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static QueryResult parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (QueryResult) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
