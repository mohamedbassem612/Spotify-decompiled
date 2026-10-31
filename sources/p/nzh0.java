package p;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.session.legacy.MediaConstants;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.RatingCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class nzh0 implements d0i0 {
    public final /* synthetic */ e0i0 a;
    public final /* synthetic */ MediaDescriptionCompat b;
    public final /* synthetic */ int c;

    public /* synthetic */ nzh0(e0i0 e0i0Var, MediaDescriptionCompat mediaDescriptionCompat, int i) {
        this.a = e0i0Var;
        this.b = mediaDescriptionCompat;
        this.c = i;
    }

    public final void a(ixh0 ixh0Var) {
        MediaDescriptionCompat mediaDescriptionCompat = this.b;
        if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
            oon1.H("onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i = yzb0.a;
        String mediaId = mediaDescriptionCompat.getMediaId();
        loh0 loh0Var = new loh0();
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        List list = Collections.EMPTY_LIST;
        w280 w280Var2 = b380.b;
        bg11 bg11Var2 = bg11.e;
        qoh0 qoh0Var = new qoh0();
        toh0 toh0Var = toh0.d;
        if (mediaId == null) {
            mediaId = "";
        }
        String str = mediaId;
        o3e0 o3e0Var = new o3e0();
        o3e0Var.b = mediaDescriptionCompat.getMediaUri();
        toh0 toh0Var2 = new toh0(o3e0Var);
        upq upqVar = new upq();
        upqVar.f = mediaDescriptionCompat.getSubtitle();
        upqVar.g = mediaDescriptionCompat.getDescription();
        upqVar.n = mediaDescriptionCompat.getIconUri();
        int i2 = 0;
        upqVar.i = yzb0.g(RatingCompat.newUnratedRating(0));
        byte[] iconBitmapData = mediaDescriptionCompat.getIconBitmapData();
        if (iconBitmapData != null) {
            upqVar.c(iconBitmapData, 3);
        }
        Bundle extras = mediaDescriptionCompat.getExtras();
        Bundle bundle = extras == null ? null : new Bundle(extras);
        if (bundle != null && bundle.containsKey(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)) {
            long j = bundle.getLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE);
            if (j != 0) {
                if (j == 1) {
                    i2 = 1;
                } else if (j == 2) {
                    i2 = 2;
                } else if (j == 3) {
                    i2 = 3;
                } else if (j == 4) {
                    i2 = 4;
                } else if (j == 5) {
                    i2 = 5;
                } else if (j == 6) {
                    i2 = 6;
                }
            }
            upqVar.q = Integer.valueOf(i2);
            bundle.remove(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE);
        }
        upqVar.r = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            upqVar.I = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey(MediaConstants.DESCRIPTION_EXTRAS_KEY_CUSTOM_BROWSER_ACTION_ID_LIST)) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList(MediaConstants.DESCRIPTION_EXTRAS_KEY_CUSTOM_BROWSER_ACTION_ID_LIST);
            stringArrayList.getClass();
            upqVar.K = b380.p(b380.p(stringArrayList));
        }
        if (bundle == null || !bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            upqVar.a = mediaDescriptionCompat.getTitle();
        } else {
            upqVar.a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            upqVar.e = mediaDescriptionCompat.getTitle();
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle != null && !bundle.isEmpty()) {
            upqVar.J = bundle;
        }
        upqVar.s = Boolean.TRUE;
        yoh0 yoh0Var = new yoh0(str, new noh0(loh0Var), null, new roh0(qoh0Var), new tqh0(upqVar), toh0Var2);
        e0i0 e0i0Var = this.a;
        n8d0 n8d0VarR = e0i0Var.d.r(ixh0Var, b380.t(yoh0Var));
        n8d0VarR.b(new nx30(n8d0VarR, new mgc(e0i0Var, ixh0Var, this.c), (byte) 24), new wkh0(e0i0Var, (byte) 4));
    }
}
