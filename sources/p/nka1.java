package p;

import com.spotify.pses.v1.proto.ConfigurationResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nka1 extends ouk {
    public final ConfigurationResponse a;

    public nka1(ConfigurationResponse configurationResponse) {
        this.a = configurationResponse;
    }

    public final ConfigurationResponse a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nka1) && this.a.equals(((nka1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
