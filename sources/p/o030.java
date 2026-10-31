package p;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o030 implements it80 {
    public final /* synthetic */ byte a;
    public final sbi1 b;
    public final gdx0 c;

    public /* synthetic */ o030(sbi1 sbi1Var, gdx0 gdx0Var, byte b) {
        this.a = b;
        this.b = sbi1Var;
        this.c = gdx0Var;
    }

    public final void a(ajq0 ajq0Var) {
        byte b = this.a;
        gdx0 gdx0Var = this.c;
        switch (b) {
            case 0:
                if (gdx0Var.a.a()) {
                    wmo1.q(ajq0Var, new ebu(czu0.g, (byte) 8), "Folder via account ID with social handle", new ew0(this, (lnm) null, (byte) 23));
                    break;
                }
                break;
            default:
                blc0 blc0Var = blc0.fe;
                ybx0 ybx0Var = ybx0.b;
                ajq0Var.I(blc0Var, "Artist list in the profile feature", m6r0.class, new aod(rbx0.class, ybx0Var, (byte) 18));
                ajq0Var.K(blc0.se, "Users following list", vbx0.b);
                ajq0Var.I(blc0.ge, "Blocked list in the profile feature", m6r0.class, new aod(rbx0.class, ybx0Var, (byte) 18));
                ajq0Var.I(blc0.re, "Followers list in the profile feature", m6r0.class, new aod(rbx0.class, ybx0Var, (byte) 18));
                ajq0Var.K(blc0.ue, "Friends list in the profile feature", wbx0.b);
                ajq0Var.I(blc0.xe, "Public playlist list in the profile feature", m6r0.class, new aod(rbx0.class, ybx0Var, (byte) 18));
                if (gdx0Var.a.a()) {
                    b(ajq0Var, hji1.f, "Playlist overview via account ID with social handle", "playlists", false, k1x0.N0);
                    b(ajq0Var, bji1.f, "Artists via account ID with social handle", "artists", false, k1x0.O0);
                    b(ajq0Var, cji1.f, "Blocked list via account ID with social handle", "blocked", true, k1x0.P0);
                    b(ajq0Var, dji1.f, "Followers via account ID with social handle", "followers", false, k1x0.Q0);
                    b(ajq0Var, eji1.f, "Following via account ID with social handle", "following", false, k1x0.R0);
                    b(ajq0Var, fji1.f, "Friends list via account ID with social handle", "friends", true, k1x0.S0);
                }
                break;
        }
    }

    public void b(ajq0 ajq0Var, b3i1 b3i1Var, String str, String str2, boolean z, iu30 iu30Var) {
        wmo1.q(ajq0Var, new ebu(b3i1Var, (byte) 8), str, new xbx0(iu30Var, this, z, str2, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, String str2, String str3, s4b1 s4b1Var, Bundle bundle, onm onmVar) {
        n030 n030Var;
        if (onmVar instanceof n030) {
            n030Var = (n030) onmVar;
            int i = n030Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                n030Var.f = i - Integer.MIN_VALUE;
            } else {
                n030Var = new n030(this, onmVar);
            }
        } else {
            n030Var = new n030(this, onmVar);
        }
        Object objB = n030Var.d;
        int i2 = n030Var.f;
        if (i2 == 0) {
            hm5.M(objB);
            n030Var.a = str2;
            n030Var.b = s4b1Var;
            n030Var.c = bundle;
            n030Var.f = 1;
            objB = this.b.b(str, str3, n030Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bundle = n030Var.c;
            s4b1Var = n030Var.b;
            str2 = n030Var.a;
            hm5.M(objB);
        }
        String str4 = (String) objB;
        if (str4 == null) {
            String strD = s4b1Var.D();
            return strD != null ? new hrn0(hkh1.class, new kkh1(strD, bundle), ikh1.a) : crn0.a;
        }
        Set set = s4b1.f;
        return new ern0(uic.x("spotify:user:" + str4 + ":folder:" + str2));
    }
}
