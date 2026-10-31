package p;

import com.spotify.wrapped.v1.proto.ButtonConfiguration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w50 {
    public final ButtonConfiguration a;

    public w50(ButtonConfiguration buttonConfiguration) {
        this.a = buttonConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w50) && this.a.equals(((w50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
