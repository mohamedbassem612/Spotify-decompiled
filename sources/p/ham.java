package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ham implements Function, o2r0, p2r0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public ham(String str, String str2) {
        this.a = (byte) 9;
        this.b = str;
        this.c = str2;
        if (str.length() > 0) {
            return;
        }
        hhg1.n("userId should not be empty");
        throw null;
    }

    public static void f(StringBuilder sb, String str, char c) {
        if (str.length() > 0) {
            sb.append(str);
            sb.append('\n');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                sb.append(c);
            }
            sb.append('\n');
        }
    }

    public void a(ihm0 ihm0Var, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        ham hamVar;
        boolean z = ihm0Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1703901354);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ihm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            hamVar = this;
            i2 |= x340Var.i(hamVar) ? 2048 : 1024;
        } else {
            hamVar = this;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131954669);
            boolean zH = x340Var.h(z);
            Object objT = x340Var.T();
            if (zH || objT == fkj0.X) {
                objT = z ? new hax(strO0) : jax.a;
                x340Var.s0(objT);
            }
            k5p1.d(u291.f(nim0.a, 1.0f), new d36(20.0f, true, new g21(een.Q0, (byte) 29)), new d36(20.0f, false, new g21(een.N0, (byte) 28)), null, 0, 0, apo.r(-87977391, new jb1((Object) ihm0Var, (Object) function0, objT, (Object) hamVar, iu30Var, (byte) 11), x340Var), x340Var, 1572864, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, this, ihm0Var, iu30Var, function0, (byte) 20);
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                return new CompletableFromAction(new wf0((mmr0) obj, (dfm) obj3, (tqw) obj2, (byte) 6));
            case 14:
                asn asnVar = (asn) obj3;
                return ((dfo) asnVar.b).a((String) obj2, ((Boolean) obj).booleanValue(), ((yqg) asnVar.a).g().getID());
            default:
                return ((fjo) obj).a((String) obj3, (lik1) obj2);
        }
    }

    public void b(ihm0 ihm0Var, iu30 iu30Var, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        String str = ihm0Var.b;
        m4c m4cVar = fkj0.X;
        cqn cqnVar = ((dqn) this.c).b;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-602241839);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(ihm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(vzq0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (b0kVar2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zG = b0kVar2.g(cqnVar.b) | b0kVar2.g(str);
            Object objT = b0kVar2.T();
            if (zG || objT == m4cVar) {
                String str2 = cqnVar.b;
                if (str2 != null) {
                    str = str2;
                }
                b0kVar2.s0(str);
                objT = str;
            }
            String str3 = (String) objT;
            y7e1 y7e1VarD = c4p1.D(0, 2, str3, b0kVar2);
            boolean zI = b0kVar2.i(y7e1VarD) | b0kVar2.i(this) | ((i3 & 112) == 32);
            Object objT2 = b0kVar2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new ssm(y7e1VarD, this, iu30Var, (byte) 5);
                b0kVar2.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            era eraVar = een.Q0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L);
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            qim0 qim0VarH = l6o1.H(too1.i(uyn1.w(uyn1.z(32.0f, 0.0f, 2, dug.e(qim0VarD, new mic0(0, jFloatToRawIntBits, jFloatToRawIntBits2, p7h.M(new u7h[]{new u7h(((yex) zscVar.d).f), new u7h(((yex) zscVar.d).a)}), (List) null), null, 0.0f, 6)), vzq0Var), vzq0Var), l6o1.C(0, 0, 1, b0kVar2), false, 14);
            mbh mbhVarA = jbh.a(h36.e, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarH);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            WeakHashMap weakHashMap = osl1.x;
            op71.g(b0kVar2, u291.h(nim0Var, poo1.x(lhc.g(b0kVar2).f, b0kVar2).d()));
            e(b0kVar2, (i3 >> 9) & 14);
            op71.g(b0kVar2, u291.h(nim0Var, 48.0f));
            d(str3, y7e1VarD, null, function0, b0kVar2, (i3 << 3) & 57344);
            b0kVar2 = b0kVar2;
            op71.g(b0kVar2, u291.h(nim0Var, 56.0f));
            a(ihm0Var, iu30Var, function0, b0kVar2, i3 & 7294);
            x0d.s(nim0Var, 24.0f, b0kVar2, true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, this, ihm0Var, iu30Var, vzq0Var, (byte) 21);
        }
    }

    public void c(ihm0 ihm0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1956415702);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ihm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qti1 qti1Var = voo1.f;
            qim0 qim0Var3 = nim0.a;
            irn1.u(voo1.y(qim0Var3, qti1Var), wgi.a, null, new mn20(0, 0, 0, 0), apo.r(-1648763459, new nzd(this, ihm0Var, iu30Var, (byte) 11), x340Var), x340Var, 24624, 4);
            boolean zI = ((i3 & 112) == 32) | x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new von(this, iu30Var, (byte) 1);
                x340Var.s0(objT);
            }
            q3p1.b(0, 1, (Function0) objT, x340Var, false);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, this, ihm0Var, iu30Var, qim0Var2, (byte) 22);
        }
    }

    public void d(String str, y7e1 y7e1Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        int i3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1946409069);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(y7e1Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= b0kVar3.i(this) ? 16384 : 8192;
        }
        int i5 = i4;
        if (b0kVar3.Y(i5 & 1, (i5 & 9363) != 9362)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(b0kVar3);
            }
            lz20 lz20Var = (lz20) objT;
            Object[] objArr = new Object[0];
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = lmm.P0;
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT2, b0kVar3, 48);
            boolean zI = b0kVar3.i(lz20Var) | b0kVar3.i(ven0Var) | b0kVar3.i(y7e1Var);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                gke gkeVar = new gke(lz20Var, y7e1Var, ven0Var, (lnm) null, (byte) 15);
                b0kVar3.s0(gkeVar);
                objT3 = gkeVar;
            }
            qxd0.t(str, b0kVar3, (vu30) objT3);
            aqn aqnVar = ((dqn) this.c).b.c;
            if (aqnVar instanceof vpn) {
                i3 = 2131954625;
            } else {
                if (!(aqnVar instanceof zpn)) {
                    eg.o();
                    return;
                }
                i3 = 2131954671;
            }
            String strO0 = cwl1.o0(b0kVar3, i3);
            uwr uwrVar = cbx.a;
            lee1 lee1VarA = lee1.a(cbx.d(b0kVar3).c, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, TextDecoration.b, (Shadow) null, (phc1) null, 3, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16740351);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var3);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            g820 g820VarM = k8p1.m(vy5.e, 100);
            qim0 qim0VarP = vby0.p(u291.f(qim0Var3, 1.0f), lz20Var);
            boolean zG = b0kVar3.g(strO0);
            Object objT4 = b0kVar3.T();
            if (zG || objT4 == m4cVar) {
                objT4 = new kak(strO0, (byte) 22);
                b0kVar3.s0(objT4);
            }
            qim0 qim0VarB = s161.b(qim0VarP, false, (iu30) objT4);
            long j = cbx.a(b0kVar3).b.d;
            long j2 = cbx.a(b0kVar3).b.a;
            long j3 = cbx.a(b0kVar3).b.a;
            long j4 = cbx.a(b0kVar3).b.b;
            long j5 = u7h.j;
            zxx zxxVar = new zxx(j2, j3, j4, j, j5, j5, cbx.a(b0kVar3).b.c, 0L, 896);
            kua0 kua0VarA = kua0.a(kua0.g, 7, (Boolean) null, 118);
            boolean z = (i5 & 7168) == 2048;
            Object objT5 = b0kVar3.T();
            if (z || objT5 == m4cVar) {
                objT5 = new uy5(function0, (byte) 1);
                b0kVar3.s0(objT5);
            }
            rwo1.b(y7e1Var, qim0VarB, null, str, null, null, false, false, g820VarM, lee1VarA, kua0VarA, (yta0) objT5, d6e1.b, null, null, null, null, null, 0.0f, false, zxxVar, b0kVar3, ((i5 >> 3) & 14) | ((i5 << 9) & 7168), 0, 1040628);
            b0kVar2 = b0kVar3;
            t1c.a(uyn1.z(16.0f, 0.0f, 2, dug.f(u291.h(u291.f(qim0Var3, 1.0f), 1.0f), ((vex) zex.a.e).j, d4o1.a)), b0kVar2, 0);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0(this, str, y7e1Var, qim0Var2, function0, i);
        }
    }

    public void e(b0k b0kVar, int i) {
        int i2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1185270843);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            zpn zpnVar = ((dqn) this.c).b.c;
            if (zpnVar instanceof vpn) {
                i3 = 2131954627;
            } else {
                if (!(zpnVar instanceof zpn)) {
                    eg.o();
                    return;
                }
                i3 = zpnVar.b ? 2131954666 : 2131954675;
            }
            String strO0 = cwl1.o0(x340Var, i3);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).d;
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new kak(strO0, (byte) 23);
                x340Var.s0(objT);
            }
            uwo1.e(strO0, anm1.N("create_title_text", s161.b(nim0.a, false, (iu30) objT)), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0((Object) this, i, (byte) 18);
        }
    }

    public j4m g(nhr0 nhr0Var, Bundle bundle) {
        return ((o2r0) this.b).g(nhr0Var, bundle);
    }

    public o2r0 h(q7r0 q7r0Var, Bundle bundle) {
        q7r0Var.d.c.getLifecycle().a(new lt1((rzq) this.c, (byte) 1));
        return ((w6e0) this.b).h(q7r0Var, bundle);
    }

    public jto i() {
        ham hamVar = this;
        iu30 iu30Var = (iu30) hamVar.c;
        gfd1 gfd1Var = new gfd1();
        iu30Var.invoke(gfd1Var);
        pj8 pj8Var = gfd1Var.b;
        fai0 fai0VarQ = pj8Var != null ? w6d1.q((ymd0) pj8Var.invoke(), d6d1.W0) : new kdn0(0);
        dpc dpcVar = gfd1Var.c;
        qwc1 qwc1Var = dpcVar != null ? new qwc1(dpcVar, (byte) 5) : null;
        int i = dpcVar != null ? dpcVar.c : 0;
        ArrayList arrayList = gfd1Var.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            ffd1 ffd1Var = (ffd1) it.next();
            dnc0 dnc0Var = (dnc0) ((Function0) hamVar.b).invoke();
            ffd1Var.c.invoke(dnc0Var);
            cnc0 cnc0VarA = dnc0Var.a();
            snc0 snc0Var = (snc0) cnc0VarA.a.invoke();
            LinkedHashMap linkedHashMap = cnc0VarA.c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), new y0o(entry, snc0Var, (byte) 8));
            }
            String str = ffd1Var.a;
            String str2 = ffd1Var.b;
            Map map = cnc0VarA.b;
            fai0 fai0VarQ2 = w6d1.q(ffd1Var.d, eno.N0);
            hp91 hp91Var = ffd1Var.e;
            arrayList2.add(new ito(str, str2, snc0Var, linkedHashMap2, map, fai0VarQ2, new ic9(new ij81(((ho41) hp91Var.b).a, (byte) 6), new ij81(((ho41) hp91Var.c).a, (byte) 5), (byte) 21), ffd1Var.f, ffd1Var.h, ffd1Var.i, ffd1Var.g));
            hamVar = this;
        }
        return new jto(arrayList2, fai0VarQ, qwc1Var, i);
    }

    public void j() {
        try {
            ((d520) this.c).B((String) this.b).createNewFile();
        } catch (IOException unused) {
        }
    }

    public n2r k() {
        return (n2r) this.c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable l(List list, onm onmVar) throws AbortFlowException {
        gam gamVar;
        huz huzVarE;
        List list2;
        if (onmVar instanceof gam) {
            gamVar = (gam) onmVar;
            int i = gamVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gamVar.d = i - Integer.MIN_VALUE;
            } else {
                gamVar = new gam(this, onmVar);
            }
        } else {
            gamVar = new gam(this, onmVar);
        }
        Object objI = gamVar.b;
        int i2 = gamVar.d;
        if (i2 == 0) {
            hm5.M(objI);
            gamVar.a = list;
            gamVar.d = 1;
            fkv fkvVar = (fkv) this.c;
            List list3 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((u310) it.next()).a);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            Set setP1 = o7h.p1(arrayList2);
            boolean zIsEmpty = setP1.isEmpty();
            b7x b7xVar = b7x.a;
            if (zIsEmpty) {
                objI = b7xVar;
            } else {
                Set<String> set = setP1;
                ArrayList arrayList3 = new ArrayList(q7h.U(set, 10));
                for (String str : set) {
                    arrayList3.add(hon1.r(str).a(new iey0(str)));
                }
                Set setP2 = o7h.p1(arrayList3);
                rhg0 rhg0Var = fkvVar.e;
                if (rhg0Var != null) {
                    rhg0Var.a(setP2, (ArrayList) null, (ArrayList) null);
                }
                mr20 mr20VarU = rqt0.u(o4p1.k(h4p1.f(new ymu(fkvVar.b(), (lnm) null, (byte) 13)), -1, 2));
                if (setP1.isEmpty()) {
                    huzVarE = new huz(b7xVar, (byte) 10);
                } else {
                    ArrayList arrayList4 = new ArrayList(q7h.U(set, 10));
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(new iey0((String) it2.next()));
                    }
                    huzVarE = hu20.e(mr20VarU, new ekv(new lu2(o7h.p1(arrayList4), (byte) 2), dkv.c, (lnm) null));
                }
                objI = b5p1.i(huzVarE, gamVar);
            }
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
            list2 = list;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = gamVar.a;
            hm5.M(objI);
        }
        Map map = (Map) objI;
        List<u310> list4 = list2;
        ArrayList arrayList5 = new ArrayList(q7h.U(list4, 10));
        for (u310 u310VarB : list4) {
            String str2 = u310VarB.a;
            String str3 = u310VarB.d;
            String str4 = (String) map.get(str2);
            if (str4 != null) {
                u310VarB = (str3 == null || str3.length() == 0) ? u310.b(u310VarB, (String) null, str4, (Uri) null, 0, (Double) null, (String) null, 0, (y310) null, (String) null, (Map) null, (Uri) null, (q510) null, -9, 15) : u310.b(u310VarB, (String) null, ((Context) this.b).getString(2131954312, str4, str3), (Uri) null, 0, (Double) null, (String) null, 0, (y310) null, (String) null, (Map) null, (Uri) null, (q510) null, -9, 15);
            }
            arrayList5.add(u310VarB);
        }
        return arrayList5;
    }

    public ywo m() {
        return (ywo) ((jly0) this.c).get();
    }

    public tjm n(String str) {
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(str).c;
        return (blc0Var == blc0.Pg || blc0Var == blc0.Vg || blc0Var == blc0.z6) ? (p3v0) this.c : (fqr) this.b;
    }

    public boolean o() {
        return ((d520) this.c).B((String) this.b).exists();
    }

    public boolean p() {
        return ((d520) this.c).B((String) this.b).delete();
    }

    public ham(LinkedHashMap linkedHashMap, Map map, jwa0 jwa0Var) {
        this.a = (byte) 6;
        this.b = new p1d0(linkedHashMap, map, 0L, jwa0Var);
        this.c = map;
    }

    public ham(it8 it8Var) {
        this.a = (byte) 28;
        this.b = it8Var;
        this.c = iy81.a(new z1p(this, (byte) 14));
    }

    public ham(ycc1 ycc1Var) {
        this.a = (byte) 21;
        this.b = ycc1Var;
        this.c = iy81.a(new jwo(this, (byte) 10));
    }

    public ham(w4b1 w4b1Var) {
        this.a = (byte) 19;
        this.b = w4b1Var;
        this.c = new jwo(this, (byte) 2);
    }

    public ham(t22 t22Var, q7r0 q7r0Var) {
        this.a = (byte) 22;
        this.b = q7r0Var;
        this.c = new jwo(this, (byte) 13);
    }

    public ham(m0q m0qVar, qop qopVar, gl90 gl90Var) {
        this.a = (byte) 27;
        this.b = m0qVar;
        this.c = iy81.a(new z1p(this, (byte) 10));
    }

    public ham(ej8 ej8Var) {
        this.a = (byte) 25;
        this.b = ej8Var;
        this.c = xqu.b(new z1p(this, (byte) 2));
    }

    public ham(ude udeVar, q7r0 q7r0Var) {
        this.a = (byte) 29;
        this.b = q7r0Var;
        this.c = new z1p(this, (byte) 17);
    }

    public ham(xzp xzpVar, bct bctVar) {
        this.a = (byte) 23;
        this.b = xzpVar;
        this.c = iy81.a(new jwo(this, (byte) 20));
    }

    public ham(mz5 mz5Var, nz5 nz5Var) {
        this.a = (byte) 24;
        this.b = mz5Var;
        this.c = xqu.b(new jwo(this, (byte) 25));
    }

    public ham(bd1 bd1Var, zuj zujVar, cd1 cd1Var) {
        this.a = (byte) 20;
        this.b = bd1Var;
        this.c = new jwo(this, (byte) 6);
    }

    public ham(gua guaVar, zuj zujVar, hua huaVar, q7r0 q7r0Var) {
        this.a = (byte) 26;
        this.b = q7r0Var;
        this.c = new z1p(this, (byte) 6);
    }

    public /* synthetic */ ham(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
