package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xy40 {
    public final lzn0 a;

    public xy40(lzn0 lzn0Var) {
        this.a = lzn0Var;
    }

    public final jhm a(String str) {
        String strM = l1d.m("spotify:user:", Uri.encode(str));
        return new jhm("profile_go_to_profile", ttx.c, (fhm) null, 2131959447, (String) null, false, (tm81) null, new ihm(ahm.c, new ghm(vc40.W0, new ry40(strM, (byte) 1)), new zf10(this, strM, (byte) 29)), 244);
    }
}
