package p;

import com.spotify.pendragon.v1.proto.BackgroundColor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rw9 implements iu30 {
    @Override // p.iu30
    public final Object invoke(Object obj) {
        BackgroundColor backgroundColor = (BackgroundColor) obj;
        int iO = backgroundColor.o();
        int i = iO == 0 ? -1 : qw9.a[l1d.C(iO)];
        if (i != 1) {
            return i != 2 ? com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor.NotSet.INSTANCE : new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor.GradientBackgroundColor(ihc1.e1(backgroundColor.q().r()).toString(), ihc1.e1(backgroundColor.q().q()).toString(), backgroundColor.q().p());
        }
        return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor.SolidBackgroundColor(ihc1.e1(backgroundColor.r()).toString());
    }
}
