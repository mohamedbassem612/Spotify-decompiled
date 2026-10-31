package p;

import com.google.protobuf.BytesValue;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qtz {
    public final a4e a;
    public final nfa0 b;
    public final Map c = sqg0.J(new mmr0[]{oqn1.n(tg01.UNKNOWN, 24), oqn1.n(tg01.CAST_INTERNAL_ERROR, 6), oqn1.n(tg01.CASTING_STOPPED, 5), oqn1.n(tg01.APPLICATION_NOT_RUNNING, 2), oqn1.n(tg01.SESSION_START_FAILED, 21), oqn1.n(tg01.SESSION_RESUME_FAILED, 20), oqn1.n(tg01.CAST_SOCKET_ERROR, 7), oqn1.n(tg01.TIMEOUT, 23), oqn1.n(tg01.NETWORK_ERROR, 14), oqn1.n(tg01.CASTING_ROUTE_CHANGED, 4), oqn1.n(tg01.APPLICATION_LAUNCH_ERROR, 0), oqn1.n(tg01.CANCELLED, 3)});

    public qtz(a4e a4eVar, nfa0 nfa0Var) {
        this.a = a4eVar;
        this.b = nfa0Var;
    }

    public final Object a(int i, String str, onm onmVar) {
        k3e k3eVarN = CastMessages.ConnectionErrorRequest.n();
        Integer num = (Integer) this.c.get(pto1.p(i));
        k3eVarN.q(num != null ? num.intValue() : 17);
        k3eVarN.r(i);
        if (str != null) {
            k3eVarN.n(str);
        }
        Object objB = this.a.b(k3eVarN.build(), onmVar);
        return objB == d9n.a ? objB : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        jtz jtzVar;
        if (onmVar instanceof jtz) {
            jtzVar = (jtz) onmVar;
            int i = jtzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jtzVar.c = i - Integer.MIN_VALUE;
            } else {
                jtzVar = new jtz(this, onmVar);
            }
        } else {
            jtzVar = new jtz(this, onmVar);
        }
        Object objC = jtzVar.a;
        int i2 = jtzVar.c;
        if (i2 == 0) {
            hm5.M(objC);
            l3e l3eVarN = CastMessages.DeviceId.n();
            l3eVarN.n(str);
            CastMessages.DeviceId deviceIdBuild = l3eVarN.build();
            jtzVar.c = 1;
            objC = this.a.c(deviceIdBuild, jtzVar);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        ((CastMessages.Response) objC).n().toString();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum c(String str, onm onmVar) {
        ktz ktzVar;
        if (onmVar instanceof ktz) {
            ktzVar = (ktz) onmVar;
            int i = ktzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ktzVar.c = i - Integer.MIN_VALUE;
            } else {
                ktzVar = new ktz(this, onmVar);
            }
        } else {
            ktzVar = new ktz(this, onmVar);
        }
        Object objA = ktzVar.a;
        int i2 = ktzVar.c;
        if (i2 == 0) {
            hm5.M(objA);
            l3e l3eVarN = CastMessages.DeviceId.n();
            l3eVarN.n(str);
            CastMessages.DeviceId deviceIdBuild = l3eVarN.build();
            ktzVar.c = 1;
            objA = this.a.a(deviceIdBuild, ktzVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        CastMessages.Response response = (CastMessages.Response) objA;
        response.n().toString();
        return response.n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(y7u y7uVar, onm onmVar) {
        ltz ltzVar;
        if (onmVar instanceof ltz) {
            ltzVar = (ltz) onmVar;
            int i = ltzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ltzVar.c = i - Integer.MIN_VALUE;
            } else {
                ltzVar = new ltz(this, onmVar);
            }
        } else {
            ltzVar = new ltz(this, onmVar);
        }
        Object objD = ltzVar.a;
        int i2 = ltzVar.c;
        if (i2 == 0) {
            hm5.M(objD);
            String strB = this.b.b(y7u.Companion.serializer(), y7uVar);
            m3e m3eVarN = CastMessages.PutDeviceRequest.n();
            m3eVarN.n(y7uVar.a);
            m3eVarN.q(phc.i(strB));
            CastMessages.PutDeviceRequest putDeviceRequestBuild = m3eVarN.build();
            "PutDevice request: ".concat(strB);
            putDeviceRequestBuild.getClass();
            ltzVar.c = 1;
            objD = this.a.d(putDeviceRequestBuild, ltzVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        ((CastMessages.Response) objD).n().toString();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar) {
        mtz mtzVar;
        if (onmVar instanceof mtz) {
            mtzVar = (mtz) onmVar;
            int i = mtzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mtzVar.c = i - Integer.MIN_VALUE;
            } else {
                mtzVar = new mtz(this, onmVar);
            }
        } else {
            mtzVar = new mtz(this, onmVar);
        }
        Object objE = mtzVar.a;
        int i2 = mtzVar.c;
        if (i2 == 0) {
            hm5.M(objE);
            uhc uhcVarO = BytesValue.o();
            uhcVarO.n(phc.i(str));
            BytesValue bytesValueBuild = uhcVarO.build();
            mtzVar.c = 1;
            objE = this.a.e(bytesValueBuild, mtzVar);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        ((CastMessages.Response) objE).n().toString();
        return rih1.a;
    }
}
