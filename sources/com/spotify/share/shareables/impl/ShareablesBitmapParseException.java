package com.spotify.share.shareables.impl;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/share/shareables/impl/ShareablesBitmapParseException;", "Ljava/lang/Exception;", "<init>", "()V", "src_main_java_com_spotify_share_shareables_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ShareablesBitmapParseException extends Exception {
    public ShareablesBitmapParseException() {
        super("Can't convert shareables response to bitmap");
    }
}
