package p;

import android.app.Activity;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gu8 {
    public final Activity a;
    public final whh1 b;

    public gu8(Activity activity, whh1 whh1Var) {
        this.a = activity;
        this.b = whh1Var;
    }

    public final void a(String str, Function0 function0, Function0 function1) {
        Activity activity = this.a;
        String string = activity.getString(2131952682);
        String string2 = activity.getString(2131952679);
        String string3 = activity.getString(2131952681);
        String string4 = activity.getString(2131952680);
        mw40 mw40VarT = yoi1.T(activity, string, string2);
        fu8 fu8Var = new fu8(this, str, function1, (byte) 0);
        mw40VarT.a = string3;
        mw40VarT.c = fu8Var;
        fu8 fu8Var2 = new fu8(this, str, function0, (byte) 1);
        mw40VarT.b = string4;
        mw40VarT.d = fu8Var2;
        mw40VarT.e = true;
        mw40VarT.f = new in1(this, str, function0);
        mw40VarT.b().b();
        whh1 whh1Var = this.b;
        jtk0 jtk0Var = whh1Var.b;
        jtk0Var.getClass();
        x6h1 x6h1VarC = jtk0Var.b.c();
        x6h1VarC.i.add(new a7h1("unfollow_dialog", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = jtk0Var.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        whh1Var.a.f(k7h1Var.a(), (Set) null);
    }
}
