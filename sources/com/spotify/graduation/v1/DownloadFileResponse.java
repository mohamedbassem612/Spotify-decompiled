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
public final class DownloadFileResponse extends h implements DownloadFileResponseOrBuilder {
    private static final DownloadFileResponse DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String link_ = "";

    /* JADX INFO: renamed from: com.spotify.graduation.v1.DownloadFileResponse$1, reason: invalid class name */
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
        DownloadFileResponse downloadFileResponse = new DownloadFileResponse();
        DEFAULT_INSTANCE = downloadFileResponse;
        h.registerDefaultInstance(DownloadFileResponse.class, downloadFileResponse);
    }

    private DownloadFileResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = DEFAULT_INSTANCE.link_;
    }

    public static DownloadFileResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DownloadFileResponse parseDelimitedFrom(InputStream inputStream) {
        return (DownloadFileResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DownloadFileResponse parseFrom(ByteBuffer byteBuffer) {
        return (DownloadFileResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.link_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"link_"});
        }
        if (iOrdinal == 3) {
            return new DownloadFileResponse();
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
        synchronized (DownloadFileResponse.class) {
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

    @Override // com.spotify.graduation.v1.DownloadFileResponseOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.graduation.v1.DownloadFileResponseOrBuilder
    public final String getLink() {
        return this.link_;
    }

    @Override // com.spotify.graduation.v1.DownloadFileResponseOrBuilder
    public final phc getLinkBytes() {
        return phc.i(this.link_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements DownloadFileResponseOrBuilder {
        private Builder() {
            super(DownloadFileResponse.DEFAULT_INSTANCE);
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

        public final Builder clearLink() {
            copyOnWrite();
            ((DownloadFileResponse) ((g) this).instance).clearLink();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.graduation.v1.DownloadFileResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.graduation.v1.DownloadFileResponseOrBuilder
        public final String getLink() {
            return ((DownloadFileResponse) ((g) this).instance).getLink();
        }

        @Override // com.spotify.graduation.v1.DownloadFileResponseOrBuilder
        public final phc getLinkBytes() {
            return ((DownloadFileResponse) ((g) this).instance).getLinkBytes();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m348mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setLink(String str) {
            copyOnWrite();
            ((DownloadFileResponse) ((g) this).instance).setLink(str);
            return this;
        }

        public final Builder setLinkBytes(phc phcVar) {
            copyOnWrite();
            ((DownloadFileResponse) ((g) this).instance).setLinkBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m347clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m349mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m346clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m350mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(DownloadFileResponse downloadFileResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(downloadFileResponse);
    }

    public static DownloadFileResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (DownloadFileResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DownloadFileResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (DownloadFileResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static DownloadFileResponse parseFrom(phc phcVar) {
        return (DownloadFileResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static DownloadFileResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (DownloadFileResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static DownloadFileResponse parseFrom(byte[] bArr) {
        return (DownloadFileResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DownloadFileResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (DownloadFileResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static DownloadFileResponse parseFrom(InputStream inputStream) {
        return (DownloadFileResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DownloadFileResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (DownloadFileResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DownloadFileResponse parseFrom(lwg lwgVar) {
        return (DownloadFileResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static DownloadFileResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (DownloadFileResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
