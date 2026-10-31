package com.spotify.kidsview.v1.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class GetChildrenResponse extends h implements GetChildrenResponseOrBuilder {
    public static final int CHILDREN_FIELD_NUMBER = 1;
    private static final GetChildrenResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private h290 children_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.GetChildrenResponse$1, reason: invalid class name */
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
        GetChildrenResponse getChildrenResponse = new GetChildrenResponse();
        DEFAULT_INSTANCE = getChildrenResponse;
        h.registerDefaultInstance(GetChildrenResponse.class, getChildrenResponse);
    }

    private GetChildrenResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChildren(Iterable<? extends Child> iterable) {
        ensureChildrenIsMutable();
        s8.addAll(iterable, this.children_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildren(Child child) {
        child.getClass();
        ensureChildrenIsMutable();
        this.children_.add(child);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildren() {
        this.children_ = h.emptyProtobufList();
    }

    private void ensureChildrenIsMutable() {
        i9 i9Var = this.children_;
        if (i9Var.a) {
            return;
        }
        this.children_ = h.mutableCopy(i9Var);
    }

    public static GetChildrenResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetChildrenResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetChildrenResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetChildrenResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetChildrenResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChildren(int i) {
        ensureChildrenIsMutable();
        this.children_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildren(int i, Child child) {
        child.getClass();
        ensureChildrenIsMutable();
        this.children_.set(i, child);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"children_", Child.class});
        }
        if (iOrdinal == 3) {
            return new GetChildrenResponse();
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
        synchronized (GetChildrenResponse.class) {
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

    @Override // com.spotify.kidsview.v1.proto.GetChildrenResponseOrBuilder
    public Child getChildren(int i) {
        return (Child) this.children_.get(i);
    }

    @Override // com.spotify.kidsview.v1.proto.GetChildrenResponseOrBuilder
    public int getChildrenCount() {
        return this.children_.size();
    }

    @Override // com.spotify.kidsview.v1.proto.GetChildrenResponseOrBuilder
    public List<Child> getChildrenList() {
        return this.children_;
    }

    public ChildOrBuilder getChildrenOrBuilder(int i) {
        return (ChildOrBuilder) this.children_.get(i);
    }

    public List<? extends ChildOrBuilder> getChildrenOrBuilderList() {
        return this.children_;
    }

    @Override // com.spotify.kidsview.v1.proto.GetChildrenResponseOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GetChildrenResponseOrBuilder {
        private Builder() {
            super(GetChildrenResponse.DEFAULT_INSTANCE);
        }

        public Builder addAllChildren(Iterable<? extends Child> iterable) {
            copyOnWrite();
            ((GetChildrenResponse) ((g) this).instance).addAllChildren(iterable);
            return this;
        }

        public Builder addChildren(Child.Builder builder) {
            copyOnWrite();
            ((GetChildrenResponse) ((g) this).instance).addChildren((Child) builder.build());
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

        public Builder clearChildren() {
            copyOnWrite();
            ((GetChildrenResponse) ((g) this).instance).clearChildren();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.GetChildrenResponseOrBuilder
        public Child getChildren(int i) {
            return ((GetChildrenResponse) ((g) this).instance).getChildren(i);
        }

        @Override // com.spotify.kidsview.v1.proto.GetChildrenResponseOrBuilder
        public int getChildrenCount() {
            return ((GetChildrenResponse) ((g) this).instance).getChildrenCount();
        }

        @Override // com.spotify.kidsview.v1.proto.GetChildrenResponseOrBuilder
        public List<Child> getChildrenList() {
            return Collections.unmodifiableList(((GetChildrenResponse) ((g) this).instance).getChildrenList());
        }

        @Override // com.spotify.kidsview.v1.proto.GetChildrenResponseOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m88mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder removeChildren(int i) {
            copyOnWrite();
            ((GetChildrenResponse) ((g) this).instance).removeChildren(i);
            return this;
        }

        public Builder setChildren(int i, Child.Builder builder) {
            copyOnWrite();
            ((GetChildrenResponse) ((g) this).instance).setChildren(i, (Child) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m87clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m89mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m86clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m90mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder addChildren(int i, Child child) {
            copyOnWrite();
            ((GetChildrenResponse) ((g) this).instance).addChildren(i, child);
            return this;
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setChildren(int i, Child child) {
            copyOnWrite();
            ((GetChildrenResponse) ((g) this).instance).setChildren(i, child);
            return this;
        }

        public Builder addChildren(Child child) {
            copyOnWrite();
            ((GetChildrenResponse) ((g) this).instance).addChildren(child);
            return this;
        }

        public Builder addChildren(int i, Child.Builder builder) {
            copyOnWrite();
            ((GetChildrenResponse) ((g) this).instance).addChildren(i, (Child) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(GetChildrenResponse getChildrenResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getChildrenResponse);
    }

    public static GetChildrenResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetChildrenResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetChildrenResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetChildrenResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetChildrenResponse parseFrom(phc phcVar) {
        return (GetChildrenResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetChildrenResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetChildrenResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildren(int i, Child child) {
        child.getClass();
        ensureChildrenIsMutable();
        this.children_.add(i, child);
    }

    public static GetChildrenResponse parseFrom(byte[] bArr) {
        return (GetChildrenResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetChildrenResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetChildrenResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetChildrenResponse parseFrom(InputStream inputStream) {
        return (GetChildrenResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetChildrenResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetChildrenResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetChildrenResponse parseFrom(lwg lwgVar) {
        return (GetChildrenResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetChildrenResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetChildrenResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
