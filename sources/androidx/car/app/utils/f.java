package androidx.car.app.utils;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.HostException;
import androidx.car.app.IOnDoneCallback;
import p.a421;
import p.b5q0;
import p.f4i1;
import p.k65;
import p.m2d;
import p.sge1;
import p.tcc;
import p.vqh0;
import p.x8a0;
import p.x8c0;
import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class f {
    public static IOnDoneCallback a() {
        final b5q0 b5q0Var = null;
        return new IOnDoneCallback.Stub(b5q0Var) { // from class: androidx.car.app.utils.RemoteUtils$1
            final /* synthetic */ b5q0 val$callback;

            @Override // androidx.car.app.IOnDoneCallback
            public int getInterfaceVersion() {
                return 1;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onFailure(tcc tccVar) {
                throw null;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onSuccess(tcc tccVar) {
                throw null;
            }
        };
    }

    public static void b(IOnDoneCallback iOnDoneCallback, String str, z321 z321Var) {
        sge1.b(new vqh0((Object) iOnDoneCallback, (Object) str, (Object) z321Var, (byte) 11));
    }

    public static void c(x8c0 x8c0Var, IOnDoneCallback iOnDoneCallback, String str, z321 z321Var) {
        sge1.b(new m2d((Object) x8c0Var, (Object) iOnDoneCallback, (Object) str, (Object) z321Var, (byte) 22));
    }

    public static Object d(String str, a421 a421Var) {
        try {
            Log.isLoggable("CarApp", 3);
            return a421Var.call();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new HostException(f4i1.f("Remote ", str, " call failed"), e2);
        }
    }

    public static void e(IOnDoneCallback iOnDoneCallback, Exception exc, String str) {
        try {
            d(f4i1.e(str, " onFailure"), new x8a0(iOnDoneCallback, exc, str));
        } catch (RemoteException unused) {
        }
    }

    public static void f(IOnDoneCallback iOnDoneCallback, String str, Object obj) {
        try {
            d(str.concat(" onSuccess"), new k65(iOnDoneCallback, obj, str, (byte) 19));
        } catch (RemoteException unused) {
        }
    }
}
