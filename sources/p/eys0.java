package p;

import android.net.Uri;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eys0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PictureSelectionActivity b;

    public /* synthetic */ eys0(PictureSelectionActivity pictureSelectionActivity, byte b) {
        this.a = b;
        this.b = pictureSelectionActivity;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity] */
    public final void accept(Object obj) {
        byte b = this.a;
        ?? r1 = this.b;
        switch (b) {
            case 0:
                Uri uri = (Uri) obj;
                uri.getClass();
                int i = PictureSelectionActivity.y1;
                r1.s1 = uri;
                r1.q0();
                break;
            default:
                r1.setResult(0);
                r1.finish();
                break;
        }
    }
}
