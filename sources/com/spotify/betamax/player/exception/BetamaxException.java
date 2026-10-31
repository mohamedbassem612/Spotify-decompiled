package com.spotify.betamax.player.exception;

import java.io.IOException;
import kotlin.Metadata;
import p.xjz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/betamax/player/exception/BetamaxException;", "Ljava/io/IOException;", "src_main_java_com_spotify_betamax_player-player"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BetamaxException extends IOException {
    public final xjz a;

    public BetamaxException(String str, xjz xjzVar, Throwable th) {
        super(str, th);
        this.a = xjzVar;
    }
}
