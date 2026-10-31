package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.car.app.navigation.model.Maneuver;
import com.comscore.streaming.ContentFeedType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class g6f0 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:30:0x0150  */
    /* JADX WARN: Type inference failed for: r11v23, types: [android.view.View, p.ifv0] */
    public final Object invoke(Object obj) throws Throwable {
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((hmb0) obj).h = true;
                return rih1Var;
            case 1:
                ((Long) obj).getClass();
                return rih1Var;
            case 2:
                return Boolean.TRUE;
            case 3:
                b261.F((e261) obj, true);
                return rih1Var;
            case 4:
                mma0[] mma0VarArr = b261.a;
                ((e261) obj).b(z161.y, rih1Var);
                return rih1Var;
            case 5:
                sor0 sor0Var = (sor0) obj;
                return l1d.j(sor0Var.b, sor0Var.c, "[", ", ", ")");
            case 6:
                g030 g030Var = ((zao0) obj).a;
                if (g030Var != null) {
                    g030Var.invoke();
                }
                return rih1Var;
            case 7:
                ((Long) obj).getClass();
                return rih1Var;
            case 8:
                tjp0 tjp0Var = (tjp0) obj;
                if (tjp0Var.B0()) {
                    tjp0Var.a.f0();
                }
                return rih1Var;
            case 9:
                hmb0 hmb0Var = (hmb0) obj;
                if (hmb0Var.I()) {
                    hmb0.U(hmb0Var, false, 7);
                }
                return rih1Var;
            case 10:
                hmb0 hmb0Var2 = (hmb0) obj;
                if (hmb0Var2.I()) {
                    hmb0.W(hmb0Var2, false, 7);
                }
                return rih1Var;
            case 11:
                hmb0 hmb0Var3 = (hmb0) obj;
                if (hmb0Var3.I()) {
                    hmb0Var3.G();
                }
                return rih1Var;
            case 12:
                hmb0 hmb0Var4 = (hmb0) obj;
                if (hmb0Var4.I()) {
                    hmb0Var4.V(false);
                }
                return rih1Var;
            case 13:
                hmb0 hmb0Var5 = (hmb0) obj;
                if (hmb0Var5.I()) {
                    hmb0Var5.V(false);
                }
                return rih1Var;
            case 14:
                hmb0 hmb0Var6 = (hmb0) obj;
                if (hmb0Var6.I()) {
                    hmb0Var6.T(false);
                }
                return rih1Var;
            case 15:
                hmb0 hmb0Var7 = (hmb0) obj;
                if (hmb0Var7.I()) {
                    hmb0Var7.T(false);
                }
                return rih1Var;
            case 16:
                return Boolean.valueOf(!((txq0) obj).B0());
            case 17:
                return rih1Var;
            case 18:
                ga30 ga30Var = (ga30) obj;
                return "'" + ga30Var.b() + "' " + ga30Var.a();
            case 19:
                return rih1Var;
            case 20:
                ?? r11 = (ifv0) obj;
                if (r11.isAttachedToWindow()) {
                    r11.D();
                }
                return rih1Var;
            case 21:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i = 0; i < size; i++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 22:
                xua0 xua0Var = (xua0) obj;
                xua0Var.a = (short) 1332;
                xua0Var.a(Float.valueOf(0.0f), 0).b = shx0.e;
                xua0Var.a(Float.valueOf(290.0f), 666);
                return rih1Var;
            case 23:
                xua0 xua0Var2 = (xua0) obj;
                xua0Var2.a = (short) 6000;
                Float fValueOf = Float.valueOf(90.0f);
                xua0Var2.a(fValueOf, ContentFeedType.OTHER).b = onm0.b;
                xua0Var2.a(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                xua0Var2.a(fValueOf2, 1800);
                xua0Var2.a(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                xua0Var2.a(fValueOf3, 3300);
                xua0Var2.a(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                xua0Var2.a(fValueOf4, 4800);
                xua0Var2.a(fValueOf4, 6000);
                return rih1Var;
            case 24:
                return rih1Var;
            case 25:
                xua0 xua0Var3 = (xua0) obj;
                xua0Var3.a = (short) 1332;
                xua0Var3.a(Float.valueOf(0.0f), 666).b = shx0.e;
                xua0Var3.a(Float.valueOf(290.0f), xua0Var3.a);
                return rih1Var;
            case 26:
                xua0 xua0Var4 = (xua0) obj;
                xua0Var4.a = (short) 1800;
                xua0Var4.a(Float.valueOf(0.0f), 0).b = shx0.a;
                xua0Var4.a(Float.valueOf(1.0f), 750);
                return rih1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                xua0 xua0Var5 = (xua0) obj;
                xua0Var5.a = (short) 1800;
                xua0Var5.a(Float.valueOf(0.0f), 333).b = shx0.b;
                xua0Var5.a(Float.valueOf(1.0f), 1183);
                return rih1Var;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                xua0 xua0Var6 = (xua0) obj;
                xua0Var6.a = (short) 1800;
                xua0Var6.a(Float.valueOf(0.0f), 1000).b = shx0.c;
                xua0Var6.a(Float.valueOf(1.0f), 1567);
                return rih1Var;
            default:
                xua0 xua0Var7 = (xua0) obj;
                xua0Var7.a = (short) 1800;
                xua0Var7.a(Float.valueOf(0.0f), 1267).b = shx0.d;
                xua0Var7.a(Float.valueOf(1.0f), 1800);
                return rih1Var;
        }
    }

    public /* synthetic */ g6f0(byte b) {
        this.a = b;
    }
}
