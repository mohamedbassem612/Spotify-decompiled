package p;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class syy0 {
    public static final nl51 l;
    public final NoAnimLauncherActivity a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public Bitmap f;
    public mxa1 g;
    public String h;
    public boolean i;
    public boolean j;
    public zyh0 k;

    static {
        nl51 nl51Var = new nl51((byte) 26);
        nl51Var.b = new HashMap();
        l = nl51Var;
    }

    public syy0(NoAnimLauncherActivity noAnimLauncherActivity, int i, int i2, int i3, String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        this.j = false;
        this.b = i;
        this.c = i2;
        this.a = noAnimLauncherActivity;
        this.d = str;
        this.e = i3;
    }
}
