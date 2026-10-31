package p;

import android.app.ActivityManager;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.data.cache.room.MessagesDatabase_Impl;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z8i0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8i0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        lik1 lik1Var;
        switch (this.a) {
            case 0:
                q8n q8nVar = ((q9i0) this.b).d;
                p8n p8nVar = q8n.b;
                return q8nVar.M(4);
            case 1:
                dai0 dai0Var = (dai0) this.b;
                luk lukVar = dai0Var.b;
                if (lukVar != null) {
                    return lukVar.e(new d26(dai0Var, (byte) 24));
                }
                return null;
            case 2:
                iob1 iob1Var = (iob1) this.b;
                iob1Var.getClass();
                return new tgm((String) null, true, false, false, false, false, false, new yh10(iob1Var.e, iob1Var.i, (String) null, new ugo0(false, iob1Var.n, (String) null, false, false, (String) null, (mgo0) null, 509), 20), false, false, 0, false, !iob1Var.v, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -16643, 1);
            case 3:
                return (njv0) ((ojv0) this.b).a.get();
            case 4:
                return new xho((kko) ((umf0) this.b).d);
            case 5:
                return new xho((kko) ((qlb) this.b).e);
            case 6:
                return cwl1.F(((bgi0) this.b).d);
            case 7:
                cm0 cm0Var = (cm0) this.b;
                hs00 hs00Var = (hs00) cm0Var.h;
                Set setB = hs00Var != null ? hs00Var.b() : w7x.a;
                Object value = ((epb1) cm0Var.d).Y.getValue();
                value.getClass();
                return new lii0((ioj0) value, setB);
            case 8:
                r8s r8sVar = (r8s) this.b;
                return new lii0((ioj0) r8sVar.Y, ((hs00) r8sVar.i).b());
            case 9:
                ((pni0) this.b).b.a(ixb.c);
                return rih1.a;
            case 10:
                String str = ((sqi0) ((kqi0) this.b).d).a;
                r6h1 r6h1Var = r6h1.c;
                return new m1m0(str);
            case 11:
                String str2 = ((tri0) ((kqi0) this.b).d).a;
                r6h1 r6h1Var2 = r6h1.c;
                return new n1m0(str2);
            case 12:
                ActivityManager activityManager = (ActivityManager) this.b;
                if (activityManager == null) {
                    return null;
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                return new gsi0(memoryInfo.availMem, memoryInfo.threshold, memoryInfo.lowMemory);
            case 13:
                bzi0 bzi0Var = (bzi0) this.b;
                return bzi0Var.i.a(bzi0Var.O0, bzi0Var.Z);
            case 14:
                return new o4e0((pzi0) this.b, (byte) 5);
            case 15:
                return new q1m0(((o3x0) ((wmy) this.b).d).c.b());
            case 16:
                bn70 bn70VarA = ((k3j0) this.b).a.b0(bn70.class).a();
                if (bn70VarA == null || (lik1Var = bn70VarA.b) == null) {
                    return null;
                }
                return lik1Var.a;
            case 17:
                return new t6j0((MessagesDatabase_Impl) this.b);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                rb3 rb3Var = (rb3) this.b;
                k7j0 k7j0Var = (k7j0) rb3Var.c;
                return new kpg0(new res(k7j0Var.a, k7j0Var.b, k7j0Var.c, k7j0Var.d, k7j0Var.e), new r7j0(rb3Var, (byte) 0));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new vl90(((lmj0) this.b).a, false);
            case 20:
                sam1.a((qam1) this.b);
                return rih1.a;
            case 21:
                goq goqVar = ((duj0) this.b).e;
                String str3 = (String) goqVar.e;
                if (str3 != null) {
                    ((vku) goqVar.d).a(((l8s) goqVar.b).a(str3).subscribe());
                }
                goqVar.e = null;
                goqVar.f = null;
                return rih1.a;
            case 22:
                exj0 exj0Var = (exj0) this.b;
                return new cjk0(exj0Var.h.a.a.A5, exj0Var.Y);
            case 23:
                ixj0 ixj0Var = (ixj0) this.b;
                return new kpg0((xpw) ixj0Var.d.get(), new gxj0(ixj0Var, (byte) 1));
            case 24:
                zen0 zen0Var = (zen0) this.b;
                return Boolean.valueOf(!((Boolean) zen0Var.c.getValue()).booleanValue() && zen0Var.v1());
            case 25:
                p7k0 p7k0Var = (p7k0) this.b;
                return new xzq(p7k0Var.c.a(p7k0Var.a, new o7k0(3, null, (byte) 0)), hxj0.d1);
            case 26:
                return tp91.b(((bjk0) this.b).a);
            case 27:
                hkc1 hkc1Var = (hkc1) this.b;
                hkc1Var.m.J(hkc1Var.f, hkc1Var.g, hkc1Var.h, 0);
                return rih1.a;
            case 28:
                klm klmVarL = ((xbm) this.b).L();
                List<jlq0> listQ = ((xbm) this.b).q();
                if ((klmVarL.g instanceof hnb1) || (klmVarL.g instanceof gnb1)) {
                    String str4 = klmVarL.h;
                    if (str4 != null) {
                        bhn0.f(f4i1.f("[Quasar][", str4, "] Cannot execute startup operations after shutdown invoked"));
                        return null;
                    }
                    u890.C("scopeName");
                    throw null;
                }
                for (jlq0 jlq0Var : listQ) {
                    if (klmVarL.h == null) {
                        u890.C("scopeName");
                        throw null;
                    }
                    jlq0Var.getClass();
                    long jC = klmVarL.a.c();
                    tif1 tif1Var = klmVarL.c;
                    String name = jlq0Var.getName();
                    try {
                        tif1Var.e(2, name, "qss");
                        jlq0Var.c();
                        tif1Var.f(name, "qss");
                        long jC2 = klmVarL.a.c() - jC;
                        zlb1 zlb1Var = klmVarL.g;
                        if (zlb1Var instanceof zlb1) {
                            zlb1Var.e.add(new sfh0(jC, jC2, jlq0Var.getName(), 2));
                        }
                    } catch (Throwable th) {
                        tif1Var.f(name, "qss");
                        throw th;
                    }
                }
                ((xbm) this.b).g0();
                return rih1.a;
            default:
                ((uem0) this.b).h.a();
                return rih1.a;
        }
    }
}
