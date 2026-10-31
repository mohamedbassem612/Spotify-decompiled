package com.spotify.carapplibrary.api;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/carapplibrary/api/CommandFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_carapplibrary_api-api"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class CommandFailedException extends Exception {
    public final String a;

    public CommandFailedException(String str) {
        this.a = str;
    }
}
