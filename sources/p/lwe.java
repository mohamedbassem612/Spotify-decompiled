package p;

import android.animation.ObjectAnimator;
import android.view.View;
import android.webkit.CookieManager;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.Connection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lwe extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lwe(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0244  */
    /* JADX WARN: Code duplicated, block: B:108:0x024d  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    public final Object invoke() {
        int i = -1;
        byte b = 1;
        int i2 = 0;
        String str = null;
        switch (this.a) {
            case 0:
                nwe nweVar = (nwe) this.b;
                nweVar.d2 = true;
                d1c d1cVar = nweVar.c2;
                if (d1cVar == null) {
                    nweVar.r1(true);
                    fn31.T(cto1.q(nweVar), (o8n) null, 0, new awe(nweVar, str, b), 3);
                } else {
                    d1cVar.invoke();
                }
                i8h1 i8h1VarP1 = nweVar.p1();
                dsk0 dsk0Var = nweVar.Z1;
                dsk0Var.getClass();
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1VarP1.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                if (d1cVar != null && nweVar.e2) {
                    nweVar.dismiss();
                }
                return rih1.a;
            case 1:
                return new ovk0(new uvk0((String) ((cce) this.b).c));
            case 2:
                yaf yafVar = (yaf) this.b;
                kt91 kt91Var = yafVar.b;
                if (kt91Var.g()) {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131953309});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", 2131953309, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                yafVar.a.e();
                return rih1.a;
            case 3:
                tff tffVar = (tff) this.b;
                xid xidVar = tffVar.d;
                i8h1 i8h1Var = (i8h1) ((b2p) xidVar.b).get();
                x6h1 x6h1VarC2 = ((h7l0) xidVar.c).b.c();
                x6h1VarC2.i.add(new a7h1("exit_view_header", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                b7x b7xVar2 = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_hide", 1, b7xVar2), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                a1r0 a1r0Var = tffVar.i;
                if (a1r0Var.h(tffVar.a)) {
                    a1r0Var.g();
                } else {
                    tffVar.b.e();
                }
                return rih1.a;
            case 4:
                goe goeVar = ((ncf) this.b).a;
                List list = goeVar.f;
                if (goeVar.h.c >= 3) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((tom) it.next()).e) {
                            i = i2;
                            if (i > 0) {
                                tom tomVar = (tom) o7h.t0(i - 1, list);
                                str = tomVar != null ? tomVar.a : null;
                                if (str == null) {
                                    return str;
                                }
                            }
                        } else {
                            i2++;
                        }
                    }
                    if (i > 0) {
                        tom tomVar2 = (tom) o7h.t0(i - 1, list);
                        if (tomVar2 != null) {
                        }
                        if (str == null) {
                            return str;
                        }
                    }
                }
                return "";
            case 5:
                return ((njf) this.b).e.b.a.h() ? nik1.G2.a : nik1.F2.a;
            case 6:
                return pcf.d(6, ((ekf) this.b).c.a, (String) null);
            case 7:
                return gio1.b(Integer.valueOf(((fpf) this.b).b.l(fpf.i, 0)));
            case 8:
                ((zqf) this.b).invoke();
                return rih1.a;
            case 9:
                op71.q(((fzw) ((cce) this.b).c).b.a, (CancellationException) null);
                return rih1.a;
            case 10:
                return (qtf) ((ttf) this.b).c.get();
            case 11:
                return (i8h1) ((z1p) this.b).get();
            case 12:
                return new nu((m3g) this.b);
            case 13:
                return Boolean.valueOf(!((gag) this.b).n);
            case 14:
                vdg vdgVar = (vdg) this.b;
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(vdgVar.f, "level", 0, 10000);
                objectAnimatorOfInt.setDuration(3500L);
                objectAnimatorOfInt.setRepeatCount(-1);
                objectAnimatorOfInt.addUpdateListener(new kb5(vdgVar, (byte) 2));
                return objectAnimatorOfInt;
            case 15:
                tfg tfgVar = (tfg) this.b;
                iu30 iu30Var = tfgVar.O0;
                if (iu30Var != null) {
                    iu30Var.invoke(new rfg(tfg.y(tfgVar).b));
                }
                return rih1.a;
            case 16:
                vfg vfgVar = (vfg) this.b;
                iu30 iu30Var2 = vfgVar.O0;
                if (iu30Var2 != null) {
                    iu30Var2.invoke(new rfg(vfg.y(vfgVar).b));
                }
                return rih1.a;
            case 17:
                xjl xjlVar = (xjl) ((wo5) this.b).b;
                ReentrantReadWriteLock reentrantReadWriteLock = xjlVar.b;
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    lock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    xjlVar.a.clear();
                    while (i2 < readHoldCount) {
                        lock.lock();
                        i2++;
                    }
                    return rih1.a;
                } finally {
                    while (i2 < readHoldCount) {
                        lock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                iu30 iu30Var3 = ((ggg) this.b).O0;
                if (iu30Var3 != null) {
                    iu30Var3.invoke(egg.a);
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                w2n w2nVar = (w2n) ((wo5) this.b).b;
                w2nVar.getClass();
                w2nVar.a.a(new j3m((Object) CookieManager.getInstance(), (byte) 12));
                return rih1.a;
            case 20:
                return Boolean.valueOf(((crl1) this.b).b());
            case 21:
                ((bng) this.b).d.a(ixb.c);
                return rih1.a;
            case 22:
                return new kpg0((xpw) ((z1p) ((dqg) this.b).e).get(), tpg.f);
            case 23:
                iu30 iu30Var4 = ((krg) this.b).O0;
                if (iu30Var4 != null) {
                    iu30Var4.invoke(irg.a);
                }
                return rih1.a;
            case 24:
                return new kpg0((xpw) ((z1p) ((h82) this.b).c).get(), tpg.P0);
            case 25:
                Integer num = ((t6p0) this.b).b;
                return new err0(num != null ? num.intValue() : 0);
            case 26:
                Set set = s4b1.f;
                return uic.x(((l2h) this.b).a);
            case 27:
                f3h f3hVar = (f3h) this.b;
                luk lukVar = f3hVar.b;
                if (lukVar != null) {
                    return lukVar.e(new d26(f3hVar, (byte) 6));
                }
                return null;
            case 28:
                i34 i34Var = (i34) this.b;
                Connection connection = (Connection) i34Var.c;
                if (connection != null) {
                    connection.dispose();
                }
                i34Var.c = null;
                return rih1.a;
            default:
                ujh ujhVar = (ujh) this.b;
                luk lukVar2 = ujhVar.b;
                if (lukVar2 != null) {
                    return lukVar2.e(new d26(ujhVar, (byte) 7));
                }
                return null;
        }
    }
}
