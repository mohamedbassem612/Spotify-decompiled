package p;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dc21 implements ss80 {
    @Override // p.ss80
    public final smc0 a(Intent intent) {
        String path;
        smc0 smc0VarN = k4p1.n();
        Uri data = intent.getData();
        if (data != null && (path = data.getPath()) != null && path.length() != 0 && nhc1.R(path, "/", false)) {
            Uri.Builder builderBuildUpon = data.buildUpon();
            builderBuildUpon.path(ihc1.J0(path, "/"));
            Uri uriBuild = builderBuildUpon.build();
            uriBuild.getClass();
            smc0VarN.add(new us80(uriBuild));
        }
        return k4p1.k(smc0VarN);
    }
}
