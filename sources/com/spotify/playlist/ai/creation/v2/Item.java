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
public final class Item extends h implements ItemOrBuilder {
    private static final Item DEFAULT_INSTANCE;
    public static final int NOTE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";
    private String note_ = "";

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.Item$1, reason: invalid class name */
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
        Item item = new Item();
        DEFAULT_INSTANCE = item;
        h.registerDefaultInstance(Item.class, item);
    }

    private Item() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNote() {
        this.note_ = DEFAULT_INSTANCE.note_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = DEFAULT_INSTANCE.uri_;
    }

    public static Item getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Item parseDelimitedFrom(InputStream inputStream) {
        return (Item) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Item parseFrom(ByteBuffer byteBuffer) {
        return (Item) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNote(String str) {
        str.getClass();
        this.note_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoteBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.note_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.uri_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"uri_", "note_"});
        }
        if (iOrdinal == 3) {
            return new Item();
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
        synchronized (Item.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.ItemOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.ItemOrBuilder
    public final String getNote() {
        return this.note_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ItemOrBuilder
    public final phc getNoteBytes() {
        return phc.i(this.note_);
    }

    @Override // com.spotify.playlist.ai.creation.v2.ItemOrBuilder
    public final String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.ItemOrBuilder
    public final phc getUriBytes() {
        return phc.i(this.uri_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ItemOrBuilder {
        private Builder() {
            super(Item.DEFAULT_INSTANCE);
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

        public final Builder clearNote() {
            copyOnWrite();
            ((Item) ((g) this).instance).clearNote();
            return this;
        }

        public final Builder clearUri() {
            copyOnWrite();
            ((Item) ((g) this).instance).clearUri();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ItemOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ItemOrBuilder
        public final String getNote() {
            return ((Item) ((g) this).instance).getNote();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ItemOrBuilder
        public final phc getNoteBytes() {
            return ((Item) ((g) this).instance).getNoteBytes();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ItemOrBuilder
        public final String getUri() {
            return ((Item) ((g) this).instance).getUri();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ItemOrBuilder
        public final phc getUriBytes() {
            return ((Item) ((g) this).instance).getUriBytes();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m510mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setNote(String str) {
            copyOnWrite();
            ((Item) ((g) this).instance).setNote(str);
            return this;
        }

        public final Builder setNoteBytes(phc phcVar) {
            copyOnWrite();
            ((Item) ((g) this).instance).setNoteBytes(phcVar);
            return this;
        }

        public final Builder setUri(String str) {
            copyOnWrite();
            ((Item) ((g) this).instance).setUri(str);
            return this;
        }

        public final Builder setUriBytes(phc phcVar) {
            copyOnWrite();
            ((Item) ((g) this).instance).setUriBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m509clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m511mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m508clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m512mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(Item item) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(item);
    }

    public static Item parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Item) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Item parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Item) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Item parseFrom(phc phcVar) {
        return (Item) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Item parseFrom(phc phcVar, uz00 uz00Var) {
        return (Item) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static Item parseFrom(byte[] bArr) {
        return (Item) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Item parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Item) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Item parseFrom(InputStream inputStream) {
        return (Item) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Item parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Item) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Item parseFrom(lwg lwgVar) {
        return (Item) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Item parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Item) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
