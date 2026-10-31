package p;

import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.mobius.Next;
import com.spotify.mobius.functions.Consumer;
import com.spotify.pushkatokens.v1.proto.AndroidDeviceState;
import com.spotify.pushkatokens.v1.proto.AndroidNotificationChannel;
import com.spotify.pushkatokens.v1.proto.AndroidNotificationPermissions;
import com.spotify.pushkatokens.v1.proto.AndroidPushToken;
import com.spotify.pushkatokens.v1.proto.DeviceState;
import com.spotify.pushkatokens.v1.proto.SyncDeviceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class sok {
    public static final aja a = new aja((byte) 0);
    public static b180 b;
    public static b180 c;

    public static final SyncDeviceRequest A(ocd1 ocd1Var) {
        kax kaxVar;
        y15 y15Var;
        ru4 ru4Var;
        jz4 jz4Var;
        mcd1 mcd1Var;
        kax kaxVar2;
        kcd1 kcd1VarN = SyncDeviceRequest.n();
        kcd1VarN.q(ocd1Var.b);
        String str = Build.VERSION.RELEASE;
        kcd1VarN.t();
        kcd1VarN.s();
        String str2 = ocd1Var.c;
        if (str2 != null) {
            kcd1VarN.u(str2);
        }
        fwt fwtVarN = DeviceState.n();
        gwt gwtVar = ocd1Var.d;
        ato0 ato0Var = gwtVar.a;
        hd4 hd4VarN = AndroidDeviceState.n();
        int iC = l1d.C(gwtVar.b);
        SyncDeviceRequest syncDeviceRequest = null;
        kax kaxVar3 = kax.ENABLED_STATE_UNSPECIFIED;
        kax kaxVar4 = kax.ENABLED_STATE_TRUE;
        kax kaxVar5 = kax.ENABLED_STATE_FALSE;
        if (iC == 0) {
            kaxVar = kaxVar3;
        } else if (iC == 1) {
            kaxVar = kaxVar4;
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            kaxVar = kaxVar5;
        }
        hd4VarN.n(kaxVar);
        int iC2 = l1d.C(gwtVar.c);
        if (iC2 == 0) {
            y15Var = y15.ANDROID_STANDBY_BUCKET_UNSPECIFIED;
        } else if (iC2 == 1) {
            y15Var = y15.ANDROID_STANDBY_BUCKET_ACTIVE;
        } else if (iC2 == 2) {
            y15Var = y15.ANDROID_STANDBY_BUCKET_WORKING_SET;
        } else if (iC2 == 3) {
            y15Var = y15.ANDROID_STANDBY_BUCKET_FREQUENT;
        } else if (iC2 == 4) {
            y15Var = y15.ANDROID_STANDBY_BUCKET_RARE;
        } else {
            if (iC2 != 5) {
                eg.o();
                return null;
            }
            y15Var = y15.ANDROID_STANDBY_BUCKET_RESTRICTED;
        }
        hd4VarN.r(y15Var);
        su4 su4VarO = AndroidNotificationPermissions.o();
        int iC3 = l1d.C(ato0Var.a);
        if (iC3 == 0) {
            ru4Var = ru4.ANDROID_NOTIFICATION_PERMISSION_UNSPECIFIED;
        } else if (iC3 == 1) {
            ru4Var = ru4.ANDROID_NOTIFICATION_PERMISSION_NOT_DETERMINED;
        } else if (iC3 == 2) {
            ru4Var = ru4.ANDROID_NOTIFICATION_PERMISSION_ENABLED;
        } else if (iC3 == 3) {
            ru4Var = ru4.ANDROID_NOTIFICATION_PERMISSION_DENIED;
        } else if (iC3 == 4) {
            ru4Var = ru4.ANDROID_NOTIFICATION_PERMISSION_DENIED_CAN_REQUEST_INLINE;
        } else {
            if (iC3 != 5) {
                eg.o();
                return null;
            }
            ru4Var = ru4.ANDROID_NOTIFICATION_PERMISSION_DENIED_EXPLICIT;
        }
        su4VarO.q(ru4Var);
        List<wjo0> list = ato0Var.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (wjo0 wjo0Var : list) {
            qu4 qu4VarN = AndroidNotificationChannel.n();
            SyncDeviceRequest syncDeviceRequest2 = syncDeviceRequest;
            int iC4 = l1d.C(wjo0Var.b);
            if (iC4 == 0) {
                kaxVar2 = kaxVar3;
            } else if (iC4 == 1) {
                kaxVar2 = kaxVar4;
            } else {
                if (iC4 != 2) {
                    eg.o();
                    return syncDeviceRequest2;
                }
                kaxVar2 = kaxVar5;
            }
            qu4VarN.q(kaxVar2);
            qu4VarN.r(wjo0Var.c);
            qu4VarN.n(wjo0Var.a);
            arrayList.add(qu4VarN.build());
            syncDeviceRequest = syncDeviceRequest2;
        }
        SyncDeviceRequest syncDeviceRequest3 = syncDeviceRequest;
        su4VarO.n(arrayList);
        hd4VarN.q(su4VarO.build());
        fwtVarN.n(hd4VarN.build());
        kcd1VarN.r(fwtVarN.build());
        vxy0 vxy0Var = ocd1Var.a;
        iz4 iz4VarN = AndroidPushToken.n();
        iz4VarN.q(vxy0Var.a);
        int iC5 = l1d.C(2);
        if (iC5 == 0) {
            jz4Var = jz4.ANDROID_PUSH_TOKEN_SOURCE_UNSPECIFIED;
        } else if (iC5 == 1) {
            jz4Var = jz4.ANDROID_PUSH_TOKEN_SOURCE_FCM_TOKEN;
        } else {
            if (iC5 != 2) {
                eg.o();
                return syncDeviceRequest3;
            }
            jz4Var = jz4.ANDROID_PUSH_TOKEN_SOURCE_FIREBASE_INSTALLATION_ID;
        }
        iz4VarN.n(jz4Var);
        kcd1VarN.n((AndroidPushToken) iz4VarN.build());
        int iC6 = l1d.C(ocd1Var.e);
        if (iC6 == 0) {
            mcd1Var = mcd1.SYNC_REASON_UNSPECIFIED;
        } else if (iC6 == 1) {
            mcd1Var = mcd1.SYNC_REASON_SESSION_START;
        } else if (iC6 == 2) {
            mcd1Var = mcd1.SYNC_REASON_PERIODIC;
        } else {
            if (iC6 != 3) {
                eg.o();
                return syncDeviceRequest3;
            }
            mcd1Var = mcd1.SYNC_REASON_TOKEN_VALIDATED;
        }
        kcd1VarN.v(mcd1Var);
        return kcd1VarN.build();
    }

    public static Next B(kak0 kak0Var, s2k0 s2k0Var) {
        kak0 kak0VarA = kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, giq0.a, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -1, 1048574);
        String str = s2k0Var.a;
        return Next.i(kak0VarA, f46.S0(new k1k0[]{i0k0.a, new e0k0(str), new o0k0(str, s2k0Var.b)}));
    }

    public static final void a(hcl1 hcl1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-893082333);
        int i2 = (x340Var.g(hcl1Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var) | ((i2 & 14) == 4);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new j9l1(hcl1Var, ven0Var, (lnm) null, (byte) 0);
                x340Var.s0(objT2);
            }
            rih1 rih1Var = rih1.a;
            qxd0.t(rih1Var, x340Var, (vu30) objT2);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(1507011166);
                boolean zI2 = x340Var.i(ven0Var);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new mek1(ven0Var, (byte) 5);
                    x340Var.s0(objT3);
                }
                i8p1.a((Function0) objT3, x340Var, 6);
                x340Var.r(false);
            } else {
                x340Var.i0(1507135135);
                x340Var.r(false);
            }
            boolean zI3 = x340Var.i(ven0Var);
            Object objT4 = x340Var.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new i2g1(ven0Var, (byte) 21);
                x340Var.s0(objT4);
            }
            qxd0.i(rih1Var, (iu30) objT4, x340Var);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eii1(hcl1Var, qim0Var, i, (byte) 28);
        }
    }

    public static final void b(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(635320758);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            isl islVar = isl.a;
            qim0 qim0Var3 = nim0.a;
            if (str != null) {
                x340Var.i0(-1080065841);
                qim0 qim0VarQ = i1p1.q(qim0Var3, er31.a);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                qim0Var2 = qim0Var3;
                eso1.e(Uri.parse(str), islVar, anm1.N("artwork", u291.m(qim0VarQ, 48.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 24624, 0, 4072);
                x340Var.r(false);
            } else {
                qim0Var2 = qim0Var3;
                x340Var.i0(-1079736032);
                qim0 qim0VarQ2 = i1p1.q(qim0Var2, er31.a);
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                qim0 qim0VarN = anm1.N("artwork_placeholder", dug.f(u291.m(qim0VarQ2, 48.0f), cbx.a(x340Var).a.b.a(), d4o1.a));
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                w0h1.a(ttx.c, islVar, (qim0) null, cbx.a(x340Var).b.b, 0L, false, x340Var, ttx.d | 48, 52);
                x340Var.r(true);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var2, i, (byte) 3);
        }
    }

    public static final void c(wr91 wr91Var, qim0 qim0Var, xu30 xu30Var, b0k b0kVar, int i) {
        Object obj;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-977568115);
        int i2 = (i & 6) == 0 ? (x340Var.g(wr91Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(xu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strQ = bno1.q(x340Var, 2131957975);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                obj = objT;
                vg10 vg10Var = new vg10();
                vg10Var.a = new Object();
                vg10Var.b = new ArrayList();
                x340Var.s0(vg10Var);
                obj = vg10Var;
            }
            obj = objT;
            vg10 vg10Var2 = (vg10) obj;
            Object obj2 = vg10Var2.a;
            ArrayList arrayList = vg10Var2.b;
            if (u890.j(wr91Var, obj2)) {
                x340Var.i0(1443908949);
                x340Var.r(false);
            } else {
                x340Var.i0(1154891761);
                vg10Var2.a = wr91Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((wr91) ((tg10) arrayList.get(i3)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(wr91Var)) {
                    arrayList3.add(wr91Var);
                }
                arrayList.clear();
                ArrayList arrayListA = p5d0.a(arrayList3);
                int size2 = arrayListA.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    wr91 wr91Var2 = (wr91) arrayListA.get(i4);
                    arrayList.add(new tg10(wr91Var2, apo.r(-1952400805, new ur91(wr91Var2, wr91Var, vg10Var2, strQ), x340Var)));
                }
                x340Var.r(false);
            }
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            llj lljVar = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar);
            }
            nko1.H(qim0VarE, x340Var, y580.Y);
            vg10Var2.c = tgp1.m(x340Var);
            x340Var.i0(-1888182177);
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                tg10 tg10Var = (tg10) arrayList.get(i5);
                wr91 wr91Var3 = (wr91) tg10Var.a;
                j2i j2iVar = tg10Var.b;
                x340Var.f0(1325010085, wr91Var3);
                j2iVar.invoke(apo.r(-1893791890, new ek1(xu30Var, wr91Var3, (byte) 15), x340Var), x340Var, 6);
                x340Var.r(false);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05(wr91Var, qim0Var, xu30Var, i, (byte) 11);
        }
    }

    public static final void d(String str, kko kkoVar, rzo rzoVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2108661764);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(kkoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(rzoVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            otw.c(rzoVar.a(kkoVar), new p330(str), (qim0) null, (ipb1) null, x340Var, 64, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(str, kkoVar, rzoVar, i, (byte) 10);
        }
    }

    public static final void e(dbp dbpVar, hcl1 hcl1Var, cce cceVar, q9l1 q9l1Var, q9l1 q9l1Var2, Consumer consumer, boolean z, z0i z0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1079224219);
        int i2 = i | (x340Var.g(dbpVar) ? 4 : 2) | (x340Var.i(hcl1Var) ? 32 : 16) | (x340Var.i(cceVar) ? 256 : 128) | (x340Var.i(q9l1Var) ? 2048 : 1024) | (x340Var.g(q9l1Var2) ? 16384 : 8192) | (x340Var.i(consumer) ? 131072 : 65536) | (x340Var.h(z) ? 1048576 : 524288) | (x340Var.i(z0iVar) ? 8388608 : 4194304) | 100663296;
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            tob1 tob1VarB = z95.b(!((Boolean) ven0Var.getValue()).booleanValue() ? 1.0f : 0.0f, irn1.o0(300, 0, (dlv) null, 6), "headerAlpha", (iu30) null, x340Var, 3072, 20);
            boolean zI = x340Var.i(hcl1Var) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new j9l1(hcl1Var, ven0Var, (lnm) null, (byte) 1);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            boolean zI2 = x340Var.i(tob1VarB);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new eyg1(tob1VarB, (byte) 11);
                x340Var.s0(objT3);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarC = i541.C(qim0Var3, (iu30) objT3);
            boolean z2 = (i2 & 57344) == 16384;
            Object objT4 = x340Var.T();
            if (z2 || objT4 == m4cVar) {
                objT4 = new x3t0(q9l1Var2, (byte) 1);
                x340Var.s0(objT4);
            }
            int i3 = i2 >> 3;
            ila0.j(dbpVar, cceVar, q9l1Var, z0iVar, consumer, z, lrn1.u(qim0VarC, (iu30) objT4), (erl1) null, x340Var, (i2 & 14) | (i3 & 112) | (i3 & 896) | ((i2 >> 12) & 7168) | (i3 & 57344) | (i3 & 458752), 128);
            x340Var = x340Var;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qw1(dbpVar, hcl1Var, cceVar, q9l1Var, q9l1Var2, consumer, z, z0iVar, qim0Var2, i);
        }
    }

    public static final void f(int i, String str, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1289504640);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(0, x340Var);
            }
            err0 err0Var2 = (hdn0) objT2;
            wat watVar = (wat) x340Var.k(t4k.h);
            err0 err0Var3 = err0Var;
            int iS = err0Var3.s();
            err0 err0Var4 = err0Var2;
            boolean zE = x340Var.e(err0Var4.s()) | x340Var.e(iS);
            int i4 = i3 & 14;
            boolean zG = (i4 == 4) | zE | x340Var.g(watVar);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                objT3 = (err0Var3.s() <= 0 || err0Var4.s() <= 0) ? dqs0.e : mqo1.t(new mmr0[]{new mmr0("ai_badge", new gh80(new d6t0(4, watVar.s(watVar.M0(err0Var3.s())), watVar.s(watVar.M0(err0Var4.s()))), new j2i(-1937416035, new p3(str, (byte) 14), true)))});
                x340Var.s0(objT3);
            }
            cqs0 cqs0Var = (cqs0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = new g2(err0Var, err0Var2, (byte) 1);
                x340Var.s0(objT4);
            }
            gfh0 gfh0Var = (gfh0) objT4;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            suo1.f(str, 2, (qim0) null, 2, x340Var, i4 | 24624, 12);
            j2iVar.invoke(cqs0Var, x340Var, Integer.valueOf((i3 >> 3) & 112));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yw2(str, qim0Var, j2iVar, i);
        }
    }

    public static final void g(q9l1 q9l1Var, bcl1 bcl1Var, Consumer consumer, p5j1 p5j1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1652128538);
        int i2 = i | (x340Var.i(q9l1Var) ? 4 : 2) | (x340Var.i(bcl1Var) ? 32 : 16) | (x340Var.i(consumer) ? 256 : 128) | (x340Var.g(p5j1Var) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            boolean zI = x340Var.i(ven0Var) | x340Var.i(q9l1Var) | x340Var.i(ven0Var2) | x340Var.i(bcl1Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                odp0 odp0Var = new odp0(q9l1Var, bcl1Var, ven0Var, ven0Var2, (byte) 25);
                x340Var.s0(odp0Var);
                objT3 = odp0Var;
            }
            Function0 function0 = (Function0) objT3;
            boolean zI2 = x340Var.i(consumer);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new kf(consumer, (byte) 5);
                x340Var.s0(objT4);
            }
            apo.h(p5j1Var, function0, (Function0) objT4, x340Var, ((i2 >> 9) & 14) | 3072);
            boolean zI3 = x340Var.i(ven0Var2) | x340Var.i(bcl1Var);
            Object objT5 = x340Var.T();
            if (zI3 || objT5 == m4cVar) {
                objT5 = new d(bcl1Var, ven0Var2, (byte) 26);
                x340Var.s0(objT5);
            }
            qxd0.i(rih1.a, (iu30) objT5, x340Var);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tte1((byte) 15, i, q9l1Var, bcl1Var, consumer, p5j1Var, qim0Var2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void h(iu30 iu30Var, gzv0 gzv0Var, e9k e9kVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-432408925);
        int i2 = i | (x340Var2.i(iu30Var) ? 4 : 2) | (x340Var2.i(gzv0Var) ? 32 : 16) | (x340Var2.g(e9kVar) ? 256 : 128) | 3072;
        byte b2 = 1;
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var2, 2131960374);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new smt0(iu30Var, (byte) 21);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarV = u291.v(anm1.N("card-container", qim0Var3), 160.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            ydx ydxVar = new ydx((23 & 1) != 0 ? 2.0f : 0.0f, (23 & 2) != 0 ? 12.0f : 0.0f, (23 & 4) != 0 ? 8.0f : 0.0f, (23 & 8) != 0 ? new zzq0(8.0f, 8.0f, 8.0f, 8.0f) : new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (23 & 16) != 0 ? vdx.a : wdx.a);
            j2i j2iVarR = null;
            if (e9kVar.equals(bzv0.g)) {
                x340Var2.i0(-1284967576);
                String str = gzv0Var.i;
                if (str == null) {
                    x340Var2.i0(-1284967577);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1284967576);
                    j2iVarR = apo.r(-920941066, new qdg0(str, (byte) 28), x340Var2);
                    x340Var2.r(false);
                }
                x340Var2.r(false);
            } else if (e9kVar.equals(dzv0.g)) {
                x340Var2.i0(-1284427215);
                Integer num = gzv0Var.j;
                if (num == null) {
                    x340Var2.i0(-1284427216);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1284427215);
                    j2iVarR = apo.r(1861644521, new f13(num.intValue(), (byte) 15), x340Var2);
                    x340Var2.r(false);
                }
                x340Var2.r(false);
            } else {
                if (!e9kVar.equals(czv0.g)) {
                    throw p3d1.k(x340Var2, 1066925984, false);
                }
                x340Var2.i0(-1283909702);
                x340Var2.r(false);
            }
            j2i j2iVar = j2iVarR;
            j2i j2iVarR2 = apo.r(-614433186, new jzv0(gzv0Var, (byte) 0), x340Var2);
            j2i j2iVarR3 = apo.r(-1567953923, new jzv0(gzv0Var, (byte) 1), x340Var2);
            j2i j2iVarR4 = apo.r(1744019996, new jzv0(gzv0Var, (byte) 2), x340Var2);
            j2i j2iVarR5 = apo.r(-1204960135, new hov0(gzv0Var, iu30Var, b2), x340Var2);
            j2i j2iVarR6 = apo.r(2107013784, new jzv0(gzv0Var, (byte) 3), x340Var2);
            qim0Var2 = qim0Var3;
            ioo1.c(qim0VarV, (pgx) null, ydxVar, (hw61) null, (max) null, (idn0) null, (ga80) null, gbxVar, (gbx) null, j2iVarR2, (xu30) null, j2iVarR3, j2iVarR4, (xu30) null, j2iVar, j2iVarR5, j2iVarR6, x340Var2, 805306880, 1769904, 9594);
            x340Var = x340Var2;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(iu30Var, gzv0Var, e9kVar, qim0Var2, i);
        }
    }

    public static final void i(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1033679513);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(qim0Var3, jA, cr31VarB);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("rich-media-error-placeholder", uyn1.y(qim0VarF, 16.0f, 12.0f));
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            cnx cnxVar = cnx.c;
            long j = cbx.a(x340Var).b.b;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(cnxVar, isl.a, u291.r(qim0Var3, 16.0f), j, 0L, false, x340Var, cnx.d | 48, 48);
            uwo1.e(cwl1.o0(x340Var, 2131961342), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var2, i, (byte) 18);
        }
    }

    public static final void j(c380 c380Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(684984203);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        boolean z2 = true;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131952135);
            boolean z3 = x340Var.k(t4k.n) == flb0.b;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !x340Var.g(c380Var))) {
                z2 = false;
            }
            boolean zH = x340Var.h(z3) | z2;
            Object objT = x340Var.T();
            if (zH || objT == fkj0.X) {
                ye5 ye5Var = new ye5();
                int i4 = 0;
                for (Object obj : c380Var) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    qm31 qm31Var = (qm31) obj;
                    if (i4 > 0) {
                        ye5Var.g(" • ");
                    }
                    if (z3) {
                        ye5Var.g("\u2067");
                    }
                    ye5Var.g(qm31Var.a);
                    if (qm31Var.b) {
                        ye5Var.g(" ");
                        z6p1.s(ye5Var, "ai_badge");
                    }
                    if (z3) {
                        ye5Var.g("\u2069");
                    }
                    i4 = i5;
                }
                objT = ye5Var.p();
                x340Var.s0(objT);
            }
            j2i j2iVarR = apo.r(-1706630560, new zw2(z, (af5) objT, (byte) 0), x340Var);
            qim0 qim0Var3 = nim0.a;
            f(((i3 >> 3) & 112) | 384, strO0, j2iVarR, x340Var, qim0Var3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(c380Var, z, qim0Var2, i, (byte) 3);
        }
    }

    public static final void k(bs91 bs91Var, qim0 qim0Var, xu30 xu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1077081618);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(bs91Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= x340Var.i(xu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            if (i5 != 0) {
                xu30Var = fjj.a;
            }
            wr91 wr91VarA = bs91Var.a();
            cg cgVar = (cg) x340Var.k(t4k.a);
            boolean zG = x340Var.g(wr91VarA) | x340Var.i(cgVar);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new sb91(wr91VarA, cgVar, (lnm) null, (byte) 5);
                x340Var.s0(objT);
            }
            qxd0.t(wr91VarA, x340Var, (vu30) objT);
            c(bs91Var.a(), qim0Var, xu30Var, x340Var, i3 & 1008);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        xu30 xu30Var2 = xu30Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rd4(bs91Var, qim0Var2, xu30Var2, i, i2, (byte) 3);
        }
    }

    public static final void l(String str, gt40 gt40Var, int i, b0k b0kVar, int i2) {
        gt40 gt40Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(463645734);
        int i3 = (x340Var.g(str) ? 4 : 2) | i2 | (x340Var.i(gt40Var) ? 32 : 16) | (x340Var.e(i) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            gt40Var2 = gt40Var;
            eqr0.a(gt40Var2, 0, 1, apo.r(183939696, new qvh(str, i, (byte) 6), x340Var), x340Var, ((i3 >> 3) & 14) | 3072, 2);
        } else {
            gt40Var2 = gt40Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(str, gt40Var2, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void m(String str, vw2 vw2Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1805313435);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(vw2Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = vw2Var instanceof uw2;
            qim0 qim0Var3 = nim0.a;
            if (z) {
                x340Var.i0(260583094);
                ((uw2) vw2Var).a.invoke(str, x340Var, Integer.valueOf(i2 & 14));
                x340Var.r(false);
            } else {
                if (!(vw2Var instanceof tw2)) {
                    throw p3d1.k(x340Var, 260580812, false);
                }
                x340Var.i0(-511785578);
                plx plxVar = plx.c;
                uwr uwrVar = cbx.a;
                long j = cbx.a(x340Var).b.b;
                qim0 qim0VarN = anm1.N("chevron", qim0Var3);
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(plxVar, isl.a, u291.m(qim0VarN, 16.0f), j, 0L, false, x340Var, plx.d | 48, 48);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oj2(str, vw2Var, qim0Var2, i, (byte) 4);
        }
    }

    public static final void n(cce cceVar, dbp dbpVar, hcl1 hcl1Var, m0t m0tVar, q9l1 q9l1Var, q9l1 q9l1Var2, fbp fbpVar, bcl1 bcl1Var, fq10 fq10Var, n8l1 n8l1Var, abu abuVar, hcl1 hcl1Var2, qau qauVar, Consumer consumer, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1315364636);
        int i2 = i | (x340Var.i(cceVar) ? 4 : 2) | (x340Var.g(dbpVar) ? 32 : 16) | (x340Var.g(hcl1Var) ? 256 : 128) | (x340Var.i(m0tVar) ? 2048 : 1024) | (x340Var.i(q9l1Var) ? 16384 : 8192) | (x340Var.g(q9l1Var2) ? 131072 : 65536) | (x340Var.g(fbpVar) ? 1048576 : 524288) | (x340Var.i(bcl1Var) ? 8388608 : 4194304) | (x340Var.g(fq10Var) ? 67108864 : 33554432) | (x340Var.g(n8l1Var) ? 536870912 : 268435456);
        if (x340Var.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (((((((x340Var.i(abuVar) ? (char) 4 : (char) 2) | (x340Var.i(hcl1Var2) ? ' ' : (char) 16)) | (x340Var.i(qauVar) ? 256 : 128)) | (x340Var.i(consumer) ? 2048 : 1024)) | (x340Var.h(z) ? (char) 16384 : (char) 8192)) | 196608) & 74899) == 74898) ? false : true)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(anm1.N("watch_feed_page", qim0Var3), 1.0f);
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT;
            x340Var.j0(-492369756);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT2;
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT5;
            who1.h(s161.b(qim0VarD, false, new tu(ufh0Var, (byte) 27)), apo.i(x340Var, -1488813576, new m9l1(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 23), n8l1Var, abuVar, qauVar, fbpVar, cceVar, q9l1Var, q9l1Var2, z, consumer, fq10Var, dbpVar, hcl1Var2, m0tVar, hcl1Var, bcl1Var)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 23), x340Var, 48);
            x340Var.r(false);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tah1(cceVar, dbpVar, hcl1Var, m0tVar, q9l1Var, q9l1Var2, fbpVar, bcl1Var, fq10Var, n8l1Var, abuVar, hcl1Var2, qauVar, consumer, z, qim0Var2, i);
        }
    }

    public static final xhb p(BluetoothManager bluetoothManager, Context context, boolean z) {
        if (Build.VERSION.SDK_INT < 31 || context.checkSelfPermission("android.permission.BLUETOOTH_ADVERTISE") != 0) {
            return whb.a;
        }
        if (bluetoothManager.getAdapter().getBluetoothLeAdvertiser() == null) {
            return thb.a;
        }
        if (z) {
            return uhb.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x006a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0076  */
    /* JADX WARN: Code duplicated, block: B:51:0x0079  */
    /* JADX WARN: Code duplicated, block: B:53:0x007c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0080  */
    /* JADX WARN: Code duplicated, block: B:58:0x0084  */
    /* JADX WARN: Code duplicated, block: B:59:0x0087  */
    /* JADX WARN: Code duplicated, block: B:60:0x008a  */
    /* JADX WARN: Code duplicated, block: B:61:0x008d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0090  */
    public static final String q(jdk jdkVar) {
        int iOrdinal;
        String str;
        hdk hdkVar = jdkVar instanceof hdk ? (hdk) jdkVar : null;
        String str2 = "";
        if (hdkVar == null) {
            return "";
        }
        d7d d7dVar = hdkVar.m;
        if (d7dVar instanceof z6d) {
            str2 = "reserved";
        } else if (d7dVar instanceof w6d) {
            str2 = "fcfs";
        } else if (d7dVar instanceof b7d) {
            str2 = "waitlistable";
        } else if (d7dVar instanceof c7d) {
            str2 = "waitlisted";
        } else if (d7dVar instanceof x6d) {
            str2 = "ineligible";
        } else if (d7dVar instanceof y6d) {
            str2 = "purchased";
        } else if (u890.j(d7dVar, a7d.a)) {
            str2 = "unknown";
        } else if (d7dVar != null) {
            eg.o();
            return null;
        }
        if (t(hdkVar)) {
            iOrdinal = hdkVar.i.ordinal();
            if (iOrdinal == 0) {
                str = "learn_more";
            } else if (iOrdinal == 1) {
                str = "see_tickets";
            } else if (iOrdinal == 2) {
                str = "join_waitlist";
            } else if (iOrdinal == 3) {
                str = "joined_waitlist";
            } else if (iOrdinal != 4) {
                if (iOrdinal != 5) {
                    eg.o();
                    return null;
                }
                str = null;
            } else {
                str = "view";
            }
        } else {
            int iC = l1d.C(hdkVar.D);
            if (iC != 0) {
                if (iC != 1) {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    iOrdinal = hdkVar.i.ordinal();
                    if (iOrdinal == 0) {
                        str = "learn_more";
                    } else if (iOrdinal == 1) {
                        str = "see_tickets";
                    } else if (iOrdinal == 2) {
                        str = "join_waitlist";
                    } else if (iOrdinal == 3) {
                        str = "joined_waitlist";
                    } else if (iOrdinal != 4) {
                        str = "view";
                    } else if (iOrdinal != 5) {
                        eg.o();
                        return null;
                    }
                }
            } else if (hdkVar.E != 2 || !hdkVar.v) {
                iOrdinal = hdkVar.i.ordinal();
                if (iOrdinal == 0) {
                    str = "learn_more";
                } else if (iOrdinal == 1) {
                    str = "see_tickets";
                } else if (iOrdinal == 2) {
                    str = "join_waitlist";
                } else if (iOrdinal == 3) {
                    str = "joined_waitlist";
                } else if (iOrdinal != 4) {
                    str = "view";
                } else if (iOrdinal != 5) {
                    eg.o();
                    return null;
                }
            }
            str = null;
        }
        return o7h.y0(f46.i0(new String[]{str2.length() != 0 ? str2 : null, str, t(hdkVar) ? "v2" : null}), "|", (String) null, (String) null, (iu30) null, 62);
    }

    public static final hg50 r(adn adnVar) {
        cqz0 cqz0Var = dqz0.a;
        mu91 mu91Var = adnVar.f;
        int i = adnVar.t;
        int i2 = adnVar.i;
        if (i2 <= 0 || i <= 0) {
            return new hg50(0, 0);
        }
        if (i2 <= 2 || i <= 2) {
            return new hg50(i2 / 2, i / 2);
        }
        Set setP1 = o7h.p1(mu91Var.a);
        hg50 hg50VarA = mu91Var.a();
        int i3 = i2 - 1;
        if (i3 < 2) {
            i3 = 2;
        }
        tr80 tr80VarQ = yoi1.Q(1, i3);
        int i4 = i - 1;
        tr80 tr80VarQ2 = yoi1.Q(1, i4 >= 2 ? i4 : 2);
        for (int i5 = 0; i5 < 100; i5++) {
            int iH = yoi1.H(tr80VarQ, cqz0Var);
            int iH2 = yoi1.H(tr80VarQ2, cqz0Var);
            hg50 hg50Var = new hg50(iH, iH2);
            int iAbs = Math.abs(iH2 - hg50VarA.b) + Math.abs(iH - hg50VarA.a);
            if (!setP1.contains(hg50Var) && iAbs >= 3) {
                return hg50Var;
            }
        }
        for (int i6 = 0; i6 < 100; i6++) {
            hg50 hg50Var2 = new hg50(yoi1.H(tr80VarQ, cqz0Var), yoi1.H(tr80VarQ2, cqz0Var));
            if (!setP1.contains(hg50Var2)) {
                return hg50Var2;
            }
        }
        return new hg50(yoi1.H(tr80VarQ, cqz0Var), yoi1.H(tr80VarQ2, cqz0Var));
    }

    public static final Next s(adn adnVar) {
        int i = adnVar.h;
        int i2 = adnVar.d;
        return Next.i(adn.a(adnVar, (List) null, Math.max(i, i2), yy30.c, (mu91) null, (zhd) null, 0, 0, 0, 0, (String) null, (String) null, (List) null, false, (List) null, 0, 131047), f46.S0(new acn[]{zbn.a, new xbn(adnVar.b, Math.max(i, i2))}));
    }

    public static final boolean t(hdk hdkVar) {
        return hdkVar.F == 2 && hdkVar.D != 2;
    }

    public static final String u(jdk jdkVar) {
        String str;
        hdk hdkVar = jdkVar instanceof hdk ? (hdk) jdkVar : null;
        return (hdkVar == null || (str = hdkVar.y) == null) ? jdkVar.getUri() : str;
    }

    public static fyx v(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        long j = cbx.a(b0kVar).b.a;
        long j2 = cbx.a(b0kVar).b.b;
        long j3 = cbx.a(b0kVar).b.b;
        long j4 = cbx.a(b0kVar).b.a;
        long j5 = u7h.j;
        return new fyx(new zxx(j, j2, j3, j4, j5, j5, cbx.a(b0kVar).b.c, cbx.a(b0kVar).c.a, cbx.a(b0kVar).a.b.c(), cbx.a(b0kVar).b.d));
    }

    public static final gmh1 w(ArrayList arrayList) {
        qx81 qx81Var;
        int size = arrayList.size();
        if (size == 0) {
            eg.m("Expected some types");
            return null;
        }
        if (size == 1) {
            return (gmh1) o7h.U0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            qx81 qx81Var2 = (gmh1) it.next();
            z = z || d4o1.i(qx81Var2);
            if (qx81Var2 instanceof qx81) {
                qx81Var = qx81Var2;
            } else {
                if (!(qx81Var2 instanceof dq20)) {
                    eg.o();
                    return null;
                }
                qx81Var = ((dq20) qx81Var2).b;
                z2 = true;
            }
            arrayList2.add(qx81Var);
        }
        if (z) {
            return bkz.b(zjz.X0, new String[]{arrayList.toString()});
        }
        v0h1 v0h1Var = v0h1.a;
        if (!z2) {
            return v0h1Var.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(i3p1.I((gmh1) it2.next()));
        }
        return y3o1.Z(v0h1Var.b(arrayList2), v0h1Var.b(arrayList3));
    }

    public static p6m0 x() {
        return new p6m0((byte) 0);
    }

    public static final zzq0 y(b0k b0kVar) {
        cvx cvxVar = cbx.b(b0kVar).b;
        cvx cvxVar2 = cbx.b(b0kVar).b;
        return uyn1.j(12.0f, 0.0f, 4.0f, 0.0f, 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Serializable z(BluetoothManager bluetoothManager, qhb qhbVar, rhb rhbVar, int i, boolean z, onm onmVar) {
        xjb xjbVar;
        if (onmVar instanceof xjb) {
            xjbVar = (xjb) onmVar;
            int i2 = xjbVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xjbVar.b = i2 - Integer.MIN_VALUE;
            } else {
                xjbVar = new xjb(onmVar);
            }
        } else {
            xjbVar = new xjb(onmVar);
        }
        Object objP = xjbVar.a;
        int i3 = xjbVar.b;
        if (i3 == 0) {
            hm5.M(objP);
            BluetoothLeAdvertiser bluetoothLeAdvertiser = bluetoothManager.getAdapter().getBluetoothLeAdvertiser();
            if (bluetoothLeAdvertiser == null) {
                return new mmr0(thb.a, cu9.V0);
            }
            ytw0 ytw0Var = jfv.b;
            long jK0 = fdg1.k0(5, ngv.e);
            yjb yjbVar = new yjb(bluetoothLeAdvertiser, qhbVar, rhbVar, i, z, bluetoothManager);
            xjbVar.b = 1;
            objP = rc2.P(jK0, new vk6(yjbVar, (lnm) null, (byte) 13), xjbVar);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        mmr0 mmr0Var = (mmr0) objP;
        return mmr0Var == null ? new mmr0(new vhb("advertisingTimeout"), cu9.U0) : mmr0Var;
    }
}
