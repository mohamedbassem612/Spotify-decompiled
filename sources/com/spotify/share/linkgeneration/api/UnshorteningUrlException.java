package com.spotify.share.linkgeneration.api;

import kotlin.Metadata;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/share/linkgeneration/api/UnshorteningUrlException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_share_linkgeneration_api-api"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UnshorteningUrlException extends Exception {
    public final Integer a;

    public UnshorteningUrlException(String str, HttpException httpException, Integer num) {
        super(str, httpException);
        this.a = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getA() {
        return this.a;
    }
}
