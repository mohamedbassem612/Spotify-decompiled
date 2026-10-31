package p;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jm1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jm1(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0287  */
    public final Object invoke(Object obj) {
        wo1 wo1Var;
        ArrayList arrayList;
        byte b = this.a;
        boolean z = true;
        z = true;
        boolean z2 = true;
        String str = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((qtr) obj).b(new gz0((nm1) obj2, (lnm) null, (byte) 1));
                return rih1Var;
            case 1:
                ((qtr) obj).b(new f3((avl1) obj2, (lnm) str, z ? (byte) 1 : (byte) 0));
                return rih1Var;
            case 2:
                String str2 = (String) obj;
                return ((g7h) ((a0m) obj2).b).a("", Collections.singletonList(str2), false).map(new njp1(str2, (byte) 6));
            case 3:
                bhd bhdVar = (bhd) obj;
                if (bhdVar.equals(ahd.a)) {
                    wo1Var = wo1.a;
                } else if (bhdVar.equals(zgd.a)) {
                    wo1Var = wo1.b;
                } else {
                    if (!bhdVar.equals(ygd.a)) {
                        eg.o();
                        return null;
                    }
                    wo1Var = wo1.c;
                }
                ((ow1) obj2).o.invoke(wo1Var);
                return rih1Var;
            case 4:
                ((u4a0) obj2).invoke((pia1) obj);
                return rih1Var;
            case 5:
                ((csc1) ((eyh0) obj2).d).a((tv80) obj);
                return rih1Var;
            case 6:
                qxc0 qxc0Var = (qxc0) obj;
                le30 le30VarA = ((me30) obj2).a(qxc0Var != null ? qxc0Var.e : null);
                if (le30VarA != le30.b1 && le30VarA != le30.c1) {
                    z = (qxc0Var != null ? qxc0Var.W0 : 0) > 1;
                }
                return Boolean.valueOf(z);
            case 7:
                return ((s22) obj2).b;
            case 8:
                ((g3) obj2).invoke();
                return rih1Var;
            case 9:
                ((zhm) obj2).e.invoke();
                return rih1Var;
            case 10:
                ((qtr) obj).b(new js((z72) obj2, (lnm) null, (byte) 2));
                return rih1Var;
            case 11:
                return new rxc0(((d82) obj2).b);
            case 12:
                j7e0 j7e0Var = ((hwq) obj).g;
                j7e0 j7e0Var2 = j7e0Var instanceof j7e0 ? j7e0Var : null;
                zuc0 zuc0Var = j7e0Var2 != null ? j7e0Var2.a : null;
                co01 co01Var = new co01(zuc0Var != null ? zuc0Var.b : 0, ((h82) obj2).b, j7e0Var.getUri());
                pc41 pc41Var = zuc0Var != null ? zuc0Var.h : null;
                int i = pc41Var != null ? pc41Var.a : 0;
                int i2 = i == 0 ? -1 : i82.a[l1d.C(i)];
                if (i2 == -1) {
                    z2 = false;
                } else if (i2 != 1 && i2 != 2) {
                    eg.o();
                    return null;
                }
                return new ao01(co01Var, z2);
            case 13:
                ((qtr) obj).b(new ep0((qj0) obj2, (lnm) null, (byte) 2));
                return rih1Var;
            case 14:
                ((xab1) obj2).d((CancellationException) null);
                return rih1Var;
            case 15:
                ((Number) obj).intValue();
                return ((yok0) obj2).b();
            case 16:
                ((qtr) obj).b(new iw2((jw2) obj2, (lnm) null));
                return rih1Var;
            case 17:
                ((jen0) obj).a((ComposeView) obj2);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((v7h) obj2).a(((Number) obj).intValue(), true);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                Context context = (Context) ((rt01) obj2).c;
                return new i73(context.getString(2131952172), context.getString(2131952174), context.getString(2131952173), context.getString(2131952171));
            case 20:
                uto utoVar = (uto) obj2;
                return sqg0.J(new mmr0[]{new mmr0(f83.b, o7h.p1(((p53) obj).a)), new mmr0(f83.a, dm61.A0(utoVar != null ? utoVar.a : null))});
            case 21:
                return new szv0(((Long) obj2).longValue() * 1000, 6, null);
            case 22:
                iz0 iz0Var = (iz0) obj2;
                return new vd0((kge) iz0Var.f, (ha3) obj, iz0Var, (byte) 4);
            case 23:
                ljd0 ljd0Var = (ljd0) ((fb3) obj2).c;
                if (ljd0Var != null) {
                    return ljd0Var;
                }
                u890.C("model");
                throw null;
            case 24:
                ((z2s) obj).R(tb3.class, (rt01) ((rt01) obj2).d, ra3.N0, ra3.O0, ra3.P0, false, p83.T0);
                return rih1Var;
            case 25:
                String string = ((Context) ((rb3) obj2).c).getResources().getString(2131952181);
                xti0 xti0VarA = ((cxc0) obj).f.x.a(xti0.class);
                if (xti0VarA != null) {
                    ArrayList<vui0> arrayList2 = xti0VarA.a;
                    arrayList = new ArrayList(q7h.U(arrayList2, 10));
                    for (vui0 vui0Var : arrayList2) {
                        arrayList.add(new yti0(vui0Var.b, vui0Var.d, vui0Var.e));
                    }
                } else {
                    arrayList = z6x.a;
                }
                return new ob3(string, arrayList);
            case 26:
                ufx ufxVar = ((xfx) ((rt01) obj2).d).b;
                return new b8s(ufxVar.a, ufxVar.b, new bui0());
            case 27:
                Bundle bundle = (Bundle) obj;
                ip31 ip31Var = ((gc3) obj2).h;
                String str3 = ((lc3) ip31Var.b).c;
                if (str3 != null) {
                    if (!u890.j(bundle != null ? bundle.getString("cwp_autoplay_key") : null, str3) || bundle == null) {
                        fn31.T(cto1.q((iac0) ip31Var.h), (o8n) null, 0, new l53(ip31Var, str3, (lnm) null), 3);
                    }
                }
                return rih1Var;
            case 28:
                qv00 qv00Var = (qv00) obj;
                String str4 = ((yd3) obj2).a;
                qv00Var.a(str4, zoy0.class, false);
                qv00Var.a(str4, myv0.class, false);
                return rih1Var;
            default:
                return new uxd(((ce3) obj2).b.getString(2131960976));
        }
    }
}
