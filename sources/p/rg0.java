package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@kzn0("activity")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lp/rg0;", "Lp/mzn0;", "Lp/qg0;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class rg0 extends mzn0 {
    public final Context c;
    public final Activity d;

    public rg0(Context context) {
        this.c = context;
        for (Object obj : z561.c0(ft.a1, context)) {
            if (((Context) obj) instanceof Activity) {
                this.d = (Activity) obj;
            }
        }
        obj = null;
        this.d = (Activity) obj;
    }

    @Override // p.mzn0
    public final vnn0 c(vnn0 vnn0Var, Bundle bundle, qon0 qon0Var) {
        Intent intent;
        int intExtra;
        qg0 qg0Var = (qg0) vnn0Var;
        if (qg0Var.Y == null) {
            bhn0.f(gvg.j(new StringBuilder("Destination "), qg0Var.h, " does not have an Intent set."));
            return null;
        }
        Intent intent2 = new Intent(qg0Var.Y);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = qg0Var.Z;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (qon0Var != null && qon0Var.a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", qg0Var.h);
        Context context = this.c;
        Resources resources = context.getResources();
        if (qon0Var != null) {
            int i = qon0Var.h;
            int i2 = qon0Var.i;
            if ((i <= 0 || !u890.j(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !u890.j(resources.getResourceTypeName(i2), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2);
            } else {
                resources.getResourceName(i);
                resources.getResourceName(i2);
                qg0Var.toString();
            }
        }
        context.startActivity(intent2);
        if (qon0Var != null && activity != null) {
            int i3 = qon0Var.f;
            int i4 = qon0Var.g;
            if ((i3 > 0 && u890.j(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && u890.j(resources.getResourceTypeName(i4), "animator"))) {
                resources.getResourceName(i3);
                resources.getResourceName(i4);
                qg0Var.toString();
            } else if (i3 >= 0 || i4 >= 0) {
                if (i3 < 0) {
                    i3 = 0;
                }
                activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            }
        }
        return null;
    }

    @Override // p.mzn0
    public final boolean j() {
        Activity activity = this.d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
