package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import app.p000rive.semantics.SemanticState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class tii implements bv30 {
    public final /* synthetic */ byte a;

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        int i = SemanticState.Focused;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                r3e1 r3e1Var = (r3e1) obj;
                g3e1 g3e1Var = (g3e1) obj2;
                Function0 function0 = (Function0) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i2 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? x340Var.g(r3e1Var) : x340Var.i(r3e1Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= (iIntValue & 64) == 0 ? x340Var.g(g3e1Var) : x340Var.i(g3e1Var) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    if (x340Var.i(function0)) {
                        i = 256;
                    }
                    i2 |= i;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    x340Var2.b0();
                } else {
                    fus.c(r3e1Var, g3e1Var, function0, x340Var2, i2 & 1022);
                }
                break;
            case 1:
                r3e1 r3e1Var2 = (r3e1) obj;
                g3e1 g3e1Var2 = (g3e1) obj2;
                Function0 function1 = (Function0) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? x340Var3.g(r3e1Var2) : x340Var3.i(r3e1Var2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= (iIntValue2 & 64) == 0 ? x340Var3.g(g3e1Var2) : x340Var3.i(g3e1Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    if (x340Var3.i(function1)) {
                        i = 256;
                    }
                    i3 |= i;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i3 & 1, (i3 & 1171) != 1170)) {
                    x340Var4.b0();
                } else {
                    fus.c(r3e1Var2, g3e1Var2, function1, x340Var4, i3 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                nbe1 nbe1Var = (nbe1) obj5;
                String string = ((CharSequence) obj4).subSequence(nbe1.g(nbe1Var.a), nbe1.f(nbe1Var.a)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return rih1Var;
    }
}
