package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.bhn0;
import p.dng0;
import p.jf40;
import p.kul1;
import p.lwg;
import p.phc;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CanMessageUsersResponse extends h implements CanMessageUsersResponseOrBuilder {
    private static final CanMessageUsersResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESULTS_FIELD_NUMBER = 1;
    public static final int SHARED_HIERARCHIES_FIELD_NUMBER = 2;
    private qng0 results_;
    private qng0 sharedHierarchies_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponse$1, reason: invalid class name */
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

    public static final class ResultsDefaultEntryHolder {
        static final dng0 defaultEntry = new dng0(kul1.g, "", kul1.f, Boolean.FALSE);

        private ResultsDefaultEntryHolder() {
        }
    }

    public static final class SharedHierarchiesDefaultEntryHolder {
        static final dng0 defaultEntry = new dng0(kul1.g, "", kul1.i, SharedHierarchies.getDefaultInstance());

        private SharedHierarchiesDefaultEntryHolder() {
        }
    }

    static {
        CanMessageUsersResponse canMessageUsersResponse = new CanMessageUsersResponse();
        DEFAULT_INSTANCE = canMessageUsersResponse;
        h.registerDefaultInstance(CanMessageUsersResponse.class, canMessageUsersResponse);
    }

    private CanMessageUsersResponse() {
        qng0 qng0Var = qng0.b;
        this.results_ = qng0Var;
        this.sharedHierarchies_ = qng0Var;
    }

    public static CanMessageUsersResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Boolean> getMutableResultsMap() {
        return internalGetMutableResults();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, SharedHierarchies> getMutableSharedHierarchiesMap() {
        return internalGetMutableSharedHierarchies();
    }

    private qng0 internalGetMutableResults() {
        qng0 qng0Var = this.results_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.results_ = qng0VarH;
        return qng0VarH;
    }

    private qng0 internalGetMutableSharedHierarchies() {
        qng0 qng0Var = this.sharedHierarchies_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.sharedHierarchies_ = qng0VarH;
        return qng0VarH;
    }

    private qng0 internalGetResults() {
        return this.results_;
    }

    private qng0 internalGetSharedHierarchies() {
        return this.sharedHierarchies_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CanMessageUsersResponse parseDelimitedFrom(InputStream inputStream) {
        return (CanMessageUsersResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CanMessageUsersResponse parseFrom(ByteBuffer byteBuffer) {
        return (CanMessageUsersResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public boolean containsResults(String str) {
        str.getClass();
        return internalGetResults().containsKey(str);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public boolean containsSharedHierarchies(String str) {
        str.getClass();
        return internalGetSharedHierarchies().containsKey(str);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"results_", ResultsDefaultEntryHolder.defaultEntry, "sharedHierarchies_", SharedHierarchiesDefaultEntryHolder.defaultEntry});
        }
        if (iOrdinal == 3) {
            return new CanMessageUsersResponse();
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
        synchronized (CanMessageUsersResponse.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    @Deprecated
    public Map<String, Boolean> getResults() {
        return getResultsMap();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public int getResultsCount() {
        return internalGetResults().size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public Map<String, Boolean> getResultsMap() {
        return Collections.unmodifiableMap(internalGetResults());
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public boolean getResultsOrDefault(String str, boolean z) {
        str.getClass();
        qng0 qng0VarInternalGetResults = internalGetResults();
        return qng0VarInternalGetResults.containsKey(str) ? ((Boolean) qng0VarInternalGetResults.get(str)).booleanValue() : z;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public boolean getResultsOrThrow(String str) {
        str.getClass();
        qng0 qng0VarInternalGetResults = internalGetResults();
        if (qng0VarInternalGetResults.containsKey(str)) {
            return ((Boolean) qng0VarInternalGetResults.get(str)).booleanValue();
        }
        bhn0.q();
        return false;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    @Deprecated
    public Map<String, SharedHierarchies> getSharedHierarchies() {
        return getSharedHierarchiesMap();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public int getSharedHierarchiesCount() {
        return internalGetSharedHierarchies().size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public Map<String, SharedHierarchies> getSharedHierarchiesMap() {
        return Collections.unmodifiableMap(internalGetSharedHierarchies());
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public SharedHierarchies getSharedHierarchiesOrDefault(String str, SharedHierarchies sharedHierarchies) {
        str.getClass();
        qng0 qng0VarInternalGetSharedHierarchies = internalGetSharedHierarchies();
        return qng0VarInternalGetSharedHierarchies.containsKey(str) ? (SharedHierarchies) qng0VarInternalGetSharedHierarchies.get(str) : sharedHierarchies;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
    public SharedHierarchies getSharedHierarchiesOrThrow(String str) {
        str.getClass();
        qng0 qng0VarInternalGetSharedHierarchies = internalGetSharedHierarchies();
        if (qng0VarInternalGetSharedHierarchies.containsKey(str)) {
            return (SharedHierarchies) qng0VarInternalGetSharedHierarchies.get(str);
        }
        bhn0.q();
        return null;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements CanMessageUsersResponseOrBuilder {
        private Builder() {
            super(CanMessageUsersResponse.DEFAULT_INSTANCE);
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

        public Builder clearResults() {
            copyOnWrite();
            ((CanMessageUsersResponse) ((g) this).instance).getMutableResultsMap().clear();
            return this;
        }

        public Builder clearSharedHierarchies() {
            copyOnWrite();
            ((CanMessageUsersResponse) ((g) this).instance).getMutableSharedHierarchiesMap().clear();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public boolean containsResults(String str) {
            str.getClass();
            return ((CanMessageUsersResponse) ((g) this).instance).getResultsMap().containsKey(str);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public boolean containsSharedHierarchies(String str) {
            str.getClass();
            return ((CanMessageUsersResponse) ((g) this).instance).getSharedHierarchiesMap().containsKey(str);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        @Deprecated
        public Map<String, Boolean> getResults() {
            return getResultsMap();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public int getResultsCount() {
            return ((CanMessageUsersResponse) ((g) this).instance).getResultsMap().size();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public Map<String, Boolean> getResultsMap() {
            return Collections.unmodifiableMap(((CanMessageUsersResponse) ((g) this).instance).getResultsMap());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public boolean getResultsOrDefault(String str, boolean z) {
            str.getClass();
            Map<String, Boolean> resultsMap = ((CanMessageUsersResponse) ((g) this).instance).getResultsMap();
            return resultsMap.containsKey(str) ? resultsMap.get(str).booleanValue() : z;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public boolean getResultsOrThrow(String str) {
            str.getClass();
            Map<String, Boolean> resultsMap = ((CanMessageUsersResponse) ((g) this).instance).getResultsMap();
            if (resultsMap.containsKey(str)) {
                return resultsMap.get(str).booleanValue();
            }
            bhn0.q();
            return false;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        @Deprecated
        public Map<String, SharedHierarchies> getSharedHierarchies() {
            return getSharedHierarchiesMap();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public int getSharedHierarchiesCount() {
            return ((CanMessageUsersResponse) ((g) this).instance).getSharedHierarchiesMap().size();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public Map<String, SharedHierarchies> getSharedHierarchiesMap() {
            return Collections.unmodifiableMap(((CanMessageUsersResponse) ((g) this).instance).getSharedHierarchiesMap());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public SharedHierarchies getSharedHierarchiesOrDefault(String str, SharedHierarchies sharedHierarchies) {
            str.getClass();
            Map<String, SharedHierarchies> sharedHierarchiesMap = ((CanMessageUsersResponse) ((g) this).instance).getSharedHierarchiesMap();
            return sharedHierarchiesMap.containsKey(str) ? sharedHierarchiesMap.get(str) : sharedHierarchies;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersResponseOrBuilder
        public SharedHierarchies getSharedHierarchiesOrThrow(String str) {
            str.getClass();
            Map<String, SharedHierarchies> sharedHierarchiesMap = ((CanMessageUsersResponse) ((g) this).instance).getSharedHierarchiesMap();
            if (sharedHierarchiesMap.containsKey(str)) {
                return sharedHierarchiesMap.get(str);
            }
            bhn0.q();
            return null;
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m79mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder putAllResults(Map<String, Boolean> map) {
            copyOnWrite();
            ((CanMessageUsersResponse) ((g) this).instance).getMutableResultsMap().putAll(map);
            return this;
        }

        public Builder putAllSharedHierarchies(Map<String, SharedHierarchies> map) {
            copyOnWrite();
            ((CanMessageUsersResponse) ((g) this).instance).getMutableSharedHierarchiesMap().putAll(map);
            return this;
        }

        public Builder putResults(String str, boolean z) {
            str.getClass();
            copyOnWrite();
            ((CanMessageUsersResponse) ((g) this).instance).getMutableResultsMap().put(str, Boolean.valueOf(z));
            return this;
        }

        public Builder putSharedHierarchies(String str, SharedHierarchies sharedHierarchies) {
            str.getClass();
            sharedHierarchies.getClass();
            copyOnWrite();
            ((CanMessageUsersResponse) ((g) this).instance).getMutableSharedHierarchiesMap().put(str, sharedHierarchies);
            return this;
        }

        public Builder removeResults(String str) {
            str.getClass();
            copyOnWrite();
            ((CanMessageUsersResponse) ((g) this).instance).getMutableResultsMap().remove(str);
            return this;
        }

        public Builder removeSharedHierarchies(String str) {
            str.getClass();
            copyOnWrite();
            ((CanMessageUsersResponse) ((g) this).instance).getMutableSharedHierarchiesMap().remove(str);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m78clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m80mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m77clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m81mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(CanMessageUsersResponse canMessageUsersResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(canMessageUsersResponse);
    }

    public static CanMessageUsersResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (CanMessageUsersResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CanMessageUsersResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (CanMessageUsersResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static CanMessageUsersResponse parseFrom(phc phcVar) {
        return (CanMessageUsersResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static CanMessageUsersResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (CanMessageUsersResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static CanMessageUsersResponse parseFrom(byte[] bArr) {
        return (CanMessageUsersResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CanMessageUsersResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (CanMessageUsersResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static CanMessageUsersResponse parseFrom(InputStream inputStream) {
        return (CanMessageUsersResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CanMessageUsersResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (CanMessageUsersResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static CanMessageUsersResponse parseFrom(lwg lwgVar) {
        return (CanMessageUsersResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static CanMessageUsersResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (CanMessageUsersResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
