package com.spotify.playlist.ai.creation.v2;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class CreateSessionResponse extends h implements CreateSessionResponseOrBuilder {
    private static final CreateSessionResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int POPULAR_PROMPTS_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SUGGESTED_PROMPTS_FIELD_NUMBER = 2;
    private String sessionId_ = "";
    private h290 suggestedPrompts_ = h.emptyProtobufList();
    private h290 popularPrompts_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.CreateSessionResponse$1, reason: invalid class name */
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
        CreateSessionResponse createSessionResponse = new CreateSessionResponse();
        DEFAULT_INSTANCE = createSessionResponse;
        h.registerDefaultInstance(CreateSessionResponse.class, createSessionResponse);
    }

    private CreateSessionResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPopularPrompts(Iterable<String> iterable) {
        ensurePopularPromptsIsMutable();
        s8.addAll(iterable, this.popularPrompts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSuggestedPrompts(Iterable<String> iterable) {
        ensureSuggestedPromptsIsMutable();
        s8.addAll(iterable, this.suggestedPrompts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPopularPrompts(String str) {
        str.getClass();
        ensurePopularPromptsIsMutable();
        this.popularPrompts_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPopularPromptsBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        ensurePopularPromptsIsMutable();
        this.popularPrompts_.add(phcVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuggestedPrompts(String str) {
        str.getClass();
        ensureSuggestedPromptsIsMutable();
        this.suggestedPrompts_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuggestedPromptsBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        ensureSuggestedPromptsIsMutable();
        this.suggestedPrompts_.add(phcVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularPrompts() {
        this.popularPrompts_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestedPrompts() {
        this.suggestedPrompts_ = h.emptyProtobufList();
    }

    private void ensurePopularPromptsIsMutable() {
        i9 i9Var = this.popularPrompts_;
        if (i9Var.a) {
            return;
        }
        this.popularPrompts_ = h.mutableCopy(i9Var);
    }

    private void ensureSuggestedPromptsIsMutable() {
        i9 i9Var = this.suggestedPrompts_;
        if (i9Var.a) {
            return;
        }
        this.suggestedPrompts_ = h.mutableCopy(i9Var);
    }

    public static CreateSessionResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CreateSessionResponse parseDelimitedFrom(InputStream inputStream) {
        return (CreateSessionResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateSessionResponse parseFrom(ByteBuffer byteBuffer) {
        return (CreateSessionResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularPrompts(int i, String str) {
        str.getClass();
        ensurePopularPromptsIsMutable();
        this.popularPrompts_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.sessionId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedPrompts(int i, String str) {
        str.getClass();
        ensureSuggestedPromptsIsMutable();
        this.suggestedPrompts_.set(i, str);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ț", new Object[]{"sessionId_", "suggestedPrompts_", "popularPrompts_"});
        }
        if (iOrdinal == 3) {
            return new CreateSessionResponse();
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
        synchronized (CreateSessionResponse.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
    public final String getPopularPrompts(int i) {
        return (String) this.popularPrompts_.get(i);
    }

    @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
    public final phc getPopularPromptsBytes(int i) {
        return phc.i((String) this.popularPrompts_.get(i));
    }

    @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
    public final int getPopularPromptsCount() {
        return this.popularPrompts_.size();
    }

    @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
    public final List<String> getPopularPromptsList() {
        return this.popularPrompts_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
    public final phc getSessionIdBytes() {
        return phc.i(this.sessionId_);
    }

    @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
    public final String getSuggestedPrompts(int i) {
        return (String) this.suggestedPrompts_.get(i);
    }

    @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
    public final phc getSuggestedPromptsBytes(int i) {
        return phc.i((String) this.suggestedPrompts_.get(i));
    }

    @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
    public final int getSuggestedPromptsCount() {
        return this.suggestedPrompts_.size();
    }

    @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
    public final List<String> getSuggestedPromptsList() {
        return this.suggestedPrompts_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements CreateSessionResponseOrBuilder {
        private Builder() {
            super(CreateSessionResponse.DEFAULT_INSTANCE);
        }

        public final Builder addAllPopularPrompts(Iterable<String> iterable) {
            copyOnWrite();
            ((CreateSessionResponse) ((g) this).instance).addAllPopularPrompts(iterable);
            return this;
        }

        public final Builder addAllSuggestedPrompts(Iterable<String> iterable) {
            copyOnWrite();
            ((CreateSessionResponse) ((g) this).instance).addAllSuggestedPrompts(iterable);
            return this;
        }

        public final Builder addPopularPrompts(String str) {
            copyOnWrite();
            ((CreateSessionResponse) ((g) this).instance).addPopularPrompts(str);
            return this;
        }

        public final Builder addPopularPromptsBytes(phc phcVar) {
            copyOnWrite();
            ((CreateSessionResponse) ((g) this).instance).addPopularPromptsBytes(phcVar);
            return this;
        }

        public final Builder addSuggestedPrompts(String str) {
            copyOnWrite();
            ((CreateSessionResponse) ((g) this).instance).addSuggestedPrompts(str);
            return this;
        }

        public final Builder addSuggestedPromptsBytes(phc phcVar) {
            copyOnWrite();
            ((CreateSessionResponse) ((g) this).instance).addSuggestedPromptsBytes(phcVar);
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

        public final Builder clearPopularPrompts() {
            copyOnWrite();
            ((CreateSessionResponse) ((g) this).instance).clearPopularPrompts();
            return this;
        }

        public final Builder clearSessionId() {
            copyOnWrite();
            ((CreateSessionResponse) ((g) this).instance).clearSessionId();
            return this;
        }

        public final Builder clearSuggestedPrompts() {
            copyOnWrite();
            ((CreateSessionResponse) ((g) this).instance).clearSuggestedPrompts();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
        public final String getPopularPrompts(int i) {
            return ((CreateSessionResponse) ((g) this).instance).getPopularPrompts(i);
        }

        @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
        public final phc getPopularPromptsBytes(int i) {
            return ((CreateSessionResponse) ((g) this).instance).getPopularPromptsBytes(i);
        }

        @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
        public final int getPopularPromptsCount() {
            return ((CreateSessionResponse) ((g) this).instance).getPopularPromptsCount();
        }

        @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
        public final List<String> getPopularPromptsList() {
            return Collections.unmodifiableList(((CreateSessionResponse) ((g) this).instance).getPopularPromptsList());
        }

        @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
        public final String getSessionId() {
            return ((CreateSessionResponse) ((g) this).instance).getSessionId();
        }

        @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
        public final phc getSessionIdBytes() {
            return ((CreateSessionResponse) ((g) this).instance).getSessionIdBytes();
        }

        @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
        public final String getSuggestedPrompts(int i) {
            return ((CreateSessionResponse) ((g) this).instance).getSuggestedPrompts(i);
        }

        @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
        public final phc getSuggestedPromptsBytes(int i) {
            return ((CreateSessionResponse) ((g) this).instance).getSuggestedPromptsBytes(i);
        }

        @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
        public final int getSuggestedPromptsCount() {
            return ((CreateSessionResponse) ((g) this).instance).getSuggestedPromptsCount();
        }

        @Override // com.spotify.playlist.ai.creation.v2.CreateSessionResponseOrBuilder
        public final List<String> getSuggestedPromptsList() {
            return Collections.unmodifiableList(((CreateSessionResponse) ((g) this).instance).getSuggestedPromptsList());
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m465mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setPopularPrompts(int i, String str) {
            copyOnWrite();
            ((CreateSessionResponse) ((g) this).instance).setPopularPrompts(i, str);
            return this;
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((CreateSessionResponse) ((g) this).instance).setSessionId(str);
            return this;
        }

        public final Builder setSessionIdBytes(phc phcVar) {
            copyOnWrite();
            ((CreateSessionResponse) ((g) this).instance).setSessionIdBytes(phcVar);
            return this;
        }

        public final Builder setSuggestedPrompts(int i, String str) {
            copyOnWrite();
            ((CreateSessionResponse) ((g) this).instance).setSuggestedPrompts(i, str);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m464clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m466mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m463clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m467mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }
    }

    public static Builder newBuilder(CreateSessionResponse createSessionResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(createSessionResponse);
    }

    public static CreateSessionResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (CreateSessionResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CreateSessionResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (CreateSessionResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static CreateSessionResponse parseFrom(phc phcVar) {
        return (CreateSessionResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static CreateSessionResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (CreateSessionResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static CreateSessionResponse parseFrom(byte[] bArr) {
        return (CreateSessionResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CreateSessionResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (CreateSessionResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static CreateSessionResponse parseFrom(InputStream inputStream) {
        return (CreateSessionResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateSessionResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (CreateSessionResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CreateSessionResponse parseFrom(lwg lwgVar) {
        return (CreateSessionResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static CreateSessionResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (CreateSessionResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
