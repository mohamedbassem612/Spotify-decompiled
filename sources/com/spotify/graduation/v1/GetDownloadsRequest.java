package com.spotify.graduation.v1;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetDownloadsRequest extends h implements GetDownloadsRequestOrBuilder {
    private static final GetDownloadsRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int UNUSED_FIELD_NUMBER = 1;
    private String unused_ = "";

    /* JADX INFO: renamed from: com.spotify.graduation.v1.GetDownloadsRequest$1, reason: invalid class name */
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
        GetDownloadsRequest getDownloadsRequest = new GetDownloadsRequest();
        DEFAULT_INSTANCE = getDownloadsRequest;
        h.registerDefaultInstance(GetDownloadsRequest.class, getDownloadsRequest);
    }

    private GetDownloadsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnused() {
        this.unused_ = DEFAULT_INSTANCE.unused_;
    }

    public static GetDownloadsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetDownloadsRequest parseDelimitedFrom(InputStream inputStream) {
        return (GetDownloadsRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetDownloadsRequest parseFrom(ByteBuffer byteBuffer) {
        return (GetDownloadsRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnused(String str) {
        str.getClass();
        this.unused_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnusedBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.unused_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"unused_"});
        }
        if (iOrdinal == 3) {
            return new GetDownloadsRequest();
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
        synchronized (GetDownloadsRequest.class) {
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

    @Override // com.spotify.graduation.v1.GetDownloadsRequestOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.graduation.v1.GetDownloadsRequestOrBuilder
    public final String getUnused() {
        return this.unused_;
    }

    @Override // com.spotify.graduation.v1.GetDownloadsRequestOrBuilder
    public final phc getUnusedBytes() {
        return phc.i(this.unused_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GetDownloadsRequestOrBuilder {
        private Builder() {
            super(GetDownloadsRequest.DEFAULT_INSTANCE);
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

        public final Builder clearUnused() {
            copyOnWrite();
            ((GetDownloadsRequest) ((g) this).instance).clearUnused();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.graduation.v1.GetDownloadsRequestOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.graduation.v1.GetDownloadsRequestOrBuilder
        public final String getUnused() {
            return ((GetDownloadsRequest) ((g) this).instance).getUnused();
        }

        @Override // com.spotify.graduation.v1.GetDownloadsRequestOrBuilder
        public final phc getUnusedBytes() {
            return ((GetDownloadsRequest) ((g) this).instance).getUnusedBytes();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m355mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setUnused(String str) {
            copyOnWrite();
            ((GetDownloadsRequest) ((g) this).instance).setUnused(str);
            return this;
        }

        public final Builder setUnusedBytes(phc phcVar) {
            copyOnWrite();
            ((GetDownloadsRequest) ((g) this).instance).setUnusedBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m354clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m356mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m353clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m357mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(GetDownloadsRequest getDownloadsRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getDownloadsRequest);
    }

    public static GetDownloadsRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetDownloadsRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetDownloadsRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetDownloadsRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetDownloadsRequest parseFrom(phc phcVar) {
        return (GetDownloadsRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetDownloadsRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetDownloadsRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GetDownloadsRequest parseFrom(byte[] bArr) {
        return (GetDownloadsRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetDownloadsRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetDownloadsRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetDownloadsRequest parseFrom(InputStream inputStream) {
        return (GetDownloadsRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetDownloadsRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetDownloadsRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetDownloadsRequest parseFrom(lwg lwgVar) {
        return (GetDownloadsRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetDownloadsRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetDownloadsRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
