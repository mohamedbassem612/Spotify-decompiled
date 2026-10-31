package androidx.car.app.media.model;

import androidx.car.app.model.Banner;
import androidx.car.app.model.Header;
import java.util.Objects;
import p.fuh0;
import p.qrd;
import p.sxd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class MediaPlaybackTemplate implements sxd1 {
    private final Banner mBanner;
    private final Header mHeader;
    private final MediaPlaybackStyle mStyle;

    public MediaPlaybackTemplate(fuh0 fuh0Var) {
        this.mHeader = fuh0Var.a;
        this.mBanner = null;
        this.mStyle = fuh0Var.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPlaybackTemplate)) {
            return false;
        }
        MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
        return Objects.equals(this.mHeader, mediaPlaybackTemplate.mHeader) && Objects.equals(this.mBanner, mediaPlaybackTemplate.mBanner) && Objects.equals(this.mStyle, mediaPlaybackTemplate.mStyle);
    }

    public Banner getBanner() {
        return this.mBanner;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public MediaPlaybackStyle getStyle() {
        return this.mStyle;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader, this.mBanner, this.mStyle);
    }

    public String toString() {
        return "MediaPlaybackTemplate";
    }

    private MediaPlaybackTemplate() {
        this.mHeader = null;
        this.mBanner = null;
        this.mStyle = null;
    }
}
