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
public final class ContextPage extends h implements ContextPageOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final ContextPage DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private qng0 metadata_ = qng0.b;
    private String id_ = "";
    private h290 content_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.ContextPage$1, reason: invalid class name */
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
        ContextPage contextPage = new ContextPage();
        DEFAULT_INSTANCE = contextPage;
        h.registerDefaultInstance(ContextPage.class, contextPage);
    }

    private ContextPage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllContent(Iterable<? extends ContentElement> iterable) {
        ensureContentIsMutable();
        s8.addAll(iterable, this.content_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContent(ContentElement contentElement) {
        contentElement.getClass();
        ensureContentIsMutable();
        this.content_.add(contentElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = DEFAULT_INSTANCE.id_;
    }

    private void ensureContentIsMutable() {
        i9 i9Var = this.content_;
        if (i9Var.a) {
            return;
        }
        this.content_ = h.mutableCopy(i9Var);
    }

    public static ContextPage getDefaultInstance() {
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

    public static ContextPage parseDelimitedFrom(InputStream inputStream) {
        return (ContextPage) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextPage parseFrom(ByteBuffer byteBuffer) {
        return (ContextPage) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeContent(int i) {
        ensureContentIsMutable();
        this.content_.remove(i);
    }

    public static qng0 s(ContextPage contextPage) {
        return contextPage.internalGetMutableMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(int i, ContentElement contentElement) {
        contentElement.getClass();
        ensureContentIsMutable();
        this.content_.set(i, contentElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.id_ = phcVar.v();
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0001\u0000\u0001Ȉ\u0002\u001b\u00032", new Object[]{"id_", "content_", ContentElement.class, "metadata_", MetadataDefaultEntryHolder.defaultEntry});
        }
        if (iOrdinal == 3) {
            return new ContextPage();
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
        synchronized (ContextPage.class) {
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

    @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
    public final ContentElement getContent(int i) {
        return (ContentElement) this.content_.get(i);
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
    public final int getContentCount() {
        return this.content_.size();
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
    public final List<ContentElement> getContentList() {
        return this.content_;
    }

    public final ContentElementOrBuilder getContentOrBuilder(int i) {
        return (ContentElementOrBuilder) this.content_.get(i);
    }

    public final List<? extends ContentElementOrBuilder> getContentOrBuilderList() {
        return this.content_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
    public final String getId() {
        return this.id_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
    public final phc getIdBytes() {
        return phc.i(this.id_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
    @Deprecated
    public final Map<String, String> getMetadata() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
    public final int getMetadataCount() {
        return this.metadata_.size();
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
    public final Map<String, String> getMetadataMap() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
    public final String getMetadataOrDefault(String str, String str2) {
        str.getClass();
        qng0 qng0Var = this.metadata_;
        return qng0Var.containsKey(str) ? (String) qng0Var.get(str) : str2;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
    public final String getMetadataOrThrow(String str) {
        str.getClass();
        qng0 qng0Var = this.metadata_;
        if (qng0Var.containsKey(str)) {
            return (String) qng0Var.get(str);
        }
        bhn0.q();
        return null;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ContextPageOrBuilder {
        private Builder() {
            super(ContextPage.DEFAULT_INSTANCE);
        }

        public final Builder addAllContent(Iterable<? extends ContentElement> iterable) {
            copyOnWrite();
            ((ContextPage) ((g) this).instance).addAllContent(iterable);
            return this;
        }

        public final Builder addContent(ContentElement.Builder builder) {
            copyOnWrite();
            ((ContextPage) ((g) this).instance).addContent((ContentElement) builder.build());
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

        public final Builder clearContent() {
            copyOnWrite();
            ((ContextPage) ((g) this).instance).clearContent();
            return this;
        }

        public final Builder clearId() {
            copyOnWrite();
            ((ContextPage) ((g) this).instance).clearId();
            return this;
        }

        public final Builder clearMetadata() {
            copyOnWrite();
            ContextPage.s((ContextPage) ((g) this).instance).clear();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
        public final boolean containsMetadata(String str) {
            str.getClass();
            return ((ContextPage) ((g) this).instance).getMetadataMap().containsKey(str);
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
        public final ContentElement getContent(int i) {
            return ((ContextPage) ((g) this).instance).getContent(i);
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
        public final int getContentCount() {
            return ((ContextPage) ((g) this).instance).getContentCount();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
        public final List<ContentElement> getContentList() {
            return Collections.unmodifiableList(((ContextPage) ((g) this).instance).getContentList());
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
        public final String getId() {
            return ((ContextPage) ((g) this).instance).getId();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
        public final phc getIdBytes() {
            return ((ContextPage) ((g) this).instance).getIdBytes();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
        @Deprecated
        public final Map<String, String> getMetadata() {
            return getMetadataMap();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
        public final int getMetadataCount() {
            return ((ContextPage) ((g) this).instance).getMetadataMap().size();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
        public final Map<String, String> getMetadataMap() {
            return Collections.unmodifiableMap(((ContextPage) ((g) this).instance).getMetadataMap());
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
        public final String getMetadataOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> metadataMap = ((ContextPage) ((g) this).instance).getMetadataMap();
            return metadataMap.containsKey(str) ? metadataMap.get(str) : str2;
        }

        @Override // com.spotify.dj.interactionmanager.v0.ContextPageOrBuilder
        public final String getMetadataOrThrow(String str) {
            str.getClass();
            Map<String, String> metadataMap = ((ContextPage) ((g) this).instance).getMetadataMap();
            if (metadataMap.containsKey(str)) {
                return metadataMap.get(str);
            }
            bhn0.q();
            return null;
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m17mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder putAllMetadata(Map<String, String> map) {
            copyOnWrite();
            ContextPage.s((ContextPage) ((g) this).instance).putAll(map);
            return this;
        }

        public final Builder putMetadata(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ContextPage.s((ContextPage) ((g) this).instance).put(str, str2);
            return this;
        }

        public final Builder removeContent(int i) {
            copyOnWrite();
            ((ContextPage) ((g) this).instance).removeContent(i);
            return this;
        }

        public final Builder removeMetadata(String str) {
            str.getClass();
            copyOnWrite();
            ContextPage.s((ContextPage) ((g) this).instance).remove(str);
            return this;
        }

        public final Builder setContent(int i, ContentElement.Builder builder) {
            copyOnWrite();
            ((ContextPage) ((g) this).instance).setContent(i, (ContentElement) builder.build());
            return this;
        }

        public final Builder setId(String str) {
            copyOnWrite();
            ((ContextPage) ((g) this).instance).setId(str);
            return this;
        }

        public final Builder setIdBytes(phc phcVar) {
            copyOnWrite();
            ((ContextPage) ((g) this).instance).setIdBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m16clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m18mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m15clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m19mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public final Builder addContent(int i, ContentElement contentElement) {
            copyOnWrite();
            ((ContextPage) ((g) this).instance).addContent(i, contentElement);
            return this;
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public final Builder setContent(int i, ContentElement contentElement) {
            copyOnWrite();
            ((ContextPage) ((g) this).instance).setContent(i, contentElement);
            return this;
        }

        public final Builder addContent(ContentElement contentElement) {
            copyOnWrite();
            ((ContextPage) ((g) this).instance).addContent(contentElement);
            return this;
        }

        public final Builder addContent(int i, ContentElement.Builder builder) {
            copyOnWrite();
            ((ContextPage) ((g) this).instance).addContent(i, (ContentElement) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(ContextPage contextPage) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(contextPage);
    }

    public static ContextPage parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ContextPage) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ContextPage parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ContextPage) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ContextPage parseFrom(phc phcVar) {
        return (ContextPage) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ContextPage parseFrom(phc phcVar, uz00 uz00Var) {
        return (ContextPage) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContent(int i, ContentElement contentElement) {
        contentElement.getClass();
        ensureContentIsMutable();
        this.content_.add(i, contentElement);
    }

    public static ContextPage parseFrom(byte[] bArr) {
        return (ContextPage) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContextPage parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ContextPage) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ContextPage parseFrom(InputStream inputStream) {
        return (ContextPage) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextPage parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ContextPage) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ContextPage parseFrom(lwg lwgVar) {
        return (ContextPage) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ContextPage parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ContextPage) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
