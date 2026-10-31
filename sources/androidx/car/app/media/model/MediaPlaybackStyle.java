package androidx.car.app.media.model;

import androidx.car.app.model.CarColor;
import java.util.Objects;
import p.euh0;
import p.gvg;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class MediaPlaybackStyle {
    private final CarColor mMediaAccentColor;
    private final int mProgressBarStrokeCap;

    private MediaPlaybackStyle(euh0 euh0Var) {
        this.mMediaAccentColor = euh0Var.a;
        this.mProgressBarStrokeCap = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPlaybackStyle)) {
            return false;
        }
        MediaPlaybackStyle mediaPlaybackStyle = (MediaPlaybackStyle) obj;
        return Objects.equals(this.mMediaAccentColor, mediaPlaybackStyle.mMediaAccentColor) && this.mProgressBarStrokeCap == mediaPlaybackStyle.mProgressBarStrokeCap;
    }

    public CarColor getMediaAccentColor() {
        return this.mMediaAccentColor;
    }

    public int getProgressBarStrokeCap() {
        return this.mProgressBarStrokeCap;
    }

    public int hashCode() {
        return Objects.hash(this.mMediaAccentColor, Integer.valueOf(this.mProgressBarStrokeCap));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaPlaybackStyle{mediaAccentColor=");
        sb.append(this.mMediaAccentColor);
        sb.append(", progressBarStrokeCap=");
        return gvg.j(sb, this.mProgressBarStrokeCap, "}");
    }

    public /* synthetic */ MediaPlaybackStyle(euh0 euh0Var, int i) {
        this(euh0Var);
    }

    private MediaPlaybackStyle() {
        this.mMediaAccentColor = null;
        this.mProgressBarStrokeCap = 0;
    }
}
