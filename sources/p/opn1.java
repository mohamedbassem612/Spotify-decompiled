package p;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class opn1 extends jim0 {
    public final /* synthetic */ xaa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opn1(xaa xaaVar, Looper looper) {
        super(looper, (byte) 6);
        this.b = xaaVar;
    }

    public final void handleMessage(Message message) {
        Boolean bool;
        san1 san1Var;
        xaa xaaVar = this.b;
        int i = xaaVar.x.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (san1Var = (san1) message.obj) != null) {
                synchronized (san1Var) {
                    san1Var.a = null;
                }
                xaa xaaVar2 = san1Var.c;
                synchronized (xaaVar2.l) {
                    xaaVar2.l.remove(san1Var);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !xaaVar.v()) {
            san1 san1Var2 = (san1) message.obj;
            if (san1Var2 != null) {
                synchronized (san1Var2) {
                    san1Var2.a = null;
                }
                xaa xaaVar3 = san1Var2.c;
                synchronized (xaaVar3.l) {
                    xaaVar3.l.remove(san1Var2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            xaaVar.Q(new lal(message.arg2, null, null));
            if (xaaVar.K() && !xaaVar.R()) {
                xaaVar.H(3);
                return;
            }
            lal lalVarP = xaaVar.P() != null ? xaaVar.P() : new lal(8, null, null);
            xaaVar.j.g(lalVarP);
            xaaVar.w(lalVarP);
            return;
        }
        if (i4 == 5) {
            lal lalVarP2 = xaaVar.P() != null ? xaaVar.P() : new lal(8, null, null);
            xaaVar.j.g(lalVarP2);
            xaaVar.w(lalVarP2);
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            lal lalVar = new lal(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            xaaVar.j.g(lalVar);
            xaaVar.w(lalVar);
            return;
        }
        if (i4 == 6) {
            xaaVar.H(5);
            if (xaaVar.N() != null) {
                ((nz40) xaaVar.N().b).B0(message.arg2);
            }
            xaaVar.x();
            xaaVar.I(5, 1, (IInterface) null);
            return;
        }
        if (i4 == 2 && !xaaVar.u()) {
            san1 san1Var3 = (san1) message.obj;
            if (san1Var3 != null) {
                synchronized (san1Var3) {
                    san1Var3.a = null;
                }
                xaa xaaVar4 = san1Var3.c;
                synchronized (xaaVar4.l) {
                    xaaVar4.l.remove(san1Var3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            new StringBuilder(String.valueOf(i5).length() + 34);
            new Exception();
            return;
        }
        san1 san1Var4 = (san1) message.obj;
        synchronized (san1Var4) {
            try {
                bool = san1Var4.a;
                if (san1Var4.b) {
                    new StringBuilder(san1Var4.toString().length() + 47);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            xaa xaaVar5 = san1Var4.f;
            int i6 = san1Var4.d;
            if (i6 != 0) {
                xaaVar5.H(1);
                Bundle bundle = san1Var4.e;
                san1Var4.b(new lal(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!san1Var4.a()) {
                xaaVar5.H(1);
                san1Var4.b(new lal(8, null, null));
            }
        }
        synchronized (san1Var4) {
            san1Var4.b = true;
        }
        synchronized (san1Var4) {
            san1Var4.a = null;
        }
        xaa xaaVar6 = san1Var4.c;
        synchronized (xaaVar6.l) {
            xaaVar6.l.remove(san1Var4);
        }
    }
}
