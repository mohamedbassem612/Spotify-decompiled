package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import p.cd80;
import p.eg;
import p.krw0;
import p.u7n0;
import p.uo5;
import p.v9c0;
import p.w9c0;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lp/cd80;", "Lp/iac0;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class ProcessLifecycleInitializer implements cd80 {
    @Override // p.cd80
    public final Object create(Context context) {
        if (!((HashSet) uo5.F(context).c).contains(ProcessLifecycleInitializer.class)) {
            eg.m("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!w9c0.a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new v9c0());
        }
        krw0 krw0Var = krw0.i;
        u7n0.y(context);
        return u7n0.w();
    }

    @Override // p.cd80
    public final List dependencies() {
        return z6x.a;
    }
}
