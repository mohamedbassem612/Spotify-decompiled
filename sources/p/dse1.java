package p;

import com.spotify.highlightsstats.data.proto.timeline.view.v1.UserListeningStatus;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dse1 extends ese1 {
    public final UserListeningStatus a;

    public dse1(UserListeningStatus userListeningStatus) {
        this.a = userListeningStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dse1) && this.a.equals(((dse1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
