package p;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.gms.tasks.Task;
import com.spotify.authentication.tokenexchangeapi.TokenExchangeException;
import com.spotify.interapp.service.IapException;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.File;
import java.io.InvalidObjectException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class f341 implements Function, a441, akl, Predicate, mnm, BiFunction {
    public final /* synthetic */ byte a;

    public static /* synthetic */ void b(int i, String str) throws InvalidObjectException {
        throw new InvalidObjectException(str + i + '.');
    }

    public ax51 a(jqd0 jqd0Var) {
        yw51 yw51VarF;
        yw51 yw51Var;
        yw51 yw51Var2;
        boolean z = false;
        switch (this.a) {
            case 7:
                a9a a9aVar = (a9a) jqd0Var.d;
                return new ax51(a9aVar.c(a9aVar.b), a9aVar.c(a9aVar.c), jqd0Var.q() == 1);
            case 8:
                a9a a9aVar2 = (a9a) jqd0Var.d;
                return dio1.t(new ax51(a9aVar2.c(a9aVar2.b), a9aVar2.c(a9aVar2.c), jqd0Var.q() == 1), jqd0Var);
            case 9:
                return dio1.n(jqd0Var, njx0.t);
            case 10:
                return dio1.n(jqd0Var, djx0.t);
            default:
                ax51 ax51Var = (ax51) jqd0Var.c;
                a9a a9aVar3 = (a9a) jqd0Var.d;
                if (ax51Var == null) {
                    return dio1.n(jqd0Var, njx0.t);
                }
                yw51 yw51Var3 = ax51Var.b;
                yw51 yw51Var4 = ax51Var.a;
                if (jqd0Var.b) {
                    yw51VarF = dio1.F(jqd0Var, a9aVar3, yw51Var4);
                    yw51Var2 = yw51Var3;
                    yw51Var3 = yw51Var4;
                    yw51Var = yw51VarF;
                } else {
                    yw51VarF = dio1.F(jqd0Var, a9aVar3, yw51Var3);
                    yw51Var = yw51Var4;
                    yw51Var2 = yw51VarF;
                }
                if (u890.j(yw51VarF, yw51Var3)) {
                    return ax51Var;
                }
                if (jqd0Var.q() == 1 || (jqd0Var.q() == 3 && yw51Var.b > yw51Var2.b)) {
                    z = true;
                }
                return dio1.t(new ax51(yw51Var, yw51Var2, z), jqd0Var);
        }
    }

    public void accept(Object obj) {
        ((l541) obj).b.release();
    }

    public Object apply(Object obj) throws TokenExchangeException {
        Object obj2;
        switch (this.a) {
            case 0:
                a1f1 a1f1Var = (b1f1) obj;
                if (a1f1Var instanceof a1f1) {
                    String str = a1f1Var.a.a;
                    if (!TextUtils.isEmpty(str)) {
                        Uri.Builder builderBuildUpon = Uri.parse("https://accounts.spotify.com/login/ott/v2").buildUpon();
                        builderBuildUpon.encodedFragment("token=".concat(str));
                        return builderBuildUpon.build();
                    }
                }
                if (!(a1f1Var instanceof z0f1)) {
                    throw new TokenExchangeException("Token exchange returned unexpected result: ".concat(a1f1Var.getClass().getSimpleName()));
                }
                z0f1 z0f1Var = (z0f1) a1f1Var;
                throw new TokenExchangeException(gvg.h("Token exchange failed: ", z0f1Var.getClass().getSimpleName(), " - ", z0f1Var.a()));
            case 1:
                return Boolean.valueOf(yto.j((String) obj));
            case 2:
                throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 16:
            case 22:
            case 24:
            default:
                return IapException.a(((Throwable) obj).getClass().getName());
            case 4:
                spq0 spq0Var = (spq0) obj;
                if (spq0Var.c()) {
                    return (String) spq0Var.b();
                }
                return null;
            case 15:
                return ((th61) obj).a;
            case 17:
                int i = kld.h;
                Boolean boolValueOf = Boolean.valueOf("premium".equals((String) obj));
                dq5 dq5Var = new dq5();
                dq5Var.b = boolValueOf;
                return dq5Var;
            case 18:
                return new zs5((PlayerState) obj);
            case 19:
                return cv5.a;
            case 20:
                Throwable th = (Throwable) obj;
                return th instanceof TimeoutException ? IapException.a("Failed to set Podcast playback speed.") : Observable.error(th);
            case 21:
                return spq0.d(LoggingParams.builder().interactionId(((ou80) obj).a).build());
            case 23:
                return spq0.d(LoggingParams.builder().interactionId(((ou80) obj).a).build());
            case 25:
                return (String) ((spq0) obj).b();
            case 26:
                Throwable th2 = (Throwable) obj;
                return th2 instanceof TimeoutException ? IapException.a("Unable to start radio") : Observable.error(th2);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                nmr0 nmr0Var = (nmr0) obj;
                Object obj3 = nmr0Var.a;
                if (obj3 == null || (obj2 = nmr0Var.b) == null) {
                    qq5.Companion.getClass();
                    return qq5.m;
                }
                PlayerState playerState = (PlayerState) obj3;
                playerState.getClass();
                return new qq5((iun0) obj2, playerState);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return spq0.d(LoggingParams.builder().interactionId(((ou80) obj).a).build());
        }
    }

    public Object d(Task task) {
        boolean z;
        if (task.j()) {
            vy8 vy8Var = (vy8) task.g();
            String str = vy8Var.b;
            Log.isLoggable("FirebaseCrashlytics", 3);
            File file = vy8Var.c;
            if (file.delete()) {
                file.getPath();
                Log.isLoggable("FirebaseCrashlytics", 3);
            } else {
                file.getPath();
            }
            z = true;
        } else {
            task.f();
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 13:
                return voo1.p((th61) obj);
            case 14:
                return ((th61) obj).b;
            default:
                return ((spq0) obj).c();
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new nmr0((spq0) obj, (PlayerState) obj2);
    }
}
