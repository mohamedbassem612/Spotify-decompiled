package p;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ni implements Runnable {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public ni(c8n1 c8n1Var, n9n1 n9n1Var) {
        this.a = (byte) 3;
        Objects.requireNonNull(c8n1Var);
        this.c = c8n1Var;
        this.b = n9n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.a) {
            case 0:
                oi oiVar = (oi) this.c;
                if (((View) oiVar.d) == null) {
                    return;
                }
                Rect rect = new Rect();
                ((ViewGroup) oiVar.c).getHitRect(rect);
                int iY = a8o.y(24.0f, ((View) oiVar.d).getResources());
                rect.top = 0;
                rect.left -= iY;
                rect.bottom += iY;
                rect.right += iY;
                ((View) this.b).setTouchDelegate(new TouchDelegate(rect, (View) oiVar.d));
                return;
            case 1:
                Rect rect2 = new Rect();
                kr81 kr81Var = (kr81) this.b;
                kr81.a(kr81Var).getHitRect(rect2);
                int dimensionPixelSize = ((Context) this.c).getResources().getDimensionPixelSize(2131167033);
                rect2.right += dimensionPixelSize;
                rect2.bottom += dimensionPixelSize;
                TouchDelegate touchDelegate = new TouchDelegate(rect2, kr81.a(kr81Var));
                if (View.class.isInstance(kr81.a(kr81Var).getParent())) {
                    ((View) kr81.a(kr81Var).getParent()).setTouchDelegate(touchDelegate);
                    return;
                }
                return;
            case 2:
                Future future = (n8d0) this.b;
                boolean zIsCancelled = future.isCancelled();
                ohd ohdVar = (ohd) this.c;
                if (zIsCancelled) {
                    ezn1.l(ohdVar);
                    return;
                }
                try {
                    Future future2 = future;
                    while (true) {
                        try {
                            Object obj = future2.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            ohdVar.resumeWith(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    ohdVar.resumeWith(new m231(cause));
                    return;
                }
                break;
            case 3:
                c8n1 c8n1Var = (c8n1) this.c;
                if (c8n1Var.b) {
                    n9n1 n9n1Var = (n9n1) this.b;
                    lal lalVarB = n9n1Var.b();
                    if (lalVarB.b != 0 && lalVarB.c != null) {
                        bac0 bac0Var = c8n1Var.a;
                        Activity activityA = c8n1Var.a();
                        PendingIntent pendingIntent = lalVarB.c;
                        zod.s(pendingIntent);
                        int iA = n9n1Var.a();
                        int i = GoogleApiActivity.b;
                        Intent intent = new Intent(activityA, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", iA);
                        intent.putExtra("notify_manager", false);
                        bac0Var.startActivityForResult(intent, 1);
                        return;
                    }
                    Activity activityA2 = c8n1Var.a();
                    int i2 = lalVarB.b;
                    lz40 lz40Var = c8n1Var.e;
                    if (lz40Var.a(i2, activityA2, (String) null) != null) {
                        lz40Var.g(c8n1Var.a(), c8n1Var.a, lalVarB.b, c8n1Var);
                        return;
                    }
                    if (lalVarB.b != 18) {
                        int iA2 = n9n1Var.a();
                        c8n1Var.c.set(null);
                        c8n1Var.g.h(lalVarB, iA2);
                        return;
                    }
                    Activity activityA3 = c8n1Var.a();
                    ProgressBar progressBar = new ProgressBar(activityA3, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activityA3);
                    builder.setView(progressBar);
                    builder.setMessage(x8n1.c(activityA3, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog alertDialogCreate = builder.create();
                    lz40.j(activityA3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", c8n1Var);
                    Context applicationContext = c8n1Var.a().getApplicationContext();
                    a6n1 a6n1Var = new a6n1(this, alertDialogCreate);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    BroadcastReceiver k8n1Var = new k8n1(a6n1Var);
                    x74.h0(applicationContext, k8n1Var, intentFilter);
                    ((k8n1) k8n1Var).a = applicationContext;
                    if (h450.h(applicationContext)) {
                        return;
                    }
                    c8n1 c8n1Var2 = (c8n1) this.c;
                    c8n1Var2.c.set(null);
                    jim0 jim0Var = c8n1Var2.g.N0;
                    jim0Var.sendMessage(jim0Var.obtainMessage(3));
                    if (alertDialogCreate.isShowing()) {
                        alertDialogCreate.dismiss();
                    }
                    synchronized (k8n1Var) {
                        try {
                            Context context = ((k8n1) k8n1Var).a;
                            if (context != null) {
                                context.unregisterReceiver(k8n1Var);
                            }
                            ((k8n1) k8n1Var).a = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            case 4:
                Context context2 = (Context) this.b;
                bsd1 bsd1Var = (bsd1) this.c;
                try {
                    f8o.a(context2);
                    bsd1Var.b((Object) null);
                    return;
                } catch (Exception e2) {
                    bsd1Var.a(e2);
                    return;
                }
            case 5:
                ((fsn1) this.b).d1((dwh0) this.c);
                return;
            case 6:
                boolean z2 = ((Task) this.b).d;
                pxn1 pxn1Var = (pxn1) this.c;
                if (z2) {
                    pxn1Var.d.s();
                    return;
                }
                try {
                    ((pxn1) this.c).d.r(pxn1Var.c.d((Task) this.b));
                    return;
                } catch (Exception e3) {
                    ((pxn1) this.c).d.q(e3);
                    return;
                } catch (RuntimeExecutionException e4) {
                    boolean z3 = e4.getCause() instanceof Exception;
                    hfp1 hfp1Var = ((pxn1) this.c).d;
                    if (z3) {
                        hfp1Var.q((Exception) e4.getCause());
                        return;
                    } else {
                        hfp1Var.q(e4);
                        return;
                    }
                }
            case 7:
                pxn1 pxn1Var2 = (pxn1) this.c;
                hfp1 hfp1Var2 = pxn1Var2.d;
                try {
                    Task task = (Task) pxn1Var2.c.d((Task) this.b);
                    if (task == null) {
                        pxn1Var2.i(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    m5u m5uVar = dsd1.b;
                    task.d(m5uVar, pxn1Var2);
                    task.c(m5uVar, pxn1Var2);
                    task.a(m5uVar, pxn1Var2);
                    return;
                } catch (Exception e5) {
                    hfp1Var2.q(e5);
                    return;
                } catch (RuntimeExecutionException e6) {
                    if (e6.getCause() instanceof Exception) {
                        hfp1Var2.q((Exception) e6.getCause());
                        return;
                    } else {
                        hfp1Var2.q(e6);
                        return;
                    }
                }
            case 8:
                synchronized (((afo1) this.c).c) {
                    ((i2q0) ((afo1) this.c).d).onComplete((Task) this.b);
                    break;
                }
                return;
            case 9:
                synchronized (((afo1) this.c).c) {
                    d5q0 d5q0Var = (d5q0) ((afo1) this.c).d;
                    Exception excF = ((Task) this.b).f();
                    zod.s(excF);
                    d5q0Var.i(excF);
                    break;
                }
                return;
            case 10:
                synchronized (((afo1) this.c).c) {
                    ((h8q0) ((afo1) this.c).d).onSuccess(((Task) this.b).g());
                    break;
                }
                return;
            case 11:
                afo1 afo1Var = (afo1) this.c;
                hfp1 hfp1Var3 = (hfp1) afo1Var.d;
                try {
                    hfp1 hfp1VarE = ((fsc1) afo1Var.c).e(((Task) this.b).g());
                    m5u m5uVar2 = dsd1.b;
                    hfp1VarE.d(m5uVar2, afo1Var);
                    hfp1VarE.c(m5uVar2, afo1Var);
                    hfp1VarE.a(m5uVar2, afo1Var);
                    return;
                } catch (CancellationException unused2) {
                    afo1Var.c();
                    return;
                } catch (Exception e7) {
                    hfp1Var3.q(e7);
                    return;
                } catch (RuntimeExecutionException e8) {
                    if (e8.getCause() instanceof Exception) {
                        afo1Var.i((Exception) e8.getCause());
                        return;
                    } else {
                        hfp1Var3.q(e8);
                        return;
                    }
                }
            default:
                hfp1 hfp1Var4 = (hfp1) this.b;
                try {
                    hfp1Var4.r(((Callable) this.c).call());
                    return;
                } catch (Exception e9) {
                    hfp1Var4.q(e9);
                    return;
                } catch (Throwable th3) {
                    hfp1Var4.q(new RuntimeException(th3));
                    return;
                }
        }
    }

    public /* synthetic */ ni(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ ni(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}
