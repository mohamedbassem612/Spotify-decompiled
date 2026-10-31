package p;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y5n1 {
    public final u7n1 a;
    public final String b;
    public final bsd1 c;
    public final rtw0 d;
    public final c5n1 e;

    public y5n1(Context context, u7n1 u7n1Var, rtw0 rtw0Var) {
        bsd1 bsd1Var = new bsd1();
        this.c = bsd1Var;
        this.b = context.getPackageName();
        this.a = u7n1Var;
        this.d = rtw0Var;
        c5n1 c5n1Var = new c5n1(context, u7n1Var, z5n1.a, new xpv0((byte) 22));
        this.e = c5n1Var;
        c5n1Var.a().post(new a5n1(this, bsd1Var, context));
    }

    public static Bundle a(y5n1 y5n1Var, l7n1 l7n1Var, long j, long j2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", y5n1Var.b);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", l7n1Var.a);
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(l7n1Var.b));
        ArrayList arrayList = new ArrayList();
        xzn1.k(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(xzn1.i(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle b(y5n1 y5n1Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", y5n1Var.b);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        xzn1.k(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(xzn1.i(arrayList)));
        return bundle;
    }

    public static boolean c(y5n1 y5n1Var) {
        return y5n1Var.c.a.j() && ((Integer) y5n1Var.c.a.g()).intValue() < 83420000;
    }

    public static boolean d(y5n1 y5n1Var) {
        return y5n1Var.c.a.j() && ((Integer) y5n1Var.c.a.g()).intValue() == 0;
    }
}
