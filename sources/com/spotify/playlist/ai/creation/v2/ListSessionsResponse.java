package com.spotify.playlist.ai.creation.v2;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ListSessionsResponse extends h implements ListSessionsResponseOrBuilder {
    private static final ListSessionsResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SESSIONS_FIELD_NUMBER = 1;
    private h290 sessions_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.ListSessionsResponse$1, reason: invalid class name */
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
        ListSessionsResponse listSessionsResponse = new ListSessionsResponse();
        DEFAULT_INSTANCE = listSessionsResponse;
        h.registerDefaultInstance(ListSessionsResponse.class, listSessionsResponse);
    }

    private ListSessionsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSessions(Iterable<? extends GetSessionResponse> iterable) {
        ensureSessionsIsMutable();
        s8.addAll(iterable, this.sessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSessions(GetSessionResponse getSessionResponse) {
        getSessionResponse.getClass();
        ensureSessionsIsMutable();
        this.sessions_.add(getSessionResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessions() {
        this.sessions_ = h.emptyProtobufList();
    }

    private void ensureSessionsIsMutable() {
        i9 i9Var = this.sessions_;
        if (i9Var.a) {
            return;
        }
        this.sessions_ = h.mutableCopy(i9Var);
    }

    public static ListSessionsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListSessionsResponse parseDelimitedFrom(InputStream inputStream) {
        return (ListSessionsResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListSessionsResponse parseFrom(ByteBuffer byteBuffer) {
        return (ListSessionsResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSessions(int i) {
        ensureSessionsIsMutable();
        this.sessions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessions(int i, GetSessionResponse getSessionResponse) {
        getSessionResponse.getClass();
        ensureSessionsIsMutable();
        this.sessions_.set(i, getSessionResponse);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sessions_", GetSessionResponse.class});
        }
        if (iOrdinal == 3) {
            return new ListSessionsResponse();
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
        synchronized (ListSessionsResponse.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.ListSessionsResponseOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.ListSessionsResponseOrBuilder
    public final GetSessionResponse getSessions(int i) {
        return (GetSessionResponse) this.sessions_.get(i);
    }

    @Override // com.spotify.playlist.ai.creation.v2.ListSessionsResponseOrBuilder
    public final int getSessionsCount() {
        return this.sessions_.size();
    }

    @Override // com.spotify.playlist.ai.creation.v2.ListSessionsResponseOrBuilder
    public final List<GetSessionResponse> getSessionsList() {
        return this.sessions_;
    }

    public final GetSessionResponseOrBuilder getSessionsOrBuilder(int i) {
        return (GetSessionResponseOrBuilder) this.sessions_.get(i);
    }

    public final List<? extends GetSessionResponseOrBuilder> getSessionsOrBuilderList() {
        return this.sessions_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ListSessionsResponseOrBuilder {
        private Builder() {
            super(ListSessionsResponse.DEFAULT_INSTANCE);
        }

        public final Builder addAllSessions(Iterable<? extends GetSessionResponse> iterable) {
            copyOnWrite();
            ((ListSessionsResponse) ((g) this).instance).addAllSessions(iterable);
            return this;
        }

        public final Builder addSessions(GetSessionResponse.Builder builder) {
            copyOnWrite();
            ((ListSessionsResponse) ((g) this).instance).addSessions((GetSessionResponse) builder.build());
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

        public final Builder clearSessions() {
            copyOnWrite();
            ((ListSessionsResponse) ((g) this).instance).clearSessions();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ListSessionsResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ListSessionsResponseOrBuilder
        public final GetSessionResponse getSessions(int i) {
            return ((ListSessionsResponse) ((g) this).instance).getSessions(i);
        }

        @Override // com.spotify.playlist.ai.creation.v2.ListSessionsResponseOrBuilder
        public final int getSessionsCount() {
            return ((ListSessionsResponse) ((g) this).instance).getSessionsCount();
        }

        @Override // com.spotify.playlist.ai.creation.v2.ListSessionsResponseOrBuilder
        public final List<GetSessionResponse> getSessionsList() {
            return Collections.unmodifiableList(((ListSessionsResponse) ((g) this).instance).getSessionsList());
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m520mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder removeSessions(int i) {
            copyOnWrite();
            ((ListSessionsResponse) ((g) this).instance).removeSessions(i);
            return this;
        }

        public final Builder setSessions(int i, GetSessionResponse.Builder builder) {
            copyOnWrite();
            ((ListSessionsResponse) ((g) this).instance).setSessions(i, (GetSessionResponse) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m519clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m521mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m518clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m522mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public final Builder addSessions(int i, GetSessionResponse getSessionResponse) {
            copyOnWrite();
            ((ListSessionsResponse) ((g) this).instance).addSessions(i, getSessionResponse);
            return this;
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public final Builder setSessions(int i, GetSessionResponse getSessionResponse) {
            copyOnWrite();
            ((ListSessionsResponse) ((g) this).instance).setSessions(i, getSessionResponse);
            return this;
        }

        public final Builder addSessions(GetSessionResponse getSessionResponse) {
            copyOnWrite();
            ((ListSessionsResponse) ((g) this).instance).addSessions(getSessionResponse);
            return this;
        }

        public final Builder addSessions(int i, GetSessionResponse.Builder builder) {
            copyOnWrite();
            ((ListSessionsResponse) ((g) this).instance).addSessions(i, (GetSessionResponse) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(ListSessionsResponse listSessionsResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(listSessionsResponse);
    }

    public static ListSessionsResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ListSessionsResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ListSessionsResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ListSessionsResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ListSessionsResponse parseFrom(phc phcVar) {
        return (ListSessionsResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ListSessionsResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (ListSessionsResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSessions(int i, GetSessionResponse getSessionResponse) {
        getSessionResponse.getClass();
        ensureSessionsIsMutable();
        this.sessions_.add(i, getSessionResponse);
    }

    public static ListSessionsResponse parseFrom(byte[] bArr) {
        return (ListSessionsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListSessionsResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ListSessionsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ListSessionsResponse parseFrom(InputStream inputStream) {
        return (ListSessionsResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListSessionsResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ListSessionsResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ListSessionsResponse parseFrom(lwg lwgVar) {
        return (ListSessionsResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ListSessionsResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ListSessionsResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
