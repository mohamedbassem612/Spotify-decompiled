package com.spotify.share.file.api.files;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import java.io.IOException;
import kotlin.Metadata;
import p.l420;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/share/file/api/files/CreateFileException;", "Ljava/io/IOException;", "src_main_java_com_spotify_share_file_api-api"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class CreateFileException extends IOException {
    public CreateFileException(l420 l420Var) {
        super("Could not make shareable directory: " + l420Var);
    }
}
