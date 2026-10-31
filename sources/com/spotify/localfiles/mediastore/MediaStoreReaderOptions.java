package com.spotify.localfiles.mediastore;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/spotify/localfiles/mediastore/MediaStoreReaderOptions;", "", "includeAlarms", "", "includeAudiobooks", "includeMusic", "includeNotifications", "includePodcasts", "includeRingtones", "durationMin", "", "supportFileUriScheme", "<init>", "(ZZZZZZIZ)V", "getIncludeAlarms", "()Z", "getIncludeAudiobooks", "getIncludeMusic", "getIncludeNotifications", "getIncludePodcasts", "getIncludeRingtones", "getDurationMin", "()I", "getSupportFileUriScheme", "src_main_java_com_spotify_localfiles_mediastore-mediastore"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class MediaStoreReaderOptions {
    private final int durationMin;
    private final boolean includeAlarms;
    private final boolean includeAudiobooks;
    private final boolean includeMusic;
    private final boolean includeNotifications;
    private final boolean includePodcasts;
    private final boolean includeRingtones;
    private final boolean supportFileUriScheme;

    public /* synthetic */ MediaStoreReaderOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, boolean z7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, z4, z5, z6, i, (i2 & 128) != 0 ? false : z7);
    }

    public final int getDurationMin() {
        return this.durationMin;
    }

    public final boolean getIncludeAlarms() {
        return this.includeAlarms;
    }

    public final boolean getIncludeAudiobooks() {
        return this.includeAudiobooks;
    }

    public final boolean getIncludeMusic() {
        return this.includeMusic;
    }

    public final boolean getIncludeNotifications() {
        return this.includeNotifications;
    }

    public final boolean getIncludePodcasts() {
        return this.includePodcasts;
    }

    public final boolean getIncludeRingtones() {
        return this.includeRingtones;
    }

    public final boolean getSupportFileUriScheme() {
        return this.supportFileUriScheme;
    }

    public MediaStoreReaderOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, boolean z7) {
        this.includeAlarms = z;
        this.includeAudiobooks = z2;
        this.includeMusic = z3;
        this.includeNotifications = z4;
        this.includePodcasts = z5;
        this.includeRingtones = z6;
        this.durationMin = i;
        this.supportFileUriScheme = z7;
    }
}
