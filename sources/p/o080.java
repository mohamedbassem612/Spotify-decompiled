package p;

import android.widget.RemoteViews;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o080 {
    public static final o080 a = new o080();

    public final void a(cng1 cng1Var, RemoteViews remoteViews, z9h z9hVar, int i) {
        if (z9hVar instanceof l7r) {
            l7r l7rVar = (l7r) z9hVar;
            b421.f(remoteViews, i, "setColorFilter", z4p1.G(l7rVar.a), z4p1.G(l7rVar.b));
            return;
        }
        if (z9hVar instanceof tw21) {
            b421.d(remoteViews, i, "setColorFilter", ((tw21) z9hVar).a);
        } else {
            remoteViews.setInt(i, "setColorFilter", z4p1.G(z9hVar.a(cng1Var.a)));
        }
    }
}
