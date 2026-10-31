package com.spotify.localfiles.localfilesmonorepo;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import p.jbh0;
import p.js31;
import p.qs31;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/spotify/localfiles/localfilesmonorepo/AudioMimeMatcher;", "Lp/jbh0;", "Lp/js31;", "<init>", "()V", "input", "", "match", "(Lp/js31;)Z", "", "description", "()Ljava/lang/String;", "src_main_java_com_spotify_localfiles_localfiles-android-localfiles"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class AudioMimeMatcher implements jbh0 {
    public static final AudioMimeMatcher INSTANCE = new AudioMimeMatcher();

    private AudioMimeMatcher() {
    }

    @Override // p.jbh0
    public String description() {
        return "Audio MimeType matcher for Local Files";
    }

    @Override // p.jbh0
    public boolean match(js31 input) {
        return AudioMimeIntentChecker.INSTANCE.isAudioMimeIntent(((qs31) input).a);
    }
}
