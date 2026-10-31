package com.spotify.bluejay.data.api;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import p.gvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/bluejay/data/api/GenerationServiceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_bluejay_data_api-api"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class GenerationServiceException extends Exception {
    public final String a;
    public final int b;

    public GenerationServiceException(String str, int i, int i2) {
        super(gvg.e(i, "Generation failed (", ")"));
        this.a = str;
        this.b = i2;
    }
}
