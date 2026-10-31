package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class mv2 implements id5 {
    public final Object a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public mv2(e9r e9rVar, tzg1 tzg1Var, Object obj, oe5 oe5Var) {
        jui1 jui1Var = new jui1(e9rVar.a);
        this.c = jui1Var;
        this.d = tzg1Var;
        this.a = obj;
        oe5 oe5Var2 = (oe5) tzg1Var.a.invoke(obj);
        this.e = oe5Var2;
        this.f = rrn1.y(oe5Var);
        iu30 iu30Var = tzg1Var.b;
        oe5 oe5VarC = jui1Var.d;
        if (oe5VarC == null) {
            oe5VarC = oe5Var2.c();
            jui1Var.d = oe5VarC;
        }
        int iB = oe5VarC.b();
        int i = 0;
        while (true) {
            oe5 oe5Var3 = jui1Var.d;
            br20 br20Var = jui1Var.a;
            if (i >= iB) {
                if (oe5Var3 == null) {
                    u890.C("targetVector");
                    throw null;
                }
                this.h = iu30Var.invoke(oe5Var3);
                oe5 oe5VarC2 = jui1Var.c;
                if (oe5VarC2 == null) {
                    oe5VarC2 = oe5Var2.c();
                    jui1Var.c = oe5VarC2;
                }
                int iB2 = oe5VarC2.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    oe5Var2.getClass();
                    jMax = Math.max(jMax, br20Var.m(oe5Var.a(i2)));
                }
                this.b = jMax;
                oe5 oe5VarY = rrn1.y(((jui1) this.c).a(jMax, (oe5) this.e, oe5Var));
                this.g = oe5VarY;
                int iB3 = oe5VarY.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    oe5 oe5Var4 = (oe5) this.g;
                    float fA = oe5Var4.a(i3);
                    float f = ((jui1) this.c).e;
                    oe5Var4.e(yoi1.o(fA, -f, f), i3);
                }
                return;
            }
            if (oe5Var3 == null) {
                u890.C("targetVector");
                throw null;
            }
            oe5Var3.e(br20Var.p(oe5Var2.a(i), oe5Var.a(i)), i);
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    public boolean A() {
        cwh0 cwh0Var;
        boolean z;
        ArrayList arrayList = (ArrayList) this.d;
        pwh0 pwh0Var = (pwh0) this.h;
        pwh0Var.c();
        hvh0 hvh0Var = (hvh0) this.f;
        if (hvh0Var != null) {
            pwh0Var.b(this.b, hvh0Var.b());
            if (((hvh0) this.f).b.booleanValue()) {
                boolean zB = ((hvh0) this.f).b();
                long j = this.b;
                if (!zB || pwh0Var.d - j >= 30000) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            hvh0 hvh0Var2 = (hvh0) this.f;
            hvh0Var2.a();
            cwh0Var = new cwh0(hvh0Var2.c);
        } else {
            cwh0Var = null;
            z = false;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xvh0 xvh0Var = (xvh0) arrayList.get(i);
            hvh0 hvh0Var3 = xvh0Var.d;
            if (hvh0Var3 != null) {
                hvh0Var3.a();
                dwh0 dwh0Var = hvh0Var3.c;
                dwh0Var.a();
                if (!dwh0Var.b.isEmpty() || hvh0Var3.b()) {
                    pwh0Var.b(xvh0Var.e, hvh0Var3.b());
                    if (cwh0Var == null) {
                        hvh0Var3.a();
                        cwh0Var = new cwh0(hvh0Var3.c);
                    } else {
                        hvh0Var3.a();
                        dwh0 dwh0Var2 = hvh0Var3.c;
                        if (dwh0Var2 == null) {
                            hhg1.n("selector must not be null");
                            return false;
                        }
                        cwh0Var.a(dwh0Var2.b());
                    }
                }
            }
        }
        hvh0 hvh0Var4 = cwh0Var != null ? new hvh0(cwh0Var.d(), pwh0Var.a(), z) : null;
        if (Objects.equals((hvh0) this.e, hvh0Var4)) {
            return false;
        }
        this.e = hvh0Var4;
        pvh0 pvh0Var = ((zvh0) this.c).d;
        if (pvh0Var != null) {
            pvh0Var.h(hvh0Var4);
        }
        return true;
    }

    public boolean b() {
        return false;
    }

    public oe5 c(long j) {
        return !d(j) ? ((jui1) this.c).a(j, (oe5) this.e, (oe5) this.f) : (oe5) this.g;
    }

    public long e() {
        return this.b;
    }

    public tzg1 f() {
        return (tzg1) this.d;
    }

    public Object g(long j) {
        if (d(j)) {
            return this.h;
        }
        iu30 iu30Var = ((tzg1) this.d).b;
        jui1 jui1Var = (jui1) this.c;
        oe5 oe5Var = (oe5) this.e;
        oe5 oe5Var2 = (oe5) this.f;
        oe5 oe5VarC = jui1Var.b;
        if (oe5VarC == null) {
            oe5VarC = oe5Var.c();
            jui1Var.b = oe5VarC;
        }
        int iB = oe5VarC.b();
        int i = 0;
        while (true) {
            oe5 oe5Var3 = jui1Var.b;
            if (i >= iB) {
                if (oe5Var3 != null) {
                    return iu30Var.invoke(oe5Var3);
                }
                u890.C("valueVector");
                throw null;
            }
            if (oe5Var3 == null) {
                u890.C("valueVector");
                throw null;
            }
            oe5Var3.e(jui1Var.a.b(oe5Var.a(i), oe5Var2.a(i), j), i);
            i++;
        }
    }

    public Object h() {
        return this.h;
    }

    public xvh0 i(Messenger messenger, int i, String str) {
        return new xvh0(this, messenger, i, str);
    }

    public int k(Messenger messenger) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((xvh0) arrayList.get(i)).a.getBinder() == messenger.getBinder()) {
                return i;
            }
        }
        return -1;
    }

    public void l() {
    }

    public xvh0 m(Messenger messenger) {
        int iK = k(messenger);
        if (iK >= 0) {
            return (xvh0) ((ArrayList) this.d).get(iK);
        }
        return null;
    }

    public xe01 n() {
        return (xe01) this.g;
    }

    public yvh0 o() {
        return new yvh0(this);
    }

    public void p() {
        synchronized (this.a) {
            try {
                this.b++;
                xab1 xab1Var = (xab1) this.h;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.h = null;
                ((bpb1) this.f).l((Object) null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q() {
        ((ipk1) ((kly0) this.c).get()).getClass();
    }

    public boolean r() {
        if (((xe01) this.g).a.getValue() instanceof gre) {
            return true;
        }
        return false;
    }

    public void s() {
        synchronized (this.a) {
            if (u890.j(((xe01) this.g).a.getValue(), ere.a)) {
                ((bpb1) this.f).l((Object) null);
            }
        }
    }

    public void t() {
        if (((HashMap) this.g).isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            ((xvh0) it.next()).getClass();
            arrayList.add(new jma((byte) 16));
        }
        synchronized (this.a) {
            try {
                for (Map.Entry entry : ((HashMap) this.g).entrySet()) {
                    ((Executor) entry.getValue()).execute(new ag20((dkl) entry.getKey(), arrayList, (byte) 28));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public IBinder u(Intent intent) {
        zvh0 zvh0Var = (zvh0) this.c;
        if (!intent.getAction().equals("android.media.MediaRouteProviderService")) {
            return null;
        }
        zvh0Var.b();
        if (zvh0Var.d != null) {
            return zvh0Var.a.getBinder();
        }
        return null;
    }

    public void v() {
        synchronized (this.a) {
            ((HashMap) this.g).clear();
        }
    }

    public void w(jqd0 jqd0Var) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xvh0 xvh0Var = (xvh0) arrayList.get(i);
            zvh0.d(xvh0Var.a, 5, 0, 0, xvh0Var.a(jqd0Var), (Bundle) null);
        }
    }

    public Object x(ekb ekbVar, bq2 bq2Var, aq2 aq2Var) {
        return fn31.q((c9n) this.e, (o8n) null, 0, new c6(this, ekbVar, bq2Var, (lnm) null, (byte) 16), 3).Q(aq2Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #1 {, blocks: (B:64:0x00a9, B:66:0x00b1), top: B:99:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:99:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ff, code lost:
    
        if (r14 == r1) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object y(p.ekb r12, p.bq2 r13, p.onm r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mv2.y(p.ekb, p.bq2, p.onm):java.lang.Object");
    }

    public void z(o0i o0iVar, String str, String str2) {
        this.f = null;
        this.b = 0L;
        this.g = null;
        n2u0 n2u0Var = o0iVar.c.b;
        if (n2u0Var == null) {
            hhg1.n("Required value was null.");
        } else {
            this.h = fn31.T(o0iVar.a, (o8n) null, 0, new lqv(n2u0Var.c, this, str, str2, (lnm) null, (byte) 6), 3);
        }
    }

    public void a(Context context) {
    }

    public jqd0 j(jqd0 jqd0Var, String str) {
        return jqd0Var;
    }

    public mv2(caq caqVar, mr20 mr20Var, c9n c9nVar, kg01 kg01Var) {
        this.c = caqVar;
        this.d = mr20Var;
        this.e = c9nVar;
        this.a = new Object();
        bpb1 bpb1VarB = gio1.b(null);
        this.f = bpb1VarB;
        this.g = d5p1.h(bpb1VarB);
        new ime1(1, (lnm) null, (byte) 1);
        if ((1023 & 16) != 0) {
            new bpk1(4, (lnm) null);
        }
        if ((1023 & 32) != 0) {
            new whk1(2, (lnm) null, (byte) 1);
        }
        if ((1023 & 64) != 0) {
            new whk1(2, (lnm) null, (byte) 2);
        }
        if ((1023 & 128) != 0) {
            new whk1(2, (lnm) null, (byte) 3);
        }
        if ((1023 & 256) != 0) {
            new whk1(2, (lnm) null, (byte) 4);
        }
    }

    public mv2(Activity activity, Handler handler) {
        this.c = handler;
        this.d = activity.getApplicationContext();
        this.a = new Object();
        this.e = new ArrayMap();
        this.b = 10L;
        this.g = new v7y(this, (byte) 0);
        this.h = new u7y(this);
    }

    public mv2(xjl xjlVar, cbu cbuVar, yp10 yp10Var, yqg yqgVar) {
        this.c = xjlVar;
        this.d = cbuVar;
        this.e = yp10Var;
        this.a = yqgVar;
    }

    public mv2(zvh0 zvh0Var) {
        this.d = new ArrayList();
        this.g = new HashMap();
        this.a = new Object();
        this.h = new pwh0(new gv40(this, (byte) 18));
        this.c = zvh0Var;
    }
}
