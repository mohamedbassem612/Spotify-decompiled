package com.spotify.playlist.ai.creation.v2;

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
public final class Status extends h implements StatusOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final Status DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int action_;
    private String message_ = "";

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.Status$1, reason: invalid class name */
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
        Status status = new Status();
        DEFAULT_INSTANCE = status;
        h.registerDefaultInstance(Status.class, status);
    }

    private Status() {
    }

    private void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = DEFAULT_INSTANCE.message_;
    }

    public static Status getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static void n(Status status) {
        status.action_ = 0;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Status parseDelimitedFrom(InputStream inputStream) {
        return (Status) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(ByteBuffer byteBuffer) {
        return (Status) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void q(Status status, int i) {
        status.action_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(Action action) {
        this.action_ = action.getNumber();
    }

    private void setActionValue(int i) {
        this.action_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.message_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"action_", "message_"});
        }
        if (iOrdinal == 3) {
            return new Status();
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
        synchronized (Status.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.StatusOrBuilder
    public final Action getAction() {
        Action actionForNumber = Action.forNumber(this.action_);
        return actionForNumber == null ? Action.UNRECOGNIZED : actionForNumber;
    }

    @Override // com.spotify.playlist.ai.creation.v2.StatusOrBuilder
    public final int getActionValue() {
        return this.action_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.StatusOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.StatusOrBuilder
    public final String getMessage() {
        return this.message_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.StatusOrBuilder
    public final phc getMessageBytes() {
        return phc.i(this.message_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements StatusOrBuilder {
        private Builder() {
            super(Status.DEFAULT_INSTANCE);
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

        public final Builder clearAction() {
            copyOnWrite();
            Status.n((Status) ((g) this).instance);
            return this;
        }

        public final Builder clearMessage() {
            copyOnWrite();
            ((Status) ((g) this).instance).clearMessage();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.StatusOrBuilder
        public final Action getAction() {
            return ((Status) ((g) this).instance).getAction();
        }

        @Override // com.spotify.playlist.ai.creation.v2.StatusOrBuilder
        public final int getActionValue() {
            return ((Status) ((g) this).instance).getActionValue();
        }

        @Override // com.spotify.playlist.ai.creation.v2.StatusOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.StatusOrBuilder
        public final String getMessage() {
            return ((Status) ((g) this).instance).getMessage();
        }

        @Override // com.spotify.playlist.ai.creation.v2.StatusOrBuilder
        public final phc getMessageBytes() {
            return ((Status) ((g) this).instance).getMessageBytes();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m562mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setAction(Action action) {
            copyOnWrite();
            ((Status) ((g) this).instance).setAction(action);
            return this;
        }

        public final Builder setActionValue(int i) {
            copyOnWrite();
            Status.q((Status) ((g) this).instance, i);
            return this;
        }

        public final Builder setMessage(String str) {
            copyOnWrite();
            ((Status) ((g) this).instance).setMessage(str);
            return this;
        }

        public final Builder setMessageBytes(phc phcVar) {
            copyOnWrite();
            ((Status) ((g) this).instance).setMessageBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m561clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m563mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m560clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m564mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(Status status) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(status);
    }

    public static Status parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Status) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Status parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Status) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Status parseFrom(phc phcVar) {
        return (Status) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Status parseFrom(phc phcVar, uz00 uz00Var) {
        return (Status) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static Status parseFrom(byte[] bArr) {
        return (Status) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Status parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Status) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Status parseFrom(InputStream inputStream) {
        return (Status) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Status) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Status parseFrom(lwg lwgVar) {
        return (Status) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Status parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Status) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
