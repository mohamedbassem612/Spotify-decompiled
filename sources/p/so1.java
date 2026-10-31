package p;

import android.os.Bundle;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class so1 extends x7e0 implements b031 {
    public final bl3 N0;
    public final ho1 O0;
    public final ums P0;
    public final yka1 Q0;
    public final boolean R0;
    public final String S0;
    public List T0;
    public ajg1 U0;
    public final bpb1 V0;
    public final bpb1 W0;
    public final jxo X;
    public final bpb1 X0;
    public final asn Y;
    public final bpb1 Y0;
    public final qmr Z;
    public final llm Z0;
    public xab1 a1;
    public final pia1 b1;
    public Set c1;
    public final ria1 d;
    public Set d1;
    public final dxz0 e;
    public Set e1;
    public final av1 f;
    public Set f1;
    public final wml g;
    public final yjq h;
    public final hy1 i;
    public final qt1 t;

    public so1(ria1 ria1Var, dxz0 dxz0Var, av1 av1Var, wml wmlVar, yjq yjqVar, hy1 hy1Var, qt1 qt1Var, jxo jxoVar, asn asnVar, q8n q8nVar, qmr qmrVar, bl3 bl3Var, ho1 ho1Var, ums umsVar, yka1 yka1Var, boolean z) {
        this.d = ria1Var;
        this.e = dxz0Var;
        this.f = av1Var;
        this.g = wmlVar;
        this.h = yjqVar;
        this.i = hy1Var;
        this.t = qt1Var;
        this.X = jxoVar;
        this.Y = asnVar;
        this.Z = qmrVar;
        this.N0 = bl3Var;
        this.O0 = ho1Var;
        this.P0 = umsVar;
        this.Q0 = yka1Var;
        this.R0 = z;
        String username = av1Var.getUsername();
        this.S0 = username;
        this.T0 = z6x.a;
        fy1 fy1VarH = av1Var.h();
        fy1 fy1Var = fy1VarH instanceof fy1 ? fy1VarH : null;
        this.U0 = fy1Var != null ? fy1Var.a() : null;
        this.V0 = gio1.b("");
        this.W0 = gio1.b((Object) null);
        this.X0 = gio1.b(ria1Var.a(username));
        zu1 zu1VarA = av1Var.a();
        this.Y0 = gio1.b(zu1VarA != null ? zu1VarA.getUri() : null);
        this.Z0 = smo1.e(q8nVar);
        this.b1 = ria1Var.a(username);
        w7x w7xVar = w7x.a;
        this.d1 = w7xVar;
        this.e1 = w7xVar;
        this.f1 = w7xVar;
    }

    public static boolean k(List list) {
        blc0 blc0Var = blc0.fh;
        List<String> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (String str : list2) {
            Set set = s4b1.f;
            if (!uic.g(str, blc0Var)) {
                return false;
            }
        }
        return true;
    }

    public static m6e0 o(so1 so1Var) {
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        so1Var.getClass();
        return f4p1.f(so1Var, scheduler);
    }

    public final void a(Bundle bundle) {
        String string = bundle.getString("TEXT_FILTER_BUNDLE_KEY");
        if (string == null) {
            string = "";
        }
        this.V0.m((Object) null, string);
        String[] stringArray = bundle.getStringArray("INITIAL_CURATED_CONTENT_KEY");
        this.O0.h(stringArray != null ? f46.S0(stringArray) : null);
        if (bundle.containsKey("FOLDER_URI_BUNDLE_KEY")) {
            this.Y0.l(bundle.getString("FOLDER_URI_BUNDLE_KEY"));
        }
    }

    public final void e() {
        mr20 u70Var;
        if (this.W0.getValue() != null) {
            i();
        } else {
            j();
        }
        huz huzVarE = h4p1.e(new n5(this));
        by1 by1VarH = this.f.h();
        if (by1VarH instanceof by1) {
            u70Var = new u70(this.N0.n(by1VarH.a()), (byte) 6);
        } else {
            u70Var = h4p1.m(w7x.a);
        }
        this.a1 = l4p1.u(this.Z0, x4p1.h(f5p1.q(new gk(hu20.e(h5p1.q(this.X0, this.V0, this.Y0, huzVarE, u70Var, new mo1(this, null)), new qt((lnm) null, this, (byte) 4)), this, (byte) 10), new k2(this, (lnm) null, (byte) 9)), new l2(this, (lnm) null, (byte) 2)));
        this.Q0.a();
    }

    public final void f() {
        xab1 xab1Var = this.a1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.Q0.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(go1 go1Var, onm onmVar) {
        oo1 oo1Var;
        ajg1 ajg1Var;
        String strA;
        Set set;
        if (onmVar instanceof oo1) {
            oo1Var = (oo1) onmVar;
            int i = oo1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo1Var.d = i - Integer.MIN_VALUE;
            } else {
                oo1Var = new oo1(this, onmVar);
            }
        } else {
            oo1Var = new oo1(this, onmVar);
        }
        Object objE = oo1Var.b;
        int i2 = oo1Var.d;
        if (i2 == 0) {
            hm5.M(objE);
            if (!(this.f.h() instanceof fy1) || (ajg1Var = this.U0) == null || (strA = ajg1Var.a()) == null) {
                return go1Var;
            }
            Set set2 = this.c1;
            oo1Var.a = set2;
            oo1Var.d = 1;
            objE = this.Z.e(go1Var, strA, set2, oo1Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
            set = set2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = oo1Var.a;
            hm5.M(objE);
        }
        dig1 dig1Var = (dig1) objE;
        if (set == null) {
            this.c1 = dig1Var.a();
            if (!dig1Var.a().isEmpty()) {
                ho1 ho1Var = this.O0;
                w7x w7xVarC = ho1Var.c();
                if (w7xVarC == null) {
                    w7xVarC = w7x.a;
                }
                ho1Var.h(dm61.y0(w7xVarC, dig1Var.a()));
                ho1Var.g(dig1Var.b());
            }
        }
        return dig1Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(lnm lnmVar) {
        po1 po1Var;
        List list;
        List list2;
        Object objM;
        List list3;
        List list4;
        tlo tloVar;
        xj61 xj61Var;
        tlo tloVar2;
        Set set;
        List list5;
        so1 so1Var;
        Serializable serializableA;
        if (lnmVar instanceof po1) {
            po1Var = (po1) lnmVar;
            int i = po1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                po1Var.g = i - Integer.MIN_VALUE;
            } else {
                po1Var = new po1(this, lnmVar);
            }
        } else {
            po1Var = new po1(this, lnmVar);
        }
        Object objN = po1Var.e;
        int i2 = po1Var.g;
        av1 av1Var = this.f;
        Serializable serializable = d9n.a;
        if (i2 == 0) {
            hm5.M(objN);
            if (av1Var.h() instanceof by1) {
                return z6x.a;
            }
            List listB = av1Var.b();
            po1Var.g = 1;
            objN = n(listB, po1Var);
            if (objN != serializable) {
            }
            return serializable;
        }
        if (i2 == 1) {
            hm5.M(objN);
        } else {
            if (i2 == 2) {
                list = po1Var.a;
                hm5.M(objN);
                list2 = (List) objN;
                this.T0 = list2;
                po1Var.a = list;
                po1Var.b = list2;
                po1Var.g = 3;
                objM = this.Y.m(list, po1Var);
                if (objM != serializable) {
                    List list6 = list;
                    list3 = list2;
                    objN = objM;
                    list4 = list6;
                    tloVar = (tlo) objN;
                    xj61Var = new xj61();
                    xj61Var.addAll(tloVar.b());
                    if (av1Var.h() instanceof fy1) {
                        xj61Var.add(av1Var.g());
                    }
                    this.d1 = cwl1.j(xj61Var);
                    if (this.R0) {
                        uio uioVarC = tloVar.c();
                        po1Var.a = null;
                        po1Var.b = list3;
                        po1Var.c = tloVar;
                        po1Var.d = this;
                        po1Var.g = 4;
                        serializableA = this.P0.a(list4, uioVarC, po1Var);
                        if (serializableA != serializable) {
                            tloVar2 = tloVar;
                            objN = serializableA;
                            list5 = list3;
                            so1Var = this;
                        }
                    } else {
                        tloVar2 = tloVar;
                        set = w7x.a;
                        list5 = list3;
                        so1Var = this;
                    }
                    so1Var.f1 = set;
                    Set setA = tloVar2.a();
                    if (setA.isEmpty()) {
                    }
                    this.i.e(setA.isEmpty() ? null : setA);
                    return list5;
                }
                return serializable;
            }
            if (i2 == 3) {
                list3 = po1Var.b;
                list4 = po1Var.a;
                hm5.M(objN);
                tloVar = (tlo) objN;
                xj61Var = new xj61();
                xj61Var.addAll(tloVar.b());
                if (av1Var.h() instanceof fy1) {
                    xj61Var.add(av1Var.g());
                }
                this.d1 = cwl1.j(xj61Var);
                if (this.R0) {
                    uio uioVarC2 = tloVar.c();
                    po1Var.a = null;
                    po1Var.b = list3;
                    po1Var.c = tloVar;
                    po1Var.d = this;
                    po1Var.g = 4;
                    serializableA = this.P0.a(list4, uioVarC2, po1Var);
                    if (serializableA != serializable) {
                        tloVar2 = tloVar;
                        objN = serializableA;
                        list5 = list3;
                        so1Var = this;
                    }
                    return serializable;
                }
                tloVar2 = tloVar;
                set = w7x.a;
                list5 = list3;
                so1Var = this;
                so1Var.f1 = set;
                Set setA2 = tloVar2.a();
                this.i.e(setA2.isEmpty() ? null : setA2);
                return list5;
            }
            if (i2 != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            so1Var = po1Var.d;
            tloVar2 = po1Var.c;
            list5 = po1Var.b;
            List list7 = po1Var.a;
            hm5.M(objN);
        }
        set = (Set) objN;
        so1Var.f1 = set;
        Set setA3 = tloVar2.a();
        if (setA3.isEmpty()) {
        }
        this.i.e(setA3.isEmpty() ? null : setA3);
        return list5;
        List list8 = (List) objN;
        po1Var.a = list8;
        po1Var.g = 2;
        Object objD = this.h.D(list8, po1Var);
        if (objD != serializable) {
            list = list8;
            objN = objD;
            list2 = (List) objN;
            this.T0 = list2;
            po1Var.a = list;
            po1Var.b = list2;
            po1Var.g = 3;
            objM = this.Y.m(list, po1Var);
            if (objM != serializable) {
                List list9 = list;
                list3 = list2;
                objN = objM;
                list4 = list9;
                tloVar = (tlo) objN;
                xj61Var = new xj61();
                xj61Var.addAll(tloVar.b());
                if (av1Var.h() instanceof fy1) {
                    xj61Var.add(av1Var.g());
                }
                this.d1 = cwl1.j(xj61Var);
                if (this.R0) {
                    uio uioVarC3 = tloVar.c();
                    po1Var.a = null;
                    po1Var.b = list3;
                    po1Var.c = tloVar;
                    po1Var.d = this;
                    po1Var.g = 4;
                    serializableA = this.P0.a(list4, uioVarC3, po1Var);
                    if (serializableA != serializable) {
                        tloVar2 = tloVar;
                        objN = serializableA;
                        list5 = list3;
                        so1Var = this;
                        set = (Set) objN;
                    }
                } else {
                    tloVar2 = tloVar;
                    set = w7x.a;
                    list5 = list3;
                    so1Var = this;
                }
                so1Var.f1 = set;
                Set setA4 = tloVar2.a();
                if (setA4.isEmpty()) {
                }
                this.i.e(setA4.isEmpty() ? null : setA4);
                return list5;
            }
        }
        return serializable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(List list, onm onmVar) {
        qo1 qo1Var;
        List list2;
        if (onmVar instanceof qo1) {
            qo1Var = (qo1) onmVar;
            int i = qo1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qo1Var.d = i - Integer.MIN_VALUE;
            } else {
                qo1Var = new qo1(this, onmVar);
            }
        } else {
            qo1Var = new qo1(this, onmVar);
        }
        Object objD = qo1Var.b;
        int i2 = qo1Var.d;
        if (i2 == 0) {
            hm5.M(objD);
            if (this.U0 == null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (bo1.b((String) obj)) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    String str = (String) o7h.q0(arrayList);
                    qo1Var.a = arrayList2;
                    qo1Var.d = 1;
                    objD = this.g.d(str, qo1Var);
                    d9n d9nVar = d9n.a;
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                    list2 = arrayList2;
                }
            }
            return list;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list2 = qo1Var.a;
        hm5.M(objD);
        ukg1 ukg1Var = (ukg1) objD;
        if (ukg1Var == null) {
            return list2;
        }
        this.U0 = ukg1Var.b();
        return o7h.N0(list2, ukg1Var.a());
    }

    public final Bundle serialize() {
        mmr0 mmr0VarN = oqn1.n("TEXT_FILTER_BUNDLE_KEY", this.V0.getValue());
        Set setC = this.O0.c();
        return mno1.h(mmr0VarN, oqn1.n("INITIAL_CURATED_CONTENT_KEY", setC != null ? (String[]) setC.toArray(new String[0]) : null), oqn1.n("FOLDER_URI_BUNDLE_KEY", this.Y0.getValue()));
    }
}
