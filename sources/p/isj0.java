package p;

import android.view.View;
import com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class isj0 implements qzh {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TrackInfoView b;

    public /* synthetic */ isj0(TrackInfoView trackInfoView, byte b) {
        this.a = b;
        this.b = trackInfoView;
    }

    public final void f(Object obj) {
        byte b = this.a;
        TrackInfoView trackInfoView = this.b;
        switch (b) {
            case 0:
                trackInfoView.y((lof1) obj);
                break;
            default:
                trackInfoView.y((lof1) obj);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        return this.b;
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        TrackInfoView trackInfoView = this.b;
        switch (b) {
            case 0:
                trackInfoView.Y0 = iu30Var;
                break;
            default:
                trackInfoView.Y0 = iu30Var;
                break;
        }
    }
}
