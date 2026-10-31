package com.spotify.campfire.datasource.impl.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EventCapture extends h implements EventCaptureOrBuilder {
    private static final EventCapture DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 2;
    public static final int EVENT_TYPE_FIELD_NUMBER = 3;
    public static final int OCCURRED_AT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String eventId_ = "";
    private int eventType_;
    private Timestamp occurredAt_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.EventCapture$1, reason: invalid class name */
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
        EventCapture eventCapture = new EventCapture();
        DEFAULT_INSTANCE = eventCapture;
        h.registerDefaultInstance(EventCapture.class, eventCapture);
    }

    private EventCapture() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventType() {
        this.eventType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOccurredAt() {
        this.occurredAt_ = null;
        this.bitField0_ &= -2;
    }

    public static EventCapture getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOccurredAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.occurredAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.o()) {
            this.occurredAt_ = timestamp;
        } else {
            this.occurredAt_ = Timestamp.s(this.occurredAt_).mergeFrom(timestamp).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EventCapture parseDelimitedFrom(InputStream inputStream) {
        return (EventCapture) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventCapture parseFrom(ByteBuffer byteBuffer) {
        return (EventCapture) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        str.getClass();
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.eventId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventType(EventType eventType) {
        this.eventType_ = eventType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventTypeValue(int i) {
        this.eventType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOccurredAt(Timestamp timestamp) {
        timestamp.getClass();
        this.occurredAt_ = timestamp;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\f", new Object[]{"bitField0_", "occurredAt_", "eventId_", "eventType_"});
        }
        if (iOrdinal == 3) {
            return new EventCapture();
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
        synchronized (EventCapture.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
    public String getEventId() {
        return this.eventId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
    public phc getEventIdBytes() {
        return phc.i(this.eventId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
    public EventType getEventType() {
        EventType eventTypeForNumber = EventType.forNumber(this.eventType_);
        return eventTypeForNumber == null ? EventType.UNRECOGNIZED : eventTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
    public int getEventTypeValue() {
        return this.eventType_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
    public Timestamp getOccurredAt() {
        Timestamp timestamp = this.occurredAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
    public boolean hasOccurredAt() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements EventCaptureOrBuilder {
        private Builder() {
            super(EventCapture.DEFAULT_INSTANCE);
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

        public Builder clearEventId() {
            copyOnWrite();
            ((EventCapture) ((g) this).instance).clearEventId();
            return this;
        }

        public Builder clearEventType() {
            copyOnWrite();
            ((EventCapture) ((g) this).instance).clearEventType();
            return this;
        }

        public Builder clearOccurredAt() {
            copyOnWrite();
            ((EventCapture) ((g) this).instance).clearOccurredAt();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
        public String getEventId() {
            return ((EventCapture) ((g) this).instance).getEventId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
        public phc getEventIdBytes() {
            return ((EventCapture) ((g) this).instance).getEventIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
        public EventType getEventType() {
            return ((EventCapture) ((g) this).instance).getEventType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
        public int getEventTypeValue() {
            return ((EventCapture) ((g) this).instance).getEventTypeValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
        public Timestamp getOccurredAt() {
            return ((EventCapture) ((g) this).instance).getOccurredAt();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.EventCaptureOrBuilder
        public boolean hasOccurredAt() {
            return ((EventCapture) ((g) this).instance).hasOccurredAt();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m317mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeOccurredAt(Timestamp timestamp) {
            copyOnWrite();
            ((EventCapture) ((g) this).instance).mergeOccurredAt(timestamp);
            return this;
        }

        public Builder setEventId(String str) {
            copyOnWrite();
            ((EventCapture) ((g) this).instance).setEventId(str);
            return this;
        }

        public Builder setEventIdBytes(phc phcVar) {
            copyOnWrite();
            ((EventCapture) ((g) this).instance).setEventIdBytes(phcVar);
            return this;
        }

        public Builder setEventType(EventType eventType) {
            copyOnWrite();
            ((EventCapture) ((g) this).instance).setEventType(eventType);
            return this;
        }

        public Builder setEventTypeValue(int i) {
            copyOnWrite();
            ((EventCapture) ((g) this).instance).setEventTypeValue(i);
            return this;
        }

        public Builder setOccurredAt(sve1 sve1Var) {
            copyOnWrite();
            ((EventCapture) ((g) this).instance).setOccurredAt(sve1Var.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m316clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m318mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m315clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m319mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setOccurredAt(Timestamp timestamp) {
            copyOnWrite();
            ((EventCapture) ((g) this).instance).setOccurredAt(timestamp);
            return this;
        }
    }

    public static Builder newBuilder(EventCapture eventCapture) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(eventCapture);
    }

    public static EventCapture parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (EventCapture) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EventCapture parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (EventCapture) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static EventCapture parseFrom(phc phcVar) {
        return (EventCapture) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static EventCapture parseFrom(phc phcVar, uz00 uz00Var) {
        return (EventCapture) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static EventCapture parseFrom(byte[] bArr) {
        return (EventCapture) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EventCapture parseFrom(byte[] bArr, uz00 uz00Var) {
        return (EventCapture) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static EventCapture parseFrom(InputStream inputStream) {
        return (EventCapture) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventCapture parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (EventCapture) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EventCapture parseFrom(lwg lwgVar) {
        return (EventCapture) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static EventCapture parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (EventCapture) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
