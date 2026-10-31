package com.spotify.profileprivacy.proto.v1;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetShowFollowsResponse extends h implements GetShowFollowsResponseOrBuilder {
    private static final GetShowFollowsResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_FOLLOWS_FIELD_NUMBER = 1;
    private boolean showFollows_;

    /* JADX INFO: renamed from: com.spotify.profileprivacy.proto.v1.GetShowFollowsResponse$1, reason: invalid class name */
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
        GetShowFollowsResponse getShowFollowsResponse = new GetShowFollowsResponse();
        DEFAULT_INSTANCE = getShowFollowsResponse;
        h.registerDefaultInstance(GetShowFollowsResponse.class, getShowFollowsResponse);
    }

    private GetShowFollowsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowFollows() {
        this.showFollows_ = false;
    }

    public static GetShowFollowsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetShowFollowsResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetShowFollowsResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetShowFollowsResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetShowFollowsResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowFollows(boolean z) {
        this.showFollows_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"showFollows_"});
        }
        if (iOrdinal == 3) {
            return new GetShowFollowsResponse();
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
        synchronized (GetShowFollowsResponse.class) {
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

    @Override // com.spotify.profileprivacy.proto.v1.GetShowFollowsResponseOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.profileprivacy.proto.v1.GetShowFollowsResponseOrBuilder
    public boolean getShowFollows() {
        return this.showFollows_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GetShowFollowsResponseOrBuilder {
        private Builder() {
            super(GetShowFollowsResponse.DEFAULT_INSTANCE);
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

        public Builder clearShowFollows() {
            copyOnWrite();
            ((GetShowFollowsResponse) ((g) this).instance).clearShowFollows();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetShowFollowsResponseOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.profileprivacy.proto.v1.GetShowFollowsResponseOrBuilder
        public boolean getShowFollows() {
            return ((GetShowFollowsResponse) ((g) this).instance).getShowFollows();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m939mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setShowFollows(boolean z) {
            copyOnWrite();
            ((GetShowFollowsResponse) ((g) this).instance).setShowFollows(z);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m938clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m940mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m937clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m941mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(GetShowFollowsResponse getShowFollowsResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getShowFollowsResponse);
    }

    public static GetShowFollowsResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetShowFollowsResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetShowFollowsResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetShowFollowsResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetShowFollowsResponse parseFrom(phc phcVar) {
        return (GetShowFollowsResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetShowFollowsResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetShowFollowsResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GetShowFollowsResponse parseFrom(byte[] bArr) {
        return (GetShowFollowsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetShowFollowsResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetShowFollowsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetShowFollowsResponse parseFrom(InputStream inputStream) {
        return (GetShowFollowsResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetShowFollowsResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetShowFollowsResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetShowFollowsResponse parseFrom(lwg lwgVar) {
        return (GetShowFollowsResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetShowFollowsResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetShowFollowsResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
