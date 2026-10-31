package com.spotify.kidsview.v1.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class DeleteAction extends h implements DeleteActionOrBuilder {
    private static final DeleteAction DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    private int state_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.DeleteAction$1, reason: invalid class name */
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
        DeleteAction deleteAction = new DeleteAction();
        DEFAULT_INSTANCE = deleteAction;
        h.registerDefaultInstance(DeleteAction.class, deleteAction);
    }

    private DeleteAction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static DeleteAction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DeleteAction parseDelimitedFrom(InputStream inputStream) {
        return (DeleteAction) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeleteAction parseFrom(ByteBuffer byteBuffer) {
        return (DeleteAction) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(DeleteActionState deleteActionState) {
        this.state_ = deleteActionState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i) {
        this.state_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"state_"});
        }
        if (iOrdinal == 3) {
            return new DeleteAction();
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
        synchronized (DeleteAction.class) {
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

    @Override // com.spotify.kidsview.v1.proto.DeleteActionOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.v1.proto.DeleteActionOrBuilder
    public DeleteActionState getState() {
        DeleteActionState deleteActionStateForNumber = DeleteActionState.forNumber(this.state_);
        return deleteActionStateForNumber == null ? DeleteActionState.UNRECOGNIZED : deleteActionStateForNumber;
    }

    @Override // com.spotify.kidsview.v1.proto.DeleteActionOrBuilder
    public int getStateValue() {
        return this.state_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements DeleteActionOrBuilder {
        private Builder() {
            super(DeleteAction.DEFAULT_INSTANCE);
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

        public Builder clearState() {
            copyOnWrite();
            ((DeleteAction) ((g) this).instance).clearState();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.DeleteActionOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.v1.proto.DeleteActionOrBuilder
        public DeleteActionState getState() {
            return ((DeleteAction) ((g) this).instance).getState();
        }

        @Override // com.spotify.kidsview.v1.proto.DeleteActionOrBuilder
        public int getStateValue() {
            return ((DeleteAction) ((g) this).instance).getStateValue();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m68mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setState(DeleteActionState deleteActionState) {
            copyOnWrite();
            ((DeleteAction) ((g) this).instance).setState(deleteActionState);
            return this;
        }

        public Builder setStateValue(int i) {
            copyOnWrite();
            ((DeleteAction) ((g) this).instance).setStateValue(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m67clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m69mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m66clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m70mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(DeleteAction deleteAction) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(deleteAction);
    }

    public static DeleteAction parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (DeleteAction) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DeleteAction parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (DeleteAction) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static DeleteAction parseFrom(phc phcVar) {
        return (DeleteAction) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static DeleteAction parseFrom(phc phcVar, uz00 uz00Var) {
        return (DeleteAction) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static DeleteAction parseFrom(byte[] bArr) {
        return (DeleteAction) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeleteAction parseFrom(byte[] bArr, uz00 uz00Var) {
        return (DeleteAction) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static DeleteAction parseFrom(InputStream inputStream) {
        return (DeleteAction) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeleteAction parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (DeleteAction) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DeleteAction parseFrom(lwg lwgVar) {
        return (DeleteAction) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static DeleteAction parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (DeleteAction) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
