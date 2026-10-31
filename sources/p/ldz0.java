package p;

import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ldz0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ldz0(Object obj, byte b) {
        super(1);
        this.a = b;
    }

    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        ng9 ng9Var = ng9.a;
        lg9 lg9Var = lg9.a;
        br01 br01Var = br01.c;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ndz0.n(((ai9) obj).b(), ng9Var);
            case 1:
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) obj;
                return ndz0.n((bluetoothGattCharacteristic.getProperties() & 2) != 0 ? bluetoothGattCharacteristic : null, lg9Var);
            case 2:
                return ndz0.n(((ai9) obj).b(), ng9Var);
            case 3:
                BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) obj;
                return ndz0.n((bluetoothGattCharacteristic2.getProperties() & 8) != 0 ? bluetoothGattCharacteristic2 : null, lg9Var);
            case 4:
                fjz0 fjz0Var = (fjz0) obj;
                return jjz0.f(new gjz0(fjz0Var.a, fjz0Var.b, fjz0Var.c, fjz0Var.d, false, fjz0Var.f, "", (String) null));
            case 5:
                d441 d441VarG1 = ((y341) obj).g1("\n        SELECT * FROM RateLimitedEvents\n        ");
                try {
                    int iW = y7y0.w(d441VarG1, "eventName");
                    int iW2 = y7y0.w(d441VarG1, "count");
                    int iW3 = y7y0.w(d441VarG1, "timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG1.f1()) {
                        arrayList.add(new mrz0(d441VarG1.getLong(iW3), (int) d441VarG1.getLong(iW2), d441VarG1.P0(iW)));
                    }
                    d441VarG1.close();
                    return arrayList;
                } catch (Throwable th) {
                    d441VarG1.close();
                    throw th;
                }
            case 6:
                bsz0 bsz0Var = ((xsz0) obj).a;
                if (bsz0Var instanceof bsz0) {
                    bsz0 bsz0Var2 = bsz0Var;
                    return new ksz0(bsz0Var2.a, new fsz0(Double.valueOf(bsz0Var2.c), Long.valueOf(bsz0Var2.d), Boolean.valueOf(bsz0Var2.e)), Integer.valueOf(bsz0Var2.b));
                }
                if (bsz0Var.equals(wdx0.d)) {
                    return lsz0.a;
                }
                eg.o();
                return null;
            case 7:
                j7e0 j7e0Var = ((hwq) obj).g;
                boolean z = j7e0Var instanceof j7e0;
                h290 h290Var = z6x.a;
                if (!z) {
                    return new jxz0(0, "", "", h290Var);
                }
                j7e0 j7e0Var2 = j7e0Var;
                wyz0 wyz0VarI = pvc.i(j7e0Var2.a.g);
                if (wyz0VarI != null) {
                    h290Var = wyz0VarI.c;
                }
                return new jxz0(wyz0VarI != null ? wyz0VarI.b : 0, wyz0VarI != null ? wyz0VarI.a : "", j7e0Var2.c, h290Var);
            case 8:
                rtb0 rtb0Var = (rtb0) obj;
                rtb0.c(rtb0Var, (Object) null, pbj.a, 3);
                rtb0Var.e(0, new emv0((byte) 24), new emv0((byte) 25), new j2i(802480018, new jy00((byte) 1), true));
                return rih1Var;
            case 9:
                d441 d441VarG2 = ((y341) obj).g1("DELETE FROM recent_locations WHERE geoNameId NOT IN (SELECT geoNameId FROM recent_locations ORDER BY timestamp DESC LIMIT (30 - ?))");
                try {
                    d441VarG2.r(1, 1L);
                    d441VarG2.f1();
                    return rih1Var;
                } finally {
                    d441VarG2.close();
                }
            case 10:
                d441 d441VarG3 = ((y341) obj).g1("SELECT * FROM recent_locations ORDER BY timestamp DESC");
                try {
                    int iW4 = y7y0.w(d441VarG3, "geoNameId");
                    int iW5 = y7y0.w(d441VarG3, "city");
                    int iW6 = y7y0.w(d441VarG3, "timestamp");
                    ArrayList arrayList2 = new ArrayList();
                    while (d441VarG3.f1()) {
                        arrayList2.add(new hm01(d441VarG3.getLong(iW6), (int) d441VarG3.getLong(iW4), d441VarG3.P0(iW5)));
                    }
                    d441VarG3.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    d441VarG3.close();
                    throw th2;
                }
            case 11:
                oq01 oq01Var = (oq01) obj;
                String str = oq01Var.b;
                ArrayList arrayList3 = new ArrayList(8);
                for (int i = 0; i < 8; i++) {
                    arrayList3.add(new nv70(str, oq01Var.e));
                }
                return new pmb1(str, arrayList3, oq01Var.c);
            case 12:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 13:
                cr01 cr01Var = ((aw01) obj).b;
                String strS = zxo1.s(cr01Var);
                i = cr01Var.e == br01Var ? 1 : 0;
                if (eyo1.p(strS) || i != 0) {
                    return null;
                }
                return strS;
            case 14:
                cr01 cr01Var2 = ((aw01) obj).b;
                String strS2 = zxo1.s(cr01Var2);
                i = cr01Var2.e == br01Var ? 1 : 0;
                if (eyo1.p(strS2) || i != 0) {
                    return null;
                }
                return strS2;
            case 15:
                oey0 oey0Var = (oey0) obj;
                return new kob1(oey0Var.a, oey0Var.b, oey0Var.c, oey0Var.d, oey0Var.e, oey0Var.f, oey0Var.g, oey0Var.h, oey0Var.i, oey0Var.j, oey0Var.k, oey0Var.l, oey0Var.m, oey0Var.n, oey0Var.o, oey0Var.f27p, oey0Var.q, oey0Var.r, false, oey0Var.v, oey0Var.x);
            case 16:
                kjf1 kjf1Var = ((xv31) obj).e;
                String str2 = kjf1Var.a;
                String str3 = kjf1Var.b;
                String str4 = kjf1Var.c;
                String str5 = kjf1Var.d;
                String str6 = kjf1Var.e;
                String str7 = kjf1Var.f;
                String str8 = kjf1Var.g;
                vw01 vw01Var = kjf1Var.h;
                return new gyf1(str2, str3, str4, str7, str5, str6, str8, vw01Var == vw01.b, vw01Var == vw01.a);
            case 17:
                return nm1.j((wk11) obj);
            case 18:
                y0r y0rVar = (y0r) obj;
                return new rxc0(new dr11(y0rVar.a, y0rVar.d, y0rVar.e).a);
            case 19:
                return 1;
            case 20:
                int iOrdinal = ((wy41) obj).ordinal();
                if (iOrdinal == 0) {
                    return "track";
                }
                if (iOrdinal == 1) {
                    return "artist";
                }
                eg.o();
                return null;
            case 21:
                return new zau0(((Boolean) obj).booleanValue());
            case 22:
                return Boolean.valueOf(u890.j(((jh5) obj).a, hvm.b));
            case 23:
                return new owl0(new opl0(6, (r6h1) obj, (byte) 6));
            case 24:
                owl0 owl0Var = (owl0) obj;
                x6h1 x6h1VarC = owl0Var.a.c();
                vi11 vi11VarP = m4c.p();
                vi11VarP.E("confirm_button");
                x6h1VarC.i.add(vi11VarP.l());
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str9 = wzu.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, zno1.t(oqn1.n("destination", str9 != null ? str9 : ""))), y6h1VarA, owl0Var.b.b, System.currentTimeMillis());
            case 25:
                owl0 owl0Var2 = (owl0) obj;
                x6h1 x6h1VarC2 = owl0Var2.a.c();
                vi11 vi11VarP2 = m4c.p();
                vi11VarP2.E("confirm_button");
                x6h1VarC2.i.add(vi11VarP2.l());
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC2.a(), owl0Var2.b.b, System.currentTimeMillis());
            case 26:
                return mno1.h(new mmr0[]{new mmr0("share.sheet.state", (Parcelable) obj)});
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return (Parcelable) jhc1.t((Bundle) obj, "share.sheet.state", zg71.class);
            case 28:
                return mno1.h(new mmr0[]{new mmr0("share.sheet.tabs.state", (Parcelable) obj)});
            default:
                return (Parcelable) jhc1.t((Bundle) obj, "share.sheet.tabs.state", km71.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ldz0(int i, byte b) {
        super(i);
        this.a = b;
    }
}
