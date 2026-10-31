package p;

import com.spotify.pses.v1.proto.ConfigurationResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ika1 extends ouk {
    public final ConfigurationResponse a;

    public ika1(ConfigurationResponse configurationResponse) {
        this.a = configurationResponse;
    }

    public final ConfigurationResponse a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ika1) && this.a.equals(((ika1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
