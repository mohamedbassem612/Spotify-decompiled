package p;

import com.spotify.alignedcuration.transitioncurationimpl.MixConversionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sgo implements vgo {
    public final MixConversionException a;

    public sgo(MixConversionException mixConversionException) {
        this.a = mixConversionException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sgo) && this.a == ((sgo) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
