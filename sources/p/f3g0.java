package p;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity;
import com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f3g0 implements awh0 {
    public final apr a;
    public final p7s b;
    public final jks c;
    public final j0l d;
    public final l6s e;
    public final q8n f;
    public c9n g;
    public final ComponentName h;
    public final ComponentName i;

    public f3g0(Context context, apr aprVar, p7s p7sVar, jks jksVar, j0l j0lVar, l6s l6sVar, q8n q8nVar) {
        this.a = aprVar;
        this.b = p7sVar;
        this.c = jksVar;
        this.d = j0lVar;
        this.e = l6sVar;
        this.f = q8nVar;
        this.g = cy30.t(q8nVar);
        this.h = new ComponentName(context, (Class<?>) OutputSwitcherJamLauncherActivity.class);
        this.i = new ComponentName(context, (Class<?>) OutputSwitcherPermissionNudgeActivity.class);
    }

    @Override // p.awh0
    public final void a() {
        smo1.q(this.g);
    }

    @Override // p.awh0
    public final void b() {
        this.g = qmo1.v(this.g, new tzf0(this, (byte) 7));
        cs31 cs31Var = new cs31((List) null, (ComponentName) null, Build.VERSION.SDK_INT >= 37 ? this.i : null, 11);
        p7s p7sVar = this.b;
        c921.y(p7sVar.c, (o8n) null, 0, new eum(cs31Var, p7sVar, (lnm) null, (byte) 22), 3);
        c921.y(this.g, (o8n) null, 0, new p6d0(this, (lnm) null, (byte) 26), 3);
    }
}
