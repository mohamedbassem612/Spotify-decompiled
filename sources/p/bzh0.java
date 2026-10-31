package p;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bzh0 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ fzh0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzh0(fzh0 fzh0Var, Looper looper) {
        super(looper);
        this.c = fzh0Var;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = false;
        this.a = this.a && z;
        if (this.b && z2) {
            z3 = true;
        }
        this.b = z3;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        List list;
        jv81 jv81Var;
        int i;
        ixh0 ixh0Var;
        int iD;
        sqe1 sqe1Var;
        o3g1 o3g1Var;
        fzh0 fzh0Var = this.c;
        h2i0 h2i0Var = fzh0Var.g;
        boolean z = true;
        if (message.what != 1) {
            bhn0.r(message.what, "Invalid message what=");
            return;
        }
        jbu0 jbu0Var = fzh0Var.s;
        fzh0Var.C();
        sqe1 sqe1VarI1 = fzh0Var.t.i1();
        fzh0Var.C();
        jbu0 jbu0VarM = jbu0Var.m(sqe1VarI1, fzh0Var.t.g1(), fzh0Var.s.k);
        fzh0Var.s = jbu0VarM;
        boolean z2 = this.a;
        boolean z3 = this.b;
        jbu0 jbu0VarL1 = h2i0Var.l1(jbu0VarM);
        v1k v1kVar = h2i0Var.m;
        jbu0 jbu0VarK1 = h2i0Var.k1(jbu0VarL1);
        o3g1 o3g1Var2 = jbu0VarK1.F;
        sqe1 sqe1Var2 = jbu0VarK1.j;
        List listM = v1kVar.m();
        jv81 jv81Var2 = (y36) v1kVar.c;
        int i2 = 0;
        while (i2 < listM.size()) {
            ixh0 ixh0Var2 = (ixh0) listM.get(i2);
            try {
                if (v1kVar.u(ixh0Var2)) {
                    v1kVar.J();
                    q8l q8lVar = (q8l) jv81Var2.get(ixh0Var2);
                    q8lVar.getClass();
                    sqe1 sqe1Var3 = q8lVar.i;
                    v1kVar.J();
                    q8l q8lVar2 = (q8l) jv81Var2.get(ixh0Var2);
                    q8lVar2.getClass();
                    o3g1 o3g1Var3 = q8lVar2.j;
                    boolean z4 = (z2 && sqe1Var2.equals(sqe1Var3)) ? z : false;
                    boolean z5 = (z3 && o3g1Var2.equals(o3g1Var3)) ? z : false;
                    xen0 xen0VarQ = v1kVar.q(ixh0Var2);
                    if (xen0VarQ != null) {
                        iD = xen0VarQ.d();
                    } else if (!fzh0Var.n(ixh0Var2)) {
                        break;
                    } else {
                        iD = 0;
                    }
                    v1kVar.J();
                    v1kVar.J();
                    v1kVar.J();
                    q8l q8lVar3 = (q8l) jv81Var2.get(ixh0Var2);
                    m8u0 m8u0Var = q8lVar3 != null ? q8lVar3.e : null;
                    fzh0Var.C();
                    m8u0 m8u0VarD = bai0.d(m8u0Var, fzh0Var.t.n0());
                    list = listM;
                    try {
                        hxh0 hxh0Var = ixh0Var2.e;
                        hxh0Var.getClass();
                        z2 = z2;
                        ixh0Var = ixh0Var2;
                        boolean z6 = z4;
                        fzh0Var = fzh0Var;
                        jv81Var = jv81Var2;
                        int i3 = iD;
                        i = i2;
                        try {
                            hxh0Var.i(i3, jbu0VarK1, m8u0VarD, z6, z5);
                            if (!z6) {
                                sqe1Var = sqe1Var2;
                            }
                            if (z5) {
                                sqe1Var = sqe1Var3;
                                o3g1Var = o3g1Var3;
                            } else {
                                sqe1Var = sqe1Var3;
                                o3g1Var = o3g1Var2;
                            }
                            v1kVar.J();
                            q8l q8lVar4 = (q8l) jv81Var.get(ixh0Var);
                            q8lVar4.getClass();
                            q8lVar4.i = sqe1Var;
                            q8lVar4.j = o3g1Var;
                        } catch (DeadObjectException unused) {
                            h2i0Var.m.D(ixh0Var);
                        } catch (RemoteException e) {
                            e = e;
                            oon1.I("Exception in " + ixh0Var, e);
                        }
                    } catch (DeadObjectException unused2) {
                        jv81Var = jv81Var2;
                        i = i2;
                        ixh0Var = ixh0Var2;
                        h2i0Var.m.D(ixh0Var);
                        i2 = i + 1;
                        z2 = z2;
                        jv81Var2 = jv81Var;
                        listM = list;
                        fzh0Var = fzh0Var;
                        z = true;
                    } catch (RemoteException e2) {
                        e = e2;
                        jv81Var = jv81Var2;
                        i = i2;
                        ixh0Var = ixh0Var2;
                        oon1.I("Exception in " + ixh0Var, e);
                        i2 = i + 1;
                        z2 = z2;
                        jv81Var2 = jv81Var;
                        listM = list;
                        fzh0Var = fzh0Var;
                        z = true;
                    }
                } else {
                    fzh0Var = fzh0Var;
                    z2 = z2;
                    list = listM;
                    jv81Var = jv81Var2;
                    i = i2;
                }
            } catch (DeadObjectException unused3) {
                list = listM;
            } catch (RemoteException e3) {
                e = e3;
                list = listM;
            }
            i2 = i + 1;
            z2 = z2;
            jv81Var2 = jv81Var;
            listM = list;
            fzh0Var = fzh0Var;
            z = true;
        }
        boolean z7 = z;
        this.a = z7;
        this.b = z7;
    }
}
