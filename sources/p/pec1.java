package p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.ParcelUuid;
import com.google.protobuf.Timestamp;
import com.spotify.ads.esperanto.proto.PutTargetingRequest;
import com.spotify.ads.esperanto.proto.TargetingResponse;
import com.spotify.base.java.logging.Logger;
import com.spotify.deviceproxy.navigation.v1.RegisterSupportedNavigationCommandsRequest;
import com.spotify.highlightsstats.data.proto.v2.SummaryRequest;
import com.spotify.mobius.functions.Consumer;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.scrollsita.v1.Section;
import com.spotify.stream_reporting_esperanto.proto.StreamSeekRequestOuterClass$StreamSeekRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pec1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pec1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new pec1((rec1) this.c, (afc1) obj2, lnmVar, (byte) 0);
            case 1:
                return new pec1((rec1) this.c, (StreamStartRequestOuterClass$StreamStartRequest) obj2, lnmVar, (byte) 1);
            case 2:
                return new pec1((fvc1) this.c, (kwc1) obj2, lnmVar, (byte) 2);
            case 3:
                return new pec1((fvc1) this.c, (ewc1) obj2, lnmVar, (byte) 3);
            case 4:
                return new pec1((ua91) this.c, (Long) obj2, lnmVar, (byte) 4);
            case 5:
                return new pec1((n2d1) this.c, (RegisterSupportedNavigationCommandsRequest) obj2, lnmVar, (byte) 5);
            case 6:
                return new pec1((n2d1) this.c, (String) obj2, lnmVar, (byte) 6);
            case 7:
                return new pec1((idn0) this.c, (b4d1) obj2, lnmVar, (byte) 7);
            case 8:
                pec1 pec1Var = new pec1((aqd1) obj2, lnmVar, (byte) 8);
                pec1Var.c = obj;
                return pec1Var;
            case 9:
                pec1 pec1Var2 = new pec1((qfl1) obj2, lnmVar, (byte) 9);
                pec1Var2.c = obj;
                return pec1Var2;
            case 10:
                return new pec1((trd1) this.c, (Map) obj2, lnmVar, (byte) 10);
            case 11:
                return new pec1((ysd1) this.c, (psd1) obj2, lnmVar, (byte) 11);
            case 12:
                return new pec1((i2e1) this.c, (g2e1) obj2, lnmVar, (byte) 12);
            case 13:
                pec1 pec1Var3 = new pec1((z4e1) obj2, lnmVar, (byte) 13);
                pec1Var3.c = obj;
                return pec1Var3;
            case 14:
                pec1 pec1Var4 = new pec1((j6e1) obj2, lnmVar, (byte) 14);
                pec1Var4.c = obj;
                return pec1Var4;
            case 15:
                return new pec1((ve8) this.c, (ven0) obj2, lnmVar, (byte) 15);
            case 16:
                return new pec1((y7e1) this.c, (z2f1) obj2, lnmVar, (byte) 16);
            case 17:
                return new pec1((jfe) this.c, (ven0) obj2, lnmVar, (byte) 17);
            case 18:
                return new pec1((iff1) this.c, (Consumer) obj2, lnmVar, (byte) 18);
            case 19:
                return new pec1((dif1) this.c, (ps41) obj2, lnmVar, (byte) 19);
            case 20:
                return new pec1((zjf1) this.c, (List) obj2, lnmVar, (byte) 20);
            case 21:
                return new pec1((iff1) this.c, (Consumer) obj2, lnmVar, (byte) 21);
            case 22:
                pec1 pec1Var5 = new pec1((gsf1) obj2, lnmVar, (byte) 22);
                pec1Var5.c = obj;
                return pec1Var5;
            case 23:
                return new pec1((rsf1) this.c, (String) obj2, lnmVar, (byte) 23);
            case 24:
                return new pec1((w0o) this.c, (ry71) obj2, lnmVar, (byte) 24);
            case 25:
                return new pec1((w0o) this.c, (ry71) obj2, lnmVar, (byte) 25);
            case 26:
                return new pec1((qwf1) this.c, (s4b1) obj2, lnmVar, (byte) 26);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new pec1((f1g1) this.c, (wa71) obj2, lnmVar, (byte) 27);
            case 28:
                return new pec1((f1g1) this.c, (Set) obj2, lnmVar, (byte) 28);
            default:
                return new pec1((j6g1) this.c, (String) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((jl71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                create((jx4) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((cxc0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        String m231Var;
        Object objO;
        Object objF;
        Object objJ;
        byte b = this.a;
        kfo0 kfo0Var = kfo0.a;
        byte b2 = 12;
        int i = 2;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        String str = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rec1 rec1Var = (rec1) this.c;
                jn7 jn7Var = rec1Var.a;
                afc1 afc1Var = (afc1) obj2;
                afc1Var.s(rec1Var.P0);
                StreamSeekRequestOuterClass$StreamSeekRequest streamSeekRequestOuterClass$StreamSeekRequest = (StreamSeekRequestOuterClass$StreamSeekRequest) afc1Var.build();
                this.b = true;
                Object objB0 = jn7Var.B0(streamSeekRequestOuterClass$StreamSeekRequest, this);
                return objB0 == d9nVar ? d9nVar : objB0;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Object objC0 = ((rec1) this.c).a.C0((StreamStartRequestOuterClass$StreamStartRequest) obj2, this);
                    return objC0 == d9nVar ? d9nVar : objC0;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                fvc1 fvc1Var = (fvc1) this.c;
                kwc1 kwc1Var = (kwc1) obj2;
                this.b = true;
                kwc1Var.f().collect(new ip61((Object) kwc1Var, (Object) fvc1Var, (byte) 24), this);
                return d9nVar;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                fvc1 fvc1Var2 = (fvc1) this.c;
                ewc1 ewc1Var = (ewc1) obj2;
                this.b = true;
                muc1 muc1Var = fvc1Var2.a;
                jwc1 surface = ewc1Var.getSurface();
                Object objCollect = rqt0.w(muc1Var.d, new l5b1(surface, (byte) 29), rqt0.b).collect(new ip61((Object) new ip61((Object) ewc1Var, (Object) fvc1Var2, (byte) 23), (Object) surface, (byte) 22), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                pf60 pf60Var = (pf60) ((ua91) this.c).b;
                Long l = (Long) obj2;
                this.b = true;
                qf60 qf60Var = pf60Var.a;
                dyc1 dyc1VarN = SummaryRequest.n();
                if (l != null) {
                    long jLongValue = l.longValue();
                    sve1 sve1VarR = Timestamp.r();
                    sve1VarR.q(jLongValue);
                    dyc1VarN.q(sve1VarR.build());
                }
                dyc1VarN.n(upo1.s());
                Object objE = qf60Var.e(dyc1VarN.build(), this);
                return objE == d9nVar ? d9nVar : objE;
            case 5:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n2d1 n2d1Var = (n2d1) this.c;
                this.b = true;
                Object objCollect2 = n2d1Var.d.collect(new cza1(new ip61((Object) n2d1Var, obj2, (byte) 26), (byte) 25), this);
                if (objCollect2 != d9nVar) {
                    objCollect2 = rih1Var;
                }
                if (objCollect2 != d9nVar) {
                    objCollect2 = rih1Var;
                }
                return objCollect2 == d9nVar ? d9nVar : rih1Var;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    this.b = true;
                    return ((n2d1) this.c).a((String) obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z7) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n811 n811Var = new n811();
                n811 n811Var2 = new n811();
                mr20 mr20VarC = ((idn0) this.c).c();
                efb1 efb1Var = new efb1(n811Var, n811Var2, (b4d1) obj2, (byte) 3);
                this.b = true;
                return mr20VarC.collect(efb1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 8:
                aqd1 aqd1Var = (aqd1) obj2;
                c9n c9nVar = (c9n) this.c;
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarF = h4p1.f(new pec1(aqd1Var.d, str, (byte) 9));
                ip61 ip61Var = new ip61((Object) aqd1Var, (Object) c9nVar, (byte) 28);
                this.c = null;
                this.b = true;
                return ezcVarF.collect(ip61Var, this) == d9nVar ? d9nVar : rih1Var;
            case 9:
                qfl1 qfl1Var = (qfl1) obj2;
                ssw0 ssw0Var = (ssw0) this.c;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                BluetoothAdapter adapter = ((BluetoothManager) qfl1Var.a.getSystemService("bluetooth")).getAdapter();
                BluetoothLeScanner bluetoothLeScanner = adapter != null ? adapter.getBluetoothLeScanner() : null;
                if (bluetoothLeScanner == null) {
                    ssw0Var.H((Throwable) null);
                    return rih1Var;
                }
                ScanFilter scanFilterBuild = new ScanFilter.Builder().setServiceUuid(new ParcelUuid(bqd1.a)).build();
                ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(0).build();
                hqd1 hqd1Var = new hqd1(ssw0Var);
                bluetoothLeScanner.startScan(Collections.singletonList(scanFilterBuild), scanSettingsBuild, (ScanCallback) hqd1Var);
                k7a1 k7a1Var = new k7a1(bluetoothLeScanner, hqd1Var, qfl1Var);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var, k7a1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    srd1 srd1Var = ((trd1) this.c).a;
                    myy0 myy0VarO = PutTargetingRequest.o();
                    myy0VarO.n((Map) obj2);
                    PutTargetingRequest putTargetingRequestBuild = myy0VarO.build();
                    this.b = true;
                    objA = srd1Var.a(putTargetingRequestBuild, this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                return new vrd1(((TargetingResponse) objA).o());
            case 11:
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                j0a1 j0a1Var = ((ysd1) this.c).d;
                psd1 psd1Var = (psd1) obj2;
                String str2 = psd1Var.g;
                String str3 = psd1Var.h;
                this.b = true;
                Object objA2 = j0a1Var.a(str2, str3, this);
                return objA2 == d9nVar ? d9nVar : objA2;
            case 12:
                boolean z13 = this.b;
                try {
                    if (!z13) {
                        hm5.M(obj);
                        i2e1 i2e1Var = (i2e1) this.c;
                        g2e1 g2e1Var = (g2e1) obj2;
                        vve1 vve1Var = i2e1Var.f;
                        bfb1 bfb1Var = new bfb1(g2e1Var, i2e1Var, new iag1(vve1Var != null ? vve1Var.a : i2e1Var.e + g2e1Var.f), (lnm) null, (byte) 8);
                        this.b = true;
                        objO = rc2.O(2000L, bfb1Var, this);
                        if (objO == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z13) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objO = obj;
                    }
                    m231Var = (String) objO;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                if (m231Var instanceof m231) {
                    return null;
                }
                return m231Var;
            case 13:
                z4e1 z4e1Var = (z4e1) obj2;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jx4 jx4Var = (jx4) this.c;
                ggg1 ggg1Var = z4e1Var.Q0;
                aae1 aae1Var = z4e1Var.R0;
                x180 x180VarE = z4e1Var.W0.e(z4e1Var.Y0);
                kmy kmyVar = new kmy(1, z4e1Var, z4e1.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8, (byte) 5);
                s4e1 s4e1Var = new s4e1(z4e1Var, (byte) 12);
                sen0 sen0Var = z4e1Var.a1;
                e8k1 e8k1Var = (e8k1) lcc.z(z4e1Var, t4k.t);
                t4e1 t4e1Var = new t4e1(z4e1Var, (byte) 7);
                this.b = true;
                jon1.y(jx4Var, ggg1Var, aae1Var, x180VarE, kmyVar, s4e1Var, sen0Var, e8k1Var, t4e1Var, this);
                return d9nVar;
            case 14:
                j6e1 j6e1Var = (j6e1) obj2;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                c9n c9nVar2 = (c9n) this.c;
                m441 m441VarQ = rwq.q(new ww21(j6e1Var, (byte) 20));
                i6e1 i6e1Var = new i6e1(j6e1Var, c9nVar2, (byte) 0);
                this.b = true;
                return m441VarQ.collect(i6e1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 15:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    bbc bbcVar = (bbc) ((ve8) this.c).b;
                    this.b = true;
                    if (bbcVar.r(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((ven0) obj2).setValue(Boolean.TRUE);
                return rih1Var;
            case 16:
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (((y7e1) this.c).d().d.length() <= 0) {
                    return rih1Var;
                }
                d0r d0rVar = ((z2f1) obj2).c;
                jd0 jd0Var = jd0.x;
                zf90 zf90Var = new zf90(true);
                this.b = true;
                return d0r.d(d0rVar, jd0Var, rih1Var, zf90Var, this) == d9nVar ? d9nVar : rih1Var;
            case 17:
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Integer num = (Integer) ((ven0) obj2).getValue();
                int iIntValue = num != null ? num.intValue() : 0;
                pxg1 pxg1Var = zaf1.c;
                if (iIntValue == 0) {
                    str = "genre1";
                } else if (iIntValue == 1) {
                    str = "genre2";
                } else if (iIntValue == 2) {
                    str = "genre3";
                } else if (iIntValue == 3) {
                    str = "genre4";
                } else if (iIntValue != 4) {
                    Logger.d(f4i1.c(iIntValue, "TopGenreList: Unknown genre index: "), new Object[0]);
                } else {
                    str = "genre5";
                }
                if (str == null) {
                    return rih1Var;
                }
                jfe jfeVar = (jfe) this.c;
                pj31 pj31Var = new pj31("radioGenre", str);
                this.b = true;
                return jfeVar.b(pj31Var, this) == d9nVar ? d9nVar : rih1Var;
            case 18:
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                FlowableObserveOn flowableObserveOnQ = ytp0.q(((iff1) this.c).b);
                vbm[] vbmVarArr = q601.a;
                mr20 mr20VarU = rqt0.u(new kge(flowableObserveOnQ));
                hff1 hff1Var = new hff1((Consumer) obj2, (lnm) null, (byte) 0);
                this.b = true;
                Object objCollect3 = mr20VarU.collect(new eu20(kfo0Var, hff1Var, (byte) 1), this);
                if (objCollect3 != d9nVar) {
                    objCollect3 = rih1Var;
                }
                if (objCollect3 != d9nVar) {
                    objCollect3 = rih1Var;
                }
                return objCollect3 == d9nVar ? d9nVar : rih1Var;
            case 19:
                ps41 ps41Var = (ps41) obj2;
                dif1 dif1Var = (dif1) this.c;
                boolean z20 = this.b;
                if (z20 && !z20) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                while (dif1Var.k == ps41Var) {
                    long jLongValue2 = (dif1Var.l + 200) - ((Number) dif1Var.a.invoke()).longValue();
                    if (jLongValue2 <= 0) {
                        dif1Var.k = null;
                        dif1Var.m = null;
                        dif1Var.b.invoke(ps41Var, Boolean.FALSE);
                        return rih1Var;
                    }
                    this.b = true;
                    if (hap1.i(jLongValue2, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            case 20:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zjf1 zjf1Var = (zjf1) this.c;
                List listJ0 = o7h.j0((List) obj2);
                this.b = true;
                int i2 = zjf1.c;
                Object objL = fc11.l(zjf1Var.a.b(new oi("songdna_search_recents_audio_associations", false, new bic1(listJ0, (byte) 8))).filter(hgx0.S0), 2, (Object) null, this);
                return objL == d9nVar ? d9nVar : objL;
            case 21:
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                FlowableObserveOn flowableObserveOnQ2 = ytp0.q(((iff1) this.c).b);
                vbm[] vbmVarArr2 = q601.a;
                mr20 mr20VarU2 = rqt0.u(new kge(flowableObserveOnQ2));
                hff1 hff1Var2 = new hff1((Consumer) obj2, (lnm) null, (byte) 1);
                this.b = true;
                Object objCollect4 = mr20VarU2.collect(new eu20(kfo0Var, hff1Var2, (byte) 1), this);
                if (objCollect4 != d9nVar) {
                    objCollect4 = rih1Var;
                }
                if (objCollect4 != d9nVar) {
                    objCollect4 = rih1Var;
                }
                return objCollect4 == d9nVar ? d9nVar : rih1Var;
            case 22:
                cxc0 cxc0Var = (cxc0) this.c;
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = ((gsf1) obj2).c;
                this.c = null;
                this.b = true;
                return dt71Var.emit(cxc0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 23:
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    rsc0 rsc0Var = ((rsf1) this.c).b;
                    hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                    sku0 sku0VarP = PlaylistDecorationPolicy.p();
                    sku0VarP.R();
                    sku0VarP.W();
                    sku0VarP.y();
                    sku0VarP.H();
                    sku0VarP.u();
                    sku0VarP.k0();
                    sku0VarP.G();
                    hru0VarS.x(sku0VarP);
                    trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, Collections.singleton(uqc0.a), false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 474);
                    this.b = true;
                    objF = rsc0Var.f((String) obj2, trc0Var, this);
                    if (objF == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objF = obj;
                }
                return ((py21) objF).d();
            case 24:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarG = yoi1.g(((m0t) ((w0o) this.c).c).d);
                bda1 bda1Var = new bda1(obj2, (byte) 11);
                this.b = true;
                return ezcVarG.collect(bda1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ve01 ve01Var = ((hcl1) ((w0o) this.c).d).h;
                bda1 bda1Var2 = new bda1((ry71) obj2, b2);
                this.b = true;
                return ve01Var.a.collect(bda1Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 26:
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    this.b = true;
                    Object objQ = ((qwf1) this.c).X.q((s4b1) obj2, this);
                    return objQ == d9nVar ? d9nVar : objQ;
                }
                if (z27) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                Set set = f1g1.i;
                Object objF2 = ((f1g1) this.c).f((wa71) obj2, this);
                return objF2 == d9nVar ? d9nVar : objF2;
            case 28:
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    this.b = true;
                    Object objU = ((f1g1) this.c).b.u((Set) obj2, this);
                    return objU == d9nVar ? d9nVar : objU;
                }
                if (z29) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                j6g1 j6g1Var = (j6g1) this.c;
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        objJ = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                ay8 ay8VarF = d3p1.F((d0r) j6g1Var.c.getValue(), j6g1Var.d, (String) obj2);
                q1c1 q1c1Var = new q1c1(i, str, (byte) 14);
                this.b = true;
                objJ = b5p1.j(ay8VarF, q1c1Var, this);
                if (objJ == d9nVar) {
                    return d9nVar;
                }
                i1r i1rVar = (k1r) objJ;
                if (i1rVar instanceof i1r) {
                    rio rioVar = ((uio) i1rVar.a).b;
                    if (rioVar instanceof rio) {
                        String str4 = rioVar.c;
                        if (str4.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str4.equals("spotify:collection:tracks") || str4.equals("spotify:internal:collection:tracks") || (nhc1.Y(str4, "spotify:user:", false) && nhc1.R(str4, ":collection", false))) {
                            return new ek3();
                        }
                        if (xrm1.a(str4)) {
                            return new ik3("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt");
                        }
                    } else if (!(rioVar instanceof qio) && !(rioVar instanceof sio) && !(rioVar instanceof pio) && !(rioVar instanceof tio)) {
                        eg.o();
                    }
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pec1(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
