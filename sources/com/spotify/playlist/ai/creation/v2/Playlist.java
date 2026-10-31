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
public final class Playlist extends h implements PlaylistOrBuilder {
    public static final int COVER_ART_LINK_FIELD_NUMBER = 4;
    private static final Playlist DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TRACKS_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    private String uri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String coverArtLink_ = "";
    private h290 tracks_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.Playlist$1, reason: invalid class name */
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
        Playlist playlist = new Playlist();
        DEFAULT_INSTANCE = playlist;
        h.registerDefaultInstance(Playlist.class, playlist);
    }

    private Playlist() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTracks(Iterable<? extends Item> iterable) {
        ensureTracksIsMutable();
        s8.addAll(iterable, this.tracks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTracks(Item item) {
        item.getClass();
        ensureTracksIsMutable();
        this.tracks_.add(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverArtLink() {
        this.coverArtLink_ = DEFAULT_INSTANCE.coverArtLink_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = DEFAULT_INSTANCE.subtitle_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = DEFAULT_INSTANCE.title_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTracks() {
        this.tracks_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = DEFAULT_INSTANCE.uri_;
    }

    private void ensureTracksIsMutable() {
        i9 i9Var = this.tracks_;
        if (i9Var.a) {
            return;
        }
        this.tracks_ = h.mutableCopy(i9Var);
    }

    public static Playlist getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Playlist parseDelimitedFrom(InputStream inputStream) {
        return (Playlist) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Playlist parseFrom(ByteBuffer byteBuffer) {
        return (Playlist) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTracks(int i) {
        ensureTracksIsMutable();
        this.tracks_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverArtLink(String str) {
        str.getClass();
        this.coverArtLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverArtLinkBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.coverArtLink_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(String str) {
        str.getClass();
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.subtitle_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.title_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTracks(int i, Item item) {
        item.getClass();
        ensureTracksIsMutable();
        this.tracks_.set(i, item);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u001b", new Object[]{"uri_", "title_", "subtitle_", "coverArtLink_", "tracks_", Item.class});
        }
        if (iOrdinal == 3) {
            return new Playlist();
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
        synchronized (Playlist.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
    public final String getCoverArtLink() {
        return this.coverArtLink_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
    public final phc getCoverArtLinkBytes() {
        return phc.i(this.coverArtLink_);
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
    public final String getSubtitle() {
        return this.subtitle_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
    public final phc getSubtitleBytes() {
        return phc.i(this.subtitle_);
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
    public final String getTitle() {
        return this.title_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
    public final phc getTitleBytes() {
        return phc.i(this.title_);
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
    public final Item getTracks(int i) {
        return (Item) this.tracks_.get(i);
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
    public final int getTracksCount() {
        return this.tracks_.size();
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
    public final List<Item> getTracksList() {
        return this.tracks_;
    }

    public final ItemOrBuilder getTracksOrBuilder(int i) {
        return (ItemOrBuilder) this.tracks_.get(i);
    }

    public final List<? extends ItemOrBuilder> getTracksOrBuilderList() {
        return this.tracks_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
    public final String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
    public final phc getUriBytes() {
        return phc.i(this.uri_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements PlaylistOrBuilder {
        private Builder() {
            super(Playlist.DEFAULT_INSTANCE);
        }

        public final Builder addAllTracks(Iterable<? extends Item> iterable) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).addAllTracks(iterable);
            return this;
        }

        public final Builder addTracks(Item.Builder builder) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).addTracks((Item) builder.build());
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

        public final Builder clearCoverArtLink() {
            copyOnWrite();
            ((Playlist) ((g) this).instance).clearCoverArtLink();
            return this;
        }

        public final Builder clearSubtitle() {
            copyOnWrite();
            ((Playlist) ((g) this).instance).clearSubtitle();
            return this;
        }

        public final Builder clearTitle() {
            copyOnWrite();
            ((Playlist) ((g) this).instance).clearTitle();
            return this;
        }

        public final Builder clearTracks() {
            copyOnWrite();
            ((Playlist) ((g) this).instance).clearTracks();
            return this;
        }

        public final Builder clearUri() {
            copyOnWrite();
            ((Playlist) ((g) this).instance).clearUri();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
        public final String getCoverArtLink() {
            return ((Playlist) ((g) this).instance).getCoverArtLink();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
        public final phc getCoverArtLinkBytes() {
            return ((Playlist) ((g) this).instance).getCoverArtLinkBytes();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
        public final String getSubtitle() {
            return ((Playlist) ((g) this).instance).getSubtitle();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
        public final phc getSubtitleBytes() {
            return ((Playlist) ((g) this).instance).getSubtitleBytes();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
        public final String getTitle() {
            return ((Playlist) ((g) this).instance).getTitle();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
        public final phc getTitleBytes() {
            return ((Playlist) ((g) this).instance).getTitleBytes();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
        public final Item getTracks(int i) {
            return ((Playlist) ((g) this).instance).getTracks(i);
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
        public final int getTracksCount() {
            return ((Playlist) ((g) this).instance).getTracksCount();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
        public final List<Item> getTracksList() {
            return Collections.unmodifiableList(((Playlist) ((g) this).instance).getTracksList());
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
        public final String getUri() {
            return ((Playlist) ((g) this).instance).getUri();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistOrBuilder
        public final phc getUriBytes() {
            return ((Playlist) ((g) this).instance).getUriBytes();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m525mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder removeTracks(int i) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).removeTracks(i);
            return this;
        }

        public final Builder setCoverArtLink(String str) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).setCoverArtLink(str);
            return this;
        }

        public final Builder setCoverArtLinkBytes(phc phcVar) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).setCoverArtLinkBytes(phcVar);
            return this;
        }

        public final Builder setSubtitle(String str) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).setSubtitle(str);
            return this;
        }

        public final Builder setSubtitleBytes(phc phcVar) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).setSubtitleBytes(phcVar);
            return this;
        }

        public final Builder setTitle(String str) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).setTitle(str);
            return this;
        }

        public final Builder setTitleBytes(phc phcVar) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).setTitleBytes(phcVar);
            return this;
        }

        public final Builder setTracks(int i, Item.Builder builder) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).setTracks(i, (Item) builder.build());
            return this;
        }

        public final Builder setUri(String str) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).setUri(str);
            return this;
        }

        public final Builder setUriBytes(phc phcVar) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).setUriBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m524clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m526mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m523clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m527mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public final Builder addTracks(int i, Item item) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).addTracks(i, item);
            return this;
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public final Builder setTracks(int i, Item item) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).setTracks(i, item);
            return this;
        }

        public final Builder addTracks(Item item) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).addTracks(item);
            return this;
        }

        public final Builder addTracks(int i, Item.Builder builder) {
            copyOnWrite();
            ((Playlist) ((g) this).instance).addTracks(i, (Item) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(Playlist playlist) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(playlist);
    }

    public static Playlist parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Playlist) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Playlist parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Playlist) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Playlist parseFrom(phc phcVar) {
        return (Playlist) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Playlist parseFrom(phc phcVar, uz00 uz00Var) {
        return (Playlist) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTracks(int i, Item item) {
        item.getClass();
        ensureTracksIsMutable();
        this.tracks_.add(i, item);
    }

    public static Playlist parseFrom(byte[] bArr) {
        return (Playlist) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Playlist parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Playlist) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Playlist parseFrom(InputStream inputStream) {
        return (Playlist) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Playlist parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Playlist) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Playlist parseFrom(lwg lwgVar) {
        return (Playlist) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Playlist parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Playlist) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
