package com.spotify.cosmos.util.libs.proto;

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
public final class EpisodeCollectionDecorationPolicy extends h implements EpisodeCollectionDecorationPolicyOrBuilder {
    private static final EpisodeCollectionDecorationPolicy DEFAULT_INSTANCE;
    public static final int IN_COLLECTION_FIELD_NUMBER = 1;
    public static final int IS_IN_LISTEN_LATER_FIELD_NUMBER = 2;
    public static final int IS_NEW_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private boolean inCollection_;
    private boolean isInListenLater_;
    private boolean isNew_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.libs.proto.EpisodeCollectionDecorationPolicy$1, reason: invalid class name */
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
        EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy = new EpisodeCollectionDecorationPolicy();
        DEFAULT_INSTANCE = episodeCollectionDecorationPolicy;
        h.registerDefaultInstance(EpisodeCollectionDecorationPolicy.class, episodeCollectionDecorationPolicy);
    }

    private EpisodeCollectionDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCollection() {
        this.inCollection_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInListenLater() {
        this.isInListenLater_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNew() {
        this.isNew_ = false;
    }

    public static EpisodeCollectionDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodeCollectionDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (EpisodeCollectionDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCollection(boolean z) {
        this.inCollection_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInListenLater(boolean z) {
        this.isInListenLater_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNew(boolean z) {
        this.isNew_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"inCollection_", "isInListenLater_", "isNew_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeCollectionDecorationPolicy();
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
        synchronized (EpisodeCollectionDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeCollectionDecorationPolicyOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeCollectionDecorationPolicyOrBuilder
    public boolean getInCollection() {
        return this.inCollection_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeCollectionDecorationPolicyOrBuilder
    public boolean getIsInListenLater() {
        return this.isInListenLater_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeCollectionDecorationPolicyOrBuilder
    public boolean getIsNew() {
        return this.isNew_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements EpisodeCollectionDecorationPolicyOrBuilder {
        private Builder() {
            super(EpisodeCollectionDecorationPolicy.DEFAULT_INSTANCE);
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

        public Builder clearInCollection() {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) ((g) this).instance).clearInCollection();
            return this;
        }

        public Builder clearIsInListenLater() {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) ((g) this).instance).clearIsInListenLater();
            return this;
        }

        public Builder clearIsNew() {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) ((g) this).instance).clearIsNew();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeCollectionDecorationPolicyOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeCollectionDecorationPolicyOrBuilder
        public boolean getInCollection() {
            return ((EpisodeCollectionDecorationPolicy) ((g) this).instance).getInCollection();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeCollectionDecorationPolicyOrBuilder
        public boolean getIsInListenLater() {
            return ((EpisodeCollectionDecorationPolicy) ((g) this).instance).getIsInListenLater();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeCollectionDecorationPolicyOrBuilder
        public boolean getIsNew() {
            return ((EpisodeCollectionDecorationPolicy) ((g) this).instance).getIsNew();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1294mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setInCollection(boolean z) {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) ((g) this).instance).setInCollection(z);
            return this;
        }

        public Builder setIsInListenLater(boolean z) {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) ((g) this).instance).setIsInListenLater(z);
            return this;
        }

        public Builder setIsNew(boolean z) {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) ((g) this).instance).setIsNew(z);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1293clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1295mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1292clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1296mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(episodeCollectionDecorationPolicy);
    }

    public static EpisodeCollectionDecorationPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodeCollectionDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(phc phcVar) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(byte[] bArr) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(InputStream inputStream) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(lwg lwgVar) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
