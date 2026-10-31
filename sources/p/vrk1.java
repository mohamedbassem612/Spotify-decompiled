package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.esperanto.proto.CommonMessages;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import io.reactivex.rxjava3.functions.Consumer;
import java.io.IOException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vrk1 implements Consumer {
    public final /* synthetic */ byte a;
    public static final vrk1 b = new vrk1(0);
    public static final vrk1 c = new vrk1(1);
    public static final vrk1 d = new vrk1(2);
    public static final vrk1 e = new vrk1(3);
    public static final vrk1 f = new vrk1(4);
    public static final vrk1 g = new vrk1(5);
    public static final vrk1 h = new vrk1(6);
    public static final vrk1 i = new vrk1(7);
    public static final vrk1 t = new vrk1(8);
    public static final vrk1 X = new vrk1(9);
    public static final vrk1 Y = new vrk1(10);

    public /* synthetic */ vrk1(byte b2) {
        this.a = b2;
    }

    public static String a(Throwable th) {
        Throwable cause;
        if (th == null) {
            return "null";
        }
        int i2 = 0;
        Throwable th2 = th;
        while (i2 < 10 && !(th2 instanceof CompositeException) && (cause = th2.getCause()) != null && cause != th2) {
            i2++;
            th2 = cause;
        }
        return th2 == th ? th.toString() : gvg.h(String.valueOf(th), " (root: ", String.valueOf(th2), ")");
    }

    public static void c(Throwable th) {
        Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
    }

    public final void accept(Object obj) {
        byte b2 = this.a;
        psh pshVar = psh.b;
        switch (b2) {
            case 0:
                CommonMessages.StatusResponse statusResponse = (CommonMessages.StatusResponse) obj;
                if (statusResponse.n() != pshVar) {
                    Logger.d("Set volume failure " + statusResponse.n(), new Object[0]);
                    return;
                }
                return;
            case 1:
                Throwable th = (Throwable) obj;
                Logger.e(th, l1d.m("Set volume failure: ", th.getMessage()), new Object[0]);
                return;
            case 2:
                CommonMessages.StatusResponse statusResponse2 = (CommonMessages.StatusResponse) obj;
                if (statusResponse2.n() != pshVar) {
                    Logger.d("Up volume failure " + statusResponse2.n(), new Object[0]);
                    return;
                }
                return;
            case 3:
                Throwable th2 = (Throwable) obj;
                Logger.e(th2, l1d.m("Up volume failure: ", th2.getMessage()), new Object[0]);
                return;
            case 4:
                return;
            case 5:
                Logger.e((Throwable) obj, "Couldn't update WazeBannerContent", new Object[0]);
                return;
            case 6:
                ((Throwable) obj).toString();
                return;
            case 7:
                Logger.e((Throwable) obj, "Could not obtain access token", new Object[0]);
                return;
            case 8:
                return;
            case 9:
                n57.g("Error in local files event source", (Throwable) obj);
                return;
            case 10:
                return;
            case 11:
                mm mmVar = (mm) obj;
                boolean z = mmVar.a;
                spq0 spq0Var = mmVar.c;
                spq0 spq0Var2 = mmVar.b;
                if (z && spq0Var2.c() && spq0Var.c()) {
                    e741 e741Var = (e741) spq0Var.b();
                    View view = (View) spq0Var2.b();
                    e741Var.i = view;
                    if (view != null) {
                        x4f1 x4f1Var = e741Var.d;
                        View viewInflate = LayoutInflater.from(e741Var.a).inflate(2131626089, (ViewGroup) null);
                        sus susVar = e741Var.e;
                        oh31 oh31Var = new oh31();
                        viewInflate.getClass();
                        oh31Var.h = viewInflate;
                        mus musVarB = sus.b(susVar, oh31Var);
                        ((Button) viewInflate.findViewById(2131430731)).setOnClickListener(new c741(e741Var, (byte) 0));
                        ((Button) viewInflate.findViewById(2131430728)).setOnClickListener(new c741(e741Var, (byte) 1));
                        x4f1.a(x4f1Var, musVarB, view, new d741(e741Var, (byte) 1), (g5f1) null, 44);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                Logger.e((Throwable) obj, "Failed to load Betamax configuration, keeping default", new Object[0]);
                return;
            case 13:
                throw td6.k(obj);
            case 14:
                return;
            case 15:
                return;
            case 16:
                throw td6.k(obj);
            case 17:
                UndeliverableException undeliverableException = (Throwable) obj;
                if (undeliverableException instanceof UndeliverableException) {
                    UndeliverableException undeliverableException2 = undeliverableException;
                    if (undeliverableException2.getCause() instanceof HttpException) {
                        return;
                    }
                    Throwable cause = undeliverableException2.getCause();
                    if ((cause instanceof IOException) || (cause instanceof InterruptedException)) {
                        return;
                    }
                    Logger.e(undeliverableException2, "UndeliverableException thrown", new Object[0]);
                    if (cause != null) {
                        Logger.b("UndeliverableException caused by %s", new Object[]{a(cause)});
                        return;
                    }
                    return;
                }
                if (undeliverableException instanceof CompositeException) {
                    c((CompositeException) undeliverableException);
                    return;
                }
                if (undeliverableException instanceof MissingBackpressureException) {
                    c((MissingBackpressureException) undeliverableException);
                    return;
                } else {
                    if (!(undeliverableException instanceof OnErrorNotImplementedException)) {
                        c(undeliverableException);
                        return;
                    }
                    OnErrorNotImplementedException onErrorNotImplementedException = (OnErrorNotImplementedException) undeliverableException;
                    Logger.b("Unwrapping OnErrorNotImplementedException: %s", new Object[]{a(onErrorNotImplementedException.getCause())});
                    c(onErrorNotImplementedException.getCause());
                    return;
                }
            case 18:
                Logger.d("Failed to receive Marquee response, error: %s", new Object[]{((xwg0) obj).c});
                return;
            case 19:
                Logger.b("Handling " + ((Object) null) + " has failed: " + ((Throwable) obj).getMessage(), new Object[0]);
                return;
            case 20:
                return;
            case 21:
                return;
            case 22:
                return;
            case 23:
                return;
            case 24:
                return;
            case 25:
                return;
            case 26:
                return;
            case 27:
                return;
            case 28:
                throw null;
            default:
                throw td6.k(obj);
        }
    }

    public /* synthetic */ vrk1(Object obj, byte b2) {
        this.a = b2;
    }
}
