package com.spotify.graduation.v1;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
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
public final class GraduationRequest extends h implements GraduationRequestOrBuilder {
    private static final GraduationRequest DEFAULT_INSTANCE;
    public static final int LEVELS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private static final c290 levels_converter_ = new AnonymousClass1();
    private int levelsMemoizedSerializedSize;
    private b290 levels_ = h.emptyIntList();

    /* JADX INFO: renamed from: com.spotify.graduation.v1.GraduationRequest$1, reason: invalid class name */
    public class AnonymousClass1 implements c290 {
        /* JADX INFO: renamed from: convert, reason: merged with bridge method [inline-methods] */
        public final DownloadLevel m363convert(int i) {
            DownloadLevel downloadLevelForNumber = DownloadLevel.forNumber(i);
            return downloadLevelForNumber == null ? DownloadLevel.UNRECOGNIZED : downloadLevelForNumber;
        }
    }

    /* JADX INFO: renamed from: com.spotify.graduation.v1.GraduationRequest$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
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
        GraduationRequest graduationRequest = new GraduationRequest();
        DEFAULT_INSTANCE = graduationRequest;
        h.registerDefaultInstance(GraduationRequest.class, graduationRequest);
    }

    private GraduationRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLevels(Iterable<? extends DownloadLevel> iterable) {
        ensureLevelsIsMutable();
        for (DownloadLevel downloadLevel : iterable) {
            this.levels_.c(downloadLevel.getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLevelsValue(Iterable<Integer> iterable) {
        ensureLevelsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.levels_.c(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLevels(DownloadLevel downloadLevel) {
        downloadLevel.getClass();
        ensureLevelsIsMutable();
        this.levels_.c(downloadLevel.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLevelsValue(int i) {
        ensureLevelsIsMutable();
        this.levels_.c(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevels() {
        this.levels_ = h.emptyIntList();
    }

    private void ensureLevelsIsMutable() {
        i9 i9Var = this.levels_;
        if (i9Var.a) {
            return;
        }
        this.levels_ = h.mutableCopy(i9Var);
    }

    public static GraduationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GraduationRequest parseDelimitedFrom(InputStream inputStream) {
        return (GraduationRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GraduationRequest parseFrom(ByteBuffer byteBuffer) {
        return (GraduationRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevels(int i, DownloadLevel downloadLevel) {
        downloadLevel.getClass();
        ensureLevelsIsMutable();
        this.levels_.i(i, downloadLevel.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevelsValue(int i, int i2) {
        ensureLevelsIsMutable();
        this.levels_.i(i, i2);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002,", new Object[]{"levels_"});
        }
        if (iOrdinal == 3) {
            return new GraduationRequest();
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
        synchronized (GraduationRequest.class) {
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

    @Override // com.spotify.graduation.v1.GraduationRequestOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.graduation.v1.GraduationRequestOrBuilder
    public final DownloadLevel getLevels(int i) {
        DownloadLevel downloadLevelForNumber = DownloadLevel.forNumber(this.levels_.e(i));
        return downloadLevelForNumber == null ? DownloadLevel.UNRECOGNIZED : downloadLevelForNumber;
    }

    @Override // com.spotify.graduation.v1.GraduationRequestOrBuilder
    public final int getLevelsCount() {
        return this.levels_.size();
    }

    @Override // com.spotify.graduation.v1.GraduationRequestOrBuilder
    public final List<DownloadLevel> getLevelsList() {
        return new d290(this.levels_, levels_converter_);
    }

    @Override // com.spotify.graduation.v1.GraduationRequestOrBuilder
    public final int getLevelsValue(int i) {
        return this.levels_.e(i);
    }

    @Override // com.spotify.graduation.v1.GraduationRequestOrBuilder
    public final List<Integer> getLevelsValueList() {
        return this.levels_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GraduationRequestOrBuilder {
        private Builder() {
            super(GraduationRequest.DEFAULT_INSTANCE);
        }

        public final Builder addAllLevels(Iterable<? extends DownloadLevel> iterable) {
            copyOnWrite();
            ((GraduationRequest) ((g) this).instance).addAllLevels(iterable);
            return this;
        }

        public final Builder addAllLevelsValue(Iterable<Integer> iterable) {
            copyOnWrite();
            ((GraduationRequest) ((g) this).instance).addAllLevelsValue(iterable);
            return this;
        }

        public final Builder addLevels(DownloadLevel downloadLevel) {
            copyOnWrite();
            ((GraduationRequest) ((g) this).instance).addLevels(downloadLevel);
            return this;
        }

        public final Builder addLevelsValue(int i) {
            copyOnWrite();
            ((GraduationRequest) ((g) this).instance).addLevelsValue(i);
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

        public final Builder clearLevels() {
            copyOnWrite();
            ((GraduationRequest) ((g) this).instance).clearLevels();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.graduation.v1.GraduationRequestOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.graduation.v1.GraduationRequestOrBuilder
        public final DownloadLevel getLevels(int i) {
            return ((GraduationRequest) ((g) this).instance).getLevels(i);
        }

        @Override // com.spotify.graduation.v1.GraduationRequestOrBuilder
        public final int getLevelsCount() {
            return ((GraduationRequest) ((g) this).instance).getLevelsCount();
        }

        @Override // com.spotify.graduation.v1.GraduationRequestOrBuilder
        public final List<DownloadLevel> getLevelsList() {
            return ((GraduationRequest) ((g) this).instance).getLevelsList();
        }

        @Override // com.spotify.graduation.v1.GraduationRequestOrBuilder
        public final int getLevelsValue(int i) {
            return ((GraduationRequest) ((g) this).instance).getLevelsValue(i);
        }

        @Override // com.spotify.graduation.v1.GraduationRequestOrBuilder
        public final List<Integer> getLevelsValueList() {
            return Collections.unmodifiableList(((GraduationRequest) ((g) this).instance).getLevelsValueList());
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m366mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setLevels(int i, DownloadLevel downloadLevel) {
            copyOnWrite();
            ((GraduationRequest) ((g) this).instance).setLevels(i, downloadLevel);
            return this;
        }

        public final Builder setLevelsValue(int i, int i2) {
            copyOnWrite();
            ((GraduationRequest) ((g) this).instance).setLevelsValue(i, i2);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m365clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m367mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m364clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m368mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(GraduationRequest graduationRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(graduationRequest);
    }

    public static GraduationRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GraduationRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GraduationRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GraduationRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GraduationRequest parseFrom(phc phcVar) {
        return (GraduationRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GraduationRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (GraduationRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GraduationRequest parseFrom(byte[] bArr) {
        return (GraduationRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GraduationRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GraduationRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GraduationRequest parseFrom(InputStream inputStream) {
        return (GraduationRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GraduationRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GraduationRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GraduationRequest parseFrom(lwg lwgVar) {
        return (GraduationRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GraduationRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GraduationRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
