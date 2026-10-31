package p;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity;
import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uf0 implements xjh0, cv11 {
    public final Context a;

    public uf0(NoAnimLauncherActivity noAnimLauncherActivity) {
        this.a = noAnimLauncherActivity.getApplicationContext();
    }

    public t6g1 a(uv11 uv11Var, t6g1 t6g1Var) {
        q6g1 q6g1Var = t6g1Var instanceof q6g1 ? (q6g1) t6g1Var : null;
        if (q6g1Var != null) {
            bv11 bv11Var = q6g1Var.b;
            c380 c380VarC = jon1.C(this.a, uv11Var.a, bv11Var.x);
            if (!c380VarC.isEmpty()) {
                return new q6g1(q6g1Var.a, bv11.b(bv11Var, (po11) null, c380VarC, 62914559));
            }
        }
        return t6g1Var;
    }

    public jhm b(String str) {
        int i;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        int i2 = aqz0.a;
        v5b1 v5b1Var = s4b1VarX.d;
        b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
        if (type == nyu0.e || type == wyu0.f) {
            i = 2131954378;
        } else {
            int iOrdinal = s4b1VarX.c.ordinal();
            if (iOrdinal == 30) {
                i = 2131954374;
            } else if (iOrdinal == 44) {
                i = 2131954375;
            } else if (iOrdinal != 111) {
                i = iOrdinal != 926 ? 2131954380 : 2131954381;
            } else {
                i = 2131954377;
            }
        }
        return new jhm("radio_go_to_station", trx.c, (fhm) null, Integer.valueOf(i), (String) null, false, (tm81) null, new ihm(ahm.c, new ghm(vc40.X0, new ry40(str, (byte) 2)), new fz40(this, str, (byte) 0)), 244);
    }

    public Uri c(File file, String str) {
        try {
            return FileProvider.getUriForFile(this.a, str, file);
        } catch (IllegalArgumentException e) {
            e.getMessage();
            file.toString();
            return null;
        }
    }

    public yjh0 i(g2z g2zVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new mka((byte) 27).i(g2zVar);
        }
        int i2 = asj0.i(((ie30) g2zVar.c).p);
        oon1.A("Creating an asynchronous MediaCodec adapter for track type ".concat(zoi1.L(i2)));
        oi oiVar = new oi(new lj7(i2, (byte) 0), new lj7(i2, (byte) 1));
        oiVar.b = true;
        return oiVar.w(g2zVar);
    }
}
