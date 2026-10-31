package p;

import com.spotify.pses.v1.proto.ConfigurationResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hka1 extends ouk {
    public final ConfigurationResponse a;

    public hka1(ConfigurationResponse configurationResponse) {
        this.a = configurationResponse;
    }

    @Override // p.ouk
    public final ConfigurationResponse a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hka1) && this.a.equals(((hka1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
