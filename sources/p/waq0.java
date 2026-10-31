package p;

import android.view.MotionEvent;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.geometry.Offset;
import androidx.work.impl.WorkDatabase;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class waq0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ waq0(nkr0 nkr0Var, bs41 bs41Var) {
        this.a = (byte) 1;
        this.b = nkr0Var;
    }

    public final Object invoke(Object obj) {
        Object objA;
        in31 in31Var;
        switch (this.a) {
            case 0:
                ((xaq0) this.b).H1((ho11) obj);
                return rih1.a;
            case 1:
                nkr0 nkr0Var = (nkr0) this.b;
                float fFloatValue = ((Float) obj).floatValue();
                jkr0 jkr0Var = nkr0Var.b;
                jkr0Var.q.t(jkr0Var.j(((err0) jkr0Var.d.c).s() + jch0.U(jkr0Var.n() != 0 ? fFloatValue / jkr0Var.n() : 0.0f)));
                return rih1.a;
            case 2:
                h661 h661Var = (h661) this.b;
                int iIntValue = ((Integer) obj).intValue();
                return h661Var.e(iIntValue) + ": " + h661Var.g(iIntValue).h();
            case 3:
                ((pav0) this.b).a().invoke((MotionEvent) obj);
                return rih1.a;
            case 4:
                tcv0 tcv0Var = (tcv0) this.b;
                neg negVar = (neg) obj;
                neg.b(negVar, "type", chc1.b, 12);
                neg.b(negVar, "value", omo1.l("kotlinx.serialization.Polymorphic<" + tcv0Var.a.r() + '>', k661.h, new h661[0]), 12);
                negVar.b = tcv0Var.b;
                return rih1.a;
            case 5:
                ((h4k) this.b).f(obj);
                return rih1.a;
            case 6:
                ((x311) this.b).a((lov) obj);
                return rih1.a;
            case 7:
                cf41 cf41Var = (cf41) this.b;
                uv91 uv91Var = (ven0) obj;
                if (!(uv91Var instanceof uv91)) {
                    hhg1.n("Failed requirement.");
                    return null;
                }
                uv91 uv91Var2 = uv91Var;
                if (uv91Var2.getValue() != null) {
                    Object value = uv91Var2.getValue();
                    value.getClass();
                    objA = cf41Var.a(value);
                } else {
                    objA = null;
                }
                return new hrr0(objA, uv91Var2.g());
            case 8:
                ((vgr) this.b).h = (sk30) obj;
                return rih1.a;
            case 9:
                ((waq0) this.b).invoke(new cva((d441) obj, (byte) 0));
                return rih1.a;
            case 10:
                in31 in31Var2 = (in31) this.b;
                d441 d441Var = (d441) obj;
                int i = in31Var2.g;
                if (1 <= i) {
                    int i2 = 1;
                    while (true) {
                        int i3 = in31Var2.f[i2];
                        if (i3 == 1) {
                            d441Var.t(i2);
                        } else if (i3 == 2) {
                            d441Var.r(i2, in31Var2.b[i2]);
                        } else if (i3 == 3) {
                            d441Var.s(in31Var2.c[i2], i2);
                        } else if (i3 == 4) {
                            String str = in31Var2.d[i2];
                            if (str != null) {
                                d441Var.K(i2, str);
                            } else {
                                hhg1.n("Required value was null.");
                            }
                        } else if (i3 == 5) {
                            byte[] bArr = in31Var2.e[i2];
                            if (bArr != null) {
                                d441Var.n(bArr, i2);
                            } else {
                                hhg1.n("Required value was null.");
                            }
                        }
                        if (i2 != i) {
                            i2++;
                        }
                    }
                    return null;
                }
                return rih1.a;
            case 11:
                ((Disposable) this.b).dispose();
                return rih1.a;
            case 12:
                nd41 nd41Var = ((ld41) this.b).c;
                return Boolean.valueOf(nd41Var != null ? nd41Var.d(obj) : true);
            case 13:
                es41 es41Var = (es41) this.b;
                float fFloatValue2 = ((Float) obj).floatValue();
                err0 err0Var = es41Var.a;
                float fS = err0Var.s() + fFloatValue2 + es41Var.g;
                float fO = yoi1.o(fS, 0.0f, es41Var.f.s());
                boolean z = fS == fO;
                float fS2 = fO - err0Var.s();
                int iRound = Math.round(fS2);
                err0Var.t(err0Var.s() + iRound);
                es41Var.g = fS2 - iRound;
                if (!z) {
                    fFloatValue2 = fS2;
                }
                return Float.valueOf(fFloatValue2);
            case 14:
                du41 du41Var = (du41) this.b;
                return new Offset(du41Var.d(du41Var.k, ((Offset) obj).a, du41Var.j));
            case 15:
                hav0 hav0Var = (hav0) obj;
                if (((qnm0) this.b).b(hav0Var.c)) {
                    hav0Var.a();
                }
                return rih1.a;
            case 16:
                b261.x((e261) obj, ((pm31) this.b).a);
                return rih1.a;
            case 17:
                ((List) obj).add((Float) ((etb0) this.b).invoke());
                return true;
            case 18:
                return (nma0) this.b;
            case 19:
                cw61 cw61Var = (cw61) this.b;
                kd31 kd31Var = (kd31) obj;
                kd31Var.u(kd31Var.T0.h() * cw61Var.a);
                kd31Var.w(cw61Var.b);
                kd31Var.f(cw61Var.c);
                kd31Var.c(cw61Var.d);
                kd31Var.x(cw61Var.e);
                return rih1.a;
            case 20:
                yw81 yw81Var = (yw81) this.b;
                kd31 kd31Var2 = (kd31) obj;
                kd31Var2.q(yw81Var.O0);
                kd31Var2.r(yw81Var.P0);
                kd31Var2.b(yw81Var.Q0);
                kd31Var2.C(yw81Var.R0);
                kd31Var2.E(yw81Var.S0);
                kd31Var2.u(yw81Var.T0);
                kd31Var2.l(yw81Var.U0);
                kd31Var2.n(yw81Var.V0);
                kd31Var2.p(yw81Var.W0);
                kd31Var2.e(yw81Var.X0);
                kd31Var2.A(yw81Var.Y0);
                kd31Var2.w(yw81Var.Z0);
                kd31Var2.f(yw81Var.a1);
                kd31Var2.k(yw81Var.b1);
                kd31Var2.c(yw81Var.c1);
                kd31Var2.x(yw81Var.d1);
                kd31Var2.i(yw81Var.e1);
                kd31Var2.d(yw81Var.f1);
                kd31Var2.g(yw81Var.g1);
                rkb0 rkb0Var = yw81Var.h1;
                if (!u890.j(kd31Var2.S0, rkb0Var)) {
                    kd31Var2.a |= 1048576;
                    kd31Var2.S0 = rkb0Var;
                }
                return rih1.a;
            case 21:
                n191 n191Var = (n191) this.b;
                r261 r261Var = n191Var.g;
                r261Var.getClass();
                if (!u890.j(n191Var.g, r261Var)) {
                    bmv0.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                oen0 oen0Var = n191Var.f;
                Object obj2 = n191Var.d;
                if (oen0Var != null) {
                    if (obj2 != null) {
                        bmv0.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    oen0Var.a(obj);
                } else if (obj2 == null) {
                    n191Var.d = obj;
                } else {
                    oen0 oen0Var2 = ij41.a;
                    oen0 oen0Var3 = new oen0();
                    oen0Var3.a(obj2);
                    oen0Var3.a(obj);
                    n191Var.f = oen0Var3;
                    n191Var.d = null;
                }
                return rih1.a;
            case 22:
                return Integer.valueOf(((ze91) this.b).b(aym.k(((znm0) obj).e)));
            case 23:
                return Boolean.valueOf(u890.j(((ug10) obj).a, (xr91) this.b));
            case 24:
                return Boolean.valueOf(u890.j(((tg10) obj).a, (wr91) this.b));
            case 25:
                ((drr0) this.b).t(((Float) obj).floatValue());
                return rih1.a;
            case 26:
                ((err0) this.b).t(((Integer) obj).intValue());
                return rih1.a;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((frr0) this.b).t(((Long) obj).longValue());
                return rih1.a;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((hrr0) this.b).setValue(obj);
                return rih1.a;
            default:
                zsc zscVar = (zsc) this.b;
                hhg1 hhg1Var = vwl1.z;
                pwz0 pwz0VarW = ((WorkDatabase) obj).w();
                String str2 = " AND";
                ArrayList arrayList = (ArrayList) zscVar.c;
                ArrayList arrayList2 = (ArrayList) zscVar.d;
                ArrayList arrayList3 = (ArrayList) zscVar.b;
                ArrayList arrayList4 = new ArrayList();
                StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
                String str3 = " WHERE";
                ArrayList arrayList5 = (ArrayList) zscVar.e;
                byte b = 10;
                if (!arrayList5.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                    Iterator it = arrayList5.iterator();
                    while (it.hasNext()) {
                        arrayList6.add(Integer.valueOf(cwl1.m0((wvl1) it.next())));
                    }
                    sb.append(" WHERE state IN (");
                    cwl1.i(arrayList6.size(), sb);
                    sb.append(")");
                    arrayList4.addAll(arrayList6);
                    str3 = " AND";
                }
                if (!arrayList3.isEmpty()) {
                    ArrayList arrayList7 = new ArrayList(q7h.U(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList7.add(((UUID) it2.next()).toString());
                    }
                    sb.append(str3.concat(" id IN ("));
                    cwl1.i(arrayList3.size(), sb);
                    sb.append(")");
                    arrayList4.addAll(arrayList7);
                    str3 = " AND";
                }
                if (arrayList2.isEmpty()) {
                    str2 = str3;
                } else {
                    sb.append(str3.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
                    cwl1.i(arrayList2.size(), sb);
                    sb.append("))");
                    arrayList4.addAll(arrayList2);
                }
                if (!arrayList.isEmpty()) {
                    sb.append(str2.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
                    cwl1.i(arrayList.size(), sb);
                    sb.append("))");
                    arrayList4.addAll(arrayList);
                }
                sb.append(";");
                String string = sb.toString();
                Object[] array = arrayList4.toArray(new Object[0]);
                pwz0VarW.getClass();
                TreeMap treeMap = in31.h;
                int length = array != null ? array.length : 0;
                TreeMap treeMap2 = in31.h;
                synchronized (treeMap2) {
                    Map.Entry entryCeilingEntry = treeMap2.ceilingEntry(Integer.valueOf(length));
                    if (entryCeilingEntry != null) {
                        treeMap2.remove(entryCeilingEntry.getKey());
                        in31Var = (in31) entryCeilingEntry.getValue();
                        in31Var.a = string;
                        in31Var.g = length;
                    } else {
                        in31Var = new in31(length);
                        in31Var.a = string;
                        in31Var.g = length;
                    }
                }
                mno1.f(new hn31(in31Var), array);
                String str4 = in31Var.a;
                if (str4 == null) {
                    eg.m("Required value was null.");
                    str4 = null;
                }
                return (List) hhg1Var.apply((List) qyo1.x(pwz0VarW.a, true, false, new pg((Object) str4, (Object) new rpv0(str4, new waq0(in31Var, b)), (Object) pwz0VarW, (byte) 25)));
        }
    }

    public /* synthetic */ waq0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
