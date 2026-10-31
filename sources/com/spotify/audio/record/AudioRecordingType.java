package com.spotify.audio.record;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/audio/record/AudioRecordingType;", "", "MICROPHONE", "EXTERNAL", "src_main_java_com_spotify_audio_record-record"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class AudioRecordingType {
    public static final AudioRecordingType EXTERNAL;
    public static final AudioRecordingType MICROPHONE;
    public static final /* synthetic */ AudioRecordingType[] a;

    static {
        AudioRecordingType audioRecordingType = new AudioRecordingType("MICROPHONE", 0);
        MICROPHONE = audioRecordingType;
        AudioRecordingType audioRecordingType2 = new AudioRecordingType("EXTERNAL", 1);
        EXTERNAL = audioRecordingType2;
        a = new AudioRecordingType[]{audioRecordingType, audioRecordingType2};
    }

    public static AudioRecordingType valueOf(String str) {
        return (AudioRecordingType) Enum.valueOf(AudioRecordingType.class, str);
    }

    public static AudioRecordingType[] values() {
        return (AudioRecordingType[]) a.clone();
    }
}
