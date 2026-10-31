package p;

import com.spotify.casita.v1.resolved.ResolvedHome;
import com.spotify.casita.v1.resolved.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lp60 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp60(String str, twn0 twn0Var, zf30 zf30Var, String str2, String str3, String str4, boolean z, e6w0 e6w0Var) {
        super(0);
        this.b = str;
        this.d = twn0Var;
        this.e = zf30Var;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.c = z;
        this.i = e6w0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.i;
        Object obj2 = this.e;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                mp60 mp60Var = (mp60) obj6;
                ResolvedHome resolvedHome = (ResolvedHome) obj2;
                pv00 pv00Var = (pv00) obj5;
                yz21 yz21Var = (yz21) obj4;
                sy21 sy21Var = (sy21) obj3;
                boolean zJ0 = mp60Var.j.j0();
                String str = this.b;
                uqs uqsVar = new uqs(yz21Var, str, this.c, (kp00) obj, zJ0);
                h290<Section> h290VarP = resolvedHome.s().p();
                ArrayList arrayList = new ArrayList();
                for (Section section : h290VarP) {
                    section.getClass();
                    jn60 jn60VarO = uqsVar.o(section);
                    if (jn60VarO != null) {
                        arrayList.add(jn60VarO);
                    }
                }
                ioj0 ioj0Var = (ioj0) tro1.u(mp60Var.e, kq60.Z, (aq60) null, new hs20(resolvedHome, pv00Var, (byte) 23));
                x4e0 x4e0Var = o0c.D(sy21Var, mp60Var.f) ? x4e0.b : x4e0.a;
                Set setP1 = resolvedHome.t() ? o7h.p1(resolvedHome.q().getUrisList()) : null;
                String strV = resolvedHome.r().p().v();
                String strV2 = resolvedHome.r().r().v();
                return new l2e(arrayList, ioj0Var, yz21Var, str, x4e0Var, setP1, strV, strV2.length() > 0 ? strV2 : null);
            case 1:
                ee5 ee5Var = (ee5) obj;
                e6w0 e6w0Var = (e6w0) obj6;
                boolean z = e6w0Var instanceof b6w0;
                twn0 twn0Var = (twn0) obj2;
                syn0 syn0Var = twn0Var.j;
                yyn0 yyn0Var = yyn0.a;
                if (z) {
                    son0 son0VarA = syn0Var.a(yyn0Var);
                    try {
                        twn0Var.l((zf30) obj5, this.b, (String) obj4, (String) obj3, this.c, ee5Var, (e6w0) obj6, new s2n0(twn0Var, son0VarA, (byte) 15));
                    } catch (Throwable th) {
                        syn0Var.e(son0VarA);
                        throw th;
                    }
                    break;
                } else {
                    zf30 zf30Var = (zf30) obj5;
                    String str2 = this.b;
                    String str3 = (String) obj4;
                    String str4 = (String) obj3;
                    boolean z2 = this.c;
                    son0 son0VarA2 = syn0Var.a(yyn0Var);
                    try {
                        twn0Var.l(zf30Var, str2, str3, str4, z2, ee5Var, e6w0Var, fsm0.S0);
                    } finally {
                        syn0Var.e(son0VarA2);
                    }
                }
                return rih1Var;
            default:
                twn0 twn0Var2 = (twn0) obj6;
                yun0 yun0Var = twn0Var2.b;
                xun0 xun0VarH = yun0Var.h();
                xg30 xg30VarA = xun0VarH != null ? xun0VarH.a() : null;
                String str5 = xg30VarA != null ? xg30VarA.c : null;
                String str6 = this.b;
                if (!u890.j(str6, str5) && !yun0Var.i().isEmpty()) {
                    Iterator it = yun0Var.i().iterator();
                    boolean z3 = false;
                    while (it.hasNext() && !z3) {
                        if (u890.j(str6, ((q0a) it.next()).b.c)) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        q0a q0aVar = (q0a) yun0Var.i().pop();
                        while (!u890.j(str6, q0aVar.b.c)) {
                            q0aVar = !yun0Var.i().isEmpty() ? (q0a) yun0Var.i().pop() : null;
                        }
                    }
                }
                syn0 syn0Var2 = twn0Var2.j;
                zf30 zf30Var2 = (zf30) obj2;
                String str7 = (String) obj5;
                String str8 = (String) obj4;
                String str9 = (String) obj3;
                boolean z4 = this.c;
                e6w0 e6w0Var2 = (e6w0) obj;
                son0 son0VarA3 = syn0Var2.a(azn0.a);
                try {
                    twn0Var2.p(zf30Var2, str7, str8, str9, z4, e6w0Var2);
                    return rih1Var;
                } finally {
                    syn0Var2.e(son0VarA3);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp60(mp60 mp60Var, ResolvedHome resolvedHome, String str, pv00 pv00Var, yz21 yz21Var, sy21 sy21Var, boolean z, kp00 kp00Var) {
        super(0);
        this.d = mp60Var;
        this.e = resolvedHome;
        this.b = str;
        this.f = pv00Var;
        this.g = yz21Var;
        this.h = sy21Var;
        this.c = z;
        this.i = kp00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp60(e6w0 e6w0Var, twn0 twn0Var, zf30 zf30Var, String str, String str2, String str3, boolean z, ee5 ee5Var) {
        super(0);
        this.d = e6w0Var;
        this.e = twn0Var;
        this.f = zf30Var;
        this.b = str;
        this.g = str2;
        this.h = str3;
        this.c = z;
        this.i = ee5Var;
    }
}
