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
public final class ChatMessagePreferences extends h implements ChatMessagePreferencesOrBuilder {
    private static final ChatMessagePreferences DEFAULT_INSTANCE;
    public static final int EXCLUDED_URIS_FIELD_NUMBER = 1;
    public static final int INCLUDED_URIS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private h290 excludedUris_ = h.emptyProtobufList();
    private h290 includedUris_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.ChatMessagePreferences$1, reason: invalid class name */
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
        ChatMessagePreferences chatMessagePreferences = new ChatMessagePreferences();
        DEFAULT_INSTANCE = chatMessagePreferences;
        h.registerDefaultInstance(ChatMessagePreferences.class, chatMessagePreferences);
    }

    private ChatMessagePreferences() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExcludedUris(Iterable<String> iterable) {
        ensureExcludedUrisIsMutable();
        s8.addAll(iterable, this.excludedUris_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIncludedUris(Iterable<String> iterable) {
        ensureIncludedUrisIsMutable();
        s8.addAll(iterable, this.includedUris_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExcludedUris(String str) {
        str.getClass();
        ensureExcludedUrisIsMutable();
        this.excludedUris_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExcludedUrisBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        ensureExcludedUrisIsMutable();
        this.excludedUris_.add(phcVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIncludedUris(String str) {
        str.getClass();
        ensureIncludedUrisIsMutable();
        this.includedUris_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIncludedUrisBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        ensureIncludedUrisIsMutable();
        this.includedUris_.add(phcVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExcludedUris() {
        this.excludedUris_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludedUris() {
        this.includedUris_ = h.emptyProtobufList();
    }

    private void ensureExcludedUrisIsMutable() {
        i9 i9Var = this.excludedUris_;
        if (i9Var.a) {
            return;
        }
        this.excludedUris_ = h.mutableCopy(i9Var);
    }

    private void ensureIncludedUrisIsMutable() {
        i9 i9Var = this.includedUris_;
        if (i9Var.a) {
            return;
        }
        this.includedUris_ = h.mutableCopy(i9Var);
    }

    public static ChatMessagePreferences getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ChatMessagePreferences parseDelimitedFrom(InputStream inputStream) {
        return (ChatMessagePreferences) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatMessagePreferences parseFrom(ByteBuffer byteBuffer) {
        return (ChatMessagePreferences) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExcludedUris(int i, String str) {
        str.getClass();
        ensureExcludedUrisIsMutable();
        this.excludedUris_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludedUris(int i, String str) {
        str.getClass();
        ensureIncludedUrisIsMutable();
        this.includedUris_.set(i, str);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"excludedUris_", "includedUris_"});
        }
        if (iOrdinal == 3) {
            return new ChatMessagePreferences();
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
        synchronized (ChatMessagePreferences.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
    public final String getExcludedUris(int i) {
        return (String) this.excludedUris_.get(i);
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
    public final phc getExcludedUrisBytes(int i) {
        return phc.i((String) this.excludedUris_.get(i));
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
    public final int getExcludedUrisCount() {
        return this.excludedUris_.size();
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
    public final List<String> getExcludedUrisList() {
        return this.excludedUris_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
    public final String getIncludedUris(int i) {
        return (String) this.includedUris_.get(i);
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
    public final phc getIncludedUrisBytes(int i) {
        return phc.i((String) this.includedUris_.get(i));
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
    public final int getIncludedUrisCount() {
        return this.includedUris_.size();
    }

    @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
    public final List<String> getIncludedUrisList() {
        return this.includedUris_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ChatMessagePreferencesOrBuilder {
        private Builder() {
            super(ChatMessagePreferences.DEFAULT_INSTANCE);
        }

        public final Builder addAllExcludedUris(Iterable<String> iterable) {
            copyOnWrite();
            ((ChatMessagePreferences) ((g) this).instance).addAllExcludedUris(iterable);
            return this;
        }

        public final Builder addAllIncludedUris(Iterable<String> iterable) {
            copyOnWrite();
            ((ChatMessagePreferences) ((g) this).instance).addAllIncludedUris(iterable);
            return this;
        }

        public final Builder addExcludedUris(String str) {
            copyOnWrite();
            ((ChatMessagePreferences) ((g) this).instance).addExcludedUris(str);
            return this;
        }

        public final Builder addExcludedUrisBytes(phc phcVar) {
            copyOnWrite();
            ((ChatMessagePreferences) ((g) this).instance).addExcludedUrisBytes(phcVar);
            return this;
        }

        public final Builder addIncludedUris(String str) {
            copyOnWrite();
            ((ChatMessagePreferences) ((g) this).instance).addIncludedUris(str);
            return this;
        }

        public final Builder addIncludedUrisBytes(phc phcVar) {
            copyOnWrite();
            ((ChatMessagePreferences) ((g) this).instance).addIncludedUrisBytes(phcVar);
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

        public final Builder clearExcludedUris() {
            copyOnWrite();
            ((ChatMessagePreferences) ((g) this).instance).clearExcludedUris();
            return this;
        }

        public final Builder clearIncludedUris() {
            copyOnWrite();
            ((ChatMessagePreferences) ((g) this).instance).clearIncludedUris();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
        public final String getExcludedUris(int i) {
            return ((ChatMessagePreferences) ((g) this).instance).getExcludedUris(i);
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
        public final phc getExcludedUrisBytes(int i) {
            return ((ChatMessagePreferences) ((g) this).instance).getExcludedUrisBytes(i);
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
        public final int getExcludedUrisCount() {
            return ((ChatMessagePreferences) ((g) this).instance).getExcludedUrisCount();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
        public final List<String> getExcludedUrisList() {
            return Collections.unmodifiableList(((ChatMessagePreferences) ((g) this).instance).getExcludedUrisList());
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
        public final String getIncludedUris(int i) {
            return ((ChatMessagePreferences) ((g) this).instance).getIncludedUris(i);
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
        public final phc getIncludedUrisBytes(int i) {
            return ((ChatMessagePreferences) ((g) this).instance).getIncludedUrisBytes(i);
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
        public final int getIncludedUrisCount() {
            return ((ChatMessagePreferences) ((g) this).instance).getIncludedUrisCount();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ChatMessagePreferencesOrBuilder
        public final List<String> getIncludedUrisList() {
            return Collections.unmodifiableList(((ChatMessagePreferences) ((g) this).instance).getIncludedUrisList());
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m450mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setExcludedUris(int i, String str) {
            copyOnWrite();
            ((ChatMessagePreferences) ((g) this).instance).setExcludedUris(i, str);
            return this;
        }

        public final Builder setIncludedUris(int i, String str) {
            copyOnWrite();
            ((ChatMessagePreferences) ((g) this).instance).setIncludedUris(i, str);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m449clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m451mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m448clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m452mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(ChatMessagePreferences chatMessagePreferences) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(chatMessagePreferences);
    }

    public static ChatMessagePreferences parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ChatMessagePreferences) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ChatMessagePreferences parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ChatMessagePreferences) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ChatMessagePreferences parseFrom(phc phcVar) {
        return (ChatMessagePreferences) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ChatMessagePreferences parseFrom(phc phcVar, uz00 uz00Var) {
        return (ChatMessagePreferences) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ChatMessagePreferences parseFrom(byte[] bArr) {
        return (ChatMessagePreferences) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChatMessagePreferences parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ChatMessagePreferences) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ChatMessagePreferences parseFrom(InputStream inputStream) {
        return (ChatMessagePreferences) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatMessagePreferences parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ChatMessagePreferences) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ChatMessagePreferences parseFrom(lwg lwgVar) {
        return (ChatMessagePreferences) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ChatMessagePreferences parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ChatMessagePreferences) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
