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
public final class ListeningActivity extends h implements ListeningActivityOrBuilder {
    private static final ListeningActivity DEFAULT_INSTANCE;
    public static final int LISTENING_USERNAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REACTION_FIELD_NUMBER = 1;
    private String reaction_ = "";
    private String listeningUsername_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ListeningActivity$1, reason: invalid class name */
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
        ListeningActivity listeningActivity = new ListeningActivity();
        DEFAULT_INSTANCE = listeningActivity;
        h.registerDefaultInstance(ListeningActivity.class, listeningActivity);
    }

    private ListeningActivity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListeningUsername() {
        this.listeningUsername_ = getDefaultInstance().getListeningUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReaction() {
        this.reaction_ = getDefaultInstance().getReaction();
    }

    public static ListeningActivity getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListeningActivity parseDelimitedFrom(InputStream inputStream) {
        return (ListeningActivity) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListeningActivity parseFrom(ByteBuffer byteBuffer) {
        return (ListeningActivity) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListeningUsername(String str) {
        str.getClass();
        this.listeningUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListeningUsernameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.listeningUsername_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReaction(String str) {
        str.getClass();
        this.reaction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReactionBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.reaction_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"reaction_", "listeningUsername_"});
        }
        if (iOrdinal == 3) {
            return new ListeningActivity();
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
        synchronized (ListeningActivity.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningActivityOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningActivityOrBuilder
    public String getListeningUsername() {
        return this.listeningUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningActivityOrBuilder
    public phc getListeningUsernameBytes() {
        return phc.i(this.listeningUsername_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningActivityOrBuilder
    public String getReaction() {
        return this.reaction_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningActivityOrBuilder
    public phc getReactionBytes() {
        return phc.i(this.reaction_);
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ListeningActivityOrBuilder {
        private Builder() {
            super(ListeningActivity.DEFAULT_INSTANCE);
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

        public Builder clearListeningUsername() {
            copyOnWrite();
            ((ListeningActivity) ((g) this).instance).clearListeningUsername();
            return this;
        }

        public Builder clearReaction() {
            copyOnWrite();
            ((ListeningActivity) ((g) this).instance).clearReaction();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningActivityOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningActivityOrBuilder
        public String getListeningUsername() {
            return ((ListeningActivity) ((g) this).instance).getListeningUsername();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningActivityOrBuilder
        public phc getListeningUsernameBytes() {
            return ((ListeningActivity) ((g) this).instance).getListeningUsernameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningActivityOrBuilder
        public String getReaction() {
            return ((ListeningActivity) ((g) this).instance).getReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningActivityOrBuilder
        public phc getReactionBytes() {
            return ((ListeningActivity) ((g) this).instance).getReactionBytes();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m484mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setListeningUsername(String str) {
            copyOnWrite();
            ((ListeningActivity) ((g) this).instance).setListeningUsername(str);
            return this;
        }

        public Builder setListeningUsernameBytes(phc phcVar) {
            copyOnWrite();
            ((ListeningActivity) ((g) this).instance).setListeningUsernameBytes(phcVar);
            return this;
        }

        public Builder setReaction(String str) {
            copyOnWrite();
            ((ListeningActivity) ((g) this).instance).setReaction(str);
            return this;
        }

        public Builder setReactionBytes(phc phcVar) {
            copyOnWrite();
            ((ListeningActivity) ((g) this).instance).setReactionBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m483clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m485mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m482clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m486mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(ListeningActivity listeningActivity) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(listeningActivity);
    }

    public static ListeningActivity parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ListeningActivity) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ListeningActivity parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ListeningActivity) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ListeningActivity parseFrom(phc phcVar) {
        return (ListeningActivity) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ListeningActivity parseFrom(phc phcVar, uz00 uz00Var) {
        return (ListeningActivity) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ListeningActivity parseFrom(byte[] bArr) {
        return (ListeningActivity) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListeningActivity parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ListeningActivity) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ListeningActivity parseFrom(InputStream inputStream) {
        return (ListeningActivity) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListeningActivity parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ListeningActivity) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ListeningActivity parseFrom(lwg lwgVar) {
        return (ListeningActivity) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ListeningActivity parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ListeningActivity) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
