package p;

import spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto$QueueQueryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class sns0 {
    public static final ebz0 a(PermissionsEsperanto$QueueQueryResponse permissionsEsperanto$QueueQueryResponse) {
        int i = rns0.a[permissionsEsperanto$QueueQueryResponse.o().ordinal()];
        if (i == 1) {
            return new ebz0(true, new cbz0(1));
        }
        if (i == 2) {
            return new ebz0(true, new cbz0(2));
        }
        if (i == 3) {
            return new ebz0(false, new dbz0(1));
        }
        if (i == 4) {
            return new ebz0(false, new dbz0(2));
        }
        if (i == 5) {
            return new ebz0(false, new dbz0(3));
        }
        eg.o();
        return null;
    }
}
