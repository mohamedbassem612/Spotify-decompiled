package p;

import android.net.Uri;
import android.view.View;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ttf1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ utf1 b;

    public ttf1(utf1 utf1Var, String str) {
        this.a = (byte) 0;
        this.b = utf1Var;
    }

    public final void accept(Object obj) {
        Single singleFlatMap;
        byte b = this.a;
        byte b2 = 1;
        utf1 utf1Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    utf1Var.n.a(new ObservableFromPublisher(utf1Var.f).filter(dj20.T0).filter(new hdn1(utf1Var.a.a, (byte) 5)).filter(xj20.U0).map(yj20.S0).filter(zj20.R0).map(ak20.R0).filter(bk20.T0).take(1L).observeOn(utf1Var.i).firstElement().subscribe(new ttf1(utf1Var, b2), new ttf1(utf1Var, (byte) 2)));
                }
                break;
            case 1:
                ContextTrack contextTrack = (ContextTrack) obj;
                contextTrack.uri();
                boolean zJ = u890.j(contextTrack.uri(), utf1Var.c);
                kt91 kt91Var = utf1Var.d;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959380});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", 2131959380, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                if (!zJ) {
                    if (kt91Var.g()) {
                        kt91Var.k(er91Var);
                    } else {
                        kt91Var.o(er91Var);
                    }
                    bnj0 bnj0Var = utf1Var.h;
                    String str = utf1Var.a.a;
                    i8h1 i8h1Var = (i8h1) bnj0Var.b;
                    opl0 opl0Var = (opl0) bnj0Var.c;
                    x6h1 x6h1VarC = opl0Var.c.c();
                    x6h1VarC.i.add(new a7h1("playback_error_snackbar", (String) null, (Integer) null, str, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = opl0Var.b;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                } else {
                    utf1Var.k.c();
                }
                break;
            case 2:
                utf1Var.j.a();
                break;
            case 3:
                String str2 = utf1Var.c;
                Uri uri = utf1Var.e;
                String str3 = utf1Var.b;
                vku vkuVar = utf1Var.n;
                r3q0 r3q0Var = utf1Var.m;
                if (r3q0Var.f) {
                    singleFlatMap = Single.just(Boolean.FALSE);
                } else {
                    r3q0Var.f = true;
                    singleFlatMap = yoi1.i(r3q0Var.a.q(str3), o6x.a).firstOrError().flatMap(new poj0(r3q0Var, str2, str3, uri, (byte) 20));
                }
                vkuVar.a(singleFlatMap.doOnSuccess(new jkt0((byte) 9)).subscribe(new ttf1(utf1Var, str2), iqa1.T0));
                utf1Var.l.O0().remove("share_id");
                break;
            case 4:
                tm30 tm30Var = utf1Var.j;
                ie70 ie70Var = tm30Var.a;
                ie70Var.c((re70) obj);
                ie70Var.a(tm30Var.d);
                tm30Var.d = null;
                break;
            default:
                utf1Var.j.a();
                break;
        }
    }

    public /* synthetic */ ttf1(utf1 utf1Var, byte b) {
        this.a = b;
        this.b = utf1Var;
    }
}
