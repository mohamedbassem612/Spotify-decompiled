package p;

import com.spotify.profile.profile.proto.ProfilemodelRequest$Profile;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k2x0 extends z2x0 {
    public final ProfilemodelRequest$Profile a;

    public k2x0(ProfilemodelRequest$Profile profilemodelRequest$Profile) {
        this.a = profilemodelRequest$Profile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2x0) && this.a.equals(((k2x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
