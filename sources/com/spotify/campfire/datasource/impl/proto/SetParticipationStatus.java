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
public final class SetParticipationStatus extends h implements SetParticipationStatusOrBuilder {
    private static final SetParticipationStatus DEFAULT_INSTANCE;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int USER_PARTICIPATION_STATUS_FIELD_NUMBER = 2;
    private String hierarchyId_ = "";
    private int userParticipationStatus_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.SetParticipationStatus$1, reason: invalid class name */
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
        SetParticipationStatus setParticipationStatus = new SetParticipationStatus();
        DEFAULT_INSTANCE = setParticipationStatus;
        h.registerDefaultInstance(SetParticipationStatus.class, setParticipationStatus);
    }

    private SetParticipationStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserParticipationStatus() {
        this.userParticipationStatus_ = 0;
    }

    public static SetParticipationStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SetParticipationStatus parseDelimitedFrom(InputStream inputStream) {
        return (SetParticipationStatus) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetParticipationStatus parseFrom(ByteBuffer byteBuffer) {
        return (SetParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyId(String str) {
        str.getClass();
        this.hierarchyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.hierarchyId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserParticipationStatus(HierarchyUserParticipationStatus hierarchyUserParticipationStatus) {
        this.userParticipationStatus_ = hierarchyUserParticipationStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserParticipationStatusValue(int i) {
        this.userParticipationStatus_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"hierarchyId_", "userParticipationStatus_"});
        }
        if (iOrdinal == 3) {
            return new SetParticipationStatus();
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
        synchronized (SetParticipationStatus.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.SetParticipationStatusOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetParticipationStatusOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetParticipationStatusOrBuilder
    public phc getHierarchyIdBytes() {
        return phc.i(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetParticipationStatusOrBuilder
    public HierarchyUserParticipationStatus getUserParticipationStatus() {
        HierarchyUserParticipationStatus hierarchyUserParticipationStatusForNumber = HierarchyUserParticipationStatus.forNumber(this.userParticipationStatus_);
        return hierarchyUserParticipationStatusForNumber == null ? HierarchyUserParticipationStatus.UNRECOGNIZED : hierarchyUserParticipationStatusForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SetParticipationStatusOrBuilder
    public int getUserParticipationStatusValue() {
        return this.userParticipationStatus_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements SetParticipationStatusOrBuilder {
        private Builder() {
            super(SetParticipationStatus.DEFAULT_INSTANCE);
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

        public Builder clearHierarchyId() {
            copyOnWrite();
            ((SetParticipationStatus) ((g) this).instance).clearHierarchyId();
            return this;
        }

        public Builder clearUserParticipationStatus() {
            copyOnWrite();
            ((SetParticipationStatus) ((g) this).instance).clearUserParticipationStatus();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SetParticipationStatusOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SetParticipationStatusOrBuilder
        public String getHierarchyId() {
            return ((SetParticipationStatus) ((g) this).instance).getHierarchyId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SetParticipationStatusOrBuilder
        public phc getHierarchyIdBytes() {
            return ((SetParticipationStatus) ((g) this).instance).getHierarchyIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SetParticipationStatusOrBuilder
        public HierarchyUserParticipationStatus getUserParticipationStatus() {
            return ((SetParticipationStatus) ((g) this).instance).getUserParticipationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SetParticipationStatusOrBuilder
        public int getUserParticipationStatusValue() {
            return ((SetParticipationStatus) ((g) this).instance).getUserParticipationStatusValue();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m694mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setHierarchyId(String str) {
            copyOnWrite();
            ((SetParticipationStatus) ((g) this).instance).setHierarchyId(str);
            return this;
        }

        public Builder setHierarchyIdBytes(phc phcVar) {
            copyOnWrite();
            ((SetParticipationStatus) ((g) this).instance).setHierarchyIdBytes(phcVar);
            return this;
        }

        public Builder setUserParticipationStatus(HierarchyUserParticipationStatus hierarchyUserParticipationStatus) {
            copyOnWrite();
            ((SetParticipationStatus) ((g) this).instance).setUserParticipationStatus(hierarchyUserParticipationStatus);
            return this;
        }

        public Builder setUserParticipationStatusValue(int i) {
            copyOnWrite();
            ((SetParticipationStatus) ((g) this).instance).setUserParticipationStatusValue(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m693clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m695mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m692clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m696mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(SetParticipationStatus setParticipationStatus) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(setParticipationStatus);
    }

    public static SetParticipationStatus parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (SetParticipationStatus) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SetParticipationStatus parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (SetParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static SetParticipationStatus parseFrom(phc phcVar) {
        return (SetParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static SetParticipationStatus parseFrom(phc phcVar, uz00 uz00Var) {
        return (SetParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static SetParticipationStatus parseFrom(byte[] bArr) {
        return (SetParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SetParticipationStatus parseFrom(byte[] bArr, uz00 uz00Var) {
        return (SetParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static SetParticipationStatus parseFrom(InputStream inputStream) {
        return (SetParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetParticipationStatus parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (SetParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SetParticipationStatus parseFrom(lwg lwgVar) {
        return (SetParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static SetParticipationStatus parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (SetParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
