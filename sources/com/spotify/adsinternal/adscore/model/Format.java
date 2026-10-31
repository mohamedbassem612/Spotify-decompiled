package com.spotify.adsinternal.adscore.model;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/spotify/adsinternal/adscore/model/Format;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AUDIO", "BANNER", "DUMMY", "UNKNOWN", "UNRECOGNIZED", "VIDEO", "src_main_java_com_spotify_adsinternal_adscore-adscore"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public enum Format {
    AUDIO("audio"),
    BANNER("banner"),
    DUMMY("dummy"),
    UNKNOWN("unknown"),
    UNRECOGNIZED("unrecognized"),
    VIDEO("video");

    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());
    private final String value;

    Format(String str) {
        this.value = str;
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
