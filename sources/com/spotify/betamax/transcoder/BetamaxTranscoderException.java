package com.spotify.betamax.transcoder;

import com.spotify.betamax.player.exception.BetamaxException;
import kotlin.Metadata;
import p.xjz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/betamax/transcoder/BetamaxTranscoderException;", "Lcom/spotify/betamax/player/exception/BetamaxException;", "src_main_java_com_spotify_betamax_transcoder-transcoder"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BetamaxTranscoderException extends BetamaxException {
    public BetamaxTranscoderException(String str, Throwable th, xjz xjzVar, int i) {
        super(str, (i & 4) != 0 ? xjz.ERROR_UNKNOWN : xjzVar, (i & 2) != 0 ? null : th);
    }
}
