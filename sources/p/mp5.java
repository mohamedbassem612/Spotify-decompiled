package p;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.car.app.IAppHost;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class mp5 implements pw60, Function, e9d0, wlh0, akl, ts40 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mp5(int i, pa61 pa61Var, Bundle bundle) {
        this.a = (byte) 5;
        this.b = i;
        this.c = pa61Var;
    }

    public void a(rlh0 rlh0Var) {
        byte b = this.a;
        l5u l5uVar = l5u.a;
        Object obj = this.c;
        int i = this.b;
        switch (b) {
            case 3:
                b380 b380Var = (b380) obj;
                if (rlh0Var.p()) {
                    bg11 bg11Var = rlh0Var.t;
                    bg11 bg11Var2 = rlh0Var.u;
                    rlh0Var.s = b380.p(b380Var);
                    bg11 bg11VarE = rlh0.E(b380Var, rlh0Var.r, rlh0Var.v, rlh0Var.y, rlh0Var.H);
                    rlh0Var.t = bg11VarE;
                    rlh0Var.u = rlh0.D(bg11VarE, rlh0Var.r, rlh0Var.H, rlh0Var.v, rlh0Var.y, rlh0Var.o());
                    bg11 bg11Var3 = rlh0Var.t;
                    bg11Var3.getClass();
                    boolean zJ = z1p1.j(bg11Var3, bg11Var);
                    bg11 bg11Var4 = rlh0Var.u;
                    bg11Var4.getClass();
                    z1p1.j(bg11Var4, bg11Var2);
                    tkh0 tkh0Var = rlh0Var.a;
                    tkh0Var.getClass();
                    dm5.y(Looper.myLooper() == tkh0Var.e.getLooper());
                    skh0 skh0Var = tkh0Var.d;
                    skh0Var.getClass();
                    f280 f280VarJ = fc11.J(new ch61(-6));
                    if (!zJ) {
                        skh0Var.a();
                    }
                    f280VarJ.b(new z0d(rlh0Var, f280VarJ, i, (byte) 8), l5uVar);
                    break;
                }
                break;
            case 4:
                List list = (List) obj;
                if (rlh0Var.p()) {
                    bg11 bg11Var5 = rlh0Var.t;
                    bg11 bg11Var6 = rlh0Var.u;
                    rlh0Var.r = b380.p(list);
                    bg11 bg11VarE2 = rlh0.E(rlh0Var.s, list, rlh0Var.v, rlh0Var.y, rlh0Var.H);
                    rlh0Var.t = bg11VarE2;
                    rlh0Var.u = rlh0.D(bg11VarE2, list, rlh0Var.H, rlh0Var.v, rlh0Var.y, rlh0Var.o());
                    bg11 bg11Var7 = rlh0Var.t;
                    bg11Var7.getClass();
                    boolean zJ2 = z1p1.j(bg11Var7, bg11Var5);
                    bg11 bg11Var8 = rlh0Var.u;
                    bg11Var8.getClass();
                    z1p1.j(bg11Var8, bg11Var6);
                    tkh0 tkh0Var2 = rlh0Var.a;
                    tkh0Var2.getClass();
                    dm5.y(Looper.myLooper() == tkh0Var2.e.getLooper());
                    skh0 skh0Var2 = tkh0Var2.d;
                    skh0Var2.getClass();
                    f280 f280VarJ2 = fc11.J(new ch61(-6));
                    if (!zJ2) {
                        skh0Var2.a();
                    }
                    f280VarJ2.b(new z0d(rlh0Var, f280VarJ2, i, (byte) 8), l5uVar);
                    break;
                }
                break;
            default:
                pa61 pa61Var = (pa61) obj;
                tkh0 tkh0Var3 = rlh0Var.a;
                if (rlh0Var.p()) {
                    tkh0Var3.getClass();
                    dm5.y(Looper.myLooper() == tkh0Var3.e.getLooper());
                    f280 f280VarG = tkh0Var3.d.g(pa61Var);
                    f280VarG.b(new z0d(rlh0Var, f280VarG, i, (byte) 8), l5uVar);
                    break;
                }
                break;
        }
    }

    public void accept(Object obj) {
        s7c0 s7c0VarB;
        ixh0 ixh0Var = (ixh0) this.c;
        int i = this.b;
        try {
            s7c0VarB = (s7c0) ((n8d0) obj).get();
            dm5.s(s7c0VarB, "LibraryResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            oon1.I("Library operation failed", e);
            s7c0VarB = s7c0.b(-1);
        } catch (CancellationException e2) {
            oon1.I("Library operation cancelled", e2);
            s7c0VarB = s7c0.b(1);
        } catch (ExecutionException e3) {
            e = e3;
            oon1.I("Library operation failed", e);
            s7c0VarB = s7c0.b(-1);
        }
        try {
            hxh0 hxh0Var = ixh0Var.e;
            hxh0Var.getClass();
            hxh0Var.d(i, s7c0VarB);
        } catch (RemoteException e4) {
            oon1.I("Failed to send result to browser " + ixh0Var, e4);
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 1:
                return Long.valueOf(((Long) ((PlayerState) obj).position(((gu7) obj2).c.b()).e(0L)).longValue() + ((long) i));
            default:
                return oh61.c((z310) obj, ((mq5) obj2).d.intValue(), i);
        }
    }

    @Override // p.ts40
    public void b(us40 us40Var, ss40 ss40Var, long j) {
        mym0 mym0Var = (mym0) this.c;
        int i = this.b;
        x8r.a();
        rys rysVar = mym0Var.o;
        rysVar.getClass();
        x8h x8hVar = mym0Var.b;
        synchronized (rysVar) {
            try {
                dm5.y(zoi1.l(rysVar.f, i));
                qys qysVar = (qys) rysVar.f.get(i);
                dm5.y(!qysVar.b);
                dm5.z(!x8h.h(x8hVar), "HDR input is not supported.");
                x8h x8hVar2 = rysVar.l;
                if (x8hVar2 == null) {
                    rysVar.l = x8hVar;
                    x8hVar2 = x8hVar;
                }
                dm5.z(x8hVar2.equals(x8hVar), "Mixing different ColorInfos is not supported.");
                ype1 ype1Var = new ype1(ss40Var, j);
                rysVar.k.getClass();
                qysVar.a.add(new pys(us40Var, ype1Var, new eij1()));
                if (i == rysVar.o) {
                    rysVar.c();
                } else {
                    rysVar.d(qysVar);
                }
                rysVar.e.f(new mys(rysVar, (byte) 2), true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object d(IInterface iInterface) {
        ((IAppHost) iInterface).showToast((CharSequence) this.c, this.b);
        return null;
    }

    public void invoke(Object obj) {
        byte b = this.a;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 2:
                uz3 uz3Var = (uz3) obj;
                uz3Var.getClass();
                uz3Var.s((p8u0) obj2, i);
                break;
            default:
                ((o8u0) obj).C0(((uv81) obj2).v, i);
                break;
        }
    }

    public /* synthetic */ mp5(int i, bg11 bg11Var, byte b) {
        this.a = b;
        this.b = i;
        this.c = bg11Var;
    }

    public /* synthetic */ mp5(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ mp5(tz3 tz3Var, int i, p8u0 p8u0Var, p8u0 p8u0Var2) {
        this.a = (byte) 2;
        this.b = i;
        this.c = p8u0Var;
    }
}
