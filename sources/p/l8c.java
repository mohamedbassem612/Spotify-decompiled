package p;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.browse.clientnative.mobius.BrowseState;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l8c extends hab0 implements xu30 {
    public final /* synthetic */ a8c a;
    public final /* synthetic */ cir0 b;
    public final /* synthetic */ o5e0 c;
    public final /* synthetic */ cp31 d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8c(a8c a8cVar, cir0 cir0Var, o5e0 o5e0Var, cp31 cp31Var, Function0 function0) {
        super(3);
        this.a = a8cVar;
        this.b = cir0Var;
        this.c = o5e0Var;
        this.d = cp31Var;
        this.e = function0;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0394  */
    /* JADX WARN: Type inference failed for: r14v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        int i;
        tob1 tob1VarH;
        tob1 tob1VarK;
        boolean z;
        o5e0 o5e0Var;
        rnc0 rnc0Var;
        Object obj4;
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r14;
        i2c i2cVar = (i2c) obj;
        ((Number) obj3).intValue();
        cp31 cp31Var = this.d;
        lzn0 lzn0Var = (lzn0) cp31Var.b;
        m4c m4cVar = fkj0.X;
        wat watVar = i2cVar.a;
        long j = i2cVar.b;
        x340 x340Var = (b0k) obj2;
        boolean zE = x340Var.e((int) watVar.M0(hjl.k(j)));
        Object objT = x340Var.T();
        Object obj5 = objT;
        if (zE || objT == m4cVar) {
            int iM0 = (int) watVar.M0(hjl.k(j));
            if (iM0 >= 840) {
                i = 4;
            } else if (iM0 < 600 && iM0 < 480) {
                i = iM0 >= 360 ? 2 : 1;
            } else {
                i = 3;
            }
            Integer numValueOf = Integer.valueOf(i);
            x340Var.s0(numValueOf);
            obj5 = numValueOf;
        }
        int iIntValue = ((Number) obj5).intValue();
        Integer numValueOf2 = Integer.valueOf(iIntValue);
        a8c a8cVar = this.a;
        boolean zI = x340Var.i(a8cVar) | x340Var.e(iIntValue);
        Object objT2 = x340Var.T();
        Object obj6 = objT2;
        if (zI || objT2 == m4cVar) {
            j8c j8cVar = new j8c(a8cVar, iIntValue, null, (byte) 0);
            x340Var.s0(j8cVar);
            obj6 = j8cVar;
        }
        qxd0.t(numValueOf2, x340Var, (vu30) obj6);
        Object objT3 = x340Var.T();
        Object obj7 = objT3;
        if (objT3 == m4cVar) {
            hrr0 hrr0VarQ = v8r.q(Boolean.TRUE);
            x340Var.s0(hrr0VarQ);
            obj7 = hrr0VarQ;
        }
        ven0 ven0Var = (ven0) obj7;
        k8c0 k8c0Var = k8c0.ON_RESUME;
        boolean zI2 = x340Var.i(ven0Var) | x340Var.i(a8cVar);
        Object objT4 = x340Var.T();
        Object obj8 = objT4;
        if (zI2 || objT4 == m4cVar) {
            rqa rqaVar = new rqa(a8cVar, ven0Var, (byte) 12);
            x340Var.s0(rqaVar);
            obj8 = rqaVar;
        }
        cso1.j(k8c0Var, (iac0) null, (Function0) obj8, x340Var, 6);
        cir0 cir0Var = this.b;
        boolean zG = x340Var.g(cir0Var);
        Object objT5 = x340Var.T();
        nim0 nim0Var = nim0.a;
        Object obj9 = objT5;
        if (zG || objT5 == m4cVar) {
            th41 th41Var = (th41) cp31Var.f;
            if (th41Var == null) {
                u890.C("scannablesNavigator");
                throw null;
            }
            fqg0 fqg0VarU = q1o1.u(new bs0(th41Var, (agx) cp31Var.a, lzn0Var), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 6);
            x340Var.s0(fqg0VarU);
            obj9 = fqg0VarU;
        }
        xpw xpwVar = (xpw) obj9;
        boolean zG2 = x340Var.g(cir0Var);
        Object objT6 = x340Var.T();
        Object obj10 = objT6;
        if (zG2 || objT6 == m4cVar) {
            g9c g9cVar = new g9c(lzn0Var, yoi1.g(((z141) cp31Var.d).a.map(o9p1.N0)));
            x340Var.s0(g9cVar);
            obj10 = g9cVar;
        }
        g9c g9cVar2 = (g9c) obj10;
        o5e0 o5e0Var2 = this.c;
        boolean z5 = o5e0Var2 instanceof f5e0;
        f5e0 f5e0Var = z5 ? (f5e0) o5e0Var2 : null;
        a8c a8cVar2 = f5e0Var != null ? (a8c) f5e0Var.a : null;
        bpb1 bpb1Var = a8cVar2 != null ? a8cVar2.X : null;
        if (bpb1Var == null) {
            x340Var.i0(-1292176200);
            x340Var.r(false);
            tob1VarH = null;
        } else {
            x340Var.i0(235411561);
            tob1VarH = rwq.h(bpb1Var, x340Var, 0);
            x340Var.r(false);
        }
        BrowseState browseState = tob1VarH != null ? (BrowseState) tob1VarH.getValue() : null;
        zob1 zob1VarM = a8cVar2 != null ? a8cVar2.e.M() : null;
        if (zob1VarM == null) {
            x340Var.i0(-1292109333);
            x340Var.r(false);
            z = false;
            tob1VarK = null;
        } else {
            x340Var.i0(235413718);
            tob1VarK = f4p1.k(zob1VarM, (iac0) null, x340Var, 7);
            z = false;
            x340Var.r(false);
        }
        rnc0 rnc0Var2 = tob1VarK != null ? (rnc0) tob1VarK.getValue() : null;
        if (o5e0Var2 instanceof k5e0) {
            x340Var.i0(235417213);
            x340Var.r(z);
            browseState = browseState;
            o5e0Var = o5e0Var2;
            rnc0Var = rnc0Var2;
            r14 = z;
        } else {
            Function0 function0 = this.e;
            if (z5) {
                x340Var.i0(-1291894285);
                if (a8cVar2 == null) {
                    x340Var.i0(-1291894286);
                    x340Var.r(z);
                    browseState = browseState;
                    o5e0Var = o5e0Var2;
                    rnc0Var = rnc0Var2;
                    z4 = z;
                } else {
                    x340Var.i0(-1291894285);
                    if (browseState instanceof BrowseState.Content) {
                        x340Var.i0(-2145449975);
                        if (((kf4) cp31Var.e).b()) {
                            x340Var.i0(-2084410891);
                            BrowseState.Content content = (BrowseState.Content) browseState;
                            boolean z6 = z;
                            o6c.a(content, a8cVar2, xpwVar, t6c.a(content.getProfile(), cwl1.o0(x340Var, 2131953008)), g9cVar2, anm1.N("browse_clientnative_content", nim0Var), x340Var, 32768);
                            x340Var = x340Var;
                            x340Var.r(z6);
                            z3 = z6 ? 1 : 0;
                            rnc0Var = rnc0Var2;
                        } else {
                            Throwable th = null;
                            x340Var.i0(-2083853573);
                            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
                            d520 d520Var = a8cVar2.e;
                            khc khcVar = (khc) d520Var.d;
                            LinkedHashMap linkedHashMap = (LinkedHashMap) d520Var.f;
                            if (linkedHashMap == null) {
                                u890.C("elementFactories");
                                throw null;
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                Throwable th2 = th;
                                Object key = entry.getKey();
                                vu30 vu30Var = (vu30) entry.getValue();
                                snc0 snc0Var = (snc0) d520Var.e;
                                if (snc0Var == null) {
                                    u890.C("listContentRuntime");
                                    throw th2;
                                }
                                linkedHashMap2.put(key, (laa) vu30Var.invoke(snc0Var.getMetadata(), iac0Var));
                                th = th2;
                            }
                            Throwable th3 = th;
                            Map map = (Map) d520Var.h;
                            if (map == null) {
                                u890.C("instrumentationEnvironments");
                                throw th3;
                            }
                            snc0 snc0Var2 = (snc0) d520Var.e;
                            if (snc0Var2 == null) {
                                u890.C("listContentRuntime");
                                throw th3;
                            }
                            rnc0 rnc0Var3 = rnc0Var2;
                            s6c.a((BrowseState.Content) browseState, khc.f(khcVar, linkedHashMap2, map, new qka(1, snc0Var2, snc0.class, "onVisibleScrollRangeChanged", "onVisibleScrollRangeChanged(Lcom/spotify/listcontentruntime/configdsl/ListContentRuntime$ScrollRange;)V", 0, (byte) 12), 12), rnc0Var3, xpwVar, g9cVar2, anm1.N("browse_clientnative_content", nim0Var), 2131427776, x340Var, 32768);
                            rnc0Var = rnc0Var3;
                            x340Var = x340Var;
                            z3 = false;
                            x340Var.r(false);
                        }
                        x340Var.r(z3);
                        o5e0Var = o5e0Var2;
                        z2 = z3;
                    } else {
                        rnc0Var = rnc0Var2;
                        x340Var.i0(-2145410314);
                        wb6 wb6Var = new wb6(browseState, o5e0Var2, cp31Var, function0, (byte) 27);
                        o5e0Var = o5e0Var2;
                        cp31Var.l(o5e0Var, xpwVar, g9cVar2, (qim0) null, apo.r(378529762, wb6Var, x340Var), x340Var, 25088);
                        z2 = false;
                        x340Var.r(false);
                    }
                    x340Var.r(z2);
                    z4 = z2;
                }
                x340Var.r(z4);
                r14 = z4;
            } else {
                browseState = browseState;
                o5e0Var = o5e0Var2;
                rnc0Var = rnc0Var2;
                if (o5e0Var instanceof h5e0) {
                    x340Var.i0(-1290056760);
                    Integer numValueOf3 = Integer.valueOf(iIntValue);
                    boolean zI3 = x340Var.i(a8cVar) | x340Var.e(iIntValue);
                    Object objT7 = x340Var.T();
                    if (zI3 || objT7 == m4cVar) {
                        obj4 = objT7;
                        j8c j8cVar2 = new j8c(a8cVar, iIntValue, null, (byte) 1);
                        x340Var.s0(j8cVar2);
                        obj4 = j8cVar2;
                    }
                    qxd0.t(numValueOf3, x340Var, (vu30) obj4);
                    cp31Var.l(o5e0Var, xpwVar, g9cVar2, (qim0) null, aai.a, x340Var, 25088);
                    x340Var.r(z);
                    r14 = z;
                } else {
                    x340Var.i0(-1289749209);
                    cp31Var.l(o5e0Var, xpwVar, g9cVar2, (qim0) null, apo.r(1329246490, new wb6(o5e0Var, cp31Var, (Context) x340Var.k(AndroidCompositionLocals_androidKt.b), function0, (byte) 28), x340Var), x340Var, 25088);
                    x340Var.r(z);
                    r14 = z;
                }
            }
        }
        if (o5e0Var instanceof h5e0) {
            x340Var.i0(235509672);
            lmt0.c((qim0) null, x340Var, (int) r14);
        } else {
            if (browseState instanceof BrowseState.Content) {
                List list = rnc0Var != null ? rnc0Var.b : null;
                if (list == null || list.isEmpty()) {
                    x340Var.i0(235509672);
                    lmt0.c((qim0) null, x340Var, (int) r14);
                }
            }
            x340Var.i0(-1289120343);
        }
        x340Var.r((boolean) r14);
        return rih1.a;
    }
}
