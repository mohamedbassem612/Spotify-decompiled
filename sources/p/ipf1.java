package p;

import android.view.View;
import com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ipf1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TrackInfoView b;

    public /* synthetic */ ipf1(TrackInfoView trackInfoView, byte b) {
        this.a = b;
        this.b = trackInfoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        TrackInfoView trackInfoView = this.b;
        switch (b) {
            case 0:
                trackInfoView.Y0.invoke(gof1.a);
                break;
            default:
                trackInfoView.Y0.invoke(gof1.b);
                break;
        }
    }
}
