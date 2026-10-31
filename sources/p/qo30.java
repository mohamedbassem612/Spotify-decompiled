package p;

import android.app.Activity;
import com.comscore.streaming.State;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qo30 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j8x0 b;
    public final /* synthetic */ p410 c;

    public /* synthetic */ qo30(j8x0 j8x0Var, p410 p410Var, byte b) {
        this.a = b;
        this.b = j8x0Var;
        this.c = p410Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    public final Object apply(Object obj) {
        int i;
        String str;
        int i2;
        byte b = this.a;
        j8x0 j8x0Var = this.b;
        p410 p410Var = this.c;
        switch (b) {
            case 0:
                j8x0 j8x0Var2 = (j8x0) obj;
                ArrayList arrayListN0 = o7h.N0(j8x0Var2.b, j8x0Var.b);
                if (!j8x0Var2.e) {
                    return Observable.just(j8x0.a(j8x0Var2, 0, arrayListN0, (String) null, false, false, 0, 0, 125));
                }
                j8x0 j8x0VarA = j8x0.a(j8x0Var2, 0, arrayListN0, (String) null, false, false, 0, 2, 45);
                return p410Var.s(j8x0VarA).onErrorResumeNext(new mev(j8x0VarA, (byte) 19));
            default:
                List<lo30> list = (List) obj;
                Activity activity = (Activity) p410Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (lo30 lo30Var : list) {
                    ArrayList arrayList2 = lo30Var.d;
                    String str2 = lo30Var.a;
                    lwg1 lwg1Var = (lwg1) o7h.s0(arrayList2);
                    String string = null;
                    switch (lwg1Var == null ? -1 : oo30.a[lwg1Var.ordinal()]) {
                        case State.UNDEFINED /* -1 */:
                        case 9:
                            i = 1;
                            break;
                        case 0:
                        default:
                            eg.o();
                            return null;
                        case 1:
                            i = 2;
                            break;
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            i = 6;
                            break;
                        case 6:
                            i = 7;
                            break;
                        case 7:
                            i = 8;
                            break;
                        case 8:
                            i = 9;
                            break;
                    }
                    kbx0 kbx0Var = new kbx0(i);
                    String strJ = pcf.j(str2);
                    String str3 = lo30Var.b;
                    switch (l1d.C(i)) {
                        case 1:
                            i2 = 2131960526;
                            break;
                        case 2:
                            i2 = 2131960525;
                            break;
                        case 3:
                            i2 = 2131960524;
                            break;
                        case 4:
                            i2 = 2131960529;
                            break;
                        case 5:
                            i2 = 2131960527;
                            break;
                        case 6:
                            i2 = 2131960528;
                            break;
                        case 7:
                            i2 = 2131960530;
                            break;
                        case 8:
                            i2 = 2131960531;
                            break;
                        default:
                            if (string == null) {
                                str = str2;
                            } else {
                                str = string;
                            }
                            arrayList.add(new obx0(kbx0Var, strJ, str3, str, lo30Var.c, (q730) null, (String) null, 4064));
                            break;
                    }
                    string = activity.getResources().getString(i2);
                    if (string == null) {
                        str = str2;
                    } else {
                        str = string;
                    }
                    arrayList.add(new obx0(kbx0Var, strJ, str3, str, lo30Var.c, (q730) null, (String) null, 4064));
                }
                smc0 smc0VarN = k4p1.n();
                smc0VarN.addAll(j8x0Var.b);
                if (!arrayList.isEmpty()) {
                    smc0VarN.add(new zbx0(activity.getResources().getString(2131960523)));
                    smc0VarN.addAll(arrayList);
                }
                return j8x0.a(this.b, 0, k4p1.k(smc0VarN), (String) null, false, true, 0, 4, 41);
        }
    }
}
