package p;

import android.view.View;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class vae1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vae1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) throws Exception {
        switch (this.a) {
            case 0:
                List list = (List) this.b;
                List list2 = (List) this.c;
                p5t0 p5t0Var = (p5t0) obj;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        mmr0 mmr0Var = (mmr0) list.get(i);
                        p5t0.i(p5t0Var, (q5t0) mmr0Var.a, ((qr80) mmr0Var.b).a);
                    }
                }
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        mmr0 mmr0Var2 = (mmr0) list2.get(i2);
                        q5t0 q5t0Var = (q5t0) mmr0Var2.a;
                        Function0 function0 = (Function0) mmr0Var2.b;
                        p5t0.i(p5t0Var, q5t0Var, function0 != null ? ((qr80) function0.invoke()).a : 0L);
                    }
                }
                return rih1.a;
            case 1:
                fai0 fai0Var = (fai0) this.b;
                l811 l811Var = (l811) this.c;
                Object objE = fai0Var.e();
                if (l811Var.a || ((objE == null && obj != null) || (objE != null && !objE.equals(obj)))) {
                    l811Var.a = false;
                    fai0Var.m(obj);
                }
                return rih1.a;
            case 2:
                ((fai0) this.b).m(((iu30) this.c).invoke(obj));
                return rih1.a;
            case 3:
                fn31.T((c9n) this.b, null, 4, new xb5((mhg1) this.c, null), 1);
                return new tj4((byte) 27);
            case 4:
                jo51 jo51Var = (k9) this.b;
                jo51Var.D1(new gw91(new vae1(Thread.currentThread(), (c9n) this.c, (byte) 8)));
                return new kcf1(jo51Var, (byte) 1);
            case 5:
                mhg1 mhg1Var = (mhg1) this.b;
                bjg1 bjg1Var = (bjg1) this.c;
                mhg1Var.k.add(bjg1Var);
                return new w9d0(mhg1Var, bjg1Var, (byte) 26);
            case 6:
                return new w9d0((mhg1) this.b, (zgg1) this.c, (byte) 27);
            case 7:
                mhg1 mhg1Var2 = (mhg1) this.b;
                fhg1 fhg1Var = (fhg1) this.c;
                mhg1Var2.j.add(fhg1Var);
                return new w9d0(mhg1Var2, fhg1Var, (byte) 28);
            case 8:
                Object obj2 = this.b;
                c9n c9nVar = (c9n) this.c;
                Function0 function1 = (Function0) obj;
                if (obj2 == Thread.currentThread()) {
                    function1.invoke();
                } else {
                    fn31.T(c9nVar, null, 0, new to1(function1, null, (byte) 19), 3);
                }
                return rih1.a;
            case 9:
                ptf1 ptf1Var = (ptf1) this.b;
                c2h1 c2h1Var = (c2h1) this.c;
                f2h1 f2h1Var = (f2h1) obj;
                synchronized (((pvc) ptf1Var.b)) {
                    try {
                        boolean zA = f2h1Var.a();
                        ydf0 ydf0Var = (ydf0) ptf1Var.c;
                        if (zA) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return rih1.a;
            case 10:
                vnh1 vnh1Var = (vnh1) this.b;
                iu30 iu30Var = (iu30) this.c;
                ((Long) obj).getClass();
                float f = vnh1Var.e;
                vnh1Var.e = 0.0f;
                iu30Var.invoke(Float.valueOf(f));
                return rih1.a;
            case 11:
                osl1 osl1Var = (osl1) this.b;
                View view = (View) this.c;
                osl1Var.a(view);
                return new zxg1(osl1Var, view, (byte) 11);
            case 12:
                ((gwl1) this.b).b.D((y341) obj, (fwl1) this.c);
                return rih1.a;
            case 13:
                ((lwl1) this.b).b.D((y341) obj, (kwl1) this.c);
                return rih1.a;
            case 14:
                wvl1 wvl1Var = (wvl1) this.b;
                String str = (String) this.c;
                y341 y341Var = (y341) obj;
                d441 d441VarG1 = y341Var.g1("UPDATE workspec SET state=? WHERE id=?");
                try {
                    d441VarG1.r(1, cwl1.m0(wvl1Var));
                    d441VarG1.K(2, str);
                    d441VarG1.f1();
                    return Integer.valueOf(jhc1.x(y341Var));
                } finally {
                    d441VarG1.close();
                }
            case 15:
                ewq ewqVar = (ewq) this.b;
                String str2 = (String) this.c;
                d441 d441VarG2 = ((y341) obj).g1("UPDATE workspec SET output=? WHERE id=?");
                try {
                    ewq ewqVar2 = ewq.b;
                    d441VarG2.n(o0c.N(ewqVar), 1);
                    d441VarG2.K(2, str2);
                    d441VarG2.f1();
                    return rih1.a;
                } finally {
                    d441VarG2.close();
                }
            case 16:
                ((gxl1) this.b).b.D((y341) obj, (exl1) this.c);
                return rih1.a;
            case 17:
                ((p5t0) obj).f((q5t0) this.b, 0, 0, ((j3n1) this.c).O0);
                return rih1.a;
            default:
                ((f7n1) this.b).b.D((y341) obj, (s6n1) this.c);
                return rih1.a;
        }
    }
}
