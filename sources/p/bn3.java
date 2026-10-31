package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.allboarding.entrypoint.EntryPoint;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bn3 implements is31 {
    public final Context a;

    public Intent f(Intent intent) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        wzy wzyVar = EntryPoint.Companion;
        String strJ = s4b1VarX.j();
        wzyVar.getClass();
        EntryPoint entryPointA = wzy.a(strJ);
        int i = AllboardingActivity.l1;
        Context context = this.a;
        context.getClass();
        return x2g0.z(context, entryPointA);
    }
}
