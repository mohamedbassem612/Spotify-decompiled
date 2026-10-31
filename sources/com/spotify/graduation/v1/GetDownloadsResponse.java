package com.spotify.graduation.v1;

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
public final class GetDownloadsResponse extends h implements GetDownloadsResponseOrBuilder {
    private static final GetDownloadsResponse DEFAULT_INSTANCE;
    public static final int DOWNLOADS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 downloads_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.graduation.v1.GetDownloadsResponse$1, reason: invalid class name */
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
        GetDownloadsResponse getDownloadsResponse = new GetDownloadsResponse();
        DEFAULT_INSTANCE = getDownloadsResponse;
        h.registerDefaultInstance(GetDownloadsResponse.class, getDownloadsResponse);
    }

    private GetDownloadsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDownloads(Iterable<? extends Download> iterable) {
        ensureDownloadsIsMutable();
        s8.addAll(iterable, this.downloads_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDownloads(Download download) {
        download.getClass();
        ensureDownloadsIsMutable();
        this.downloads_.add(download);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloads() {
        this.downloads_ = h.emptyProtobufList();
    }

    private void ensureDownloadsIsMutable() {
        i9 i9Var = this.downloads_;
        if (i9Var.a) {
            return;
        }
        this.downloads_ = h.mutableCopy(i9Var);
    }

    public static GetDownloadsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetDownloadsResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetDownloadsResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetDownloadsResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetDownloadsResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDownloads(int i) {
        ensureDownloadsIsMutable();
        this.downloads_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloads(int i, Download download) {
        download.getClass();
        ensureDownloadsIsMutable();
        this.downloads_.set(i, download);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"downloads_", Download.class});
        }
        if (iOrdinal == 3) {
            return new GetDownloadsResponse();
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
        synchronized (GetDownloadsResponse.class) {
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

    @Override // com.spotify.graduation.v1.GetDownloadsResponseOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.graduation.v1.GetDownloadsResponseOrBuilder
    public final Download getDownloads(int i) {
        return (Download) this.downloads_.get(i);
    }

    @Override // com.spotify.graduation.v1.GetDownloadsResponseOrBuilder
    public final int getDownloadsCount() {
        return this.downloads_.size();
    }

    @Override // com.spotify.graduation.v1.GetDownloadsResponseOrBuilder
    public final List<Download> getDownloadsList() {
        return this.downloads_;
    }

    public final DownloadOrBuilder getDownloadsOrBuilder(int i) {
        return (DownloadOrBuilder) this.downloads_.get(i);
    }

    public final List<? extends DownloadOrBuilder> getDownloadsOrBuilderList() {
        return this.downloads_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GetDownloadsResponseOrBuilder {
        private Builder() {
            super(GetDownloadsResponse.DEFAULT_INSTANCE);
        }

        public final Builder addAllDownloads(Iterable<? extends Download> iterable) {
            copyOnWrite();
            ((GetDownloadsResponse) ((g) this).instance).addAllDownloads(iterable);
            return this;
        }

        public final Builder addDownloads(Download.Builder builder) {
            copyOnWrite();
            ((GetDownloadsResponse) ((g) this).instance).addDownloads((Download) builder.build());
            return this;
        }

        public final /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        public final /* bridge */ /* synthetic */ r2j0 clear() {
            return clear();
        }

        public final Builder clearDownloads() {
            copyOnWrite();
            ((GetDownloadsResponse) ((g) this).instance).clearDownloads();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.graduation.v1.GetDownloadsResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.graduation.v1.GetDownloadsResponseOrBuilder
        public final Download getDownloads(int i) {
            return ((GetDownloadsResponse) ((g) this).instance).getDownloads(i);
        }

        @Override // com.spotify.graduation.v1.GetDownloadsResponseOrBuilder
        public final int getDownloadsCount() {
            return ((GetDownloadsResponse) ((g) this).instance).getDownloadsCount();
        }

        @Override // com.spotify.graduation.v1.GetDownloadsResponseOrBuilder
        public final List<Download> getDownloadsList() {
            return Collections.unmodifiableList(((GetDownloadsResponse) ((g) this).instance).getDownloadsList());
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m360mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder removeDownloads(int i) {
            copyOnWrite();
            ((GetDownloadsResponse) ((g) this).instance).removeDownloads(i);
            return this;
        }

        public final Builder setDownloads(int i, Download.Builder builder) {
            copyOnWrite();
            ((GetDownloadsResponse) ((g) this).instance).setDownloads(i, (Download) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m359clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m361mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m358clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m362mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super/*p.r8*/.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super/*p.r8*/.mergeFrom(phcVar);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super/*p.r8*/.mergeFrom(lwgVar);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super/*p.r8*/.mergeFrom(s2j0Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super/*p.r8*/.mergeFrom(bArr);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public final Builder addDownloads(int i, Download download) {
            copyOnWrite();
            ((GetDownloadsResponse) ((g) this).instance).addDownloads(i, download);
            return this;
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public final Builder setDownloads(int i, Download download) {
            copyOnWrite();
            ((GetDownloadsResponse) ((g) this).instance).setDownloads(i, download);
            return this;
        }

        public final Builder addDownloads(Download download) {
            copyOnWrite();
            ((GetDownloadsResponse) ((g) this).instance).addDownloads(download);
            return this;
        }

        public final Builder addDownloads(int i, Download.Builder builder) {
            copyOnWrite();
            ((GetDownloadsResponse) ((g) this).instance).addDownloads(i, (Download) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(GetDownloadsResponse getDownloadsResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getDownloadsResponse);
    }

    public static GetDownloadsResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetDownloadsResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetDownloadsResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetDownloadsResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetDownloadsResponse parseFrom(phc phcVar) {
        return (GetDownloadsResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetDownloadsResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetDownloadsResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDownloads(int i, Download download) {
        download.getClass();
        ensureDownloadsIsMutable();
        this.downloads_.add(i, download);
    }

    public static GetDownloadsResponse parseFrom(byte[] bArr) {
        return (GetDownloadsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetDownloadsResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetDownloadsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetDownloadsResponse parseFrom(InputStream inputStream) {
        return (GetDownloadsResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetDownloadsResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetDownloadsResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetDownloadsResponse parseFrom(lwg lwgVar) {
        return (GetDownloadsResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetDownloadsResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetDownloadsResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
