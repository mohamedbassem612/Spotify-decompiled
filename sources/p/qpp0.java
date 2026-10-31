package p;

import android.app.RemoteAction;
import android.companion.virtual.VirtualDeviceManager;
import android.content.Intent;
import android.graphics.Gainmap;
import android.view.autofill.AutofillManager;
import android.view.textclassifier.TextClassifier;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qpp0 implements hc10, bra, w0s0, Predicate, Function, BiFunction, BiPredicate {
    public final /* synthetic */ byte a;

    public static /* bridge */ /* synthetic */ RemoteAction d(Object obj) {
        return (RemoteAction) obj;
    }

    public static /* bridge */ /* synthetic */ VirtualDeviceManager e(Object obj) {
        return (VirtualDeviceManager) obj;
    }

    public static /* bridge */ /* synthetic */ Gainmap f(Object obj) {
        return (Gainmap) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillManager i(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassifier j(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return AutofillManager.class;
    }

    public static /* synthetic */ void l(int i, int i2, Object obj, String str) {
        throw new IllegalStateException(str + i + obj + i2);
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return VirtualDeviceManager.class;
    }

    public Object a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((c8c0) obj).getClass();
                ((izu0) obj2).getClass();
                return new ic3((byte) 6);
            case 1:
                ((sq21) obj).getClass();
                ((jq21) obj2).getClass();
                return new h8d0();
            case 2:
                ((c8c0) obj).getClass();
                ((izu0) obj2).getClass();
                return new ic3((byte) 7);
            default:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new uo7((byte) 4);
        }
    }

    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 12:
                return Observable.just(!((th61) obj).b ? h1s0.b : h1s0.a);
            case 18:
                i5w0 i5w0Var = (spq0) obj;
                return Boolean.valueOf(i5w0Var instanceof i5w0 ? "premium".equals(i5w0Var.a) : false);
            case 19:
                i5w0 i5w0Var2 = (spq0) obj;
                return Boolean.valueOf(i5w0Var2 instanceof i5w0 ? "premium".equals(i5w0Var2.a) : false);
            case 21:
                return new ota1();
            case 22:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(((th61) obj).b);
        }
    }

    public boolean b(int i, int i2, Intent intent) {
        return false;
    }

    @Override // p.hc10
    public ec10[] g() {
        return new ec10[]{new oyp0()};
    }

    public boolean test(Object obj, Object obj2) {
        v19 v19VarB = ((w19) obj).b();
        v19VarB.g = 0L;
        w19 w19VarA = v19VarB.a();
        v19 v19VarB2 = ((w19) obj2).b();
        v19VarB2.g = 0L;
        return w19VarA.equals(v19VarB2.a());
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 10:
                return ((h1s0) obj) == h1s0.a;
            default:
                th61 th61Var = (th61) obj;
                return (th61Var.c || th61Var.d) ? false : true;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 7:
            case 9:
                return Boolean.FALSE;
            case 8:
            default:
                return (PlayerState) obj;
        }
    }
}
