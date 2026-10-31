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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ChatInvite extends h implements ChatInviteOrBuilder {
    private static final ChatInvite DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 3;
    public static final int INVITING_USER_ID_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_ID_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private String shareId_ = "";
    private String uri_ = "";
    private String destination_ = "";
    private String invitingUserId_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ChatInvite$1, reason: invalid class name */
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
        ChatInvite chatInvite = new ChatInvite();
        DEFAULT_INSTANCE = chatInvite;
        h.registerDefaultInstance(ChatInvite.class, chatInvite);
    }

    private ChatInvite() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = getDefaultInstance().getDestination();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInvitingUserId() {
        this.invitingUserId_ = getDefaultInstance().getInvitingUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareId() {
        this.shareId_ = getDefaultInstance().getShareId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static ChatInvite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ChatInvite parseDelimitedFrom(InputStream inputStream) {
        return (ChatInvite) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatInvite parseFrom(ByteBuffer byteBuffer) {
        return (ChatInvite) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(String str) {
        str.getClass();
        this.destination_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.destination_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInvitingUserId(String str) {
        str.getClass();
        this.invitingUserId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInvitingUserIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.invitingUserId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareId(String str) {
        str.getClass();
        this.shareId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.shareId_ = phcVar.v();
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

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"uri_", "shareId_", "destination_", "invitingUserId_"});
        }
        if (iOrdinal == 3) {
            return new ChatInvite();
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
        synchronized (ChatInvite.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public String getDestination() {
        return this.destination_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public phc getDestinationBytes() {
        return phc.i(this.destination_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public String getInvitingUserId() {
        return this.invitingUserId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public phc getInvitingUserIdBytes() {
        return phc.i(this.invitingUserId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public String getShareId() {
        return this.shareId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public phc getShareIdBytes() {
        return phc.i(this.shareId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
    public phc getUriBytes() {
        return phc.i(this.uri_);
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ChatInviteOrBuilder {
        private Builder() {
            super(ChatInvite.DEFAULT_INSTANCE);
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

        public Builder clearDestination() {
            copyOnWrite();
            ((ChatInvite) ((g) this).instance).clearDestination();
            return this;
        }

        public Builder clearInvitingUserId() {
            copyOnWrite();
            ((ChatInvite) ((g) this).instance).clearInvitingUserId();
            return this;
        }

        public Builder clearShareId() {
            copyOnWrite();
            ((ChatInvite) ((g) this).instance).clearShareId();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((ChatInvite) ((g) this).instance).clearUri();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public String getDestination() {
            return ((ChatInvite) ((g) this).instance).getDestination();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public phc getDestinationBytes() {
            return ((ChatInvite) ((g) this).instance).getDestinationBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public String getInvitingUserId() {
            return ((ChatInvite) ((g) this).instance).getInvitingUserId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public phc getInvitingUserIdBytes() {
            return ((ChatInvite) ((g) this).instance).getInvitingUserIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public String getShareId() {
            return ((ChatInvite) ((g) this).instance).getShareId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public phc getShareIdBytes() {
            return ((ChatInvite) ((g) this).instance).getShareIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public String getUri() {
            return ((ChatInvite) ((g) this).instance).getUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatInviteOrBuilder
        public phc getUriBytes() {
            return ((ChatInvite) ((g) this).instance).getUriBytes();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m94mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setDestination(String str) {
            copyOnWrite();
            ((ChatInvite) ((g) this).instance).setDestination(str);
            return this;
        }

        public Builder setDestinationBytes(phc phcVar) {
            copyOnWrite();
            ((ChatInvite) ((g) this).instance).setDestinationBytes(phcVar);
            return this;
        }

        public Builder setInvitingUserId(String str) {
            copyOnWrite();
            ((ChatInvite) ((g) this).instance).setInvitingUserId(str);
            return this;
        }

        public Builder setInvitingUserIdBytes(phc phcVar) {
            copyOnWrite();
            ((ChatInvite) ((g) this).instance).setInvitingUserIdBytes(phcVar);
            return this;
        }

        public Builder setShareId(String str) {
            copyOnWrite();
            ((ChatInvite) ((g) this).instance).setShareId(str);
            return this;
        }

        public Builder setShareIdBytes(phc phcVar) {
            copyOnWrite();
            ((ChatInvite) ((g) this).instance).setShareIdBytes(phcVar);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((ChatInvite) ((g) this).instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(phc phcVar) {
            copyOnWrite();
            ((ChatInvite) ((g) this).instance).setUriBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m93clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m95mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m92clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m96mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(ChatInvite chatInvite) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(chatInvite);
    }

    public static ChatInvite parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ChatInvite) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ChatInvite parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ChatInvite) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ChatInvite parseFrom(phc phcVar) {
        return (ChatInvite) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ChatInvite parseFrom(phc phcVar, uz00 uz00Var) {
        return (ChatInvite) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ChatInvite parseFrom(byte[] bArr) {
        return (ChatInvite) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChatInvite parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ChatInvite) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ChatInvite parseFrom(InputStream inputStream) {
        return (ChatInvite) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatInvite parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ChatInvite) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ChatInvite parseFrom(lwg lwgVar) {
        return (ChatInvite) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ChatInvite parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ChatInvite) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
