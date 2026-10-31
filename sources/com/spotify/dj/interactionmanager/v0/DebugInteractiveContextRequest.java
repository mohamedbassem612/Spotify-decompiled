package com.spotify.dj.interactionmanager.v0;

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
public final class DebugInteractiveContextRequest extends h implements DebugInteractiveContextRequestOrBuilder {
    public static final int ACK_SYSTEM_PROMPT_OVERRIDE_FIELD_NUMBER = 10;
    public static final int ASSISTANT_NAME_FIELD_NUMBER = 2;
    public static final int ASSISTANT_TAGS_FIELD_NUMBER = 5;
    public static final int ASSISTANT_VERSION_FIELD_NUMBER = 3;
    private static final DebugInteractiveContextRequest DEFAULT_INSTANCE;
    public static final int IGNORE_PROMPT_SAFETY_VIOLATION_FIELD_NUMBER = 4;
    public static final int INTRO_SYSTEM_PROMPT_OVERRIDE_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean ignorePromptSafetyViolation_;
    private String prompt_ = "";
    private String assistantName_ = "";
    private String assistantVersion_ = "";
    private h290 assistantTags_ = h.emptyProtobufList();
    private String ackSystemPromptOverride_ = "";
    private String introSystemPromptOverride_ = "";

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequest$1, reason: invalid class name */
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
        DebugInteractiveContextRequest debugInteractiveContextRequest = new DebugInteractiveContextRequest();
        DEFAULT_INSTANCE = debugInteractiveContextRequest;
        h.registerDefaultInstance(DebugInteractiveContextRequest.class, debugInteractiveContextRequest);
    }

    private DebugInteractiveContextRequest() {
    }

    public static void E(DebugInteractiveContextRequest debugInteractiveContextRequest, boolean z) {
        debugInteractiveContextRequest.ignorePromptSafetyViolation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAssistantTags(Iterable<String> iterable) {
        ensureAssistantTagsIsMutable();
        s8.addAll(iterable, this.assistantTags_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAssistantTags(String str) {
        str.getClass();
        ensureAssistantTagsIsMutable();
        this.assistantTags_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAssistantTagsBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        ensureAssistantTagsIsMutable();
        this.assistantTags_.add(phcVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAckSystemPromptOverride() {
        this.bitField0_ &= -2;
        this.ackSystemPromptOverride_ = DEFAULT_INSTANCE.ackSystemPromptOverride_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssistantName() {
        this.assistantName_ = DEFAULT_INSTANCE.assistantName_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssistantTags() {
        this.assistantTags_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssistantVersion() {
        this.assistantVersion_ = DEFAULT_INSTANCE.assistantVersion_;
    }

    private void clearIgnorePromptSafetyViolation() {
        this.ignorePromptSafetyViolation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntroSystemPromptOverride() {
        this.bitField0_ &= -3;
        this.introSystemPromptOverride_ = DEFAULT_INSTANCE.introSystemPromptOverride_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrompt() {
        this.prompt_ = DEFAULT_INSTANCE.prompt_;
    }

    private void ensureAssistantTagsIsMutable() {
        i9 i9Var = this.assistantTags_;
        if (i9Var.a) {
            return;
        }
        this.assistantTags_ = h.mutableCopy(i9Var);
    }

    public static DebugInteractiveContextRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DebugInteractiveContextRequest parseDelimitedFrom(InputStream inputStream) {
        return (DebugInteractiveContextRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DebugInteractiveContextRequest parseFrom(ByteBuffer byteBuffer) {
        return (DebugInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckSystemPromptOverride(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.ackSystemPromptOverride_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckSystemPromptOverrideBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.ackSystemPromptOverride_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistantName(String str) {
        str.getClass();
        this.assistantName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistantNameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.assistantName_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistantTags(int i, String str) {
        str.getClass();
        ensureAssistantTagsIsMutable();
        this.assistantTags_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistantVersion(String str) {
        str.getClass();
        this.assistantVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistantVersionBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.assistantVersion_ = phcVar.v();
    }

    private void setIgnorePromptSafetyViolation(boolean z) {
        this.ignorePromptSafetyViolation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroSystemPromptOverride(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.introSystemPromptOverride_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroSystemPromptOverrideBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.introSystemPromptOverride_ = phcVar.v();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrompt(String str) {
        str.getClass();
        this.prompt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.prompt_ = phcVar.v();
    }

    public static void u(DebugInteractiveContextRequest debugInteractiveContextRequest) {
        debugInteractiveContextRequest.ignorePromptSafetyViolation_ = false;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005Ț\nለ\u0000\u000bለ\u0001", new Object[]{"bitField0_", "prompt_", "assistantName_", "assistantVersion_", "ignorePromptSafetyViolation_", "assistantTags_", "ackSystemPromptOverride_", "introSystemPromptOverride_"});
        }
        if (iOrdinal == 3) {
            return new DebugInteractiveContextRequest();
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
        synchronized (DebugInteractiveContextRequest.class) {
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

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final String getAckSystemPromptOverride() {
        return this.ackSystemPromptOverride_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final phc getAckSystemPromptOverrideBytes() {
        return phc.i(this.ackSystemPromptOverride_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final String getAssistantName() {
        return this.assistantName_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final phc getAssistantNameBytes() {
        return phc.i(this.assistantName_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final String getAssistantTags(int i) {
        return (String) this.assistantTags_.get(i);
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final phc getAssistantTagsBytes(int i) {
        return phc.i((String) this.assistantTags_.get(i));
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final int getAssistantTagsCount() {
        return this.assistantTags_.size();
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final List<String> getAssistantTagsList() {
        return this.assistantTags_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final String getAssistantVersion() {
        return this.assistantVersion_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final phc getAssistantVersionBytes() {
        return phc.i(this.assistantVersion_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final boolean getIgnorePromptSafetyViolation() {
        return this.ignorePromptSafetyViolation_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final String getIntroSystemPromptOverride() {
        return this.introSystemPromptOverride_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final phc getIntroSystemPromptOverrideBytes() {
        return phc.i(this.introSystemPromptOverride_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final String getPrompt() {
        return this.prompt_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final phc getPromptBytes() {
        return phc.i(this.prompt_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final boolean hasAckSystemPromptOverride() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
    public final boolean hasIntroSystemPromptOverride() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements DebugInteractiveContextRequestOrBuilder {
        private Builder() {
            super(DebugInteractiveContextRequest.DEFAULT_INSTANCE);
        }

        public final Builder addAllAssistantTags(Iterable<String> iterable) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).addAllAssistantTags(iterable);
            return this;
        }

        public final Builder addAssistantTags(String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).addAssistantTags(str);
            return this;
        }

        public final Builder addAssistantTagsBytes(phc phcVar) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).addAssistantTagsBytes(phcVar);
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

        public final Builder clearAckSystemPromptOverride() {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).clearAckSystemPromptOverride();
            return this;
        }

        public final Builder clearAssistantName() {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).clearAssistantName();
            return this;
        }

        public final Builder clearAssistantTags() {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).clearAssistantTags();
            return this;
        }

        public final Builder clearAssistantVersion() {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).clearAssistantVersion();
            return this;
        }

        public final Builder clearIgnorePromptSafetyViolation() {
            copyOnWrite();
            DebugInteractiveContextRequest.u((DebugInteractiveContextRequest) ((g) this).instance);
            return this;
        }

        public final Builder clearIntroSystemPromptOverride() {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).clearIntroSystemPromptOverride();
            return this;
        }

        public final Builder clearPrompt() {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).clearPrompt();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final String getAckSystemPromptOverride() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getAckSystemPromptOverride();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final phc getAckSystemPromptOverrideBytes() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getAckSystemPromptOverrideBytes();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final String getAssistantName() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getAssistantName();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final phc getAssistantNameBytes() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getAssistantNameBytes();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final String getAssistantTags(int i) {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getAssistantTags(i);
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final phc getAssistantTagsBytes(int i) {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getAssistantTagsBytes(i);
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final int getAssistantTagsCount() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getAssistantTagsCount();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final List<String> getAssistantTagsList() {
            return Collections.unmodifiableList(((DebugInteractiveContextRequest) ((g) this).instance).getAssistantTagsList());
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final String getAssistantVersion() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getAssistantVersion();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final phc getAssistantVersionBytes() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getAssistantVersionBytes();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final boolean getIgnorePromptSafetyViolation() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getIgnorePromptSafetyViolation();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final String getIntroSystemPromptOverride() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getIntroSystemPromptOverride();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final phc getIntroSystemPromptOverrideBytes() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getIntroSystemPromptOverrideBytes();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final String getPrompt() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getPrompt();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final phc getPromptBytes() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).getPromptBytes();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final boolean hasAckSystemPromptOverride() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).hasAckSystemPromptOverride();
        }

        @Override // com.spotify.dj.interactionmanager.v0.DebugInteractiveContextRequestOrBuilder
        public final boolean hasIntroSystemPromptOverride() {
            return ((DebugInteractiveContextRequest) ((g) this).instance).hasIntroSystemPromptOverride();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m22mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setAckSystemPromptOverride(String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).setAckSystemPromptOverride(str);
            return this;
        }

        public final Builder setAckSystemPromptOverrideBytes(phc phcVar) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).setAckSystemPromptOverrideBytes(phcVar);
            return this;
        }

        public final Builder setAssistantName(String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).setAssistantName(str);
            return this;
        }

        public final Builder setAssistantNameBytes(phc phcVar) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).setAssistantNameBytes(phcVar);
            return this;
        }

        public final Builder setAssistantTags(int i, String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).setAssistantTags(i, str);
            return this;
        }

        public final Builder setAssistantVersion(String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).setAssistantVersion(str);
            return this;
        }

        public final Builder setAssistantVersionBytes(phc phcVar) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).setAssistantVersionBytes(phcVar);
            return this;
        }

        public final Builder setIgnorePromptSafetyViolation(boolean z) {
            copyOnWrite();
            DebugInteractiveContextRequest.E((DebugInteractiveContextRequest) ((g) this).instance, z);
            return this;
        }

        public final Builder setIntroSystemPromptOverride(String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).setIntroSystemPromptOverride(str);
            return this;
        }

        public final Builder setIntroSystemPromptOverrideBytes(phc phcVar) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).setIntroSystemPromptOverrideBytes(phcVar);
            return this;
        }

        public final Builder setPrompt(String str) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).setPrompt(str);
            return this;
        }

        public final Builder setPromptBytes(phc phcVar) {
            copyOnWrite();
            ((DebugInteractiveContextRequest) ((g) this).instance).setPromptBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m21clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m23mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m20clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m24mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(DebugInteractiveContextRequest debugInteractiveContextRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(debugInteractiveContextRequest);
    }

    public static DebugInteractiveContextRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (DebugInteractiveContextRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DebugInteractiveContextRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (DebugInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static DebugInteractiveContextRequest parseFrom(phc phcVar) {
        return (DebugInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static DebugInteractiveContextRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (DebugInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static DebugInteractiveContextRequest parseFrom(byte[] bArr) {
        return (DebugInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DebugInteractiveContextRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (DebugInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static DebugInteractiveContextRequest parseFrom(InputStream inputStream) {
        return (DebugInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DebugInteractiveContextRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (DebugInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DebugInteractiveContextRequest parseFrom(lwg lwgVar) {
        return (DebugInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static DebugInteractiveContextRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (DebugInteractiveContextRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
