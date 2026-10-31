package com.spotify.graduation.v1;

import com.google.protobuf.Timestamp;
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
import p.sve1;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Download extends h implements DownloadOrBuilder {
    public static final int DATE_FIELD_NUMBER = 6;
    private static final Download DEFAULT_INSTANCE;
    public static final int DOWNLOAD_URL_FIELD_NUMBER = 2;
    public static final int LEVEL_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SECURITY_CODE_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TTL_FIELD_NUMBER = 4;
    private int bitField0_;
    private Timestamp date_;
    private int level_;
    private int status_;
    private int ttl_;
    private String downloadUrl_ = "";
    private String securityCode_ = "";

    /* JADX INFO: renamed from: com.spotify.graduation.v1.Download$1, reason: invalid class name */
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
        Download download = new Download();
        DEFAULT_INSTANCE = download;
        h.registerDefaultInstance(Download.class, download);
    }

    private Download() {
    }

    public static void C(int i, Download download) {
        download.status_ = i;
    }

    public static void D(int i, Download download) {
        download.ttl_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDate() {
        this.date_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloadUrl() {
        this.downloadUrl_ = DEFAULT_INSTANCE.downloadUrl_;
    }

    private void clearLevel() {
        this.level_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecurityCode() {
        this.securityCode_ = DEFAULT_INSTANCE.securityCode_;
    }

    private void clearStatus() {
        this.status_ = 0;
    }

    private void clearTtl() {
        this.ttl_ = 0;
    }

    public static Download getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDate(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.date_;
        if (timestamp2 == null || timestamp2 == Timestamp.o()) {
            this.date_ = timestamp;
        } else {
            this.date_ = Timestamp.s(this.date_).mergeFrom(timestamp).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static void p(Download download) {
        download.level_ = 0;
    }

    public static Download parseDelimitedFrom(InputStream inputStream) {
        return (Download) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Download parseFrom(ByteBuffer byteBuffer) {
        return (Download) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void r(Download download) {
        download.status_ = 0;
    }

    public static void s(Download download) {
        download.ttl_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDate(Timestamp timestamp) {
        timestamp.getClass();
        this.date_ = timestamp;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadUrl(String str) {
        str.getClass();
        this.downloadUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadUrlBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.downloadUrl_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(DownloadLevel downloadLevel) {
        this.level_ = downloadLevel.getNumber();
    }

    private void setLevelValue(int i) {
        this.level_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecurityCode(String str) {
        str.getClass();
        this.securityCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecurityCodeBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.securityCode_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(DownloadStatus downloadStatus) {
        this.status_ = downloadStatus.getNumber();
    }

    private void setStatusValue(int i) {
        this.status_ = i;
    }

    private void setTtl(int i) {
        this.ttl_ = i;
    }

    public static void y(int i, Download download) {
        download.level_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\f\u0006ဉ\u0000", new Object[]{"bitField0_", "status_", "downloadUrl_", "securityCode_", "ttl_", "level_", "date_"});
        }
        if (iOrdinal == 3) {
            return new Download();
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
        synchronized (Download.class) {
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

    @Override // com.spotify.graduation.v1.DownloadOrBuilder
    public final Timestamp getDate() {
        Timestamp timestamp = this.date_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    @Override // com.spotify.graduation.v1.DownloadOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.graduation.v1.DownloadOrBuilder
    public final String getDownloadUrl() {
        return this.downloadUrl_;
    }

    @Override // com.spotify.graduation.v1.DownloadOrBuilder
    public final phc getDownloadUrlBytes() {
        return phc.i(this.downloadUrl_);
    }

    @Override // com.spotify.graduation.v1.DownloadOrBuilder
    public final DownloadLevel getLevel() {
        DownloadLevel downloadLevelForNumber = DownloadLevel.forNumber(this.level_);
        return downloadLevelForNumber == null ? DownloadLevel.UNRECOGNIZED : downloadLevelForNumber;
    }

    @Override // com.spotify.graduation.v1.DownloadOrBuilder
    public final int getLevelValue() {
        return this.level_;
    }

    @Override // com.spotify.graduation.v1.DownloadOrBuilder
    public final String getSecurityCode() {
        return this.securityCode_;
    }

    @Override // com.spotify.graduation.v1.DownloadOrBuilder
    public final phc getSecurityCodeBytes() {
        return phc.i(this.securityCode_);
    }

    @Override // com.spotify.graduation.v1.DownloadOrBuilder
    public final DownloadStatus getStatus() {
        DownloadStatus downloadStatusForNumber = DownloadStatus.forNumber(this.status_);
        return downloadStatusForNumber == null ? DownloadStatus.UNRECOGNIZED : downloadStatusForNumber;
    }

    @Override // com.spotify.graduation.v1.DownloadOrBuilder
    public final int getStatusValue() {
        return this.status_;
    }

    @Override // com.spotify.graduation.v1.DownloadOrBuilder
    public final int getTtl() {
        return this.ttl_;
    }

    @Override // com.spotify.graduation.v1.DownloadOrBuilder
    public final boolean hasDate() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements DownloadOrBuilder {
        private Builder() {
            super(Download.DEFAULT_INSTANCE);
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

        public final Builder clearDate() {
            copyOnWrite();
            ((Download) ((g) this).instance).clearDate();
            return this;
        }

        public final Builder clearDownloadUrl() {
            copyOnWrite();
            ((Download) ((g) this).instance).clearDownloadUrl();
            return this;
        }

        public final Builder clearLevel() {
            copyOnWrite();
            Download.p((Download) ((g) this).instance);
            return this;
        }

        public final Builder clearSecurityCode() {
            copyOnWrite();
            ((Download) ((g) this).instance).clearSecurityCode();
            return this;
        }

        public final Builder clearStatus() {
            copyOnWrite();
            Download.r((Download) ((g) this).instance);
            return this;
        }

        public final Builder clearTtl() {
            copyOnWrite();
            Download.s((Download) ((g) this).instance);
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.graduation.v1.DownloadOrBuilder
        public final Timestamp getDate() {
            return ((Download) ((g) this).instance).getDate();
        }

        @Override // com.spotify.graduation.v1.DownloadOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.graduation.v1.DownloadOrBuilder
        public final String getDownloadUrl() {
            return ((Download) ((g) this).instance).getDownloadUrl();
        }

        @Override // com.spotify.graduation.v1.DownloadOrBuilder
        public final phc getDownloadUrlBytes() {
            return ((Download) ((g) this).instance).getDownloadUrlBytes();
        }

        @Override // com.spotify.graduation.v1.DownloadOrBuilder
        public final DownloadLevel getLevel() {
            return ((Download) ((g) this).instance).getLevel();
        }

        @Override // com.spotify.graduation.v1.DownloadOrBuilder
        public final int getLevelValue() {
            return ((Download) ((g) this).instance).getLevelValue();
        }

        @Override // com.spotify.graduation.v1.DownloadOrBuilder
        public final String getSecurityCode() {
            return ((Download) ((g) this).instance).getSecurityCode();
        }

        @Override // com.spotify.graduation.v1.DownloadOrBuilder
        public final phc getSecurityCodeBytes() {
            return ((Download) ((g) this).instance).getSecurityCodeBytes();
        }

        @Override // com.spotify.graduation.v1.DownloadOrBuilder
        public final DownloadStatus getStatus() {
            return ((Download) ((g) this).instance).getStatus();
        }

        @Override // com.spotify.graduation.v1.DownloadOrBuilder
        public final int getStatusValue() {
            return ((Download) ((g) this).instance).getStatusValue();
        }

        @Override // com.spotify.graduation.v1.DownloadOrBuilder
        public final int getTtl() {
            return ((Download) ((g) this).instance).getTtl();
        }

        @Override // com.spotify.graduation.v1.DownloadOrBuilder
        public final boolean hasDate() {
            return ((Download) ((g) this).instance).hasDate();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public final Builder mergeDate(Timestamp timestamp) {
            copyOnWrite();
            ((Download) ((g) this).instance).mergeDate(timestamp);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m338mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setDate(sve1 sve1Var) {
            copyOnWrite();
            ((Download) ((g) this).instance).setDate(sve1Var.build());
            return this;
        }

        public final Builder setDownloadUrl(String str) {
            copyOnWrite();
            ((Download) ((g) this).instance).setDownloadUrl(str);
            return this;
        }

        public final Builder setDownloadUrlBytes(phc phcVar) {
            copyOnWrite();
            ((Download) ((g) this).instance).setDownloadUrlBytes(phcVar);
            return this;
        }

        public final Builder setLevel(DownloadLevel downloadLevel) {
            copyOnWrite();
            ((Download) ((g) this).instance).setLevel(downloadLevel);
            return this;
        }

        public final Builder setLevelValue(int i) {
            copyOnWrite();
            Download.y(i, (Download) ((g) this).instance);
            return this;
        }

        public final Builder setSecurityCode(String str) {
            copyOnWrite();
            ((Download) ((g) this).instance).setSecurityCode(str);
            return this;
        }

        public final Builder setSecurityCodeBytes(phc phcVar) {
            copyOnWrite();
            ((Download) ((g) this).instance).setSecurityCodeBytes(phcVar);
            return this;
        }

        public final Builder setStatus(DownloadStatus downloadStatus) {
            copyOnWrite();
            ((Download) ((g) this).instance).setStatus(downloadStatus);
            return this;
        }

        public final Builder setStatusValue(int i) {
            copyOnWrite();
            Download.C(i, (Download) ((g) this).instance);
            return this;
        }

        public final Builder setTtl(int i) {
            copyOnWrite();
            Download.D(i, (Download) ((g) this).instance);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m337clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m339mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m336clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m340mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public final Builder setDate(Timestamp timestamp) {
            copyOnWrite();
            ((Download) ((g) this).instance).setDate(timestamp);
            return this;
        }
    }

    public static Builder newBuilder(Download download) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(download);
    }

    public static Download parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Download) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Download parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Download) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Download parseFrom(phc phcVar) {
        return (Download) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Download parseFrom(phc phcVar, uz00 uz00Var) {
        return (Download) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static Download parseFrom(byte[] bArr) {
        return (Download) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Download parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Download) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Download parseFrom(InputStream inputStream) {
        return (Download) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Download parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Download) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Download parseFrom(lwg lwgVar) {
        return (Download) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Download parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Download) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
