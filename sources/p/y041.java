package p;

import android.view.ViewGroup;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.runtime_consumption.esperanto.proto.ConsumptionRecord;
import com.spotify.runtime_consumption.esperanto.proto.GetConsumptionRecordsRequest;
import com.spotify.runtime_consumption.esperanto.proto.GetConsumptionRecordsResponse;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y041 implements byf0 {
    public final jn7 a;
    public final ljg b;
    public final uu00 c;
    public final ynb0 d;
    public final yqg e;
    public final q8n f;
    public llm g;
    public final LinkedHashSet h = new LinkedHashSet();

    public y041(jn7 jn7Var, ljg ljgVar, uu00 uu00Var, ynb0 ynb0Var, yqg yqgVar, q8n q8nVar) {
        this.a = jn7Var;
        this.b = ljgVar;
        this.c = uu00Var;
        this.d = ynb0Var;
        this.e = yqgVar;
        this.f = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, onm onmVar) {
        u041 u041Var;
        if (onmVar instanceof u041) {
            u041Var = (u041) onmVar;
            int i = u041Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u041Var.c = i - Integer.MIN_VALUE;
            } else {
                u041Var = new u041(this, onmVar);
            }
        } else {
            u041Var = new u041(this, onmVar);
        }
        Object obj = u041Var.a;
        int i2 = u041Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Single singleC = ljg.c(this.b, "spotify:consumption_threshold_reached:v1", TriggerType.CLIENT_EVENT, (String) null, (List) null, (tv80) null, (uy31) null, new DynamicTagsMetadata(str, (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null), (ConflictResolutionStrategy) null, (d3j0) null, 444);
                u041Var.c = 1;
                Object objJ = fc11.j(singleC, u041Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:67:0x0175  */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0197  */
    /* JADX WARN: Code duplicated, block: B:73:0x019e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ad A[LOOP:0: B:68:0x0179->B:77:0x01ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01b6 A[EDGE_INSN: B:94:0x01b6->B:79:0x01b6 BREAK  A[LOOP:0: B:68:0x0179->B:77:0x01ad], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00fc A[SYNTHETIC] */
    public final Object b(long j, long j2, long j3, boolean z, boolean z2, onm onmVar) {
        v041 v041Var;
        long j4;
        long j5;
        boolean z3;
        boolean z4;
        long j6;
        long jB;
        rih1 rih1Var;
        y041 y041Var;
        String str;
        ArrayList arrayList;
        boolean z5;
        long j7;
        boolean z6;
        long j8;
        long j9;
        String str2;
        uv00 uv00Var;
        Iterator it;
        boolean z7;
        Object next;
        Iterator it2;
        mdz mdzVar;
        Boolean boolValueOf;
        if (onmVar instanceof v041) {
            v041Var = (v041) onmVar;
            int i = v041Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                v041Var.t = i - Integer.MIN_VALUE;
            } else {
                v041Var = new v041(this, onmVar);
            }
        } else {
            v041Var = new v041(this, onmVar);
        }
        Object objU = v041Var.h;
        int i2 = v041Var.t;
        LinkedHashSet linkedHashSet = this.h;
        rih1 rih1Var2 = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objU);
                jn7 jn7Var = this.a;
                GetConsumptionRecordsRequest getConsumptionRecordsRequestN = GetConsumptionRecordsRequest.n();
                v041Var.a = j;
                j4 = j2;
                v041Var.b = j4;
                j5 = j3;
                v041Var.c = j5;
                z3 = z;
                v041Var.e = z3;
                z4 = z2;
                v041Var.f = z4;
                v041Var.t = 1;
                objU = jn7Var.u(getConsumptionRecordsRequestN, v041Var);
                if (objU != d9nVar) {
                    j6 = j;
                }
                return d9nVar;
            }
            if (i2 == 1) {
                boolean z8 = v041Var.f;
                boolean z9 = v041Var.e;
                long j10 = v041Var.c;
                long j11 = v041Var.b;
                j6 = v041Var.a;
                hm5.M(objU);
                j5 = j10;
                j4 = j11;
                z4 = z8;
                z3 = z9;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        hm5.M(objU);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j12 = v041Var.d;
                z5 = v041Var.f;
                z6 = v041Var.e;
                j8 = v041Var.c;
                j9 = v041Var.b;
                long j13 = v041Var.a;
                ArrayList arrayList2 = v041Var.g;
                hm5.M(objU);
                y041Var = this;
                arrayList = arrayList2;
                j6 = j13;
                rih1Var = rih1Var2;
                j7 = j12;
            }
            uv00Var = (uv00) objU;
            if (uv00Var == null) {
                return rih1Var;
            }
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    z7 = z5;
                    next = null;
                    break;
                }
                next = it.next();
                it2 = it;
                z7 = z5;
                mdzVar = uv00Var.a(mdz.class, (String) next).b;
                if (mdzVar != null) {
                    boolValueOf = Boolean.valueOf(mdzVar.l);
                } else {
                    boolValueOf = null;
                }
                u890.j(boolValueOf, Boolean.TRUE);
                if (u890.j(boolValueOf, Boolean.FALSE)) {
                    break;
                }
                it = it2;
                z5 = z7;
            }
            str = (String) next;
            if (str == null) {
                return rih1Var;
            }
            jB = j7;
            z4 = z7;
            z3 = z6;
            j5 = j8;
            j4 = j9;
            str2 = str;
            linkedHashSet.add(str2);
            v041Var.g = null;
            v041Var.a = j6;
            v041Var.b = j4;
            v041Var.c = j5;
            v041Var.e = z3;
            v041Var.f = z4;
            v041Var.d = jB;
            v041Var.t = 3;
            if (y041Var.a(str2, v041Var) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
            GetConsumptionRecordsResponse getConsumptionRecordsResponse = (GetConsumptionRecordsResponse) objU;
            jB = this.e.b() / 1000;
            h290 h290VarN = getConsumptionRecordsResponse.n();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = h290VarN.iterator();
            while (it3.hasNext()) {
                Iterator it4 = it3;
                Object next2 = it4.next();
                ConsumptionRecord consumptionRecord = (ConsumptionRecord) next2;
                long jP = jB - consumptionRecord.p();
                rih1 rih1Var3 = rih1Var2;
                ngv ngvVar = ngv.e;
                if (jP >= jfv.u(j6, ngvVar)) {
                    if (jfv.u(j4, ngvVar) > 0) {
                        if (jP <= jfv.u(j4, ngvVar) + jfv.u(j6, ngvVar)) {
                            if (consumptionRecord.o() >= j5) {
                                arrayList3.add(next2);
                            }
                        }
                    } else if (consumptionRecord.o() >= j5) {
                        arrayList3.add(next2);
                    }
                }
                it3 = it4;
                rih1Var2 = rih1Var3;
            }
            rih1Var = rih1Var2;
            if (arrayList3.isEmpty()) {
                return rih1Var;
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                String strN = ((ConsumptionRecord) it5.next()).n();
                strN.getClass();
                if (strN.length() <= 0 || (z3 && linkedHashSet.contains(strN))) {
                    strN = null;
                }
                if (strN != null) {
                    arrayList4.add(strN);
                }
            }
            if (arrayList4.isEmpty()) {
                return rih1Var;
            }
            if (z4) {
                v041Var.g = arrayList4;
                v041Var.a = j6;
                v041Var.b = j4;
                v041Var.c = j5;
                v041Var.e = z3;
                v041Var.f = z4;
                v041Var.d = jB;
                v041Var.t = 2;
                y041Var = this;
                Object objE = y041Var.e(arrayList4, v041Var);
                if (objE != d9nVar) {
                    arrayList = arrayList4;
                    objU = objE;
                    z5 = z4;
                    j7 = jB;
                    long j14 = j4;
                    z6 = z3;
                    j8 = j5;
                    j9 = j14;
                    uv00Var = (uv00) objU;
                    if (uv00Var == null) {
                        return rih1Var;
                    }
                    it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z7 = z5;
                            next = null;
                            break;
                        }
                        next = it.next();
                        it2 = it;
                        z7 = z5;
                        mdzVar = uv00Var.a(mdz.class, (String) next).b;
                        if (mdzVar != null) {
                            boolValueOf = Boolean.valueOf(mdzVar.l);
                        } else {
                            boolValueOf = null;
                        }
                        u890.j(boolValueOf, Boolean.TRUE);
                        if (u890.j(boolValueOf, Boolean.FALSE)) {
                            break;
                            break;
                        }
                        it = it2;
                        z5 = z7;
                    }
                    str = (String) next;
                    if (str == null) {
                        return rih1Var;
                    }
                    jB = j7;
                    z4 = z7;
                    z3 = z6;
                    j5 = j8;
                    j4 = j9;
                    str2 = str;
                    linkedHashSet.add(str2);
                    v041Var.g = null;
                    v041Var.a = j6;
                    v041Var.b = j4;
                    v041Var.c = j5;
                    v041Var.e = z3;
                    v041Var.f = z4;
                    v041Var.d = jB;
                    v041Var.t = 3;
                    if (y041Var.a(str2, v041Var) == d9nVar) {
                        return rih1Var;
                    }
                }
            } else {
                y041Var = this;
                str = (String) o7h.q0(arrayList4);
                str2 = str;
                linkedHashSet.add(str2);
                v041Var.g = null;
                v041Var.a = j6;
                v041Var.b = j4;
                v041Var.c = j5;
                v041Var.e = z3;
                v041Var.f = z4;
                v041Var.d = jB;
                v041Var.t = 3;
                if (y041Var.a(str2, v041Var) == d9nVar) {
                    return rih1Var;
                }
            }
            return d9nVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return rih1Var2;
        }
    }

    public final void c() {
        if (this.g == null) {
            ynb0 ynb0Var = this.d;
            int iG = ((d25) ynb0Var.get()).g();
            ytw0 ytw0Var = jfv.b;
            int iH = ((d25) ynb0Var.get()).h();
            ngv ngvVar = ngv.e;
            long jK0 = fdg1.k0(iH, ngvVar);
            int iB = ((d25) ynb0Var.get()).b();
            ngv ngvVar2 = ngv.g;
            long jK1 = fdg1.k0(iB, ngvVar2);
            long jK2 = fdg1.k0(((d25) ynb0Var.get()).c(), ngvVar2);
            long jF = ((d25) ynb0Var.get()).f();
            boolean zE = ((d25) ynb0Var.get()).e();
            boolean zD = ((d25) ynb0Var.get()).d();
            if (iG <= 0 || jfv.u(jK0, ngvVar) <= 0) {
                return;
            }
            llm llmVarE = smo1.e(flo1.l(guo1.B(), this.f));
            this.g = llmVarE;
            fn31.T(llmVarE, (o8n) null, 0, new x041(iG, jK0, this, jK1, jK2, jF, zE, zD, null), 3);
        }
    }

    public final void d() {
        llm llmVar = this.g;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.g = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ArrayList arrayList, onm onmVar) {
        w041 w041Var;
        if (onmVar instanceof w041) {
            w041Var = (w041) onmVar;
            int i = w041Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w041Var.c = i - Integer.MIN_VALUE;
            } else {
                w041Var = new w041(this, onmVar);
            }
        } else {
            w041Var = new w041(this, onmVar);
        }
        Object objJ = w041Var.a;
        int i2 = w041Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleFirstOrError = this.c.b(new oi("runtime-consumption-trigger", false, new nec0(arrayList, (byte) 18))).filter(pdx0.h).firstOrError();
                w041Var.c = 1;
                objJ = fc11.j(singleFirstOrError, w041Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            return (uv00) objJ;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void g(ViewGroup viewGroup) {
    }
}
