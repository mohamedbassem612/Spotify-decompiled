package p;

import android.content.SharedPreferences;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material3.internal.AnchoredDragFinishedSignal;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.spotify.mobius.Next;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class lm5 implements cb91 {
    public static boolean a;
    public static b180 b;
    public static b180 c;

    public static final zmg0 c(iu30 iu30Var) {
        y5v y5vVar = new y5v();
        iu30Var.invoke(y5vVar);
        return new zmg0(y5vVar.a);
    }

    public static final void d(String str, String str2, String str3, Integer num, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var;
        Function0 function1;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1714661227);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.g(str3) ? 256 : 128) | (x340Var2.g(num) ? 2048 : 1024) | (x340Var2.i(function0) ? 16384 : 8192);
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, cbx.b(x340Var2).e.c, 0.0f, 0.0f, 13);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            Uri uri = Uri.parse(str3 == null ? "" : str3);
            zov0 zov0Var = cbx.b(x340Var2).g;
            qim0 qim0VarR = u291.r(nim0Var, 64.0f);
            long jB = num != null ? u7h.b(z4p1.e(num.intValue()), 1.0f, 0.0f, 0.0f, 0.0f, 14) : u7h.k;
            int i3 = i2 << 9;
            bmq0.a(uri, qim0VarR, hcx.e, str, str2, jB, 0L, false, x340Var2, (i3 & 57344) | (i3 & 7168) | 384, 192);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            uwo1.e(cwl1.n0(2131960516, new Object[]{str2}, x340Var2), (qim0) null, cbx.d(x340Var2).e, 0L, new a0e1(3), (iu30) null, 0, false, new cjc0(3), 0, (qx8) null, x340Var2, 0, 0, 1770);
            uwo1.e(cwl1.o0(x340Var2, 2131960514), (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), (iu30) null, 0, false, new cjc0(Integer.MAX_VALUE), 0, (qx8) null, x340Var2, 0, 0, 1762);
            x340Var2.r(true);
            qim0 qim0VarY = voo1.y(nim0Var, voo1.g);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarY, 0.0f, 8.0f, 0.0f, 16.0f, 5);
            mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarB2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA3, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            function1 = function0;
            foo1.c(new gbx(z50.c, function1), new idx(4), (qim0) null, (max) null, yla.r(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, opi.a, x340Var2, 0, 48, 2012);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20(str, str2, str3, num, function1, i, (byte) 3);
        }
    }

    public static ColorFilter g(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objC0 = x74.c0(i2);
            if (objC0 != null) {
                return x74.m(i, objC0);
            }
            return null;
        }
        PorterDuff.Mode modeM = bmq0.M(i2);
        if (modeM != null) {
            return new PorterDuffColorFilter(i, modeM);
        }
        return null;
    }

    public static final qim0 h(qim0 qim0Var, s24 s24Var, vu30 vu30Var) {
        return qim0Var.then(new a6v(s24Var, vu30Var));
    }

    public static final boolean i(int i) {
        return i == 0;
    }

    public static Handler j() {
        return new Handler(Looper.getMainLooper());
    }

    public static final jfg k(n9r n9rVar) {
        n9r n9rVarK = n9rVar.k();
        if (n9rVarK == null || (n9rVar instanceof dzq0)) {
            return null;
        }
        if (!(n9rVarK.k() instanceof dzq0)) {
            return k(n9rVarK);
        }
        if (n9rVarK instanceof jfg) {
            return (jfg) n9rVarK;
        }
        return null;
    }

    public static boolean l() {
        return a;
    }

    public static kul0 m(String str) {
        return new kul0(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.core.CorruptionException */
    public static tnv0 p(FileInputStream fileInputStream) throws CorruptionException {
        try {
            return tnv0.l(fileInputStream);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Unable to parse preferences proto.", e);
        }
    }

    public static final mmr0 q(nl50 nl50Var, nl50 nl50Var2) {
        jl50 jl50VarA;
        jl50 jl50VarA2;
        Long lV = null;
        kl50 kl50Var = nl50Var instanceof kl50 ? (kl50) nl50Var : null;
        Long lV2 = (kl50Var == null || (jl50VarA2 = wqn1.A(kl50Var)) == null) ? null : wqn1.v(jl50VarA2);
        boolean z = nl50Var2 instanceof kl50;
        kl50 kl50Var2 = z ? (kl50) nl50Var2 : null;
        if (kl50Var2 != null && (jl50VarA = wqn1.A(kl50Var2)) != null) {
            lV = wqn1.v(jl50VarA);
        }
        if (u890.j(lV2, lV)) {
            return new mmr0(nl50Var2, w7x.a);
        }
        if (z) {
            nl50Var2 = kl50.a((kl50) nl50Var2, (String) null, (ArrayList) null, (String) null, (String) null, 7);
        }
        return new mmr0(nl50Var2, Collections.singleton(new cgw(lV)));
    }

    public static final beg r(zim0 zim0Var, kf30 kf30Var) {
        zpi0 zpi0VarO;
        lf30 lf30Var = kf30Var.a;
        if (!lf30Var.c()) {
            jfg jfgVarG = zim0Var.D(kf30Var.b()).h.g(lf30Var.g(), 4);
            beg begVar = jfgVarG instanceof beg ? (beg) jfgVarG : null;
            if (begVar != null) {
                return begVar;
            }
            beg begVarR = r(zim0Var, kf30Var.b());
            jfg jfgVarG2 = (begVarR == null || (zpi0VarO = begVarR.O()) == null) ? null : zpi0VarO.g(lf30Var.g(), 4);
            if (jfgVarG2 instanceof beg) {
                return (beg) jfgVarG2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object s(Function0 function0, vu30 vu30Var, onm onmVar) {
        p14 p14Var;
        if (onmVar instanceof p14) {
            p14Var = (p14) onmVar;
            int i = p14Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                p14Var.b = i - Integer.MIN_VALUE;
            } else {
                p14Var = new p14(onmVar);
            }
        } else {
            p14Var = new p14(onmVar);
        }
        Object obj = p14Var.a;
        int i2 = p14Var.b;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                w14 w14Var = new w14(function0, vu30Var, (lnm) null, (byte) 1);
                p14Var.b = 1;
                Object objS = smo1.s(w14Var, p14Var);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return rih1.a;
    }

    public static void t(HashMap map) {
        SharedPreferences sharedPreferences = wf10.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        Object obj = map.get("dataset_id");
        Object obj2 = map.get("endpoint");
        Object obj3 = map.get("access_key");
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("dataset_id", obj.toString());
        editorEdit.putString("endpoint", obj2.toString());
        editorEdit.putString("access_key", obj3.toString());
        editorEdit.apply();
        fza fzaVar = oue0.a;
        synchronized (wf10.b) {
        }
    }

    public static p6r0 u(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.G1("AGE_SIGNAL_BLOCKED_CONFIRM_AGE", "age-signal/blocked/confirm-age", 131, "age-signal");
        }
        if (iC == 1) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            return yon1.G1("AGE_SIGNAL_BLOCKED_ASK_PARENT", "age-signal/blocked/ask-parent", 130, "age-signal");
        }
        if (iC == 2) {
            AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
            return yon1.G1("AGE_SIGNAL_BLOCKED_PARENT_SETUP", "age-signal/blocked/parent-setup", 132, "age-signal");
        }
        eg.o();
        return null;
    }

    public static final long v(xve1 xve1Var) {
        if (xve1Var instanceof tve1) {
            return ((tve1) xve1Var).a;
        }
        if (xve1Var instanceof uve1) {
            return ((uve1) xve1Var).a;
        }
        if (xve1Var instanceof vve1) {
            return ((vve1) xve1Var).a;
        }
        eg.o();
        return 0L;
    }

    public static Next w(kak0 kak0Var, t1k0 t1k0Var) {
        lhg1 lhg1Var = kak0Var.S0;
        q6w0 q6w0Var = lhg1Var.a;
        jez jezVar = t1k0Var.c;
        return x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(lhg1Var, q6w0.a(q6w0Var, (buk1) null, jezVar != null ? new hez(jezVar) : null, (fa20) null, (px30) null, (taa0) null, (k7f0) null, (s69) null, (s69) null, t1k0Var.a, t1k0Var.b, (r920) null, (r920) null, (ox30) null, (ox30) null, (x6b) null, 63995), (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575)), kak0Var))), 3);
    }

    public static final gwk1 x(gwk1 gwk1Var) {
        int i = gwk1Var.c;
        Map map = gwk1Var.m;
        boolean z = (gwk1Var.d != 1 || gwk1Var.o || gwk1Var.n) ? false : true;
        return gwk1.b(gwk1Var, null, false, z && i - o7h.c1(map.values()) > 0, z && o7h.c1(map.values()) > 0 && o7h.c1(map.values()) == i, z, 65535);
    }

    public float b(View view, ViewGroup viewGroup) {
        return view.getTranslationY();
    }

    public void e(final int i) {
        j().post(new Runnable() { // from class: p.px21
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n(i);
            }
        });
    }

    public void f(Typeface typeface) {
        j().post(new zyh0(this, typeface, (byte) 23));
    }

    public abstract void o(Typeface typeface);

    public void n(int i) {
    }
}
