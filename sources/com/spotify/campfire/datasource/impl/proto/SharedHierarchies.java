package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p.bf40;
import p.h290;
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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SharedHierarchies extends h implements SharedHierarchiesOrBuilder {
    private static final SharedHierarchies DEFAULT_INSTANCE;
    public static final int HIERARCHIES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 hierarchies_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.SharedHierarchies$1, reason: invalid class name */
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
        SharedHierarchies sharedHierarchies = new SharedHierarchies();
        DEFAULT_INSTANCE = sharedHierarchies;
        h.registerDefaultInstance(SharedHierarchies.class, sharedHierarchies);
    }

    private SharedHierarchies() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHierarchies(Iterable<? extends SharedHierarchyEntry> iterable) {
        ensureHierarchiesIsMutable();
        s8.addAll(iterable, this.hierarchies_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHierarchies(SharedHierarchyEntry sharedHierarchyEntry) {
        sharedHierarchyEntry.getClass();
        ensureHierarchiesIsMutable();
        this.hierarchies_.add(sharedHierarchyEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchies() {
        this.hierarchies_ = h.emptyProtobufList();
    }

    private void ensureHierarchiesIsMutable() {
        i9 i9Var = this.hierarchies_;
        if (i9Var.a) {
            return;
        }
        this.hierarchies_ = h.mutableCopy(i9Var);
    }

    public static SharedHierarchies getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SharedHierarchies parseDelimitedFrom(InputStream inputStream) {
        return (SharedHierarchies) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SharedHierarchies parseFrom(ByteBuffer byteBuffer) {
        return (SharedHierarchies) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeHierarchies(int i) {
        ensureHierarchiesIsMutable();
        this.hierarchies_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchies(int i, SharedHierarchyEntry sharedHierarchyEntry) {
        sharedHierarchyEntry.getClass();
        ensureHierarchiesIsMutable();
        this.hierarchies_.set(i, sharedHierarchyEntry);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"hierarchies_", SharedHierarchyEntry.class});
        }
        if (iOrdinal == 3) {
            return new SharedHierarchies();
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
        synchronized (SharedHierarchies.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
    public SharedHierarchyEntry getHierarchies(int i) {
        return (SharedHierarchyEntry) this.hierarchies_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
    public int getHierarchiesCount() {
        return this.hierarchies_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
    public List<SharedHierarchyEntry> getHierarchiesList() {
        return this.hierarchies_;
    }

    public SharedHierarchyEntryOrBuilder getHierarchiesOrBuilder(int i) {
        return (SharedHierarchyEntryOrBuilder) this.hierarchies_.get(i);
    }

    public List<? extends SharedHierarchyEntryOrBuilder> getHierarchiesOrBuilderList() {
        return this.hierarchies_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements SharedHierarchiesOrBuilder {
        private Builder() {
            super(SharedHierarchies.DEFAULT_INSTANCE);
        }

        public Builder addAllHierarchies(Iterable<? extends SharedHierarchyEntry> iterable) {
            copyOnWrite();
            ((SharedHierarchies) ((g) this).instance).addAllHierarchies(iterable);
            return this;
        }

        public Builder addHierarchies(SharedHierarchyEntry.Builder builder) {
            copyOnWrite();
            ((SharedHierarchies) ((g) this).instance).addHierarchies((SharedHierarchyEntry) builder.build());
            return this;
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

        public Builder clearHierarchies() {
            copyOnWrite();
            ((SharedHierarchies) ((g) this).instance).clearHierarchies();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
        public SharedHierarchyEntry getHierarchies(int i) {
            return ((SharedHierarchies) ((g) this).instance).getHierarchies(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
        public int getHierarchiesCount() {
            return ((SharedHierarchies) ((g) this).instance).getHierarchiesCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
        public List<SharedHierarchyEntry> getHierarchiesList() {
            return Collections.unmodifiableList(((SharedHierarchies) ((g) this).instance).getHierarchiesList());
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m710mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder removeHierarchies(int i) {
            copyOnWrite();
            ((SharedHierarchies) ((g) this).instance).removeHierarchies(i);
            return this;
        }

        public Builder setHierarchies(int i, SharedHierarchyEntry.Builder builder) {
            copyOnWrite();
            ((SharedHierarchies) ((g) this).instance).setHierarchies(i, (SharedHierarchyEntry) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m709clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m711mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m708clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m712mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder addHierarchies(int i, SharedHierarchyEntry sharedHierarchyEntry) {
            copyOnWrite();
            ((SharedHierarchies) ((g) this).instance).addHierarchies(i, sharedHierarchyEntry);
            return this;
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setHierarchies(int i, SharedHierarchyEntry sharedHierarchyEntry) {
            copyOnWrite();
            ((SharedHierarchies) ((g) this).instance).setHierarchies(i, sharedHierarchyEntry);
            return this;
        }

        public Builder addHierarchies(SharedHierarchyEntry sharedHierarchyEntry) {
            copyOnWrite();
            ((SharedHierarchies) ((g) this).instance).addHierarchies(sharedHierarchyEntry);
            return this;
        }

        public Builder addHierarchies(int i, SharedHierarchyEntry.Builder builder) {
            copyOnWrite();
            ((SharedHierarchies) ((g) this).instance).addHierarchies(i, (SharedHierarchyEntry) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(SharedHierarchies sharedHierarchies) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(sharedHierarchies);
    }

    public static SharedHierarchies parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (SharedHierarchies) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SharedHierarchies parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (SharedHierarchies) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static SharedHierarchies parseFrom(phc phcVar) {
        return (SharedHierarchies) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static SharedHierarchies parseFrom(phc phcVar, uz00 uz00Var) {
        return (SharedHierarchies) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHierarchies(int i, SharedHierarchyEntry sharedHierarchyEntry) {
        sharedHierarchyEntry.getClass();
        ensureHierarchiesIsMutable();
        this.hierarchies_.add(i, sharedHierarchyEntry);
    }

    public static SharedHierarchies parseFrom(byte[] bArr) {
        return (SharedHierarchies) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SharedHierarchies parseFrom(byte[] bArr, uz00 uz00Var) {
        return (SharedHierarchies) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static SharedHierarchies parseFrom(InputStream inputStream) {
        return (SharedHierarchies) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SharedHierarchies parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (SharedHierarchies) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static SharedHierarchies parseFrom(lwg lwgVar) {
        return (SharedHierarchies) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static SharedHierarchies parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (SharedHierarchies) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
