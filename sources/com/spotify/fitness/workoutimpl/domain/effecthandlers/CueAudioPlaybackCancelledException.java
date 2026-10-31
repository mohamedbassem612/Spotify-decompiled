package com.spotify.fitness.workoutimpl.domain.effecthandlers;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/fitness/workoutimpl/domain/effecthandlers/CueAudioPlaybackCancelledException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "src_main_java_com_spotify_fitness_workoutimpl-workoutimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class CueAudioPlaybackCancelledException extends Exception {
    public CueAudioPlaybackCancelledException() {
        super("Cue audio playback cancelled");
    }
}
