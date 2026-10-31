package com.spotify.localfiles.localfilesmonorepo;

import android.content.Intent;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import p.nhc1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/localfiles/localfilesmonorepo/AudioMimeIntentChecker;", "", "<init>", "()V", "isAudioMimeIntent", "", "intent", "Landroid/content/Intent;", "src_main_java_com_spotify_localfiles_localfiles-android-localfiles"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class AudioMimeIntentChecker {
    public static final AudioMimeIntentChecker INSTANCE = new AudioMimeIntentChecker();

    private AudioMimeIntentChecker() {
    }

    public final boolean isAudioMimeIntent(Intent intent) {
        String type;
        return (intent.getFlags() & 1048576) == 0 && u890.j(intent.getAction(), "android.intent.action.VIEW") && (type = intent.getType()) != null && nhc1.Y(type, "audio/", false);
    }
}
