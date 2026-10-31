package p;

import android.app.Activity;
import com.spotify.connect.esperanto.proto.ConnectMessages;
import io.reactivex.rxjava3.core.Single;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o3s {
    public final y2l a;
    public final Activity b;
    public final a1r0 c;
    public final qqs d;
    public final ca40 e;
    public final q8n f;
    public final llm g;

    public o3s(y2l y2lVar, Activity activity, a1r0 a1r0Var, qqs qqsVar, ca40 ca40Var, q8n q8nVar) {
        this.a = y2lVar;
        this.b = activity;
        this.c = a1r0Var;
        this.d = qqsVar;
        this.e = ca40Var;
        this.f = q8nVar;
        this.g = smo1.e(ha71.A(guo1.B(), q8nVar).y(new v62((byte) 4)));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, tv80 tv80Var, onm onmVar) {
        l3s l3sVar;
        if (onmVar instanceof l3s) {
            l3sVar = (l3s) onmVar;
            int i = l3sVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                l3sVar.e = i - Integer.MIN_VALUE;
            } else {
                l3sVar = new l3s(this, onmVar);
            }
        } else {
            l3sVar = new l3s(this, onmVar);
        }
        Object objJ = l3sVar.c;
        int i2 = l3sVar.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleA = this.e.a();
            l3sVar.a = str;
            l3sVar.b = tv80Var;
            l3sVar.e = 1;
            objJ = fc11.j(singleA, l3sVar);
            if (objJ != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objJ);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(objJ);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tv80Var = l3sVar.b;
        str = l3sVar.a;
        hm5.M(objJ);
        boolean zBooleanValue = ((Boolean) objJ).booleanValue();
        q8n q8nVar = this.f;
        if (zBooleanValue) {
            gke gkeVar = new gke(this, tv80Var, str, (lnm) null);
            l3sVar.a = null;
            l3sVar.b = null;
            l3sVar.e = 2;
            if (c921.H(q8nVar, gkeVar, l3sVar) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        l3sVar.a = null;
        l3sVar.b = null;
        l3sVar.e = 3;
        Object objH = c921.H(q8nVar, new k53(this, str, null, (byte) 9), l3sVar);
        if (objH != d9nVar) {
            objH = rih1Var;
        }
        if (objH == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, d980 d980Var, onm onmVar) throws NoWhenBranchMatchedException {
        m3s m3sVar;
        Enum r10;
        k4l k4lVar;
        if (onmVar instanceof m3s) {
            m3sVar = (m3s) onmVar;
            int i = m3sVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                m3sVar.e = i - Integer.MIN_VALUE;
            } else {
                m3sVar = new m3s(this, onmVar);
            }
        } else {
            m3sVar = new m3s(this, onmVar);
        }
        Object obj = m3sVar.c;
        int i2 = m3sVar.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            int iOrdinal = d980Var.ordinal();
            if (iOrdinal == 0) {
                r10 = null;
            } else if (iOrdinal == 1) {
                r10 = h4n1.a;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                r10 = h4n1.b;
            }
            n3s n3sVar = new n3s(this, (lnm) null, (byte) 0);
            m3sVar.a = str;
            m3sVar.b = r10;
            m3sVar.e = 1;
            if (c921.H(this.f, n3sVar, m3sVar) != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Enum r9 = m3sVar.b;
        String str2 = m3sVar.a;
        hm5.M(obj);
        r10 = r9;
        str = str2;
        m3sVar.a = null;
        m3sVar.b = null;
        m3sVar.e = 2;
        c3l c3lVar = (c3l) this.a;
        c3lVar.getClass();
        t4l t4lVarN = ConnectMessages.SetPreferredIncarnationRequest.n();
        t4lVarN.n(str);
        if (r10 != null) {
            int iOrdinal2 = r10.ordinal();
            if (iOrdinal2 == 0) {
                k4lVar = k4l.b;
            } else {
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                k4lVar = k4l.c;
            }
            t4lVarN.q(k4lVar);
        }
        Object objB = c3lVar.b("SetPreferredIncarnation endpoint", new i24(c3lVar, t4lVarN, (lnm) null, (byte) 25), m3sVar);
        if (objB != d9nVar) {
            objB = rih1Var;
        }
        return objB == d9nVar ? d9nVar : rih1Var;
    }
}
