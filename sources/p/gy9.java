package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.pendragon.v1.proto.Background;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gy9 implements iu30 {
    @Override // p.iu30
    public final Object invoke(Object obj) {
        Background background = (Background) obj;
        int iN = background.n();
        int i = iN == 0 ? -1 : fy9.a[l1d.C(iN)];
        if (i == 1) {
            return new BackgroundColor.SolidBackgroundColor(ihc1.e1(background.q()).toString());
        }
        if (i != 2) {
            return i != 3 ? BackgroundColor.NotSet.INSTANCE : new BackgroundColor.ImageUrl(ihc1.e1(background.getImageUrl()).toString());
        }
        return new BackgroundColor.GradientBackgroundColor(ihc1.e1(background.p().q()).toString(), ihc1.e1(background.p().p()).toString(), background.p().o());
    }
}
