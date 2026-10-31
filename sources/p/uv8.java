package p;

import android.bluetooth.BluetoothGattCharacteristic;
import android.content.res.Resources;
import androidx.compose.ui.geometry.Offset;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uv8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv8(ai9 ai9Var, vg9 vg9Var) {
        super(1);
        this.a = (byte) 2;
        this.b = ai9Var;
    }

    public final Object invoke(Object obj) {
        Boolean m231Var;
        String string;
        byte b = this.a;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new rxc0(((aw8) obj2).a);
            case 1:
                tnm tnmVar = (tnm) ((i59) obj2).b.a.c;
                return new n59((i2p) ((jly0) tnmVar.e).get(), (j2p) ((jly0) tnmVar.g).get(), (cir0) obj, (byte) 0);
            case 2:
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) obj;
                ai9 ai9Var = (ai9) obj2;
                if (ai9Var == null) {
                    return new rg9(hg9.a);
                }
                try {
                    m231Var = Boolean.valueOf(ai9Var.a(bluetoothGattCharacteristic));
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    return new rg9(new ig9(thA.getClass().getSimpleName()));
                }
                Boolean bool = Boolean.TRUE;
                if (!m231Var.equals(bool)) {
                    bool = null;
                }
                return vg9.k(bool, new kg9((Integer) null));
            case 3:
                el9 el9Var = (el9) obj2;
                return new x010(((rm9) el9Var.g).u, new fu20(rqt0.u(new te1(d3p1.F(el9Var.b, el9Var.c, (String) obj), (byte) 7)), new ry5(el9Var, lnmVar, (byte) 16), (byte) 1), new cl9(3, null, (byte) 0), (byte) 1);
            case 4:
                return ((it8) obj2).n((String) obj);
            case 5:
                return new rm((ll9) obj2, (byte) 9);
            case 6:
                nl9 nl9Var = (nl9) obj2;
                return new x010(((rm9) nl9Var.b).u, new fu20(rqt0.u(((it8) nl9Var.e).n((String) obj)), new ry5(nl9Var, lnmVar, (byte) 18), (byte) 1), new cl9(3, null, (byte) 1), (byte) 1);
            case 7:
                ((Number) obj).intValue();
                return ((duk0) obj2).b();
            case 8:
                ((qtr) obj).b(new kr((br0) obj2, (lnm) null, (byte) 5));
                return rih1Var;
            case 9:
                nm1 nm1Var = (nm1) obj2;
                d0r d0rVar = (d0r) nm1Var.b;
                o3r o3rVar = (o3r) nm1Var.c;
                String str = ((rm9) nm1Var.f).a.h;
                if (str == null) {
                    str = "";
                }
                return d3p1.H(d0rVar, o3rVar, str);
            case 10:
                ((qtr) obj).b(new ep0((nl9) obj2, (lnm) null, (byte) 6));
                return rih1Var;
            case 11:
                return new rm((io9) obj2, (byte) 11);
            case 12:
                int iIntValue = ((Number) obj).intValue();
                if (((f8n) obj2).a) {
                    iIntValue = -iIntValue;
                }
                return Integer.valueOf(iIntValue);
            case 13:
                ((ro9) obj2).j.setValue((f8n) obj);
                return rih1Var;
            case 14:
                ((qtr) obj).b(new ep0((tm) obj2, (lnm) null, (byte) 7));
                return rih1Var;
            case 15:
                ((qtr) obj).b(new gp9((ip9) obj2, (lnm) null, (byte) 0));
                return rih1Var;
            case 16:
                ((qtr) obj).b(new gp9((ip9) obj2, (lnm) null, (byte) 1));
                return rih1Var;
            case 17:
                ((qtr) obj).b(new gp9((ip9) obj2, (lnm) null, (byte) 2));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                long j = ((Offset) obj).a;
                ((tui1) obj2).d();
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((qtr) obj).b(new kr((ds9) obj2, (lnm) null, (byte) 7));
                return rih1Var;
            case 20:
                et9 et9Var = (et9) obj2;
                ot9 ot9Var = (ot9) et9Var.e;
                ot9Var.c = 3;
                ot9Var.d = null;
                return new rm(et9Var, (byte) 12);
            case 21:
                kd31 kd31Var = (kd31) obj;
                kd31Var.f(false);
                kd31Var.k((vc21) obj2);
                return rih1Var;
            case 22:
                o0a o0aVar = ((i0a) obj).b;
                Resources resources = ((j0a) obj2).b.getResources();
                int iOrdinal = o0aVar.ordinal();
                if (iOrdinal == 0) {
                    string = resources.getString(2131952706);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    string = resources.getString(2131952708);
                }
                String str2 = string;
                str2.getClass();
                return new nhb1(str2, resources.getString(2131952707), resources.getString(2131952705), resources.getString(2131952704), false, (izh1) null, 96);
            case 23:
                ((qtr) obj).b(new w3a((bs0) obj2, (lnm) null, (byte) 0));
                return rih1Var;
            case 24:
                return new f6a((z7a) ((j6a) obj2).b.getValue());
            case 25:
                ic9 ic9Var = (ic9) obj2;
                return ((xa5) obj).a((p9m) ic9Var.b, (c391) ic9Var.c);
            case 26:
                return new mmr0((zga) obj2, (n700) obj);
            case 27:
                List<mmr0> list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (mmr0 mmr0Var : list) {
                    arrayList.add(new mmr0(((jh5) mmr0Var.a).b, (k3r) mmr0Var.b));
                }
                ((iu30) ((jga) obj2).d).invoke(arrayList);
                return rih1Var;
            case 28:
                return Boolean.valueOf(u890.j(((jh5) obj).a, (zjd1) obj2));
            default:
                e261 e261Var = (e261) obj;
                gka gkaVar = (gka) obj2;
                List listM = p7h.M(new String[]{gkaVar.a, gkaVar.b, gkaVar.c});
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : listM) {
                    if (!ihc1.y0((String) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                b261.n(e261Var, o7h.y0(arrayList2, ". ", (String) null, (String) null, (iu30) null, 62));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv8(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }
}
