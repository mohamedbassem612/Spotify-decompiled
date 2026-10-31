package com.spotify.playlist4.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p.bf40;
import p.h290;
import p.hhc;
import p.i9;
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
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Playlist4PubSubProto {

    /* JADX INFO: renamed from: com.spotify.playlist4.proto.Playlist4PubSubProto$1, reason: invalid class name */
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

    public interface FollowerUpdateOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        boolean getIsFollowing();

        long getTimestamp();

        String getUri();

        phc getUriBytes();

        String getUsername();

        phc getUsernameBytes();

        boolean hasIsFollowing();

        boolean hasTimestamp();

        boolean hasUri();

        boolean hasUsername();

        /* synthetic */ boolean isInitialized();
    }

    public interface PlaylistCreationInfoOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        Playlist4ApiProto.Delta getDeltas(int i);

        int getDeltasCount();

        List<Playlist4ApiProto.Delta> getDeltasList();

        phc getNewRevision();

        phc getOwnerUserId();

        String getOwnerUsername();

        phc getOwnerUsernameBytes();

        boolean getTruncatedOps();

        boolean hasNewRevision();

        boolean hasOwnerUserId();

        boolean hasOwnerUsername();

        boolean hasTruncatedOps();

        /* synthetic */ boolean isInitialized();
    }

    public interface PlaylistModificationInfoOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        Timestamp getModifiedAt();

        phc getNewRevision();

        Playlist4ApiProto.Op getOps(int i);

        int getOpsCount();

        List<Playlist4ApiProto.Op> getOpsList();

        phc getParentRevision();

        String getServerDomain();

        phc getServerDomainBytes();

        boolean getSkipPublishToClients();

        boolean getTruncatedOps();

        phc getUri();

        boolean hasModifiedAt();

        boolean hasNewRevision();

        boolean hasParentRevision();

        boolean hasServerDomain();

        boolean hasSkipPublishToClients();

        boolean hasTruncatedOps();

        boolean hasUri();

        /* synthetic */ boolean isInitialized();
    }

    public interface RootlistModificationInfoOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        Timestamp getModifiedAt();

        phc getNewRevision();

        Playlist4ApiProto.Op getOps(int i);

        int getOpsCount();

        List<Playlist4ApiProto.Op> getOpsList();

        phc getParentRevision();

        String getServerDomain();

        phc getServerDomainBytes();

        boolean getTruncatedOps();

        boolean hasModifiedAt();

        boolean hasNewRevision();

        boolean hasParentRevision();

        boolean hasServerDomain();

        boolean hasTruncatedOps();

        /* synthetic */ boolean isInitialized();
    }

    public interface SubscribeRequestOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        phc getUris(int i);

        int getUrisCount();

        List<phc> getUrisList();

        /* synthetic */ boolean isInitialized();
    }

    public interface UnsubscribeRequestOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        phc getUris(int i);

        int getUrisCount();

        List<phc> getUrisList();

        /* synthetic */ boolean isInitialized();
    }

    private Playlist4PubSubProto() {
    }

    public static final class FollowerUpdate extends h implements FollowerUpdateOrBuilder {
        private static final FollowerUpdate DEFAULT_INSTANCE;
        public static final int IS_FOLLOWING_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 4;
        public static final int URI_FIELD_NUMBER = 1;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean isFollowing_;
        private long timestamp_;
        private String uri_ = "";
        private String username_ = "";

        static {
            FollowerUpdate followerUpdate = new FollowerUpdate();
            DEFAULT_INSTANCE = followerUpdate;
            h.registerDefaultInstance(FollowerUpdate.class, followerUpdate);
        }

        private FollowerUpdate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsFollowing() {
            this.bitField0_ &= -5;
            this.isFollowing_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.bitField0_ &= -9;
            this.timestamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUri() {
            this.bitField0_ &= -2;
            this.uri_ = DEFAULT_INSTANCE.uri_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUsername() {
            this.bitField0_ &= -3;
            this.username_ = DEFAULT_INSTANCE.username_;
        }

        public static FollowerUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FollowerUpdate parseDelimitedFrom(InputStream inputStream) {
            return (FollowerUpdate) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FollowerUpdate parseFrom(ByteBuffer byteBuffer) {
            return (FollowerUpdate) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsFollowing(boolean z) {
            this.bitField0_ |= 4;
            this.isFollowing_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(long j) {
            this.bitField0_ |= 8;
            this.timestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUri(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.uri_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUriBytes(phc phcVar) {
            this.uri_ = phcVar.v();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsername(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.username_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsernameBytes(phc phcVar) {
            this.username_ = phcVar.v();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဃ\u0003", new Object[]{"bitField0_", "uri_", "username_", "isFollowing_", "timestamp_"});
            }
            if (iOrdinal == 3) {
                return new FollowerUpdate();
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
            synchronized (FollowerUpdate.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
        public final boolean getIsFollowing() {
            return this.isFollowing_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
        public final long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
        public final String getUri() {
            return this.uri_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
        public final phc getUriBytes() {
            return phc.i(this.uri_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
        public final String getUsername() {
            return this.username_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
        public final phc getUsernameBytes() {
            return phc.i(this.username_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
        public final boolean hasIsFollowing() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
        public final boolean hasTimestamp() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
        public final boolean hasUri() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
        public final boolean hasUsername() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements FollowerUpdateOrBuilder {
            private Builder() {
                super(FollowerUpdate.DEFAULT_INSTANCE);
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

            public final Builder clearIsFollowing() {
                copyOnWrite();
                ((FollowerUpdate) ((g) this).instance).clearIsFollowing();
                return this;
            }

            public final Builder clearTimestamp() {
                copyOnWrite();
                ((FollowerUpdate) ((g) this).instance).clearTimestamp();
                return this;
            }

            public final Builder clearUri() {
                copyOnWrite();
                ((FollowerUpdate) ((g) this).instance).clearUri();
                return this;
            }

            public final Builder clearUsername() {
                copyOnWrite();
                ((FollowerUpdate) ((g) this).instance).clearUsername();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
            public final boolean getIsFollowing() {
                return ((FollowerUpdate) ((g) this).instance).getIsFollowing();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
            public final long getTimestamp() {
                return ((FollowerUpdate) ((g) this).instance).getTimestamp();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
            public final String getUri() {
                return ((FollowerUpdate) ((g) this).instance).getUri();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
            public final phc getUriBytes() {
                return ((FollowerUpdate) ((g) this).instance).getUriBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
            public final String getUsername() {
                return ((FollowerUpdate) ((g) this).instance).getUsername();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
            public final phc getUsernameBytes() {
                return ((FollowerUpdate) ((g) this).instance).getUsernameBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
            public final boolean hasIsFollowing() {
                return ((FollowerUpdate) ((g) this).instance).hasIsFollowing();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
            public final boolean hasTimestamp() {
                return ((FollowerUpdate) ((g) this).instance).hasTimestamp();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
            public final boolean hasUri() {
                return ((FollowerUpdate) ((g) this).instance).hasUri();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.FollowerUpdateOrBuilder
            public final boolean hasUsername() {
                return ((FollowerUpdate) ((g) this).instance).hasUsername();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m818mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setIsFollowing(boolean z) {
                copyOnWrite();
                ((FollowerUpdate) ((g) this).instance).setIsFollowing(z);
                return this;
            }

            public final Builder setTimestamp(long j) {
                copyOnWrite();
                ((FollowerUpdate) ((g) this).instance).setTimestamp(j);
                return this;
            }

            public final Builder setUri(String str) {
                copyOnWrite();
                ((FollowerUpdate) ((g) this).instance).setUri(str);
                return this;
            }

            public final Builder setUriBytes(phc phcVar) {
                copyOnWrite();
                ((FollowerUpdate) ((g) this).instance).setUriBytes(phcVar);
                return this;
            }

            public final Builder setUsername(String str) {
                copyOnWrite();
                ((FollowerUpdate) ((g) this).instance).setUsername(str);
                return this;
            }

            public final Builder setUsernameBytes(phc phcVar) {
                copyOnWrite();
                ((FollowerUpdate) ((g) this).instance).setUsernameBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m817clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m819mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m816clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m820mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public static Builder newBuilder(FollowerUpdate followerUpdate) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(followerUpdate);
        }

        public static FollowerUpdate parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (FollowerUpdate) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static FollowerUpdate parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (FollowerUpdate) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static FollowerUpdate parseFrom(phc phcVar) {
            return (FollowerUpdate) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static FollowerUpdate parseFrom(phc phcVar, uz00 uz00Var) {
            return (FollowerUpdate) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static FollowerUpdate parseFrom(byte[] bArr) {
            return (FollowerUpdate) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FollowerUpdate parseFrom(byte[] bArr, uz00 uz00Var) {
            return (FollowerUpdate) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static FollowerUpdate parseFrom(InputStream inputStream) {
            return (FollowerUpdate) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FollowerUpdate parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (FollowerUpdate) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static FollowerUpdate parseFrom(lwg lwgVar) {
            return (FollowerUpdate) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static FollowerUpdate parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (FollowerUpdate) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class PlaylistCreationInfo extends h implements PlaylistCreationInfoOrBuilder {
        private static final PlaylistCreationInfo DEFAULT_INSTANCE;
        public static final int DELTAS_FIELD_NUMBER = 4;
        public static final int NEW_REVISION_FIELD_NUMBER = 3;
        public static final int OWNER_USERNAME_FIELD_NUMBER = 2;
        public static final int OWNER_USER_ID_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int TRUNCATED_OPS_FIELD_NUMBER = 5;
        private int bitField0_;
        private h290 deltas_;
        private byte memoizedIsInitialized = 2;
        private phc newRevision_;
        private phc ownerUserId_;
        private String ownerUsername_;
        private boolean truncatedOps_;

        static {
            PlaylistCreationInfo playlistCreationInfo = new PlaylistCreationInfo();
            DEFAULT_INSTANCE = playlistCreationInfo;
            h.registerDefaultInstance(PlaylistCreationInfo.class, playlistCreationInfo);
        }

        private PlaylistCreationInfo() {
            hhc hhcVar = phc.b;
            this.ownerUserId_ = hhcVar;
            this.ownerUsername_ = "";
            this.newRevision_ = hhcVar;
            this.deltas_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDeltas(Iterable<? extends Playlist4ApiProto.Delta> iterable) {
            ensureDeltasIsMutable();
            s8.addAll(iterable, this.deltas_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDeltas(Playlist4ApiProto.Delta delta) {
            delta.getClass();
            ensureDeltasIsMutable();
            this.deltas_.add(delta);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeltas() {
            this.deltas_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNewRevision() {
            this.bitField0_ &= -5;
            this.newRevision_ = DEFAULT_INSTANCE.newRevision_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerUserId() {
            this.bitField0_ &= -2;
            this.ownerUserId_ = DEFAULT_INSTANCE.ownerUserId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwnerUsername() {
            this.bitField0_ &= -3;
            this.ownerUsername_ = DEFAULT_INSTANCE.ownerUsername_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTruncatedOps() {
            this.bitField0_ &= -9;
            this.truncatedOps_ = false;
        }

        private void ensureDeltasIsMutable() {
            i9 i9Var = this.deltas_;
            if (i9Var.a) {
                return;
            }
            this.deltas_ = h.mutableCopy(i9Var);
        }

        public static PlaylistCreationInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PlaylistCreationInfo parseDelimitedFrom(InputStream inputStream) {
            return (PlaylistCreationInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistCreationInfo parseFrom(ByteBuffer byteBuffer) {
            return (PlaylistCreationInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDeltas(int i) {
            ensureDeltasIsMutable();
            this.deltas_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeltas(int i, Playlist4ApiProto.Delta delta) {
            delta.getClass();
            ensureDeltasIsMutable();
            this.deltas_.set(i, delta);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewRevision(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 4;
            this.newRevision_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUserId(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 1;
            this.ownerUserId_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUsername(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.ownerUsername_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerUsernameBytes(phc phcVar) {
            this.ownerUsername_ = phcVar.v();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTruncatedOps(boolean z) {
            this.bitField0_ |= 8;
            this.truncatedOps_ = z;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ည\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004Л\u0005ဇ\u0003", new Object[]{"bitField0_", "ownerUserId_", "ownerUsername_", "newRevision_", "deltas_", Playlist4ApiProto.Delta.class, "truncatedOps_"});
                case 3:
                    return new PlaylistCreationInfo();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (PlaylistCreationInfo.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
        public final Playlist4ApiProto.Delta getDeltas(int i) {
            return (Playlist4ApiProto.Delta) this.deltas_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
        public final int getDeltasCount() {
            return this.deltas_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
        public final List<Playlist4ApiProto.Delta> getDeltasList() {
            return this.deltas_;
        }

        public final Playlist4ApiProto.DeltaOrBuilder getDeltasOrBuilder(int i) {
            return (Playlist4ApiProto.DeltaOrBuilder) this.deltas_.get(i);
        }

        public final List<? extends Playlist4ApiProto.DeltaOrBuilder> getDeltasOrBuilderList() {
            return this.deltas_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
        public final phc getNewRevision() {
            return this.newRevision_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
        public final phc getOwnerUserId() {
            return this.ownerUserId_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
        public final String getOwnerUsername() {
            return this.ownerUsername_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
        public final phc getOwnerUsernameBytes() {
            return phc.i(this.ownerUsername_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
        public final boolean getTruncatedOps() {
            return this.truncatedOps_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
        public final boolean hasNewRevision() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
        public final boolean hasOwnerUserId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
        public final boolean hasOwnerUsername() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
        public final boolean hasTruncatedOps() {
            return (this.bitField0_ & 8) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements PlaylistCreationInfoOrBuilder {
            private Builder() {
                super(PlaylistCreationInfo.DEFAULT_INSTANCE);
            }

            public final Builder addAllDeltas(Iterable<? extends Playlist4ApiProto.Delta> iterable) {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).addAllDeltas(iterable);
                return this;
            }

            public final Builder addDeltas(Playlist4ApiProto.Delta.Builder builder) {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).addDeltas((Playlist4ApiProto.Delta) builder.build());
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

            public final Builder clearDeltas() {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).clearDeltas();
                return this;
            }

            public final Builder clearNewRevision() {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).clearNewRevision();
                return this;
            }

            public final Builder clearOwnerUserId() {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).clearOwnerUserId();
                return this;
            }

            public final Builder clearOwnerUsername() {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).clearOwnerUsername();
                return this;
            }

            public final Builder clearTruncatedOps() {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).clearTruncatedOps();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
            public final Playlist4ApiProto.Delta getDeltas(int i) {
                return ((PlaylistCreationInfo) ((g) this).instance).getDeltas(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
            public final int getDeltasCount() {
                return ((PlaylistCreationInfo) ((g) this).instance).getDeltasCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
            public final List<Playlist4ApiProto.Delta> getDeltasList() {
                return Collections.unmodifiableList(((PlaylistCreationInfo) ((g) this).instance).getDeltasList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
            public final phc getNewRevision() {
                return ((PlaylistCreationInfo) ((g) this).instance).getNewRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
            public final phc getOwnerUserId() {
                return ((PlaylistCreationInfo) ((g) this).instance).getOwnerUserId();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
            public final String getOwnerUsername() {
                return ((PlaylistCreationInfo) ((g) this).instance).getOwnerUsername();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
            public final phc getOwnerUsernameBytes() {
                return ((PlaylistCreationInfo) ((g) this).instance).getOwnerUsernameBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
            public final boolean getTruncatedOps() {
                return ((PlaylistCreationInfo) ((g) this).instance).getTruncatedOps();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
            public final boolean hasNewRevision() {
                return ((PlaylistCreationInfo) ((g) this).instance).hasNewRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
            public final boolean hasOwnerUserId() {
                return ((PlaylistCreationInfo) ((g) this).instance).hasOwnerUserId();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
            public final boolean hasOwnerUsername() {
                return ((PlaylistCreationInfo) ((g) this).instance).hasOwnerUsername();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistCreationInfoOrBuilder
            public final boolean hasTruncatedOps() {
                return ((PlaylistCreationInfo) ((g) this).instance).hasTruncatedOps();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m823mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder removeDeltas(int i) {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).removeDeltas(i);
                return this;
            }

            public final Builder setDeltas(int i, Playlist4ApiProto.Delta.Builder builder) {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).setDeltas(i, (Playlist4ApiProto.Delta) builder.build());
                return this;
            }

            public final Builder setNewRevision(phc phcVar) {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).setNewRevision(phcVar);
                return this;
            }

            public final Builder setOwnerUserId(phc phcVar) {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).setOwnerUserId(phcVar);
                return this;
            }

            public final Builder setOwnerUsername(String str) {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).setOwnerUsername(str);
                return this;
            }

            public final Builder setOwnerUsernameBytes(phc phcVar) {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).setOwnerUsernameBytes(phcVar);
                return this;
            }

            public final Builder setTruncatedOps(boolean z) {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).setTruncatedOps(z);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m822clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m824mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m821clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m825mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

            public final Builder addDeltas(int i, Playlist4ApiProto.Delta delta) {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).addDeltas(i, delta);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setDeltas(int i, Playlist4ApiProto.Delta delta) {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).setDeltas(i, delta);
                return this;
            }

            public final Builder addDeltas(Playlist4ApiProto.Delta delta) {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).addDeltas(delta);
                return this;
            }

            public final Builder addDeltas(int i, Playlist4ApiProto.Delta.Builder builder) {
                copyOnWrite();
                ((PlaylistCreationInfo) ((g) this).instance).addDeltas(i, (Playlist4ApiProto.Delta) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(PlaylistCreationInfo playlistCreationInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(playlistCreationInfo);
        }

        public static PlaylistCreationInfo parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (PlaylistCreationInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PlaylistCreationInfo parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (PlaylistCreationInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static PlaylistCreationInfo parseFrom(phc phcVar) {
            return (PlaylistCreationInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static PlaylistCreationInfo parseFrom(phc phcVar, uz00 uz00Var) {
            return (PlaylistCreationInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDeltas(int i, Playlist4ApiProto.Delta delta) {
            delta.getClass();
            ensureDeltasIsMutable();
            this.deltas_.add(i, delta);
        }

        public static PlaylistCreationInfo parseFrom(byte[] bArr) {
            return (PlaylistCreationInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlaylistCreationInfo parseFrom(byte[] bArr, uz00 uz00Var) {
            return (PlaylistCreationInfo) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static PlaylistCreationInfo parseFrom(InputStream inputStream) {
            return (PlaylistCreationInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistCreationInfo parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (PlaylistCreationInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PlaylistCreationInfo parseFrom(lwg lwgVar) {
            return (PlaylistCreationInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static PlaylistCreationInfo parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (PlaylistCreationInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class PlaylistModificationInfo extends h implements PlaylistModificationInfoOrBuilder {
        private static final PlaylistModificationInfo DEFAULT_INSTANCE;
        public static final int MODIFIED_AT_FIELD_NUMBER = 5;
        public static final int NEW_REVISION_FIELD_NUMBER = 2;
        public static final int OPS_FIELD_NUMBER = 4;
        public static final int PARENT_REVISION_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int SERVER_DOMAIN_FIELD_NUMBER = 6;
        public static final int SKIP_PUBLISH_TO_CLIENTS_FIELD_NUMBER = 8;
        public static final int TRUNCATED_OPS_FIELD_NUMBER = 7;
        public static final int URI_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private Timestamp modifiedAt_;
        private phc newRevision_;
        private h290 ops_;
        private phc parentRevision_;
        private String serverDomain_;
        private boolean skipPublishToClients_;
        private boolean truncatedOps_;
        private phc uri_;

        static {
            PlaylistModificationInfo playlistModificationInfo = new PlaylistModificationInfo();
            DEFAULT_INSTANCE = playlistModificationInfo;
            h.registerDefaultInstance(PlaylistModificationInfo.class, playlistModificationInfo);
        }

        private PlaylistModificationInfo() {
            hhc hhcVar = phc.b;
            this.uri_ = hhcVar;
            this.newRevision_ = hhcVar;
            this.parentRevision_ = hhcVar;
            this.ops_ = h.emptyProtobufList();
            this.serverDomain_ = "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOps(Iterable<? extends Playlist4ApiProto.Op> iterable) {
            ensureOpsIsMutable();
            s8.addAll(iterable, this.ops_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOps(Playlist4ApiProto.Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.add(op);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModifiedAt() {
            this.modifiedAt_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNewRevision() {
            this.bitField0_ &= -3;
            this.newRevision_ = DEFAULT_INSTANCE.newRevision_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOps() {
            this.ops_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParentRevision() {
            this.bitField0_ &= -5;
            this.parentRevision_ = DEFAULT_INSTANCE.parentRevision_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerDomain() {
            this.bitField0_ &= -17;
            this.serverDomain_ = DEFAULT_INSTANCE.serverDomain_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkipPublishToClients() {
            this.bitField0_ &= -65;
            this.skipPublishToClients_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTruncatedOps() {
            this.bitField0_ &= -33;
            this.truncatedOps_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUri() {
            this.bitField0_ &= -2;
            this.uri_ = DEFAULT_INSTANCE.uri_;
        }

        private void ensureOpsIsMutable() {
            i9 i9Var = this.ops_;
            if (i9Var.a) {
                return;
            }
            this.ops_ = h.mutableCopy(i9Var);
        }

        public static PlaylistModificationInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeModifiedAt(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.modifiedAt_;
            if (timestamp2 == null || timestamp2 == Timestamp.o()) {
                this.modifiedAt_ = timestamp;
            } else {
                this.modifiedAt_ = Timestamp.s(this.modifiedAt_).mergeFrom(timestamp).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PlaylistModificationInfo parseDelimitedFrom(InputStream inputStream) {
            return (PlaylistModificationInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistModificationInfo parseFrom(ByteBuffer byteBuffer) {
            return (PlaylistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOps(int i) {
            ensureOpsIsMutable();
            this.ops_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModifiedAt(Timestamp timestamp) {
            timestamp.getClass();
            this.modifiedAt_ = timestamp;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewRevision(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 2;
            this.newRevision_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOps(int i, Playlist4ApiProto.Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.set(i, op);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParentRevision(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 4;
            this.parentRevision_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerDomain(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.serverDomain_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerDomainBytes(phc phcVar) {
            this.serverDomain_ = phcVar.v();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkipPublishToClients(boolean z) {
            this.bitField0_ |= 64;
            this.skipPublishToClients_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTruncatedOps(boolean z) {
            this.bitField0_ |= 32;
            this.truncatedOps_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUri(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 1;
            this.uri_ = phcVar;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0001\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004Л\u0005ဉ\u0003\u0006ဈ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"bitField0_", "uri_", "newRevision_", "parentRevision_", "ops_", Playlist4ApiProto.Op.class, "modifiedAt_", "serverDomain_", "truncatedOps_", "skipPublishToClients_"});
                case 3:
                    return new PlaylistModificationInfo();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (PlaylistModificationInfo.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final Timestamp getModifiedAt() {
            Timestamp timestamp = this.modifiedAt_;
            return timestamp == null ? Timestamp.o() : timestamp;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final phc getNewRevision() {
            return this.newRevision_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final Playlist4ApiProto.Op getOps(int i) {
            return (Playlist4ApiProto.Op) this.ops_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final int getOpsCount() {
            return this.ops_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final List<Playlist4ApiProto.Op> getOpsList() {
            return this.ops_;
        }

        public final Playlist4ApiProto.OpOrBuilder getOpsOrBuilder(int i) {
            return (Playlist4ApiProto.OpOrBuilder) this.ops_.get(i);
        }

        public final List<? extends Playlist4ApiProto.OpOrBuilder> getOpsOrBuilderList() {
            return this.ops_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final phc getParentRevision() {
            return this.parentRevision_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final String getServerDomain() {
            return this.serverDomain_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final phc getServerDomainBytes() {
            return phc.i(this.serverDomain_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final boolean getSkipPublishToClients() {
            return this.skipPublishToClients_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final boolean getTruncatedOps() {
            return this.truncatedOps_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final phc getUri() {
            return this.uri_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final boolean hasModifiedAt() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final boolean hasNewRevision() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final boolean hasParentRevision() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final boolean hasServerDomain() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final boolean hasSkipPublishToClients() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final boolean hasTruncatedOps() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
        public final boolean hasUri() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements PlaylistModificationInfoOrBuilder {
            private Builder() {
                super(PlaylistModificationInfo.DEFAULT_INSTANCE);
            }

            public final Builder addAllOps(Iterable<? extends Playlist4ApiProto.Op> iterable) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).addAllOps(iterable);
                return this;
            }

            public final Builder addOps(Playlist4ApiProto.Op.Builder builder) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).addOps((Playlist4ApiProto.Op) builder.build());
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

            public final Builder clearModifiedAt() {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).clearModifiedAt();
                return this;
            }

            public final Builder clearNewRevision() {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).clearNewRevision();
                return this;
            }

            public final Builder clearOps() {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).clearOps();
                return this;
            }

            public final Builder clearParentRevision() {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).clearParentRevision();
                return this;
            }

            public final Builder clearServerDomain() {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).clearServerDomain();
                return this;
            }

            public final Builder clearSkipPublishToClients() {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).clearSkipPublishToClients();
                return this;
            }

            public final Builder clearTruncatedOps() {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).clearTruncatedOps();
                return this;
            }

            public final Builder clearUri() {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).clearUri();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final Timestamp getModifiedAt() {
                return ((PlaylistModificationInfo) ((g) this).instance).getModifiedAt();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final phc getNewRevision() {
                return ((PlaylistModificationInfo) ((g) this).instance).getNewRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final Playlist4ApiProto.Op getOps(int i) {
                return ((PlaylistModificationInfo) ((g) this).instance).getOps(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final int getOpsCount() {
                return ((PlaylistModificationInfo) ((g) this).instance).getOpsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final List<Playlist4ApiProto.Op> getOpsList() {
                return Collections.unmodifiableList(((PlaylistModificationInfo) ((g) this).instance).getOpsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final phc getParentRevision() {
                return ((PlaylistModificationInfo) ((g) this).instance).getParentRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final String getServerDomain() {
                return ((PlaylistModificationInfo) ((g) this).instance).getServerDomain();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final phc getServerDomainBytes() {
                return ((PlaylistModificationInfo) ((g) this).instance).getServerDomainBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final boolean getSkipPublishToClients() {
                return ((PlaylistModificationInfo) ((g) this).instance).getSkipPublishToClients();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final boolean getTruncatedOps() {
                return ((PlaylistModificationInfo) ((g) this).instance).getTruncatedOps();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final phc getUri() {
                return ((PlaylistModificationInfo) ((g) this).instance).getUri();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final boolean hasModifiedAt() {
                return ((PlaylistModificationInfo) ((g) this).instance).hasModifiedAt();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final boolean hasNewRevision() {
                return ((PlaylistModificationInfo) ((g) this).instance).hasNewRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final boolean hasParentRevision() {
                return ((PlaylistModificationInfo) ((g) this).instance).hasParentRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final boolean hasServerDomain() {
                return ((PlaylistModificationInfo) ((g) this).instance).hasServerDomain();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final boolean hasSkipPublishToClients() {
                return ((PlaylistModificationInfo) ((g) this).instance).hasSkipPublishToClients();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final boolean hasTruncatedOps() {
                return ((PlaylistModificationInfo) ((g) this).instance).hasTruncatedOps();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.PlaylistModificationInfoOrBuilder
            public final boolean hasUri() {
                return ((PlaylistModificationInfo) ((g) this).instance).hasUri();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m828mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeModifiedAt(Timestamp timestamp) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).mergeModifiedAt(timestamp);
                return this;
            }

            public final Builder removeOps(int i) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).removeOps(i);
                return this;
            }

            public final Builder setModifiedAt(sve1 sve1Var) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).setModifiedAt(sve1Var.build());
                return this;
            }

            public final Builder setNewRevision(phc phcVar) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).setNewRevision(phcVar);
                return this;
            }

            public final Builder setOps(int i, Playlist4ApiProto.Op.Builder builder) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).setOps(i, (Playlist4ApiProto.Op) builder.build());
                return this;
            }

            public final Builder setParentRevision(phc phcVar) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).setParentRevision(phcVar);
                return this;
            }

            public final Builder setServerDomain(String str) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).setServerDomain(str);
                return this;
            }

            public final Builder setServerDomainBytes(phc phcVar) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).setServerDomainBytes(phcVar);
                return this;
            }

            public final Builder setSkipPublishToClients(boolean z) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).setSkipPublishToClients(z);
                return this;
            }

            public final Builder setTruncatedOps(boolean z) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).setTruncatedOps(z);
                return this;
            }

            public final Builder setUri(phc phcVar) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).setUri(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m827clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m829mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m826clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m830mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

            public final Builder addOps(int i, Playlist4ApiProto.Op op) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).addOps(i, op);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setModifiedAt(Timestamp timestamp) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).setModifiedAt(timestamp);
                return this;
            }

            public final Builder setOps(int i, Playlist4ApiProto.Op op) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).setOps(i, op);
                return this;
            }

            public final Builder addOps(Playlist4ApiProto.Op op) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).addOps(op);
                return this;
            }

            public final Builder addOps(int i, Playlist4ApiProto.Op.Builder builder) {
                copyOnWrite();
                ((PlaylistModificationInfo) ((g) this).instance).addOps(i, (Playlist4ApiProto.Op) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(PlaylistModificationInfo playlistModificationInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(playlistModificationInfo);
        }

        public static PlaylistModificationInfo parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (PlaylistModificationInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PlaylistModificationInfo parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (PlaylistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static PlaylistModificationInfo parseFrom(phc phcVar) {
            return (PlaylistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static PlaylistModificationInfo parseFrom(phc phcVar, uz00 uz00Var) {
            return (PlaylistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOps(int i, Playlist4ApiProto.Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.add(i, op);
        }

        public static PlaylistModificationInfo parseFrom(byte[] bArr) {
            return (PlaylistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlaylistModificationInfo parseFrom(byte[] bArr, uz00 uz00Var) {
            return (PlaylistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static PlaylistModificationInfo parseFrom(InputStream inputStream) {
            return (PlaylistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistModificationInfo parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (PlaylistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static PlaylistModificationInfo parseFrom(lwg lwgVar) {
            return (PlaylistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static PlaylistModificationInfo parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (PlaylistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class RootlistModificationInfo extends h implements RootlistModificationInfoOrBuilder {
        private static final RootlistModificationInfo DEFAULT_INSTANCE;
        public static final int MODIFIED_AT_FIELD_NUMBER = 4;
        public static final int NEW_REVISION_FIELD_NUMBER = 1;
        public static final int OPS_FIELD_NUMBER = 3;
        public static final int PARENT_REVISION_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int SERVER_DOMAIN_FIELD_NUMBER = 5;
        public static final int TRUNCATED_OPS_FIELD_NUMBER = 6;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private Timestamp modifiedAt_;
        private phc newRevision_;
        private h290 ops_;
        private phc parentRevision_;
        private String serverDomain_;
        private boolean truncatedOps_;

        static {
            RootlistModificationInfo rootlistModificationInfo = new RootlistModificationInfo();
            DEFAULT_INSTANCE = rootlistModificationInfo;
            h.registerDefaultInstance(RootlistModificationInfo.class, rootlistModificationInfo);
        }

        private RootlistModificationInfo() {
            hhc hhcVar = phc.b;
            this.newRevision_ = hhcVar;
            this.parentRevision_ = hhcVar;
            this.ops_ = h.emptyProtobufList();
            this.serverDomain_ = "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOps(Iterable<? extends Playlist4ApiProto.Op> iterable) {
            ensureOpsIsMutable();
            s8.addAll(iterable, this.ops_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOps(Playlist4ApiProto.Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.add(op);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModifiedAt() {
            this.modifiedAt_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNewRevision() {
            this.bitField0_ &= -2;
            this.newRevision_ = DEFAULT_INSTANCE.newRevision_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOps() {
            this.ops_ = h.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParentRevision() {
            this.bitField0_ &= -3;
            this.parentRevision_ = DEFAULT_INSTANCE.parentRevision_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerDomain() {
            this.bitField0_ &= -9;
            this.serverDomain_ = DEFAULT_INSTANCE.serverDomain_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTruncatedOps() {
            this.bitField0_ &= -17;
            this.truncatedOps_ = false;
        }

        private void ensureOpsIsMutable() {
            i9 i9Var = this.ops_;
            if (i9Var.a) {
                return;
            }
            this.ops_ = h.mutableCopy(i9Var);
        }

        public static RootlistModificationInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeModifiedAt(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.modifiedAt_;
            if (timestamp2 == null || timestamp2 == Timestamp.o()) {
                this.modifiedAt_ = timestamp;
            } else {
                this.modifiedAt_ = Timestamp.s(this.modifiedAt_).mergeFrom(timestamp).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RootlistModificationInfo parseDelimitedFrom(InputStream inputStream) {
            return (RootlistModificationInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RootlistModificationInfo parseFrom(ByteBuffer byteBuffer) {
            return (RootlistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOps(int i) {
            ensureOpsIsMutable();
            this.ops_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModifiedAt(Timestamp timestamp) {
            timestamp.getClass();
            this.modifiedAt_ = timestamp;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNewRevision(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 1;
            this.newRevision_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOps(int i, Playlist4ApiProto.Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.set(i, op);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParentRevision(phc phcVar) {
            phcVar.getClass();
            this.bitField0_ |= 2;
            this.parentRevision_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerDomain(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.serverDomain_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerDomainBytes(phc phcVar) {
            this.serverDomain_ = phcVar.v();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTruncatedOps(boolean z) {
            this.bitField0_ |= 16;
            this.truncatedOps_ = z;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int i = 0;
            switch (jf40Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ည\u0000\u0002ည\u0001\u0003Л\u0004ဉ\u0002\u0005ဈ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "newRevision_", "parentRevision_", "ops_", Playlist4ApiProto.Op.class, "modifiedAt_", "serverDomain_", "truncatedOps_"});
                case 3:
                    return new RootlistModificationInfo();
                case 4:
                    return new Builder(i);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (RootlistModificationInfo.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    throw null;
            }
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final Timestamp getModifiedAt() {
            Timestamp timestamp = this.modifiedAt_;
            return timestamp == null ? Timestamp.o() : timestamp;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final phc getNewRevision() {
            return this.newRevision_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final Playlist4ApiProto.Op getOps(int i) {
            return (Playlist4ApiProto.Op) this.ops_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final int getOpsCount() {
            return this.ops_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final List<Playlist4ApiProto.Op> getOpsList() {
            return this.ops_;
        }

        public final Playlist4ApiProto.OpOrBuilder getOpsOrBuilder(int i) {
            return (Playlist4ApiProto.OpOrBuilder) this.ops_.get(i);
        }

        public final List<? extends Playlist4ApiProto.OpOrBuilder> getOpsOrBuilderList() {
            return this.ops_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final phc getParentRevision() {
            return this.parentRevision_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final String getServerDomain() {
            return this.serverDomain_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final phc getServerDomainBytes() {
            return phc.i(this.serverDomain_);
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final boolean getTruncatedOps() {
            return this.truncatedOps_;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final boolean hasModifiedAt() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final boolean hasNewRevision() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final boolean hasParentRevision() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final boolean hasServerDomain() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
        public final boolean hasTruncatedOps() {
            return (this.bitField0_ & 16) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements RootlistModificationInfoOrBuilder {
            private Builder() {
                super(RootlistModificationInfo.DEFAULT_INSTANCE);
            }

            public final Builder addAllOps(Iterable<? extends Playlist4ApiProto.Op> iterable) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).addAllOps(iterable);
                return this;
            }

            public final Builder addOps(Playlist4ApiProto.Op.Builder builder) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).addOps((Playlist4ApiProto.Op) builder.build());
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

            public final Builder clearModifiedAt() {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).clearModifiedAt();
                return this;
            }

            public final Builder clearNewRevision() {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).clearNewRevision();
                return this;
            }

            public final Builder clearOps() {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).clearOps();
                return this;
            }

            public final Builder clearParentRevision() {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).clearParentRevision();
                return this;
            }

            public final Builder clearServerDomain() {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).clearServerDomain();
                return this;
            }

            public final Builder clearTruncatedOps() {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).clearTruncatedOps();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final Timestamp getModifiedAt() {
                return ((RootlistModificationInfo) ((g) this).instance).getModifiedAt();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final phc getNewRevision() {
                return ((RootlistModificationInfo) ((g) this).instance).getNewRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final Playlist4ApiProto.Op getOps(int i) {
                return ((RootlistModificationInfo) ((g) this).instance).getOps(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final int getOpsCount() {
                return ((RootlistModificationInfo) ((g) this).instance).getOpsCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final List<Playlist4ApiProto.Op> getOpsList() {
                return Collections.unmodifiableList(((RootlistModificationInfo) ((g) this).instance).getOpsList());
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final phc getParentRevision() {
                return ((RootlistModificationInfo) ((g) this).instance).getParentRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final String getServerDomain() {
                return ((RootlistModificationInfo) ((g) this).instance).getServerDomain();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final phc getServerDomainBytes() {
                return ((RootlistModificationInfo) ((g) this).instance).getServerDomainBytes();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final boolean getTruncatedOps() {
                return ((RootlistModificationInfo) ((g) this).instance).getTruncatedOps();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final boolean hasModifiedAt() {
                return ((RootlistModificationInfo) ((g) this).instance).hasModifiedAt();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final boolean hasNewRevision() {
                return ((RootlistModificationInfo) ((g) this).instance).hasNewRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final boolean hasParentRevision() {
                return ((RootlistModificationInfo) ((g) this).instance).hasParentRevision();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final boolean hasServerDomain() {
                return ((RootlistModificationInfo) ((g) this).instance).hasServerDomain();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.RootlistModificationInfoOrBuilder
            public final boolean hasTruncatedOps() {
                return ((RootlistModificationInfo) ((g) this).instance).hasTruncatedOps();
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m833mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder mergeModifiedAt(Timestamp timestamp) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).mergeModifiedAt(timestamp);
                return this;
            }

            public final Builder removeOps(int i) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).removeOps(i);
                return this;
            }

            public final Builder setModifiedAt(sve1 sve1Var) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).setModifiedAt(sve1Var.build());
                return this;
            }

            public final Builder setNewRevision(phc phcVar) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).setNewRevision(phcVar);
                return this;
            }

            public final Builder setOps(int i, Playlist4ApiProto.Op.Builder builder) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).setOps(i, (Playlist4ApiProto.Op) builder.build());
                return this;
            }

            public final Builder setParentRevision(phc phcVar) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).setParentRevision(phcVar);
                return this;
            }

            public final Builder setServerDomain(String str) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).setServerDomain(str);
                return this;
            }

            public final Builder setServerDomainBytes(phc phcVar) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).setServerDomainBytes(phcVar);
                return this;
            }

            public final Builder setTruncatedOps(boolean z) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).setTruncatedOps(z);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m832clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m834mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m831clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m835mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

            public final Builder addOps(int i, Playlist4ApiProto.Op op) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).addOps(i, op);
                return this;
            }

            public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public final Builder setModifiedAt(Timestamp timestamp) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).setModifiedAt(timestamp);
                return this;
            }

            public final Builder setOps(int i, Playlist4ApiProto.Op op) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).setOps(i, op);
                return this;
            }

            public final Builder addOps(Playlist4ApiProto.Op op) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).addOps(op);
                return this;
            }

            public final Builder addOps(int i, Playlist4ApiProto.Op.Builder builder) {
                copyOnWrite();
                ((RootlistModificationInfo) ((g) this).instance).addOps(i, (Playlist4ApiProto.Op) builder.build());
                return this;
            }
        }

        public static Builder newBuilder(RootlistModificationInfo rootlistModificationInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(rootlistModificationInfo);
        }

        public static RootlistModificationInfo parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (RootlistModificationInfo) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static RootlistModificationInfo parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (RootlistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static RootlistModificationInfo parseFrom(phc phcVar) {
            return (RootlistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static RootlistModificationInfo parseFrom(phc phcVar, uz00 uz00Var) {
            return (RootlistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOps(int i, Playlist4ApiProto.Op op) {
            op.getClass();
            ensureOpsIsMutable();
            this.ops_.add(i, op);
        }

        public static RootlistModificationInfo parseFrom(byte[] bArr) {
            return (RootlistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RootlistModificationInfo parseFrom(byte[] bArr, uz00 uz00Var) {
            return (RootlistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static RootlistModificationInfo parseFrom(InputStream inputStream) {
            return (RootlistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RootlistModificationInfo parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (RootlistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static RootlistModificationInfo parseFrom(lwg lwgVar) {
            return (RootlistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static RootlistModificationInfo parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (RootlistModificationInfo) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class SubscribeRequest extends h implements SubscribeRequestOrBuilder {
        private static final SubscribeRequest DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int URIS_FIELD_NUMBER = 1;
        private h290 uris_ = h.emptyProtobufList();

        static {
            SubscribeRequest subscribeRequest = new SubscribeRequest();
            DEFAULT_INSTANCE = subscribeRequest;
            h.registerDefaultInstance(SubscribeRequest.class, subscribeRequest);
        }

        private SubscribeRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUris(Iterable<? extends phc> iterable) {
            ensureUrisIsMutable();
            s8.addAll(iterable, this.uris_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUris(phc phcVar) {
            phcVar.getClass();
            ensureUrisIsMutable();
            this.uris_.add(phcVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUris() {
            this.uris_ = h.emptyProtobufList();
        }

        private void ensureUrisIsMutable() {
            i9 i9Var = this.uris_;
            if (i9Var.a) {
                return;
            }
            this.uris_ = h.mutableCopy(i9Var);
        }

        public static SubscribeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SubscribeRequest parseDelimitedFrom(InputStream inputStream) {
            return (SubscribeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SubscribeRequest parseFrom(ByteBuffer byteBuffer) {
            return (SubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUris(int i, phc phcVar) {
            phcVar.getClass();
            ensureUrisIsMutable();
            this.uris_.set(i, phcVar);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"uris_"});
            }
            if (iOrdinal == 3) {
                return new SubscribeRequest();
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
            synchronized (SubscribeRequest.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.SubscribeRequestOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.SubscribeRequestOrBuilder
        public final phc getUris(int i) {
            return (phc) this.uris_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.SubscribeRequestOrBuilder
        public final int getUrisCount() {
            return this.uris_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.SubscribeRequestOrBuilder
        public final List<phc> getUrisList() {
            return this.uris_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements SubscribeRequestOrBuilder {
            private Builder() {
                super(SubscribeRequest.DEFAULT_INSTANCE);
            }

            public final Builder addAllUris(Iterable<? extends phc> iterable) {
                copyOnWrite();
                ((SubscribeRequest) ((g) this).instance).addAllUris(iterable);
                return this;
            }

            public final Builder addUris(phc phcVar) {
                copyOnWrite();
                ((SubscribeRequest) ((g) this).instance).addUris(phcVar);
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

            public final Builder clearUris() {
                copyOnWrite();
                ((SubscribeRequest) ((g) this).instance).clearUris();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.SubscribeRequestOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.SubscribeRequestOrBuilder
            public final phc getUris(int i) {
                return ((SubscribeRequest) ((g) this).instance).getUris(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.SubscribeRequestOrBuilder
            public final int getUrisCount() {
                return ((SubscribeRequest) ((g) this).instance).getUrisCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.SubscribeRequestOrBuilder
            public final List<phc> getUrisList() {
                return Collections.unmodifiableList(((SubscribeRequest) ((g) this).instance).getUrisList());
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m838mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setUris(int i, phc phcVar) {
                copyOnWrite();
                ((SubscribeRequest) ((g) this).instance).setUris(i, phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m837clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m839mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m836clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m840mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public static Builder newBuilder(SubscribeRequest subscribeRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(subscribeRequest);
        }

        public static SubscribeRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (SubscribeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static SubscribeRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (SubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static SubscribeRequest parseFrom(phc phcVar) {
            return (SubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static SubscribeRequest parseFrom(phc phcVar, uz00 uz00Var) {
            return (SubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static SubscribeRequest parseFrom(byte[] bArr) {
            return (SubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SubscribeRequest parseFrom(byte[] bArr, uz00 uz00Var) {
            return (SubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static SubscribeRequest parseFrom(InputStream inputStream) {
            return (SubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SubscribeRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (SubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static SubscribeRequest parseFrom(lwg lwgVar) {
            return (SubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static SubscribeRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (SubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class UnsubscribeRequest extends h implements UnsubscribeRequestOrBuilder {
        private static final UnsubscribeRequest DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int URIS_FIELD_NUMBER = 1;
        private h290 uris_ = h.emptyProtobufList();

        static {
            UnsubscribeRequest unsubscribeRequest = new UnsubscribeRequest();
            DEFAULT_INSTANCE = unsubscribeRequest;
            h.registerDefaultInstance(UnsubscribeRequest.class, unsubscribeRequest);
        }

        private UnsubscribeRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUris(Iterable<? extends phc> iterable) {
            ensureUrisIsMutable();
            s8.addAll(iterable, this.uris_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUris(phc phcVar) {
            phcVar.getClass();
            ensureUrisIsMutable();
            this.uris_.add(phcVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUris() {
            this.uris_ = h.emptyProtobufList();
        }

        private void ensureUrisIsMutable() {
            i9 i9Var = this.uris_;
            if (i9Var.a) {
                return;
            }
            this.uris_ = h.mutableCopy(i9Var);
        }

        public static UnsubscribeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UnsubscribeRequest parseDelimitedFrom(InputStream inputStream) {
            return (UnsubscribeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnsubscribeRequest parseFrom(ByteBuffer byteBuffer) {
            return (UnsubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUris(int i, phc phcVar) {
            phcVar.getClass();
            ensureUrisIsMutable();
            this.uris_.set(i, phcVar);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"uris_"});
            }
            if (iOrdinal == 3) {
                return new UnsubscribeRequest();
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
            synchronized (UnsubscribeRequest.class) {
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

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.UnsubscribeRequestOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.UnsubscribeRequestOrBuilder
        public final phc getUris(int i) {
            return (phc) this.uris_.get(i);
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.UnsubscribeRequestOrBuilder
        public final int getUrisCount() {
            return this.uris_.size();
        }

        @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.UnsubscribeRequestOrBuilder
        public final List<phc> getUrisList() {
            return this.uris_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements UnsubscribeRequestOrBuilder {
            private Builder() {
                super(UnsubscribeRequest.DEFAULT_INSTANCE);
            }

            public final Builder addAllUris(Iterable<? extends phc> iterable) {
                copyOnWrite();
                ((UnsubscribeRequest) ((g) this).instance).addAllUris(iterable);
                return this;
            }

            public final Builder addUris(phc phcVar) {
                copyOnWrite();
                ((UnsubscribeRequest) ((g) this).instance).addUris(phcVar);
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

            public final Builder clearUris() {
                copyOnWrite();
                ((UnsubscribeRequest) ((g) this).instance).clearUris();
                return this;
            }

            public final /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.UnsubscribeRequestOrBuilder
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.UnsubscribeRequestOrBuilder
            public final phc getUris(int i) {
                return ((UnsubscribeRequest) ((g) this).instance).getUris(i);
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.UnsubscribeRequestOrBuilder
            public final int getUrisCount() {
                return ((UnsubscribeRequest) ((g) this).instance).getUrisCount();
            }

            @Override // com.spotify.playlist4.proto.Playlist4PubSubProto.UnsubscribeRequestOrBuilder
            public final List<phc> getUrisList() {
                return Collections.unmodifiableList(((UnsubscribeRequest) ((g) this).instance).getUrisList());
            }

            public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m843mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public final Builder setUris(int i, phc phcVar) {
                copyOnWrite();
                ((UnsubscribeRequest) ((g) this).instance).setUris(i, phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m842clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m844mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r2j0 m841clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public final /* bridge */ /* synthetic */ r8 m845mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public static Builder newBuilder(UnsubscribeRequest unsubscribeRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(unsubscribeRequest);
        }

        public static UnsubscribeRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (UnsubscribeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UnsubscribeRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (UnsubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static UnsubscribeRequest parseFrom(phc phcVar) {
            return (UnsubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static UnsubscribeRequest parseFrom(phc phcVar, uz00 uz00Var) {
            return (UnsubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static UnsubscribeRequest parseFrom(byte[] bArr) {
            return (UnsubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UnsubscribeRequest parseFrom(byte[] bArr, uz00 uz00Var) {
            return (UnsubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static UnsubscribeRequest parseFrom(InputStream inputStream) {
            return (UnsubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnsubscribeRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (UnsubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UnsubscribeRequest parseFrom(lwg lwgVar) {
            return (UnsubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static UnsubscribeRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (UnsubscribeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static void registerAllExtensions(uz00 uz00Var) {
    }
}
