package p;

import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sm30 {
    public final kly0 a;
    public final fey b;
    public final boolean c;
    public final rm30 d;
    public final zfp0 e;

    public sm30(jly0 jly0Var, fey feyVar, boolean z, rm30 rm30Var, zfp0 zfp0Var) {
        jly0Var.getClass();
        this.a = jly0Var;
        this.b = feyVar;
        this.c = z;
        this.d = rm30Var;
        this.e = zfp0Var;
    }

    public final Observable a(String str) {
        String strE;
        if (!this.c) {
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(str);
            dm5.n(s4b1VarX.c == blc0.ti, "SpotifyLink needs to be of link type Track");
            Uri uri = Uri.parse("hm://track-entity-view/v2/track/".concat(s4b1VarX.h()));
            hny hnyVar = (hny) this.b.b;
            return new ObservableFromPublisher(yoi1.h(new x010(hnyVar.a.a, yoi1.g(hnyVar.b.d()), new xq0(3, hnyVar, hny.class, "composeQueryParams", "composeQueryParams(Ljava/util/Map;Z)Ljava/util/Map;", 4, (byte) 5), (byte) 1), o6x.a).J(new mev(hnyVar, uri))).flatMap(new nay(this, (byte) 20));
        }
        efe0 efe0Var = (efe0) this.a.get();
        if (Build.VERSION.SDK_INT >= 29) {
            strE = f4i1.e(efe0Var.b.getExternalFilesDir(null).getAbsolutePath(), "/hubs-live.json");
        } else {
            efe0Var.getClass();
            strE = f4i1.e(Environment.getExternalStorageDirectory().getPath(), "/hubs-live.json");
        }
        int i = Flowable.a;
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT = Flowable.G(1L, 1L, TimeUnit.SECONDS, Schedulers.b).W(efe0Var.a).J(new yjp1(strE, (byte) 12)).x(new mna0((byte) 21)).t(Functions.a);
        x8a0 x8a0Var = new x8a0(efe0Var, strE, (byte) 3);
        int i2 = Flowable.a;
        Flowable flowableA = flowableDistinctUntilChangedT.A(x8a0Var, i2, i2);
        return x0d.j(flowableA, flowableA);
    }
}
