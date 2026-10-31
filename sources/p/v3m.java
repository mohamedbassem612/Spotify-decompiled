package p;

import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v3m extends z3m {
    public final SearchConfiguration a;

    public v3m(SearchConfiguration searchConfiguration) {
        this.a = searchConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3m) && u890.j(this.a, ((v3m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
