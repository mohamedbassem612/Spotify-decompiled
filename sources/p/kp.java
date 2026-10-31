package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kp implements wu30 {
    public final /* synthetic */ ep a;
    public final /* synthetic */ AccountSelectionActivity b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xfx d;
    public final /* synthetic */ fp e;

    public kp(ep epVar, AccountSelectionActivity accountSelectionActivity, boolean z, xfx xfxVar, fp fpVar) {
        this.a = epVar;
        this.b = accountSelectionActivity;
        this.c = z;
        this.d = xfxVar;
        this.e = fpVar;
    }

    public final Object apply(Object obj) {
        List list = (List) obj;
        list.getClass();
        AccountSelectionActivity accountSelectionActivity = this.b;
        Bundle extras = accountSelectionActivity.getIntent().getExtras();
        Intent intent = extras != null ? (Intent) extras.getParcelable("key_source_intent") : null;
        if (intent == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        hp hpVar = new hp(list, intent, oun0.a, null, false, this.c, false);
        ep epVar = this.a;
        bza0 bza0Var = epVar.a;
        t3f0 t3f0Var = epVar.d;
        Context context = epVar.b;
        Scheduler scheduler = epVar.c;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.d(no.class, new tg(context, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.c(qo.class, new tg(t3f0Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(po.class, new so(bza0Var, context, (byte) 0));
        subtypeEffectHandlerBuilderC.g(oo.class, new ro(bza0Var, (byte) 0));
        return new ip(new pp(this.d.c, (byte) 0), Mobius.b(Mobius.d(dp.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{epVar.e.a.map(rzs0.c), epVar.f.b.map(s321.c)})), hpVar, cp.a, MainThreadWorkRunner.a()), this.e, accountSelectionActivity);
    }
}
