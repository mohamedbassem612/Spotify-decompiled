package com.spotify.widgets.colorextraction;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/widgets/colorextraction/ColorNotExtractedError;", "Ljava/io/IOException;", "src_main_java_com_spotify_widgets_colorextraction-colorextraction"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ColorNotExtractedError extends IOException {
    public final Throwable a;

    public ColorNotExtractedError(Throwable th) {
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Throwable th = this.a;
        if (th != null) {
            return th.getMessage();
        }
        return null;
    }
}
