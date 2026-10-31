package com.spotify.streamreporting.streamreportingesperanto;

import kotlin.Metadata;
import p.iub1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/streamreporting/streamreportingesperanto/StreamReportingException;", "Ljava/lang/RuntimeException;", "src_main_java_com_spotify_streamreporting_streamreportingesperanto-streamreportingesperanto"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StreamReportingException extends RuntimeException {
    public final iub1 a;

    public StreamReportingException(iub1 iub1Var, String str) {
        super(str);
        this.a = iub1Var;
    }
}
