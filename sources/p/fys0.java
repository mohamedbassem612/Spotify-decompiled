package p;

import android.net.Uri;
import com.spotify.profile.editprofile.imageutils.CroppingImageView;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class fys0 implements bh0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PictureSelectionActivity b;

    public /* synthetic */ fys0(PictureSelectionActivity pictureSelectionActivity, byte b) {
        this.a = b;
        this.b = pictureSelectionActivity;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity] */
    public final void a(Object obj) {
        Uri uri;
        byte b = this.a;
        ?? r2 = this.b;
        switch (b) {
            case 0:
                int i = PictureSelectionActivity.y1;
                r2.r1 = (Uri) obj;
                CroppingImageView croppingImageView = r2.l1;
                if (croppingImageView != null) {
                    croppingImageView.N0 = 0.0f;
                    croppingImageView.O0 = 0.0f;
                    croppingImageView.P0 = 0.0f;
                }
                r2.o0();
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i2 = PictureSelectionActivity.y1;
                if (zBooleanValue && (uri = r2.q1) != null) {
                    r2.r1 = uri;
                    CroppingImageView croppingImageView2 = r2.l1;
                    if (croppingImageView2 != null) {
                        croppingImageView2.N0 = 0.0f;
                        croppingImageView2.O0 = 0.0f;
                        croppingImageView2.P0 = 0.0f;
                    }
                    r2.o0();
                } else {
                    r2.setResult(0);
                    r2.finish();
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof bh0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof bh0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new tv30(1, this.b, PictureSelectionActivity.class, "onImageAcquired", "onImageAcquired(Landroid/net/Uri;)V", 0);
            default:
                return new tv30(1, this.b, PictureSelectionActivity.class, "onPictureTaken", "onPictureTaken(Z)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
