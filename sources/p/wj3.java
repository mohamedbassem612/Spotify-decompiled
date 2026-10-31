package p;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.campaigns.storytelling.container.StorytellingContainerFragment;
import com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity;
import com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wj3 implements dl4, il3, nrm0 {
    public final Object N0;
    public final Object O0;
    public final Object P0;
    public Object X;
    public final Object Y;
    public final Object Z;
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public wj3(pii1 pii1Var) {
        this.a = (byte) 11;
        this.b = pii1Var;
        this.c = xqu.b(new tsq(this, 1, (byte) 13));
        this.d = xqu.b(new tsq(this, 0, (byte) 13));
        this.e = xqu.b(new tsq(this, 2, (byte) 13));
        this.f = xqu.b(new tsq(this, 3, (byte) 13));
        this.g = iy81.a(new tsq(this, 4, (byte) 13));
        this.h = iy81.a(new tsq(this, 6, (byte) 13));
        this.i = iy81.a(new tsq(this, 8, (byte) 13));
        this.t = iy81.a(new tsq(this, 7, (byte) 13));
        this.X = iy81.a(new tsq(this, 9, (byte) 13));
        this.Y = iy81.a(new tsq(this, 10, (byte) 13));
        this.Z = iy81.a(new tsq(this, 11, (byte) 13));
        this.N0 = iy81.a(new tsq(this, 12, (byte) 13));
        this.O0 = iy81.a(new tsq(this, 13, (byte) 13));
        this.P0 = iy81.a(new tsq(this, 5, (byte) 13));
    }

    public Completable a(gl3 gl3Var) {
        return ((Flowable) ((idd1) this.P0).getValue()).z().flatMapCompletable(new lbq(this, gl3Var, (byte) 22));
    }

    public Completable b() {
        Flowable flowable = (Flowable) ((idd1) this.P0).getValue();
        return new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new efr(this, (byte) 0));
    }

    public jy4 c() {
        luk lukVar = (luk) ((h7v0) this.b).o.get();
        c8o.l(lukVar);
        return new jy4(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    /* JADX WARN: Code duplicated, block: B:42:0x013f  */
    /* JADX WARN: Code duplicated, block: B:46:0x015d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0176  */
    /* JADX WARN: Code duplicated, block: B:53:0x0182  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a0  */
    public void d(Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        byte b;
        int i2;
        boolean z;
        boolean zBooleanValue;
        boolean z2;
        boolean zI;
        Object objT;
        boolean zI2;
        Object objT2;
        boolean zI3;
        Object objT3;
        boolean zI4;
        Object objT4;
        boolean zI5;
        Object objT5;
        boolean zI6;
        Object objT6;
        k6a1 k6a1Var = (k6a1) this.i;
        ven0 ven0Var = (ven0) this.f;
        bs91 bs91Var = (bs91) this.e;
        c9n c9nVar = (c9n) this.d;
        ven0 ven0Var2 = (ven0) this.h;
        ven0 ven0Var3 = (ven0) this.X;
        m4c m4cVar = fkj0.X;
        ven0 ven0Var4 = (ven0) this.c;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1678537133);
        int i3 = (b0kVar3.g(this) ? 32 : 16) | (b0kVar3.i(function0) ? 4 : 2) | i;
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            String str = ((vra0) ven0Var3.getValue()).e;
            boolean zBooleanValue2 = ((Boolean) ((ven0) this.Y).getValue()).booleanValue();
            int i4 = ((vra0) ven0Var3.getValue()).f;
            boolean z3 = ((vra0) ven0Var3.getValue()).h;
            boolean zBooleanValue3 = ((Boolean) ((ven0) this.Z).getValue()).booleanValue();
            if (((Boolean) ((ven0) this.N0).getValue()).booleanValue()) {
                i2 = i4;
                if (((krm0) ven0Var2.getValue()) == krm0.a && !((Boolean) ((ven0) this.O0).getValue()).booleanValue()) {
                    z = true;
                }
                zBooleanValue = ((Boolean) ((ven0) this.P0).getValue()).booleanValue();
                String str2 = ((vra0) ven0Var3.getValue()).g;
                g9m g9mVar = (g9m) this.b;
                if (zBooleanValue || !(str2 == null || g9mVar == null)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                zI = b0kVar3.i(ven0Var4);
                objT = b0kVar3.T();
                if (zI || objT == m4cVar) {
                    objT = new i030(ven0Var4, (byte) 27);
                    b0kVar3.s0(objT);
                }
                iu30 iu30Var = (iu30) objT;
                zI2 = b0kVar3.i(ven0Var4);
                objT2 = b0kVar3.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new i030(ven0Var4, (byte) 28);
                    b0kVar3.s0(objT2);
                }
                iu30 iu30Var2 = (iu30) objT2;
                zI3 = b0kVar3.i(ven0Var4) | b0kVar3.i(c9nVar) | b0kVar3.i(bs91Var) | b0kVar3.i(ven0Var);
                objT3 = b0kVar3.T();
                if (zI3 || objT3 == m4cVar) {
                    lhx lhxVar = new lhx(c9nVar, ven0Var4, bs91Var, ven0Var, (byte) 22);
                    b0kVar3.s0(lhxVar);
                    objT3 = lhxVar;
                }
                iu30 iu30Var3 = (iu30) objT3;
                lz20 lz20Var = (lz20) this.g;
                zI4 = b0kVar3.i(ven0Var4);
                objT4 = b0kVar3.T();
                if (zI4 || objT4 == m4cVar) {
                    objT4 = new c470(ven0Var4, (byte) 3);
                    b0kVar3.s0(objT4);
                }
                Function0 function1 = (Function0) objT4;
                b = 4;
                zI5 = b0kVar3.i(ven0Var4) | b0kVar3.i(ven0Var2) | ((i3 & 14) == 4);
                objT5 = b0kVar3.T();
                if (zI5 || objT5 == m4cVar) {
                    objT5 = new dh6(function0, ven0Var4, ven0Var2, (byte) 3);
                    b0kVar3.s0(objT5);
                }
                Function0 function2 = (Function0) objT5;
                zI6 = b0kVar3.i(k6a1Var) | b0kVar3.i(ven0Var4);
                objT6 = b0kVar3.T();
                if (zI6 || objT6 == m4cVar) {
                    objT6 = new sy5(k6a1Var, ven0Var4, (byte) 2);
                    b0kVar3.s0(objT6);
                }
                b0kVar2 = b0kVar3;
                ltn1.m(str, iu30Var, iu30Var2, iu30Var3, (qim0) null, lz20Var, zBooleanValue2, i2, z3, zBooleanValue3, true, z, function1, function2, z2, (Function0) objT6, (xta0) this.t, b0kVar2, 0);
            } else {
                i2 = i4;
            }
            z = false;
            zBooleanValue = ((Boolean) ((ven0) this.P0).getValue()).booleanValue();
            String str3 = ((vra0) ven0Var3.getValue()).g;
            g9m g9mVar2 = (g9m) this.b;
            if (zBooleanValue) {
                z2 = false;
            } else {
                z2 = false;
            }
            zI = b0kVar3.i(ven0Var4);
            objT = b0kVar3.T();
            if (zI) {
                objT = new i030(ven0Var4, (byte) 27);
                b0kVar3.s0(objT);
            } else {
                objT = new i030(ven0Var4, (byte) 27);
                b0kVar3.s0(objT);
            }
            iu30 iu30Var4 = (iu30) objT;
            zI2 = b0kVar3.i(ven0Var4);
            objT2 = b0kVar3.T();
            if (zI2) {
                objT2 = new i030(ven0Var4, (byte) 28);
                b0kVar3.s0(objT2);
            } else {
                objT2 = new i030(ven0Var4, (byte) 28);
                b0kVar3.s0(objT2);
            }
            iu30 iu30Var5 = (iu30) objT2;
            zI3 = b0kVar3.i(ven0Var4) | b0kVar3.i(c9nVar) | b0kVar3.i(bs91Var) | b0kVar3.i(ven0Var);
            objT3 = b0kVar3.T();
            if (zI3) {
                lhx lhxVar2 = new lhx(c9nVar, ven0Var4, bs91Var, ven0Var, (byte) 22);
                b0kVar3.s0(lhxVar2);
                objT3 = lhxVar2;
            } else {
                lhx lhxVar3 = new lhx(c9nVar, ven0Var4, bs91Var, ven0Var, (byte) 22);
                b0kVar3.s0(lhxVar3);
                objT3 = lhxVar3;
            }
            iu30 iu30Var6 = (iu30) objT3;
            lz20 lz20Var2 = (lz20) this.g;
            zI4 = b0kVar3.i(ven0Var4);
            objT4 = b0kVar3.T();
            if (zI4) {
                objT4 = new c470(ven0Var4, (byte) 3);
                b0kVar3.s0(objT4);
            } else {
                objT4 = new c470(ven0Var4, (byte) 3);
                b0kVar3.s0(objT4);
            }
            Function0 function3 = (Function0) objT4;
            b = 4;
            zI5 = b0kVar3.i(ven0Var4) | b0kVar3.i(ven0Var2) | ((i3 & 14) == 4);
            objT5 = b0kVar3.T();
            if (zI5) {
                objT5 = new dh6(function0, ven0Var4, ven0Var2, (byte) 3);
                b0kVar3.s0(objT5);
            } else {
                objT5 = new dh6(function0, ven0Var4, ven0Var2, (byte) 3);
                b0kVar3.s0(objT5);
            }
            Function0 function4 = (Function0) objT5;
            zI6 = b0kVar3.i(k6a1Var) | b0kVar3.i(ven0Var4);
            objT6 = b0kVar3.T();
            if (zI6) {
                objT6 = new sy5(k6a1Var, ven0Var4, (byte) 2);
                b0kVar3.s0(objT6);
            } else {
                objT6 = new sy5(k6a1Var, ven0Var4, (byte) 2);
                b0kVar3.s0(objT6);
            }
            b0kVar2 = b0kVar3;
            ltn1.m(str, iu30Var4, iu30Var5, iu30Var6, (qim0) null, lz20Var2, zBooleanValue2, i2, z3, zBooleanValue3, true, z, function3, function4, z2, (Function0) objT6, (xta0) this.t, b0kVar2, 0);
        } else {
            b0kVar2 = b0kVar3;
            b = 4;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(this, function0, i, b);
        }
    }

    public g3d0 e() {
        return (g3d0) ((vvu0) this.g).invoke((String) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0108 A[LOOP:0: B:51:0x0102->B:53:0x0108, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0138  */
    /* JADX WARN: Code duplicated, block: B:60:0x013e  */
    /* JADX WARN: Code duplicated, block: B:65:0x014b  */
    /* JADX WARN: Code duplicated, block: B:69:0x016e  */
    /* JADX WARN: Code duplicated, block: B:74:0x018e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:77:0x0193  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x019c  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c4  */
    public Object f(qxc0 qxc0Var, onm onmVar) {
        e7d0 e7d0Var;
        Set set;
        g3d0 g3d0VarE;
        ArrayList<g3d0> arrayList;
        Set setG;
        Set set2;
        ArrayList arrayList2;
        smc0 smc0VarL;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Map mapT;
        ArrayList arrayList5;
        g3d0 g3d0Var;
        boolean z;
        g3d0 g3d0Var2;
        d3d0 d3d0Var;
        qha1 qha1Var;
        int i;
        int i2;
        sha1 sha1VarO;
        mmr0 mmr0Var;
        if (onmVar instanceof e7d0) {
            e7d0Var = (e7d0) onmVar;
            int i3 = e7d0Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e7d0Var.f = i3 - Integer.MIN_VALUE;
            } else {
                e7d0Var = new e7d0(this, onmVar);
            }
        } else {
            e7d0Var = new e7d0(this, onmVar);
        }
        Object objJ = e7d0Var.d;
        int i4 = e7d0Var.f;
        Object obj = d9n.a;
        if (i4 == 0) {
            hm5.M(objJ);
            x010 x010Var = new x010((ay8) this.Y, (ay8) this.Z, new wc10(3, (lnm) null, (byte) 2), (byte) 1);
            fca0 fca0Var = new fca0(2, (lnm) null, (byte) 6);
            e7d0Var.a = qxc0Var;
            e7d0Var.f = 1;
            objJ = b5p1.j(x010Var, fca0Var, e7d0Var);
            if (objJ != obj) {
            }
            return obj;
        }
        if (i4 == 1) {
            qxc0Var = e7d0Var.a;
            hm5.M(objJ);
        } else {
            if (i4 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set2 = e7d0Var.c;
            arrayList2 = e7d0Var.b;
            hm5.M(objJ);
        }
        g3d0VarE = (g3d0) objJ;
        arrayList = arrayList2;
        setG = set2;
        smc0VarL = czo1.l(setG);
        List<pa20> list = n7d0.d;
        arrayList3 = new ArrayList(q7h.U(list, 10));
        for (pa20 pa20Var : list) {
            arrayList3.add(new qa20(pa20Var.a, smc0VarL.contains(pa20Var), pa20Var));
        }
        arrayList4 = new ArrayList();
        for (g3d0 g3d0Var3 : arrayList) {
            sha1VarO = czo1.o(g3d0Var3);
            if (sha1VarO != null) {
                mmr0Var = new mmr0(sha1VarO, g3d0Var3);
            } else {
                mmr0Var = null;
            }
            if (mmr0Var != null) {
                arrayList4.add(mmr0Var);
            }
        }
        mapT = sqg0.T(arrayList4);
        if (g3d0VarE == null) {
            g3d0VarE = (g3d0) o7h.r0(mapT.values());
        }
        arrayList5 = new ArrayList(mapT.size());
        for (Map.Entry entry : mapT.entrySet()) {
            sha1 sha1Var = (sha1) entry.getKey();
            g3d0Var = (g3d0) entry.getValue();
            if (g3d0VarE == null && g3d0Var.getClass() == g3d0VarE.getClass()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g3d0Var2 = g3d0VarE;
            } else {
                g3d0Var2 = g3d0Var;
            }
            String strG = g3d0Var.g();
            if (g3d0Var2 instanceof d3d0) {
                d3d0Var = (d3d0) g3d0Var2;
            } else {
                d3d0Var = null;
            }
            if (d3d0Var != null) {
                if (d3d0Var.a()) {
                    i = 2;
                } else {
                    i = 1;
                }
                if (g3d0Var2 instanceof e3d0) {
                    i2 = 1;
                } else if (!(g3d0Var2 instanceof m2d0) || (g3d0Var2 instanceof c3d0)) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                qha1Var = new qha1(i, i2);
            } else {
                qha1Var = null;
            }
            arrayList5.add(new uha1(strG, sha1Var, z, qha1Var));
        }
        return new s620(2, arrayList3, arrayList5);
        mmr0 mmr0Var2 = (mmr0) objJ;
        i1r i1rVar = (k1r) mmr0Var2.a;
        i1r i1rVar2 = (k1r) mmr0Var2.b;
        i1r i1rVar3 = i1rVar instanceof i1r ? i1rVar : null;
        if (i1rVar3 == null || (set = (Set) i1rVar3.a) == null) {
            set = w7x.a;
        }
        i1r i1rVar4 = i1rVar2 instanceof i1r ? i1rVar2 : null;
        if (i1rVar4 == null || (g3d0VarE = (g3d0) i1rVar4.a) == null) {
            g3d0VarE = e();
        }
        ArrayList arrayListB = ((l141) this.d).b(qxc0Var);
        arrayList = new ArrayList(q7h.U(arrayListB, 10));
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            arrayList.add(((tha1) it.next()).getSortOrder());
        }
        setG = i() ? g() : set;
        if (i()) {
            e7d0Var.a = null;
            e7d0Var.b = arrayList;
            e7d0Var.c = setG;
            e7d0Var.f = 2;
            objJ = h(arrayList, e7d0Var);
            if (objJ != obj) {
                set2 = setG;
                arrayList2 = arrayList;
                g3d0VarE = (g3d0) objJ;
                arrayList = arrayList2;
                setG = set2;
            }
            return obj;
        }
        smc0VarL = czo1.l(setG);
        List<pa20> list2 = n7d0.d;
        arrayList3 = new ArrayList(q7h.U(list2, 10));
        while (r0.hasNext()) {
            arrayList3.add(new qa20(pa20Var.a, smc0VarL.contains(pa20Var), pa20Var));
        }
        arrayList4 = new ArrayList();
        while (r0.hasNext()) {
            sha1VarO = czo1.o(g3d0Var3);
            if (sha1VarO != null) {
                mmr0Var = new mmr0(sha1VarO, g3d0Var3);
            } else {
                mmr0Var = null;
            }
            if (mmr0Var != null) {
                arrayList4.add(mmr0Var);
            }
        }
        mapT = sqg0.T(arrayList4);
        if (g3d0VarE == null) {
            g3d0VarE = (g3d0) o7h.r0(mapT.values());
        }
        arrayList5 = new ArrayList(mapT.size());
        while (r14.hasNext()) {
            sha1 sha1Var2 = (sha1) entry.getKey();
            g3d0Var = (g3d0) entry.getValue();
            if (g3d0VarE == null) {
                z = false;
            } else {
                z = false;
            }
            if (z) {
                g3d0Var2 = g3d0VarE;
            } else {
                g3d0Var2 = g3d0Var;
            }
            String strG2 = g3d0Var.g();
            if (g3d0Var2 instanceof d3d0) {
                d3d0Var = (d3d0) g3d0Var2;
            } else {
                d3d0Var = null;
            }
            if (d3d0Var != null) {
                if (d3d0Var.a()) {
                    i = 2;
                } else {
                    i = 1;
                }
                if (g3d0Var2 instanceof e3d0) {
                    i2 = 1;
                } else if (g3d0Var2 instanceof m2d0) {
                    i2 = 2;
                } else {
                    i2 = 2;
                }
                qha1Var = new qha1(i, i2);
            } else {
                qha1Var = null;
            }
            arrayList5.add(new uha1(strG2, sha1Var2, z, qha1Var));
        }
        return new s620(2, arrayList3, arrayList5);
    }

    public Set g() {
        Set setA = ((dma1) this.e).a(n7d0.a);
        List list = n7d0.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (setA.contains(((pa20) obj).a)) {
                arrayList.add(obj);
            }
        }
        return o7h.p1(czo1.m(arrayList));
    }

    public Object h(ArrayList arrayList, onm onmVar) {
        List listSingletonList;
        x2d0 z2d0Var;
        x880 x880Var = (x880) this.O0;
        String strF = ((dma1) this.e).f(n7d0.b);
        if (strF == null) {
            return b5p1.i(x880Var, onmVar);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                for (Object obj2 : arrayList2) {
                    if (((g3d0) obj2).g().equals(strF)) {
                        obj = obj2;
                        break;
                    }
                }
                g3d0 g3d0Var = (g3d0) obj;
                return g3d0Var == null ? b5p1.i(x880Var, onmVar) : g3d0Var;
            }
            x2d0 x2d0Var = (g3d0) it.next();
            if (x2d0Var instanceof d3d0) {
                x2d0 x2d0Var2 = (d3d0) x2d0Var;
                x2d0Var.getClass();
                if (x2d0Var2 instanceof x2d0) {
                    z2d0Var = new x2d0(!x2d0Var2.a);
                } else if (x2d0Var2 instanceof o2d0) {
                    z2d0Var = new o2d0(!((o2d0) x2d0Var2).a);
                } else if (x2d0Var2 instanceof m2d0) {
                    z2d0Var = new m2d0(!((m2d0) x2d0Var2).a);
                } else if (x2d0Var2 instanceof w2d0) {
                    z2d0Var = new w2d0(!((w2d0) x2d0Var2).a);
                } else if (x2d0Var2 instanceof e3d0) {
                    z2d0Var = new e3d0(!((e3d0) x2d0Var2).a);
                } else if (x2d0Var2 instanceof q2d0) {
                    z2d0Var = new q2d0(!((q2d0) x2d0Var2).a);
                } else if (x2d0Var2 instanceof s2d0) {
                    z2d0Var = new s2d0(!((s2d0) x2d0Var2).a);
                } else if (x2d0Var2 instanceof v2d0) {
                    z2d0Var = new v2d0(!((v2d0) x2d0Var2).a);
                } else if (x2d0Var2 instanceof c3d0) {
                    z2d0Var = new c3d0(!((c3d0) x2d0Var2).a);
                } else if (x2d0Var2 instanceof f3d0) {
                    z2d0Var = new f3d0(!((f3d0) x2d0Var2).a);
                } else if (x2d0Var2 instanceof p2d0) {
                    z2d0Var = new p2d0(!((p2d0) x2d0Var2).a);
                } else {
                    if (!(x2d0Var2 instanceof z2d0)) {
                        eg.o();
                        return null;
                    }
                    z2d0 z2d0Var2 = (z2d0) x2d0Var2;
                    z2d0Var = new z2d0(z2d0Var2.a, z2d0Var2.b, !z2d0Var2.c);
                }
                listSingletonList = p7h.M(new g3d0[]{x2d0Var, z2d0Var});
            } else {
                listSingletonList = Collections.singletonList(x2d0Var);
            }
            r7h.W(listSingletonList, arrayList2);
        }
    }

    public boolean i() {
        return ((rp4) this.f).a() && !((dma1) this.e).h(n7d0.c, true);
    }

    public n980 j() {
        d111 d111Var = (d111) this.c;
        Flowable flowable = (Flowable) d111Var.u.get();
        c8o.l(flowable);
        FlowableElementAtSingle flowableElementAtSingleZ = flowable.x(a2x0.f).J(e2x0.f).z();
        io91 io91Var = (io91) d111Var.C.get();
        c8o.l(io91Var);
        return new n980(flowableElementAtSingleZ, io91Var);
    }

    public void k(iu30 iu30Var) {
        xab1 xab1Var = (xab1) this.X;
        lnm lnmVar = null;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.X = fn31.T((u9c0) this.h, (o8n) null, 0, new a38((Object) this, (Object) iu30Var, lnmVar, (byte) 11), 3);
    }

    public n8l0 l() {
        e7g0 e7g0Var = (e7g0) this.d;
        n8h1 h8l0Var = new h8l0();
        n8h1 h7l0Var = new h7l0((byte) 11);
        int iOrdinal = e7g0Var.c.ordinal();
        if (iOrdinal == 0) {
            h8l0Var = h7l0Var;
        } else if (iOrdinal != 1) {
            eg.o();
            return null;
        }
        return new n8l0(h8l0Var.b());
    }

    public ytp0 m() {
        pii1 pii1Var = (pii1) this.b;
        Scheduler scheduler = (Scheduler) pii1Var.j.get();
        c8o.l(scheduler);
        Flowable flowable = (Flowable) pii1Var.n.get();
        c8o.l(flowable);
        Object obj = this.c;
        return new ytp0(scheduler, flowable, ((cyp) ((jly0) obj).get()).d(), PlayOrigin.create("listeningstats"), ((cyp) ((jly0) obj).get()).a(), (byte) 13);
    }

    public no5 n() {
        Context context = (Context) ((zr61) this.c).c.get();
        c8o.l(context);
        return new no5(context);
    }

    public FlowableFilter o() {
        return ((Flowable) ((daq) this.c).D5.get()).x(qs10.b1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(qxc0 qxc0Var, onm onmVar) {
        l7d0 l7d0Var;
        Set set;
        if (onmVar instanceof l7d0) {
            l7d0Var = (l7d0) onmVar;
            int i = l7d0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l7d0Var.d = i - Integer.MIN_VALUE;
            } else {
                l7d0Var = new l7d0(this, onmVar);
            }
        } else {
            l7d0Var = new l7d0(this, onmVar);
        }
        Object obj = l7d0Var.b;
        int i2 = l7d0Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            Set setG = g();
            ArrayList arrayListB = ((l141) this.d).b(qxc0Var);
            ArrayList arrayList = new ArrayList(q7h.U(arrayListB, 10));
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                arrayList.add(((tha1) it.next()).getSortOrder());
            }
            l7d0Var.a = setG;
            l7d0Var.d = 1;
            Object objH = h(arrayList, l7d0Var);
            Object obj2 = d9n.a;
            if (objH == obj2) {
                return obj2;
            }
            set = setG;
            obj = objH;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set2 = l7d0Var.a;
            hm5.M(obj);
            set = set2;
        }
        g3d0 g3d0Var = (g3d0) obj;
        boolean z = (set.isEmpty() && u890.j(g3d0Var, e())) ? false : true;
        if (z) {
            hma1 hma1VarEdit = ((dma1) this.e).edit();
            hma1VarEdit.a(n7d0.c, true);
            hma1VarEdit.g();
            k(new d7d0(this, set, g3d0Var, null, (byte) 1));
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:? A[LOOP:0: B:23:0x0091->B:33:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object q(Set set, onm onmVar) {
        m7d0 m7d0Var;
        Iterator it;
        int i;
        Iterator it2;
        luc0 luc0Var;
        ouc0 ouc0Var = (ouc0) this.i;
        jd0 jd0Var = jd0.D;
        d0r d0rVar = (d0r) this.b;
        if (onmVar instanceof m7d0) {
            m7d0Var = (m7d0) onmVar;
            int i2 = m7d0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m7d0Var.f = i2 - Integer.MIN_VALUE;
            } else {
                m7d0Var = new m7d0(this, onmVar);
            }
        } else {
            m7d0Var = new m7d0(this, onmVar);
        }
        Object obj = m7d0Var.d;
        int i3 = m7d0Var.f;
        int i4 = 0;
        d9n d9nVar = d9n.a;
        if (i3 != 0) {
            if (i3 == 1) {
                int i5 = m7d0Var.c;
                it = m7d0Var.b;
                Set set2 = m7d0Var.a;
                hm5.M(obj);
                i = i5;
                set = set2;
            } else {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = m7d0Var.c;
                it2 = m7d0Var.b;
                Set set3 = m7d0Var.a;
                hm5.M(obj);
                i4 = i6;
            }
            while (it2.hasNext()) {
                luc0Var = new luc0((orc0) it2.next());
                m7d0Var.a = null;
                m7d0Var.b = it2;
                m7d0Var.c = i4;
                m7d0Var.f = 2;
                if (d0r.d(d0rVar, jd0Var, ouc0Var, luc0Var, m7d0Var) == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1.a;
        }
        hm5.M(obj);
        it = o7h.b1(j8d0.a, set).iterator();
        i = 0;
        while (it.hasNext()) {
            muc0 muc0Var = new muc0((orc0) it.next());
            m7d0Var.a = set;
            m7d0Var.b = it;
            m7d0Var.c = i;
            m7d0Var.f = 1;
            if (d0r.d(d0rVar, jd0Var, ouc0Var, muc0Var, m7d0Var) == d9nVar) {
                return d9nVar;
            }
        }
        it2 = set.iterator();
        while (it2.hasNext()) {
            luc0Var = new luc0((orc0) it2.next());
            m7d0Var.a = null;
            m7d0Var.b = it2;
            m7d0Var.c = i4;
            m7d0Var.f = 2;
            if (d0r.d(d0rVar, jd0Var, ouc0Var, luc0Var, m7d0Var) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }

    public Object r(g3d0 g3d0Var, a8d1 a8d1Var) {
        Object objD = d0r.d((d0r) this.b, pwc0.e, new g4d0((String) this.c), new e4d0(g3d0Var), a8d1Var);
        return objD == d9n.a ? objD : rih1.a;
    }

    public void w(Object obj) {
        byte b = this.a;
        Object obj2 = this.O0;
        Object obj3 = this.N0;
        Object obj4 = this.Z;
        Object obj5 = this.t;
        Object obj6 = this.f;
        Object obj7 = this.P0;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.Y;
        Object obj11 = this.h;
        Object obj12 = this.g;
        Object obj13 = this.i;
        switch (b) {
            case 5:
                o0p0 o0p0Var = (o0p0) obj;
                daq daqVar = (daq) obj9;
                Flowable flowable = (Flowable) daqVar.D5.get();
                teq teqVar = (teq) obj8;
                wj3 wj3Var = (wj3) this.e;
                Flowable flowable2 = (Flowable) daqVar.D5.get();
                c8o.l(flowable2);
                Resources resources = (Resources) teqVar.N0.get();
                c8o.l(resources);
                e1p0 dbvVar = new dbv(flowable2, resources, daqVar.i());
                Flowable flowable3 = (Flowable) daqVar.D5.get();
                c8o.l(flowable3);
                Resources resources2 = (Resources) teqVar.N0.get();
                c8o.l(resources2);
                ffb0 ffb0Var = (ffb0) daqVar.Zs.get();
                c8o.l(ffb0Var);
                zs21 zs21Var = (zs21) ((jly0) wj3Var.O0).get();
                c8o.l(zs21Var);
                e1p0 at21Var = new at21(flowable3, resources2, ffb0Var, zs21Var);
                Resources resources3 = (Resources) teqVar.N0.get();
                c8o.l(resources3);
                xvo xvoVar = (xvo) daqVar.H8.get();
                c8o.l(xvoVar);
                ln91 ln91Var = (ln91) daqVar.yf.get();
                c8o.l(ln91Var);
                pqs pqsVar = (pqs) daqVar.ka.get();
                c8o.l(pqsVar);
                o0p0Var.I1 = new cr6(flowable, p7h.M(new e1p0[]{dbvVar, at21Var, new dbv(resources3, xvoVar, ln91Var, pqsVar)}), (Scheduler) daqVar.r3.get(), (Scheduler) daqVar.A2.get(), (Scheduler) daqVar.z1.get());
                o0p0Var.K1 = new rzo0(new dx0((Flowable) daqVar.D5.get(), (lzn0) teqVar.i.get()), (i8h1) daqVar.A5.get(), (l6h1) daqVar.fg.get(), (byte) 1);
                Flowable flowable4 = (Flowable) daqVar.D5.get();
                yjj1 yjj1Var = (yjj1) daqVar.zq.get();
                ziq ziqVar = teqVar.a;
                o0p0Var.H1 = new q1p0(flowable4, yjj1Var, (unr) ziqVar.Db.get(), (e7p0) teqVar.W4.get(), (ior) ziqVar.Ib.get(), (yqg) daqVar.J1.get(), (o241) daqVar.u4.get(), s5h.s((b7p) daqVar.xf.get()), (ffb0) daqVar.Zs.get(), (cbv) daqVar.vq.get(), (Scheduler) daqVar.z1.get(), (Scheduler) daqVar.r3.get(), daqVar.i(), vp90.x((uy90) daqVar.hc.get()));
                o0p0Var.O1 = (lnn0) teqVar.Y0.get();
                o0p0Var.L1 = (m7p0) daqVar.q9.get();
                o0p0Var.N1 = new drj0((dg0) daqVar.Pg.get(), (axn0) teqVar.A5.get(), (byte) 19);
                o0p0Var.M1 = daqVar.i();
                o0p0Var.J1 = (o3q) ((jly0) obj7).get();
                break;
            case 6:
                StorytellingContainerFragment storytellingContainerFragment = (StorytellingContainerFragment) obj;
                ((hip) storytellingContainerFragment).F1 = (jgu) ((p2q) obj6).get();
                storytellingContainerFragment.J1 = (c4c1) ((jly0) obj12).get();
                daq daqVar2 = (daq) obj9;
                storytellingContainerFragment.K1 = (j810) daqVar2.En.get();
                Single singleCreate = Single.create(new zb91((w4c1) ((jly0) obj11).get(), (byte) 7));
                l5b1 l5b1Var = new l5b1((w4c1) ((jly0) obj11).get(), (byte) 20);
                ptj ptjVar = new ptj(1, (c4c1) ((jly0) obj12).get(), c4c1.class, "onStoriesUpdate", "onStoriesUpdate(Lcom/spotify/campaigns/storytelling/api/StoriesUpdate;)V", 0, (byte) 13);
                ewn0 ewn0Var = new ewn0((las0) ((jly0) obj13).get(), (byte) 17);
                xq81 xq81Var = new xq81((v6c1) ((jly0) obj5).get(), (byte) 11);
                ks6 ks6Var = (ks6) obj8;
                cn00 cn00Var = (cn00) ((jly0) ks6Var.R0).get();
                PublishSubject publishSubject = ((k9c1) ((jly0) this.X).get()).a;
                BehaviorSubject behaviorSubject = ((las0) ((jly0) obj13).get()).a;
                BehaviorSubject behaviorSubject2 = ((fb71) ((jly0) obj10).get()).a;
                z4c1 z4c1Var = (z4c1) ((jly0) obj4).get();
                qy7 qy7Var = (qy7) ((jly0) obj3).get();
                i8h1 i8h1Var = (i8h1) daqVar2.A5.get();
                String strC = vwn.c();
                String str = ((CulturalMomentsStoryActivity) ks6Var.a).getViewUri().a;
                c8o.m(str);
                r6h1 r6h1Var = r6h1.c;
                storytellingContainerFragment.G1 = new kbc1(singleCreate, l5b1Var, ptjVar, ewn0Var, xq81Var, cn00Var, publishSubject, behaviorSubject, behaviorSubject2, z4c1Var, qy7Var, new r2a1(i8h1Var, new h4l0(strC, str), (byte) 20), ((fgi1) ((jly0) obj2).get()).a, (Scheduler) daqVar2.r3.get(), (Scheduler) daqVar2.A2.get(), j5.a, fdb1.v((kq41) ((jly0) obj7).get()), vwn.c());
                storytellingContainerFragment.H1 = new ewn0((las0) ((jly0) obj13).get(), (byte) 17);
                storytellingContainerFragment.I1 = new ij01((fb71) ((jly0) obj10).get(), (byte) 25);
                break;
            default:
                StorytellingContainerFragment storytellingContainerFragment2 = (StorytellingContainerFragment) obj;
                ((hip) storytellingContainerFragment2).F1 = (jgu) ((p2q) obj6).get();
                storytellingContainerFragment2.J1 = (c4c1) ((jly0) obj12).get();
                daq daqVar3 = (daq) obj9;
                storytellingContainerFragment2.K1 = (j810) daqVar3.En.get();
                Single singleCreate2 = Single.create(new zb91((w4c1) ((jly0) obj11).get(), (byte) 7));
                l5b1 l5b1Var2 = new l5b1((w4c1) ((jly0) obj11).get(), (byte) 20);
                ptj ptjVar2 = new ptj(1, (c4c1) ((jly0) obj12).get(), c4c1.class, "onStoriesUpdate", "onStoriesUpdate(Lcom/spotify/campaigns/storytelling/api/StoriesUpdate;)V", 0, (byte) 13);
                ewn0 ewn0Var2 = new ewn0((las0) ((jly0) obj13).get(), (byte) 17);
                xq81 xq81Var2 = new xq81((v6c1) ((jly0) obj5).get(), (byte) 11);
                e93 e93Var = (e93) obj8;
                cn00 cn00Var2 = (cn00) ((jly0) e93Var.S0).get();
                PublishSubject publishSubject2 = ((k9c1) ((jly0) this.X).get()).a;
                BehaviorSubject behaviorSubject3 = ((las0) ((jly0) obj13).get()).a;
                BehaviorSubject behaviorSubject4 = ((fb71) ((jly0) obj10).get()).a;
                z4c1 z4c1Var2 = (z4c1) ((jly0) obj4).get();
                qy7 qy7Var2 = (qy7) ((jly0) obj3).get();
                i8h1 i8h1Var2 = (i8h1) daqVar3.A5.get();
                String strB = j310.b();
                String str2 = ((FandomCollectiblesStoryActivity) e93Var.b).getViewUri().a;
                c8o.m(str2);
                r6h1 r6h1Var2 = r6h1.c;
                storytellingContainerFragment2.G1 = new kbc1(singleCreate2, l5b1Var2, ptjVar2, ewn0Var2, xq81Var2, cn00Var2, publishSubject2, behaviorSubject3, behaviorSubject4, z4c1Var2, qy7Var2, new r2a1(i8h1Var2, new h4l0(strB, str2), (byte) 20), ((fgi1) ((jly0) obj2).get()).a, (Scheduler) daqVar3.r3.get(), (Scheduler) daqVar3.A2.get(), spq0.d((xh71) ((s2q) e93Var.V0).get()), fdb1.v((kq41) ((jly0) obj7).get()), j310.b());
                storytellingContainerFragment2.H1 = new ewn0((las0) ((jly0) obj13).get(), (byte) 17);
                storytellingContainerFragment2.I1 = new ij01((fb71) ((jly0) obj10).get(), (byte) 25);
                break;
        }
    }

    public wj3(ham hamVar, ua91 ua91Var, hwb hwbVar, k141 k141Var, rjn rjnVar, w5x w5xVar, fjb fjbVar, aru0 aru0Var, svh0 svh0Var, spu spuVar, no5 no5Var, i6b i6bVar, k141 k141Var2, oj40 oj40Var, yo31 yo31Var, myq0 myq0Var, zhq0 zhq0Var) {
        this.a = (byte) 18;
        this.b = hamVar;
        this.c = ua91Var;
        this.d = k141Var;
        this.e = rjnVar;
        this.f = w5xVar;
        this.g = aru0Var;
        this.h = svh0Var;
        this.i = spuVar;
        this.t = no5Var;
        this.X = i6bVar;
        this.Y = k141Var2;
        this.Z = oj40Var;
        this.N0 = yo31Var;
        this.O0 = myq0Var;
        this.P0 = zhq0Var;
    }

    public wj3(String str, xrc0 xrc0Var, h72 h72Var, ip91 ip91Var, Flowable flowable, agc0 agc0Var, oj3 oj3Var, jo91 jo91Var, cfr cfrVar, Scheduler scheduler, ljg ljgVar, fl1 fl1Var, a78 a78Var, pqs pqsVar) {
        this.a = (byte) 12;
        this.b = str;
        this.c = xrc0Var;
        this.d = h72Var;
        this.e = ip91Var;
        this.f = flowable;
        this.g = agc0Var;
        this.h = oj3Var;
        this.i = jo91Var;
        this.t = cfrVar;
        this.X = scheduler;
        this.Y = ljgVar;
        this.Z = fl1Var;
        this.N0 = a78Var;
        this.O0 = pqsVar;
        this.P0 = new idd1(new z5o(this, (byte) 19));
    }

    public wj3(d0r d0rVar, iac0 iac0Var, String str, l141 l141Var, dma1 dma1Var, rp4 rp4Var, vvu0 vvu0Var) {
        this.a = (byte) 16;
        this.b = d0rVar;
        this.c = str;
        this.d = l141Var;
        this.e = dma1Var;
        this.f = rp4Var;
        this.g = vvu0Var;
        this.h = cto1.q(iac0Var);
        this.i = new ouc0(str);
        this.t = ygn0.a();
        ay8 ay8VarL = vxo1.l(d0rVar, str);
        this.Y = ay8VarL;
        ay8 ay8VarF = d3p1.F(d0rVar, w3p1.o(new l4r(pwc0.e, 1, l1d0.Z, new j4r(l1d0.X), l1d0.N0), l1d0.Y), str);
        this.Z = ay8VarF;
        this.N0 = new vvu(ay8VarL, (byte) 27);
        x880 x880Var = new x880(new vvu(ay8VarF, (byte) 26), this, (byte) 28);
        this.O0 = x880Var;
        this.P0 = new x880(x880Var, this, (byte) 29);
    }

    public wj3(zr61 zr61Var, os61 os61Var, q7r0 q7r0Var) {
        this.a = (byte) 10;
        this.b = os61Var;
        this.c = zr61Var;
        this.d = q7r0Var;
        byte b = 2;
        this.e = new ipq(this, 1, b);
        this.f = new ipq(this, b, b);
        this.g = new ipq(this, 4, b);
        this.h = new ipq(this, 3, b);
        this.i = new ipq(this, 5, b);
        this.t = iy81.a(new ipq(this, 7, b));
        this.X = new ipq(this, 6, b);
        this.Y = iy81.a(new ipq(this, 9, b));
        this.Z = new ipq(this, 8, b);
        this.N0 = new ipq(this, 10, b);
        this.O0 = new ipq(this, 0, b);
        this.P0 = new ipq(this, 11, b);
    }

    public wj3(h7v0 h7v0Var, g7v0 g7v0Var) {
        this.a = (byte) 4;
        this.b = h7v0Var;
        this.c = g7v0Var;
        this.d = xqu.b(new ywp(this, 3, (byte) 17));
        this.e = xqu.b(new ywp(this, 2, (byte) 17));
        this.f = xqu.b(new ywp(this, 1, (byte) 17));
        this.g = new ywp(this, 4, (byte) 17);
        this.h = xqu.b(new ywp(this, 5, (byte) 17));
        this.i = xqu.b(new ywp(this, 8, (byte) 17));
        this.t = xqu.b(new ywp(this, 7, (byte) 17));
        this.X = xqu.b(new ywp(this, 6, (byte) 17));
        this.Y = xqu.b(new ywp(this, 10, (byte) 17));
        this.Z = xqu.b(new ywp(this, 9, (byte) 17));
        this.N0 = xqu.b(new ywp(this, 11, (byte) 17));
        this.O0 = xqu.b(new ywp(this, 12, (byte) 17));
        this.P0 = xqu.b(new ywp(this, 0, (byte) 17));
    }

    public wj3(pa31 pa31Var, q7r0 q7r0Var) {
        this.a = (byte) 9;
        this.b = pa31Var;
        this.c = q7r0Var;
        byte b = 21;
        this.d = xqu.b(new ykq(this, 0, b));
        this.e = new ykq(this, 1, b);
        this.f = xqu.b(new ykq(this, 2, b));
        this.g = iy81.a(new ykq(this, 5, b));
        this.h = xqu.b(new ykq(this, 7, b));
        this.i = iy81.a(new ykq(this, 9, b));
        this.t = iy81.a(new ykq(this, 8, b));
        this.X = iy81.a(new ykq(this, 6, b));
        this.Y = iy81.a(new ykq(this, 4, b));
        this.Z = iy81.a(new ykq(this, 10, b));
        this.N0 = iy81.a(new ykq(this, 11, b));
        this.O0 = iy81.a(new ykq(this, 12, b));
        this.P0 = iy81.a(new ykq(this, 3, b));
    }

    public wj3(d7g0 d7g0Var, e7g0 e7g0Var, q7r0 q7r0Var) {
        this.a = (byte) 2;
        this.b = d7g0Var;
        this.c = q7r0Var;
        this.d = e7g0Var;
        byte b = 22;
        this.e = new blp(this, 2, b);
        this.f = iy81.a(new blp(this, 1, b));
        this.g = iy81.a(new blp(this, 0, b));
        this.h = iy81.a(new blp(this, 4, b));
        this.i = iy81.a(new blp(this, 3, b));
        this.t = xqu.b(new blp(this, 7, b));
        this.X = new blp(this, 6, b);
        this.Y = iy81.a(new blp(this, 5, b));
        this.Z = iy81.a(new blp(this, 8, b));
        this.N0 = iy81.a(new blp(this, 9, b));
        this.O0 = iy81.a(new blp(this, 10, b));
        this.P0 = xqu.b(new blp(this, 11, b));
    }

    public /* synthetic */ wj3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.t = obj9;
        this.X = obj10;
        this.Y = obj11;
        this.Z = obj12;
        this.N0 = obj13;
        this.O0 = obj14;
        this.P0 = obj15;
    }

    public wj3(vse vseVar, t1m t1mVar, wse wseVar, q7r0 q7r0Var) {
        this.a = (byte) 1;
        this.b = wseVar;
        this.c = q7r0Var;
        this.d = t1mVar;
        byte b = 16;
        this.e = xqu.b(new b2p(this, 1, b));
        this.f = xqu.b(new b2p(this, 2, b));
        this.g = iy81.a(new b2p(this, 4, b));
        this.h = xqu.b(new b2p(this, 5, b));
        this.i = xqu.b(new b2p(this, 6, b));
        this.t = xqu.b(new b2p(this, 7, b));
        this.X = iy81.a(new b2p(this, 3, b));
        this.Y = xqu.b(new b2p(this, 11, b));
        this.Z = xqu.b(new b2p(this, 10, b));
        this.N0 = new b2p(this, 9, b);
        this.O0 = iy81.a(new b2p(this, 8, b));
        this.P0 = iy81.a(new b2p(this, 0, b));
    }

    public wj3(d111 d111Var, q7r0 q7r0Var) {
        this.a = (byte) 8;
        this.b = q7r0Var;
        this.c = d111Var;
        byte b = 15;
        this.d = xqu.b(new ykq(this, 1, b));
        this.e = xqu.b(new ykq(this, 2, b));
        this.f = xqu.b(new ykq(this, 0, b));
        this.g = iy81.a(new ykq(this, 5, b));
        this.h = iy81.a(new ykq(this, 4, b));
        this.i = iy81.a(new ykq(this, 6, b));
        this.t = iy81.a(new ykq(this, 3, b));
        this.X = xqu.b(new ykq(this, 7, b));
        this.Y = iy81.a(new ykq(this, 8, b));
        this.Z = iy81.a(new ykq(this, 9, b));
        this.N0 = iy81.a(new ykq(this, 10, b));
        this.O0 = iy81.a(new ykq(this, 11, b));
        this.P0 = new ykq(this, 12, b);
    }

    public wj3(r2p0 r2p0Var, v3p0 v3p0Var, q7r0 q7r0Var) {
        this.a = (byte) 3;
        this.b = v3p0Var;
        this.c = r2p0Var;
        this.d = q7r0Var;
        this.e = xqu.b(new bsp(this, 1, (byte) 24));
        this.f = xqu.b(new bsp(this, 2, (byte) 24));
        this.g = iy81.a(new bsp(this, 3, (byte) 24));
        this.h = new bsp(this, 5, (byte) 24);
        this.i = new bsp(this, 4, (byte) 24);
        this.t = new bsp(this, 6, (byte) 24);
        this.X = new bsp(this, 7, (byte) 24);
        this.Y = new bsp(this, 0, (byte) 24);
        this.Z = xqu.b(new bsp(this, 8, (byte) 24));
        this.N0 = xqu.b(new bsp(this, 9, (byte) 24));
        this.O0 = xqu.b(new bsp(this, 10, (byte) 24));
        this.P0 = xqu.b(new bsp(this, 11, (byte) 24));
    }

    public wj3(daq daqVar, ks6 ks6Var, StorytellingContainerFragment storytellingContainerFragment) {
        this.a = (byte) 6;
        this.c = daqVar;
        this.d = ks6Var;
        this.b = storytellingContainerFragment;
        this.e = new p2q(daqVar, ks6Var, this, 1, (byte) 7);
        this.f = new p2q(daqVar, ks6Var, this, 0, (byte) 7);
        this.g = xqu.b(new p2q(daqVar, ks6Var, this, 2, (byte) 7));
        this.h = xqu.b(new p2q(daqVar, ks6Var, this, 3, (byte) 7));
        this.i = xqu.b(new p2q(daqVar, ks6Var, this, 4, (byte) 7));
        this.t = xqu.b(new p2q(daqVar, ks6Var, this, 5, (byte) 7));
        this.X = xqu.b(new p2q(daqVar, ks6Var, this, 6, (byte) 7));
        this.Y = xqu.b(new p2q(daqVar, ks6Var, this, 7, (byte) 7));
        this.Z = xqu.b(new p2q(daqVar, ks6Var, this, 8, (byte) 7));
        this.N0 = xqu.b(new p2q(daqVar, ks6Var, this, 9, (byte) 7));
        this.O0 = xqu.b(new p2q(daqVar, ks6Var, this, 10, (byte) 7));
        this.P0 = xqu.b(new p2q(daqVar, ks6Var, this, 11, (byte) 7));
    }

    public wj3(daq daqVar, e93 e93Var, StorytellingContainerFragment storytellingContainerFragment) {
        this.a = (byte) 7;
        this.c = daqVar;
        this.d = e93Var;
        this.b = storytellingContainerFragment;
        this.e = new p2q(daqVar, e93Var, this, 1, (byte) 8);
        this.f = new p2q(daqVar, e93Var, this, 0, (byte) 8);
        this.g = xqu.b(new p2q(daqVar, e93Var, this, 2, (byte) 8));
        this.h = xqu.b(new p2q(daqVar, e93Var, this, 3, (byte) 8));
        this.i = xqu.b(new p2q(daqVar, e93Var, this, 4, (byte) 8));
        this.t = xqu.b(new p2q(daqVar, e93Var, this, 5, (byte) 8));
        this.X = xqu.b(new p2q(daqVar, e93Var, this, 6, (byte) 8));
        this.Y = xqu.b(new p2q(daqVar, e93Var, this, 7, (byte) 8));
        this.Z = xqu.b(new p2q(daqVar, e93Var, this, 8, (byte) 8));
        this.N0 = xqu.b(new p2q(daqVar, e93Var, this, 9, (byte) 8));
        this.O0 = xqu.b(new p2q(daqVar, e93Var, this, 10, (byte) 8));
        this.P0 = xqu.b(new p2q(daqVar, e93Var, this, 11, (byte) 8));
    }

    public wj3(daq daqVar, teq teqVar, o0p0 o0p0Var) {
        this.a = (byte) 5;
        this.e = this;
        this.c = daqVar;
        this.d = teqVar;
        this.b = o0p0Var;
        this.f = xqu.b(new p2q(daqVar, teqVar, this, 1, (byte) 4));
        this.g = xqu.b(new p2q(daqVar, teqVar, this, 2, (byte) 4));
        this.h = new p2q(daqVar, teqVar, this, 3, (byte) 4);
        this.i = new p2q(daqVar, teqVar, this, 4, (byte) 4);
        this.t = new p2q(daqVar, teqVar, this, 5, (byte) 4);
        this.X = xqu.b(new p2q(daqVar, teqVar, this, 6, (byte) 4));
        this.Y = iy81.a(new p2q(daqVar, teqVar, this, 7, (byte) 4));
        this.Z = new p2q(daqVar, teqVar, this, 8, (byte) 4);
        this.N0 = new p2q(daqVar, teqVar, this, 9, (byte) 4);
        this.O0 = xqu.b(new p2q(daqVar, teqVar, this, 10, (byte) 4));
        this.P0 = iy81.a(new p2q(daqVar, teqVar, this, 0, (byte) 4));
    }
}
