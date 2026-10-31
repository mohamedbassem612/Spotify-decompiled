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
public final class HierarchyStatistic extends h implements HierarchyStatisticOrBuilder {
    public static final int ALL_EVENTS_SEEN_FIELD_NUMBER = 2;
    private static final HierarchyStatistic DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REVISION_FIELD_NUMBER = 5;
    public static final int TOTAL_USER_UNSEEN_ACTIVITY_EVENTS_FIELD_NUMBER = 3;
    public static final int TOTAL_USER_UNSEEN_CONTRIBUTION_EVENTS_FIELD_NUMBER = 4;
    public static final int TOTAL_USER_UNSEEN_EVENTS_FIELD_NUMBER = 1;
    private boolean allEventsSeen_;
    private String revision_ = "";
    private int totalUserUnseenActivityEvents_;
    private int totalUserUnseenContributionEvents_;
    private int totalUserUnseenEvents_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.HierarchyStatistic$1, reason: invalid class name */
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
        HierarchyStatistic hierarchyStatistic = new HierarchyStatistic();
        DEFAULT_INSTANCE = hierarchyStatistic;
        h.registerDefaultInstance(HierarchyStatistic.class, hierarchyStatistic);
    }

    private HierarchyStatistic() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllEventsSeen() {
        this.allEventsSeen_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRevision() {
        this.revision_ = getDefaultInstance().getRevision();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalUserUnseenActivityEvents() {
        this.totalUserUnseenActivityEvents_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalUserUnseenContributionEvents() {
        this.totalUserUnseenContributionEvents_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalUserUnseenEvents() {
        this.totalUserUnseenEvents_ = 0;
    }

    public static HierarchyStatistic getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HierarchyStatistic parseDelimitedFrom(InputStream inputStream) {
        return (HierarchyStatistic) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyStatistic parseFrom(ByteBuffer byteBuffer) {
        return (HierarchyStatistic) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllEventsSeen(boolean z) {
        this.allEventsSeen_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevision(String str) {
        str.getClass();
        this.revision_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevisionBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.revision_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalUserUnseenActivityEvents(int i) {
        this.totalUserUnseenActivityEvents_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalUserUnseenContributionEvents(int i) {
        this.totalUserUnseenContributionEvents_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalUserUnseenEvents(int i) {
        this.totalUserUnseenEvents_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0004\u0004\u0004\u0005Ȉ", new Object[]{"totalUserUnseenEvents_", "allEventsSeen_", "totalUserUnseenActivityEvents_", "totalUserUnseenContributionEvents_", "revision_"});
        }
        if (iOrdinal == 3) {
            return new HierarchyStatistic();
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
        synchronized (HierarchyStatistic.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
    public boolean getAllEventsSeen() {
        return this.allEventsSeen_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
    public String getRevision() {
        return this.revision_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
    public phc getRevisionBytes() {
        return phc.i(this.revision_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
    public int getTotalUserUnseenActivityEvents() {
        return this.totalUserUnseenActivityEvents_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
    public int getTotalUserUnseenContributionEvents() {
        return this.totalUserUnseenContributionEvents_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
    public int getTotalUserUnseenEvents() {
        return this.totalUserUnseenEvents_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements HierarchyStatisticOrBuilder {
        private Builder() {
            super(HierarchyStatistic.DEFAULT_INSTANCE);
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

        public Builder clearAllEventsSeen() {
            copyOnWrite();
            ((HierarchyStatistic) ((g) this).instance).clearAllEventsSeen();
            return this;
        }

        public Builder clearRevision() {
            copyOnWrite();
            ((HierarchyStatistic) ((g) this).instance).clearRevision();
            return this;
        }

        public Builder clearTotalUserUnseenActivityEvents() {
            copyOnWrite();
            ((HierarchyStatistic) ((g) this).instance).clearTotalUserUnseenActivityEvents();
            return this;
        }

        public Builder clearTotalUserUnseenContributionEvents() {
            copyOnWrite();
            ((HierarchyStatistic) ((g) this).instance).clearTotalUserUnseenContributionEvents();
            return this;
        }

        public Builder clearTotalUserUnseenEvents() {
            copyOnWrite();
            ((HierarchyStatistic) ((g) this).instance).clearTotalUserUnseenEvents();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
        public boolean getAllEventsSeen() {
            return ((HierarchyStatistic) ((g) this).instance).getAllEventsSeen();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
        public String getRevision() {
            return ((HierarchyStatistic) ((g) this).instance).getRevision();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
        public phc getRevisionBytes() {
            return ((HierarchyStatistic) ((g) this).instance).getRevisionBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
        public int getTotalUserUnseenActivityEvents() {
            return ((HierarchyStatistic) ((g) this).instance).getTotalUserUnseenActivityEvents();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
        public int getTotalUserUnseenContributionEvents() {
            return ((HierarchyStatistic) ((g) this).instance).getTotalUserUnseenContributionEvents();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyStatisticOrBuilder
        public int getTotalUserUnseenEvents() {
            return ((HierarchyStatistic) ((g) this).instance).getTotalUserUnseenEvents();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m414mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAllEventsSeen(boolean z) {
            copyOnWrite();
            ((HierarchyStatistic) ((g) this).instance).setAllEventsSeen(z);
            return this;
        }

        public Builder setRevision(String str) {
            copyOnWrite();
            ((HierarchyStatistic) ((g) this).instance).setRevision(str);
            return this;
        }

        public Builder setRevisionBytes(phc phcVar) {
            copyOnWrite();
            ((HierarchyStatistic) ((g) this).instance).setRevisionBytes(phcVar);
            return this;
        }

        public Builder setTotalUserUnseenActivityEvents(int i) {
            copyOnWrite();
            ((HierarchyStatistic) ((g) this).instance).setTotalUserUnseenActivityEvents(i);
            return this;
        }

        public Builder setTotalUserUnseenContributionEvents(int i) {
            copyOnWrite();
            ((HierarchyStatistic) ((g) this).instance).setTotalUserUnseenContributionEvents(i);
            return this;
        }

        public Builder setTotalUserUnseenEvents(int i) {
            copyOnWrite();
            ((HierarchyStatistic) ((g) this).instance).setTotalUserUnseenEvents(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m413clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m415mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m412clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m416mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(HierarchyStatistic hierarchyStatistic) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hierarchyStatistic);
    }

    public static HierarchyStatistic parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyStatistic) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyStatistic parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (HierarchyStatistic) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static HierarchyStatistic parseFrom(phc phcVar) {
        return (HierarchyStatistic) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static HierarchyStatistic parseFrom(phc phcVar, uz00 uz00Var) {
        return (HierarchyStatistic) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static HierarchyStatistic parseFrom(byte[] bArr) {
        return (HierarchyStatistic) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HierarchyStatistic parseFrom(byte[] bArr, uz00 uz00Var) {
        return (HierarchyStatistic) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static HierarchyStatistic parseFrom(InputStream inputStream) {
        return (HierarchyStatistic) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyStatistic parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyStatistic) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyStatistic parseFrom(lwg lwgVar) {
        return (HierarchyStatistic) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static HierarchyStatistic parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (HierarchyStatistic) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
