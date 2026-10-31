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
public final class Reaction extends h implements ReactionOrBuilder {
    private static final Reaction DEFAULT_INSTANCE;
    public static final int EMOJI_UTF8_FIELD_NUMBER = 3;
    public static final int INITIATOR_USERNAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REACTION_EMOTI_FIELD_NUMBER = 1;
    private int reactionEmoti_;
    private String initiatorUsername_ = "";
    private String emojiUtf8_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.Reaction$1, reason: invalid class name */
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
        Reaction reaction = new Reaction();
        DEFAULT_INSTANCE = reaction;
        h.registerDefaultInstance(Reaction.class, reaction);
    }

    private Reaction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmojiUtf8() {
        this.emojiUtf8_ = getDefaultInstance().getEmojiUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitiatorUsername() {
        this.initiatorUsername_ = getDefaultInstance().getInitiatorUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReactionEmoti() {
        this.reactionEmoti_ = 0;
    }

    public static Reaction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Reaction parseDelimitedFrom(InputStream inputStream) {
        return (Reaction) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Reaction parseFrom(ByteBuffer byteBuffer) {
        return (Reaction) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmojiUtf8(String str) {
        str.getClass();
        this.emojiUtf8_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmojiUtf8Bytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.emojiUtf8_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitiatorUsername(String str) {
        str.getClass();
        this.initiatorUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitiatorUsernameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.initiatorUsername_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReactionEmoti(ReactionEmoti reactionEmoti) {
        this.reactionEmoti_ = reactionEmoti.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReactionEmotiValue(int i) {
        this.reactionEmoti_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"reactionEmoti_", "initiatorUsername_", "emojiUtf8_"});
        }
        if (iOrdinal == 3) {
            return new Reaction();
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
        synchronized (Reaction.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
    public String getEmojiUtf8() {
        return this.emojiUtf8_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
    public phc getEmojiUtf8Bytes() {
        return phc.i(this.emojiUtf8_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
    public String getInitiatorUsername() {
        return this.initiatorUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
    public phc getInitiatorUsernameBytes() {
        return phc.i(this.initiatorUsername_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
    public ReactionEmoti getReactionEmoti() {
        ReactionEmoti reactionEmotiForNumber = ReactionEmoti.forNumber(this.reactionEmoti_);
        return reactionEmotiForNumber == null ? ReactionEmoti.UNRECOGNIZED : reactionEmotiForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
    public int getReactionEmotiValue() {
        return this.reactionEmoti_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ReactionOrBuilder {
        private Builder() {
            super(Reaction.DEFAULT_INSTANCE);
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

        public Builder clearEmojiUtf8() {
            copyOnWrite();
            ((Reaction) ((g) this).instance).clearEmojiUtf8();
            return this;
        }

        public Builder clearInitiatorUsername() {
            copyOnWrite();
            ((Reaction) ((g) this).instance).clearInitiatorUsername();
            return this;
        }

        public Builder clearReactionEmoti() {
            copyOnWrite();
            ((Reaction) ((g) this).instance).clearReactionEmoti();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
        public String getEmojiUtf8() {
            return ((Reaction) ((g) this).instance).getEmojiUtf8();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
        public phc getEmojiUtf8Bytes() {
            return ((Reaction) ((g) this).instance).getEmojiUtf8Bytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
        public String getInitiatorUsername() {
            return ((Reaction) ((g) this).instance).getInitiatorUsername();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
        public phc getInitiatorUsernameBytes() {
            return ((Reaction) ((g) this).instance).getInitiatorUsernameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
        public ReactionEmoti getReactionEmoti() {
            return ((Reaction) ((g) this).instance).getReactionEmoti();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
        public int getReactionEmotiValue() {
            return ((Reaction) ((g) this).instance).getReactionEmotiValue();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m601mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setEmojiUtf8(String str) {
            copyOnWrite();
            ((Reaction) ((g) this).instance).setEmojiUtf8(str);
            return this;
        }

        public Builder setEmojiUtf8Bytes(phc phcVar) {
            copyOnWrite();
            ((Reaction) ((g) this).instance).setEmojiUtf8Bytes(phcVar);
            return this;
        }

        public Builder setInitiatorUsername(String str) {
            copyOnWrite();
            ((Reaction) ((g) this).instance).setInitiatorUsername(str);
            return this;
        }

        public Builder setInitiatorUsernameBytes(phc phcVar) {
            copyOnWrite();
            ((Reaction) ((g) this).instance).setInitiatorUsernameBytes(phcVar);
            return this;
        }

        public Builder setReactionEmoti(ReactionEmoti reactionEmoti) {
            copyOnWrite();
            ((Reaction) ((g) this).instance).setReactionEmoti(reactionEmoti);
            return this;
        }

        public Builder setReactionEmotiValue(int i) {
            copyOnWrite();
            ((Reaction) ((g) this).instance).setReactionEmotiValue(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m600clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m602mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m599clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m603mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(Reaction reaction) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(reaction);
    }

    public static Reaction parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Reaction) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Reaction parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Reaction) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Reaction parseFrom(phc phcVar) {
        return (Reaction) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Reaction parseFrom(phc phcVar, uz00 uz00Var) {
        return (Reaction) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static Reaction parseFrom(byte[] bArr) {
        return (Reaction) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Reaction parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Reaction) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Reaction parseFrom(InputStream inputStream) {
        return (Reaction) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Reaction parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Reaction) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Reaction parseFrom(lwg lwgVar) {
        return (Reaction) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Reaction parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Reaction) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
