package p;

import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.cosmos.servicebasedrouter.RemoteNativeRxRouter;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewView;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kd8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd8(ai9 ai9Var, vg9 vg9Var, byte[] bArr) {
        super(1);
        this.a = (byte) 5;
        this.b = ai9Var;
        this.c = bArr;
    }

    public final Object invoke(Object obj) {
        zh9 m231Var;
        Object rg9Var;
        urc0 urc0Var;
        String strConcat;
        int i = 2;
        byte b = 7;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                if (jd8.a[((mb8) obj).ordinal()] == 1) {
                    ((ym) this.b).invoke(new nc7((eh90) this.c));
                }
                return rih1.a;
            case 1:
                ((qtr) obj).b(new ql6((iu30) this.b, (ix7) this.c, (lnm) null, (byte) 2));
                return rih1.a;
            case 2:
                ((qtr) obj).b(new u08((iu30) this.b, (yu3) this.c, (lnm) null, (byte) 1));
                return rih1.a;
            case 3:
                pp ppVar = (pp) this.b;
                di4 di4Var = ((a49) this.c).b;
                eir eirVar = new eir(ppVar.b.b, di4Var.g0(), !di4Var.q(), di4Var.r(), di4Var.s());
                ((ConstraintLayout) eirVar.f.b).setTag(2131429147, eirVar);
                return eirVar;
            case 4:
                FaceView faceView = new FaceView((Context) obj, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                faceView.e(((ob9) this.b).a, (td10) this.c);
                return faceView;
            case 5:
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) obj;
                ai9 ai9Var = (ai9) this.b;
                if (ai9Var == null) {
                    return new rg9(hg9.a);
                }
                try {
                    m231Var = ai9Var.d(bluetoothGattCharacteristic, (byte[]) this.c);
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA == null) {
                    zh9 zh9Var = m231Var;
                    if (zh9Var instanceof yh9) {
                        rg9Var = new sg9(rih1.a);
                    } else {
                        if (!(zh9Var instanceof xh9)) {
                            eg.o();
                            return null;
                        }
                        rg9Var = new rg9(new kg9(Integer.valueOf(((xh9) zh9Var).a)));
                    }
                } else {
                    rg9Var = new rg9(new ig9(thA.getClass().getSimpleName()));
                }
                return rg9Var;
            case 6:
                jp80 jp80Var = new jp80((View) this.b);
                h3h1 h3h1Var = new h3h1(new uv8((duk0) this.c, b));
                wch wchVar = q6x.b;
                if (!jp80Var.equals(wchVar) || !h3h1Var.equals(wchVar)) {
                    if (jp80Var.equals(wchVar)) {
                        return h3h1Var;
                    }
                    if (h3h1Var.equals(wchVar)) {
                        return jp80Var;
                    }
                    wchVar = new wch(jp80Var, h3h1Var);
                }
                return wchVar;
            case 7:
                ls9 ls9Var = new ls9((Context) obj, y2k1.b, b3k1.c, true, (w2k1) this.b);
                ls9Var.setOnFirstFrameRendered(new bp9((ven0) this.c, (byte) 0));
                return ls9Var;
            case 8:
                kd31 kd31Var = (kd31) obj;
                kd31Var.E(((or9) this.b).a.s());
                kd31Var.w((cr31) this.c);
                kd31Var.f(true);
                return rih1.a;
            case 9:
                eu9 eu9Var = (eu9) this.c;
                r1q0 r1q0Var = (r1q0) this.b;
                if (r1q0Var != null) {
                    r1q0Var.b(eu9Var);
                }
                return new rm(eu9Var, (byte) 13);
            case 10:
                ((iu30) this.b).invoke(new RemoteNativeRxRouter(((nx9) obj).u().getRemoteNativeRouter(), ((sy9) this.c).b.getUseComputationScheduler()));
                return rih1.a;
            case 11:
                return new m441(new us0((vu30) this.b, (Set) obj, (vu30) this.c, (lnm) null, (byte) 7));
            case 12:
                Map map = (Map) obj;
                iha ihaVar = (iha) this.b;
                Long l = (Long) this.c;
                Object obj2 = ihaVar.b;
                jha jhaVar = ihaVar.m;
                synchronized (obj2) {
                    try {
                        if (!ihaVar.c) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                jh5 jh5Var = (jh5) entry.getKey();
                                k3r k3rVar = (k3r) entry.getValue();
                                if (ihaVar.d(jh5Var, l)) {
                                    k3r k3rVar2 = (k3r) ihaVar.g.get(jh5Var);
                                    if (k3rVar2 != null ? !k3rVar2.equals(k3rVar) : true) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                            }
                            if (!linkedHashMap.isEmpty()) {
                                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                    jh5 jh5Var2 = (jh5) entry2.getKey();
                                    j3r j3rVar = (k3r) entry2.getValue();
                                    if (j3rVar instanceof j3r) {
                                        jhaVar.d.a(jh5Var2, j3rVar.a);
                                    } else if ((j3rVar instanceof h3r) && (((h3r) j3rVar).a instanceof c3r)) {
                                        jhaVar.d.a(jh5Var2, null);
                                    }
                                    ihaVar.g.put(jh5Var2, j3rVar);
                                }
                                Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
                                arrayList = new ArrayList(q7h.U(setEntrySet, 10));
                                for (Map.Entry entry3 : setEntrySet) {
                                    arrayList.add(new mmr0(entry3.getKey(), entry3.getValue()));
                                }
                            }
                            if (arrayList != null) {
                                ihaVar.a.invoke(arrayList);
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return rih1.a;
            case 13:
                im6 im6Var = (im6) obj;
                d0r d0rVar = (d0r) this.b;
                rm6 rm6Var = (rm6) this.c;
                ay8 ay8VarF = d3p1.F(d0rVar, rm6Var.a, im6Var);
                List list = im6Var.b;
                return h5p1.s(ay8VarF, list.isEmpty() ? d3p1.H(d0rVar, rm6Var.c, im6Var) : d3p1.H(d0rVar, rm6Var.b, im6Var), list.isEmpty() ? d3p1.H(d0rVar, rm6Var.d, im6Var) : new huz(Boolean.TRUE, (byte) 10), new td1(4, (lnm) null, (byte) 1));
            case 14:
                vhd0 vhd0Var = (vhd0) this.b;
                uhd0 uhd0Var = (uhd0) this.c;
                uba ubaVar = vhd0Var.b;
                c4m0 c4m0VarA = vhd0Var.a((xhm1) obj);
                int iOrdinal = uhd0Var.ordinal();
                if (iOrdinal == 0) {
                    i = 3;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    i = 1;
                }
                x6h1 x6h1VarC = c4m0VarA.c.c();
                x6h1VarC.i.add(new a7h1("quiz_option", "listening_age", (Integer) null, (String) null, z3m0.d(i)));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = c4m0VarA.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return ubaVar.p(k7h1Var.a(), vhd0.d);
            case 15:
                l4h l4hVar = (l4h) obj;
                Context context = ((upa) this.b).a;
                jqa jqaVar = (jqa) this.c;
                int i2 = jqaVar.a;
                z771 z771Var = jqaVar.b;
                ez61 ez61Var = jqaVar.c;
                wa71 wa71Var = jqaVar.d;
                String str = jqaVar.e;
                String str2 = jqaVar.f;
                String str3 = jqaVar.g;
                String str4 = l4hVar.a;
                return new lqa(i2, z771Var, ez61Var, wa71Var, str, str2, str3, str4, l4hVar.b, l4hVar.c, l4hVar.d, new jlw0(str3 == null ? str4 : str3, context.getString(2131956653)), (ArrayList) null, l4hVar.e, 8320);
            case 16:
                return lmt0.u(Single.fromCallable(new wra((esa) this.b, (vjb0) this.c, (v231) obj, (byte) 0)), 7).compose(new mta((byte) 0));
            case 17:
                tv80 tv80Var = (tv80) obj;
                gza gzaVar = (gza) this.b;
                String str5 = (String) this.c;
                Set set = s4b1.f;
                String strZ = uic.x("spotify:blend:members:".concat(uic.x(str5).h())).z();
                lzn0 lzn0Var = gzaVar.a;
                if (strZ == null) {
                    strZ = "";
                }
                lzn0Var.a(strZ, tv80Var, (Bundle) null);
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                List list2 = (List) obj;
                g0b g0bVar = (g0b) this.c;
                List list3 = (List) this.b;
                if (list2.size() == 0) {
                    urc0Var = new urc0(list3, z6x.a);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    for (Object obj3 : list3) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            p7h.T();
                            throw null;
                        }
                        if (u890.j(o7h.t0(i3, list2), Boolean.FALSE)) {
                            arrayList2.add(obj3);
                        }
                        i3 = i4;
                    }
                    urc0Var = new urc0(list3, arrayList2);
                }
                if (urc0Var.b.isEmpty() && !urc0Var.a.isEmpty()) {
                    return Single.just(new ajo(2));
                }
                Set set2 = s4b1.f;
                return g0bVar.b.a(new m2b(uic.x(g0bVar.f).h(), (String) list3.get(0), "ADD_TRACK")).flatMap(new dg8((Object) g0bVar, (byte) 6)).onErrorReturnItem(new ajo(3));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                CircularVideoPreviewView circularVideoPreviewView = (CircularVideoPreviewView) obj;
                s0b s0bVar = (s0b) this.b;
                iu30 iu30Var = (iu30) this.c;
                xcg xcgVar = s0bVar.a;
                circularVideoPreviewView.f(xcgVar);
                circularVideoPreviewView.setVisibility(xcgVar.a.length() <= 0 ? 8 : 0);
                circularVideoPreviewView.g = new c5a(iu30Var, (byte) 7);
                return rih1.a;
            case 20:
                fta ftaVar = (fta) this.b;
                fn31.T(cto1.q((dg30) ftaVar.c), (o8n) null, 0, new bh(ftaVar, (String) this.c, (tv80) obj, null, (byte) 26), 3);
                return rih1.a;
            case 21:
                ((t2) this.b).a.a((String) this.c, (tv80) obj, (Bundle) null);
                return rih1.a;
            case 22:
                tv80 tv80Var2 = (tv80) obj;
                xb40 xb40Var = (xb40) ((i6b) this.b).b;
                String str6 = (String) this.c;
                xb40Var.getClass();
                Set set3 = s4b1.f;
                s4b1 s4b1VarX = uic.x(str6);
                blc0 blc0Var = s4b1VarX.c;
                int iOrdinal2 = blc0Var.ordinal();
                if (iOrdinal2 == 44) {
                    strConcat = "spotify:internal:parental-control:blocking:artist:".concat(s4b1VarX.h());
                } else {
                    if (iOrdinal2 != 926) {
                        eg.n("Invalid link type: ", blc0Var, ". Expected artist or track.");
                        return null;
                    }
                    strConcat = "spotify:internal:parental-control:blocking:track:".concat(s4b1VarX.h());
                }
                xb40Var.a.a(strConcat, tv80Var2, (Bundle) null);
                return rih1.a;
            case 23:
                ((gza) ((l2a) this.b).b).a((String) this.c, (tv80) obj);
                return rih1.a;
            case 24:
                og80 og80Var = (og80) obj;
                if (((fjt) this.b) == fjt.a) {
                    ((MobiusLoopViewModel) this.c).U(new jdb(og80Var));
                }
                return rih1.a;
            case 25:
                e261 e261Var = (e261) obj;
                if (((m0d) this.b) == null) {
                    b261.A(e261Var, (String) this.c);
                }
                return rih1.a;
            case 26:
                ((ehb) this.b).b.D((y341) obj, (fhb) this.c);
                return rih1.a;
            case 27:
                mhd mhdVar = (mhd) this.b;
                mmr0 mmr0Var = new mmr0((zhb) obj, ((p811) this.c).a);
                if (mhdVar.isActive()) {
                    mhdVar.resumeWith(mmr0Var);
                }
                return rih1.a;
            case 28:
                return rqt0.u(new x010((zob1) this.b, ((zr00) this.c).a, new vm0(3, (lnm) null, (byte) 3), (byte) 1));
            default:
                zqg0 zqg0Var = (zqg0) this.b;
                String str7 = zqg0Var.a;
                Set set4 = s4b1.f;
                String strH = uic.x(str7).h();
                pmb pmbVar = (pmb) this.c;
                fn31.T(cto1.q(pmbVar.a), (o8n) null, 0, new us0(zqg0Var, pmbVar, str7, strH, (lnm) null, (byte) 10, false), 3);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd8(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
