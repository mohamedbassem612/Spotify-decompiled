package p;

import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class w361 {
    public static final z570 a = new z570();
    public static b180 b;

    public static final void a(tky tkyVar, iu30 iu30Var, fmy fmyVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-247436052);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(tkyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(fmyVar) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uvx uvxVar = new uvx((pgx) null, 0, (tvx) null, (p3v) null, 30);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            String strN0 = cwl1.n0(2131953586, new Object[]{tkyVar.b}, b0kVar3);
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new y9y(iu30Var, (byte) 14);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strN0), (Function0) objT), (gbx) null, (xu30) null, apo.r(-748562461, new cex(fmyVar, tkyVar, (byte) 2), b0kVar3), (xu30) null, apo.r(-242934236, new wky(tkyVar, (byte) 0), b0kVar3), apo.r(-650957851, new cex(tkyVar, iu30Var, (byte) 3), b0kVar3), (xu30) null, (xu30) null, apo.r(-1875028696, new wky(tkyVar, (byte) 1), b0kVar3), b0kVar2, 805306432, 197040, 26044);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t((byte) 23, i, tkyVar, fmyVar, iu30Var);
        }
    }

    public static final void b(String str, String str2, gbx gbxVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-961544977);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(gbxVar) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            k5p1.d(qim0VarY, h36.g, new d36(8.0f, true, new um5(false)), een.N0, 0, 0, apo.r(1887457620, new ny40(str, gbxVar, str2, (byte) 0), x340Var), x340Var, 1572864, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oy40(str, str2, gbxVar, i, (byte) 0);
        }
    }

    public static final void c(String str, String str2, gbx gbxVar, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2105771536);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.i(gbxVar) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwo1.e(str, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, cbx.b(x340Var2).b.b, 7), cbx.d(x340Var2).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, i2 & 14, 0, 2040);
            foo1.c(gbxVar, new idx(6), (qim0) null, (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1646330661, new ps00(str2, (byte) 28), x340Var2), x340Var2, (i2 >> 6) & 14, 48, 2012);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oy40(str, str2, gbxVar, i, (byte) 1);
        }
    }

    public static final void d(String str, String str2, gbx gbxVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1831697569);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(gbxVar) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            k5p1.d(qim0VarX, h36.g, new d36(8.0f, true, new um5(false)), een.N0, 0, 0, apo.r(-748575162, new ny40(str, gbxVar, str2, (byte) 1), x340Var), x340Var, 1572864, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oy40(str, str2, gbxVar, i, (byte) 2);
        }
    }

    public static final void e(jlw0 jlw0Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1072209479);
        int i2 = (b0kVar2.g(jlw0Var) ? 4 : 2) | i | (b0kVar2.g(qim0Var) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0VarK = !((Boolean) ven0Var.getValue()).booleanValue() ? d9y0.k(qim0Var, 0.0f) : qim0Var;
            Uri uri = Uri.parse(jlw0Var.a);
            fwx fwxVarG = hso1.G(box.c, 0L, u7h.j, b0kVar2, box.d | 3456, 18);
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = new abh0(ven0Var, (byte) 17);
                b0kVar2.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            Object objT3 = b0kVar2.T();
            if (objT3 == m4cVar) {
                objT3 = new abh0(ven0Var, (byte) 18);
                b0kVar2.s0(objT3);
            }
            ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, fwxVarG, true, false, (j6m) null, iu30Var, (iu30) objT3, (iu30) null, 0L, b0kVar2, 102957056, 3456, 118430);
            b0kVar2 = b0kVar2;
            eso1.h(ni7VarA, new jsl(jlw0Var.b), qim0VarK, (p3v) null, (zvx) null, (ecx) null, mif1.S0, (tl3) null, (ColorFilter) null, b0kVar2, 1797120, 384);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new j7n0(jlw0Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void f(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1647383344);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            klz0 klz0Var = (klz0) x340Var.k(llz0.a);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = bin.x(dug.f(i1p1.q(qim0Var3, cr31VarB), cbx.a(x340Var).a.b.a(), d4o1.a), false, (String) null, (pm31) null, (idn0) null, function0, 15);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarX, 8.0f, 4.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(klz0Var.b.b.a, (qim0) null, cbx.d(x340Var).m, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(function0, qim0Var2, i, (byte) 7);
        }
    }

    public static final CollectionPlatformItemsRequest g(List list) {
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.n(list);
        u4hVarQ.t(w5h.f);
        return u4hVarQ.build();
    }

    public static long h(int i, long j) {
        return jjl.a(i == 1 ? hjl.k(j) : hjl.j(j), i == 1 ? hjl.i(j) : hjl.h(j), i == 1 ? hjl.j(j) : hjl.k(j), i == 1 ? hjl.h(j) : hjl.i(j));
    }

    public static long i(int i, long j) {
        return jjl.a(0, hjl.i(j), (i & 4) != 0 ? hjl.j(j) : 0, hjl.h(j));
    }

    public static final Integer j(fde1 fde1Var, c380 c380Var, int i, int i2, long j) {
        Object obj = null;
        if (!c380Var.isEmpty() && j > 0 && j != Long.MAX_VALUE) {
            int iOrdinal = fde1Var.ordinal();
            if (iOrdinal == 0) {
                oce1 oce1Var = (oce1) o7h.t0(i2, c380Var);
                if (oce1Var != null) {
                    long j2 = oce1Var.b;
                    lr80 it = new tr80(0, i2, 1).iterator();
                    while (((sr80) it).c) {
                        Object next = it.next();
                        if (j2 - ((oce1) c380Var.get(((Number) next).intValue())).a <= j) {
                            obj = next;
                            break;
                        }
                    }
                    Integer num = (Integer) obj;
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    return Integer.valueOf(i2);
                }
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                oce1 oce1Var2 = (oce1) o7h.t0(i, c380Var);
                if (oce1Var2 != null) {
                    long j3 = oce1Var2.a;
                    lr80 it2 = new tr80(i, p7h.L(c380Var), 1).iterator();
                    while (((sr80) it2).c) {
                        Object next2 = it2.next();
                        if (((oce1) c380Var.get(((Number) next2).intValue())).b - j3 <= j) {
                            obj = next2;
                        }
                    }
                    Integer num2 = (Integer) obj;
                    if (num2 != null) {
                        i = num2.intValue();
                    }
                    return Integer.valueOf(i);
                }
            }
        }
        return null;
    }

    public static final Float k(fde1 fde1Var, Integer num, q5v q5vVar) {
        Float f;
        if (num != null && (f = (Float) q5vVar.a.get(num)) != null) {
            float fFloatValue = f.floatValue();
            int iOrdinal = fde1Var.ordinal();
            if (iOrdinal == 0) {
                return f;
            }
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            Float f2 = (Float) q5vVar.b.get(num);
            if (f2 != null) {
                return Float.valueOf(f2.floatValue() + fFloatValue);
            }
        }
        return null;
    }

    public static final Integer l(float f, q5v q5vVar) {
        Map map = q5vVar.a;
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MIN_VALUE;
        Integer numValueOf3 = null;
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            float fFloatValue = ((Number) entry.getValue()).floatValue();
            Float f4 = (Float) q5vVar.b.get(Integer.valueOf(iIntValue));
            if ((f4 != null ? f4.floatValue() : 0.0f) + fFloatValue >= 0.0f && fFloatValue <= q5vVar.c) {
                if (fFloatValue < f2) {
                    numValueOf2 = Integer.valueOf(iIntValue);
                    f2 = fFloatValue;
                }
                if (fFloatValue > f3) {
                    numValueOf3 = Integer.valueOf(iIntValue);
                    f3 = fFloatValue;
                }
                if (f >= fFloatValue) {
                    if (numValueOf != null) {
                        Float f5 = (Float) map.get(numValueOf);
                        if (fFloatValue > (f5 != null ? f5.floatValue() : Float.MIN_VALUE)) {
                        }
                    }
                    numValueOf = Integer.valueOf(iIntValue);
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        return f < f2 ? numValueOf2 : numValueOf3;
    }

    public static final long m(long j) {
        long j2 = 63 & j;
        if (j2 >= 16) {
            j = (j & (-64)) | (j2 + 1);
        }
        int i = u7h.l;
        return j;
    }

    public static final mr20 n(dxl1 dxl1Var, UUID uuid) {
        List listSingletonList = Collections.singletonList(String.valueOf(uuid));
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        anm1.h(listSingletonList.size(), sb);
        sb.append(")");
        return rqt0.u(new xwl1(zno1.h(dxl1Var.a, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new d5e1(sb.toString(), listSingletonList, dxl1Var, (byte) 9)), (byte) 1));
    }

    public static void o(BulkRedownloadCancelReceiver bulkRedownloadCancelReceiver, vpp0 vpp0Var) {
        bulkRedownloadCancelReceiver.a = vpp0Var;
    }

    public static c670 p(c670... c670VarArr) {
        int length = c670VarArr.length;
        z570 z570Var = a;
        if (length != 0) {
            if (length == 1) {
                return c670VarArr[0];
            }
            ArrayList arrayList = new ArrayList(c670VarArr.length);
            for (c670 c670Var : c670VarArr) {
                c670Var.getClass();
                if (c670Var instanceof a670) {
                    ArrayList arrayList2 = ((a670) c670Var).a;
                    arrayList.ensureCapacity((arrayList2.size() + arrayList.size()) - 1);
                    arrayList.addAll(arrayList2);
                } else if (c670Var != z570Var) {
                    arrayList.add(c670Var);
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                return size != 1 ? new a670(arrayList) : (c670) arrayList.get(0);
            }
        }
        return z570Var;
    }

    public static Next q(htv htvVar) {
        arv arvVar;
        int size;
        int iNextIndex;
        List<bhk0> list = htvVar.j.g;
        if (u890.j(htvVar.f, u2d0.a)) {
            int size2 = 0;
            int i = 0;
            for (bhk0 bhk0Var : list) {
                if (bhk0Var instanceof r8t) {
                    size2 += ((r8t) bhk0Var).a.size();
                } else {
                    if (bhk0Var instanceof aom0) {
                        size = ((aom0) bhk0Var).a.size();
                    } else if (bhk0Var instanceof bhk0) {
                        size = bhk0Var.b.size();
                    }
                    i += size;
                }
            }
            arvVar = new arv((Integer) null, (size2 == 0 && i == 0) ? null : new o3w(0, size2, i, 1), htvVar.g, 1);
        } else {
            arvVar = new arv(2131955215, (o3w) null, (x7i1) null, 6);
        }
        arv arvVar2 = arvVar;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((ilq0) listIterator.previous()) instanceof bhk0) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        return Next.i(htv.a(htvVar, false, true, false, (x7i1) null, (gtv) null, (Map) null, (etv) null, (ArrayList) null, (c380) null, 4091), Collections.singleton(iNextIndex >= 0 ? new frv(htvVar.l, list.subList(0, iNextIndex), list.subList(iNextIndex + 1, list.size()), (bhk0) list.get(iNextIndex), arvVar2) : new erv(list, arvVar2)));
    }

    public static b670 r(int i, n570 n570Var) {
        return new b670(i, n570Var);
    }

    public static String s(int i) {
        switch (i) {
            case 0:
                return "NOT_STARTED";
            case 1:
                return "STARTED";
            case 2:
                return "REDIRECT_RECEIVED";
            case 3:
                return "AWAITING_FOLLOW_REDIRECT";
            case 4:
                return "AWAITING_READ";
            case 5:
                return "READING";
            case 6:
                return "ERROR";
            case 7:
                return "COMPLETE";
            case 8:
                return "CANCELLED";
            default:
                hhg1.n(f4i1.c(i, "Unknown state "));
                return null;
        }
    }

    public static final long t(long j) {
        return jjl.a(hjl.k(j), hjl.i(j), hjl.j(j), hjl.h(j));
    }

    public static final ArrayList u(List list, Map map) {
        String str;
        Long lD0;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pvc0 pvc0Var = (pvc0) it.next();
            String str2 = (String) map.get(pvc0Var.c);
            che cheVar = null;
            if (str2 != null && !ihc1.y0(str2) && (str = (String) pvc0Var.f.get("chapter.start_position_in_milliseconds")) != null && (lD0 = nhc1.d0(10, str)) != null) {
                cheVar = new che(lD0.longValue(), str2);
            }
            if (cheVar != null) {
                arrayList.add(cheVar);
            }
        }
        return arrayList;
    }

    public static final long v(long j) {
        long j2 = 63 & j;
        int i = (int) j2;
        if (i <= 15) {
            return j;
        }
        if (i == ((hah) kah.u).c) {
            return z4p1.G(j);
        }
        if ((i == ((hah) kah.v).c || i == ((hah) kah.w).c) && Build.VERSION.SDK_INT < 34) {
            return z4p1.G(j);
        }
        return (i != ((hah) kah.x).c || Build.VERSION.SDK_INT >= 36) ? (j & (-64)) | (j2 - 1) : z4p1.G(j);
    }

    public static final long w(long j) {
        int i = (int) (63 & j);
        return (i == ((hah) kah.x).c || i == ((hah) kah.s).c || i == ((hah) kah.t).c) ? v(u7h.a(j, kah.e)) : v(j);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004d A[PHI: r3
      0x004d: PHI (r3v8 int) = (r3v2 int), (r3v0 int) binds: [B:38:0x0061, B:29:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    public static g811 x(h7v h7vVar, fde1 fde1Var, Integer num, Integer num2, int i, int i2, List list, int i3) {
        h7v h7vVarA;
        int iIntValue = i;
        int iIntValue2 = i2;
        boolean z = (i3 & 128) == 0;
        boolean z2 = (i3 & 256) != 0;
        if (num == null) {
            return new g811(h7vVar, list);
        }
        fde1 fde1Var2 = fde1.a;
        if (z && (fde1Var != fde1Var2 ? num.intValue() <= iIntValue : num.intValue() >= iIntValue2)) {
            return new g811(h7vVar, list);
        }
        if (fde1Var == fde1Var2) {
            iIntValue = num.intValue();
            int iIntValue3 = num2 != null ? num2.intValue() : 0;
            if (iIntValue < iIntValue3) {
                iIntValue = iIntValue3;
            }
            if (iIntValue > iIntValue2) {
                iIntValue = iIntValue2;
            }
        } else {
            iIntValue2 = num.intValue();
            int iIntValue4 = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
            if (iIntValue2 > iIntValue4) {
                iIntValue2 = iIntValue4;
            }
            if (iIntValue2 >= iIntValue) {
                iIntValue = iIntValue2;
            }
        }
        int i4 = iIntValue;
        int i5 = fde1Var == fde1Var2 ? h7vVar.i : h7vVar.j;
        if (z2 && i4 == i5) {
            return new g811(h7vVar, list);
        }
        if (fde1Var == fde1Var2) {
            h7vVarA = h7v.a(h7vVar, false, false, 0.0f, 0.0f, 0.0f, 0.0f, (Integer) null, (Integer) null, i4, 0, 0.0f, (Integer) null, 0, 0.0f, false, false, 65279);
        } else {
            h7vVarA = h7v.a(h7vVar, false, false, 0.0f, 0.0f, 0.0f, 0.0f, (Integer) null, (Integer) null, 0, i4, 0.0f, (Integer) null, 0, 0.0f, false, false, 65023);
            i4 = i4;
        }
        return new g811(h7vVarA, o7h.O0(new law(fde1Var, i4), list));
    }
}
