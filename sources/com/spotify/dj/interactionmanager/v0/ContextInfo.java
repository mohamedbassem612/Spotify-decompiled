package com.spotify.dj.interactionmanager.v0;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p.bf40;
import p.bhn0;
import p.dng0;
import p.h290;
import p.i9;
import p.jf40;
import p.kul1;
import p.lwg;
import p.phc;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;
import p.ytl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ContextInfo extends h implements ContextInfoOrBuilder {
    private static final ContextInfo DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private qng0 metadata_ = qng0.b;
    private String uri_ = "";
    private h290 pages_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.ContextInfo$1, reason: invalid class name */
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

    public static final class MetadataDefaultEntryHolder {
        static final dng0 defaultEntry;

        static {
            ytl1 ytl1Var = kul1.g;
            defaultEntry = new dng0(ytl1Var, "", ytl1Var, "");
        }

        private MetadataDefaultEntryHolder() {
        }
    }

    static {
        ContextInfo contextInfo = new ContextInfo();
        DEFAULT_INSTANCE = contextInfo;
        h.registerDefaultInstance(ContextInfo.class, contextInfo);
    }

    private ContextInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPages(Iterable<? extends ContextPage> iterable) {
        ensurePagesIsMutable();
        s8.addAll(iterable, this.pages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(ContextPage contextPage) {
        contextPage.getClass();
        ensurePagesIsMutable();
        this.pages_.add(contextPage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPages() {
        this.pages_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = DEFAULT_INSTANCE.uri_;
    }

    private void ensurePagesIsMutable() {
        i9 i9Var = this.pages_;
        if (i9Var.a) {
            return;
        }
        this.pages_ = h.mutableCopy(i9Var);
    }

    public static ContextInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, String> getMutableMetadataMap() {
        return internalGetMutableMetadata();
    }

    private qng0 internalGetMetadata() {
        return this.metadata_;
    }

    private qng0 internalGetMutableMetadata() {
        qng0 qng0Var = this.metadata_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.metadata_ = qng0VarH;
        return qng0VarH;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ContextInfo parseDelimitedFrom(InputStream inputStream) {
        return (ContextInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextInfo parseFrom(ByteBuffer byteBuffer) {
        return (ContextInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePages(int i) {
        ensurePagesIsMutable();
        this.pages_.remove(i);
    }

    public static qng0 s(ContextInfo contextInfo) {
        return contextInfo.internalGetMutableMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPages(int i, ContextPage contextPage) {
        contextPage.getClass();
        ensurePagesIsMutable();
        this.pages_.set(i, contextPage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.uri_ = phcVar.v();
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
    public final boolean containsMetadata(String str) {
        str.getClass();
        return this.metadata_.containsKey(str);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0001\u0000\u0001Ȉ\u00022\u0003\u001b", new Object[]{"uri_", "metadata_", MetadataDefaultEntryHolder.defaultEntry, "pages_", ContextPage.class});
        }
        if (iOrdinal == 3) {
            return new ContextInfo();
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
        synchronized (ContextInfo.class) {
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

    @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
    @Deprecated
    public final Map<String, String> getMetadata() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
    public final int getMetadataCount() {
        return this.metadata_.size();
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
    public final Map<String, String> getMetadataMap() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
    public final String getMetadataOrDefault(String str, String str2) {
        str.getClass();
        qng0 qng0Var = this.metadata_;
        return qng0Var.containsKey(str) ? (String) qng0Var.get(str) : str2;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
    public final String getMetadataOrThrow(String str) {
        str.getClass();
        qng0 qng0Var = this.metadata_;
        if (qng0Var.containsKey(str)) {
            return (String) qng0Var.get(str);
        }
        bhn0.q();
        return null;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
    public final ContextPage getPages(int i) {
        return (ContextPage) this.pages_.get(i);
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
    public final int getPagesCount() {
        return this.pages_.size();
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
    public final List<ContextPage> getPagesList() {
        return this.pages_;
    }

    public final ContextPageOrBuilder getPagesOrBuilder(int i) {
        return (ContextPageOrBuilder) this.pages_.get(i);
    }

    public final List<? extends ContextPageOrBuilder> getPagesOrBuilderList() {
        return this.pages_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
    public final String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
    public final phc getUriBytes() {
        return phc.i(this.uri_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ContextInfoOrBuilder {
        private Builder() {
            super(ContextInfo.DEFAULT_INSTANCE);
        }

        public final Builder addAllPages(Iterable<? extends ContextPage> iterable) {
            copyOnWrite();
            ((ContextInfo) ((g) this).instance).addAllPages(iterable);
            return this;
        }

        public final Builder addPages(ContextPage.Builder builder) {
            copyOnWrite();
            ((ContextInfo) ((g) this).instance).addPages((ContextPage) builder.build());
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

        public final Builder clearMetadata() {
            copyOnWrite();
            ContextInfo.s((ContextInfo) ((g) this).instance).clear();
            return this;
        }

        public final Builder clearPages() {
            copyOnWrite();
            ((ContextInfo) ((g) this).instance).clearPages();
            return this;
        }

        public final Builder clearUri() {
            copyOnWrite();
            ((ContextInfo) ((g) this).instance).clearUri();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
        public final boolean containsMetadata(String str) {
            str.getClass();
            return ((ContextInfo) ((g) this).instance).getMetadataMap().containsKey(str);
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
        @Deprecated
        public final Map<String, String> getMetadata() {
            return getMetadataMap();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
        public final int getMetadataCount() {
            return ((ContextInfo) ((g) this).instance).getMetadataMap().size();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
        public final Map<String, String> getMetadataMap() {
            return Collections.unmodifiableMap(((ContextInfo) ((g) this).instance).getMetadataMap());
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
        public final String getMetadataOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> metadataMap = ((ContextInfo) ((g) this).instance).getMetadataMap();
            return metadataMap.containsKey(str) ? metadataMap.get(str) : str2;
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
        public final String getMetadataOrThrow(String str) {
            str.getClass();
            Map<String, String> metadataMap = ((ContextInfo) ((g) this).instance).getMetadataMap();
            if (metadataMap.containsKey(str)) {
                return metadataMap.get(str);
            }
            bhn0.q();
            return null;
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
        public final ContextPage getPages(int i) {
            return ((ContextInfo) ((g) this).instance).getPages(i);
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
        public final int getPagesCount() {
            return ((ContextInfo) ((g) this).instance).getPagesCount();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
        public final List<ContextPage> getPagesList() {
            return Collections.unmodifiableList(((ContextInfo) ((g) this).instance).getPagesList());
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
        public final String getUri() {
            return ((ContextInfo) ((g) this).instance).getUri();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextInfoOrBuilder
        public final phc getUriBytes() {
            return ((ContextInfo) ((g) this).instance).getUriBytes();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m12mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder putAllMetadata(Map<String, String> map) {
            copyOnWrite();
            ContextInfo.s((ContextInfo) ((g) this).instance).putAll(map);
            return this;
        }

        public final Builder putMetadata(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ContextInfo.s((ContextInfo) ((g) this).instance).put(str, str2);
            return this;
        }

        public final Builder removeMetadata(String str) {
            str.getClass();
            copyOnWrite();
            ContextInfo.s((ContextInfo) ((g) this).instance).remove(str);
            return this;
        }

        public final Builder removePages(int i) {
            copyOnWrite();
            ((ContextInfo) ((g) this).instance).removePages(i);
            return this;
        }

        public final Builder setPages(int i, ContextPage.Builder builder) {
            copyOnWrite();
            ((ContextInfo) ((g) this).instance).setPages(i, (ContextPage) builder.build());
            return this;
        }

        public final Builder setUri(String str) {
            copyOnWrite();
            ((ContextInfo) ((g) this).instance).setUri(str);
            return this;
        }

        public final Builder setUriBytes(phc phcVar) {
            copyOnWrite();
            ((ContextInfo) ((g) this).instance).setUriBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m11clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m13mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m10clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m14mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public final Builder addPages(int i, ContextPage contextPage) {
            copyOnWrite();
            ((ContextInfo) ((g) this).instance).addPages(i, contextPage);
            return this;
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public final Builder setPages(int i, ContextPage contextPage) {
            copyOnWrite();
            ((ContextInfo) ((g) this).instance).setPages(i, contextPage);
            return this;
        }

        public final Builder addPages(ContextPage contextPage) {
            copyOnWrite();
            ((ContextInfo) ((g) this).instance).addPages(contextPage);
            return this;
        }

        public final Builder addPages(int i, ContextPage.Builder builder) {
            copyOnWrite();
            ((ContextInfo) ((g) this).instance).addPages(i, (ContextPage) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(ContextInfo contextInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(contextInfo);
    }

    public static ContextInfo parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ContextInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ContextInfo parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ContextInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ContextInfo parseFrom(phc phcVar) {
        return (ContextInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ContextInfo parseFrom(phc phcVar, uz00 uz00Var) {
        return (ContextInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(int i, ContextPage contextPage) {
        contextPage.getClass();
        ensurePagesIsMutable();
        this.pages_.add(i, contextPage);
    }

    public static ContextInfo parseFrom(byte[] bArr) {
        return (ContextInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContextInfo parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ContextInfo) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ContextInfo parseFrom(InputStream inputStream) {
        return (ContextInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextInfo parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ContextInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ContextInfo parseFrom(lwg lwgVar) {
        return (ContextInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ContextInfo parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ContextInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
