package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.appauthorization.sso.util.AfterLoginDummyActivity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class a1s0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c1s0 b;

    public /* synthetic */ a1s0(c1s0 c1s0Var, byte b) {
        this.a = b;
        this.b = c1s0Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        c1s0 c1s0Var = this.b;
        switch (b) {
            case 0:
                c1s0Var.getClass();
                int iOrdinal = ((h1s0) obj).ordinal();
                if (iOrdinal == 0) {
                    return Observable.just(Boolean.TRUE);
                }
                if (iOrdinal != 1) {
                    return iOrdinal != 2 ? Observable.empty() : Observable.error(new RuntimeException("Error getting session state"));
                }
                u0s0 u0s0Var = c1s0Var.c;
                nl51 nl51Var = u0s0Var.H1;
                dg30 dg30VarN0 = u0s0Var.N0();
                nl51Var.getClass();
                Context applicationContext = dg30VarN0.getApplicationContext();
                int i = AfterLoginDummyActivity.a;
                Intent intent = new Intent(applicationContext, (Class<?>) AfterLoginDummyActivity.class);
                intent.setAction("android.intent.action.VIEW");
                intent.addFlags(1082130432);
                intent.setData(null);
                u2f0 u2f0Var = (u2f0) nl51Var.b;
                u0s0Var.startActivityForResult(u2f0Var.b(1, (Uri) null) ? p5x0.d(dg30VarN0, 0) : u2f0Var.b.b(dg30VarN0, intent, false, (Uri) null, 0, false, false), 111);
                return Observable.empty();
            default:
                g1s0 g1s0Var = c1s0Var.a;
                boolean z = g1s0Var.c.b;
                g931 g931Var = g1s0Var.b;
                return z ? g931Var.q().flatMap(new f1s0(g1s0Var, (byte) 0)).flatMap(new pjq0(g1s0Var.a, (byte) 4)) : g931Var.q().flatMap(new f1s0(g1s0Var, (byte) 1));
        }
    }
}
