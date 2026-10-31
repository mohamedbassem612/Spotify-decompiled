package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ieb0 implements i8l {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ieb0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final h8l a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                leb0 leb0Var = (leb0) obj2;
                haa0 haa0Var = (haa0) obj;
                c2r0 c2r0Var = (c2r0) haa0Var.d;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                wnh1 wnh1VarD = c2r0Var.d(yon1.G1("SETTINGS_NOTIFICATIONS_LANGUAGE_PREFERENCE_DIALOG_ERROR", "settings/notifications/language-preference/dialog/error", 1840, "settings"), (qir0) null);
                vkg vkgVar = (Activity) haa0Var.b;
                vkg tkgVar = vkgVar instanceof vkg ? vkgVar : null;
                if (tkgVar == null) {
                    tkgVar = new tkg();
                }
                return new heb0(context, leb0Var, new o860(wnh1VarD, new w1r0(tkgVar), (mwn0) haa0Var.c));
            case 1:
                return new g111(viewGroup, layoutInflater, (onq) obj, (pux0) obj2);
            default:
                jnq jnqVar = (jnq) ((loq) obj2).a.c;
                lzn0 lzn0Var = (lzn0) ((ej21) jnqVar.c).c.get();
                c8o.l(lzn0Var);
                return new fsg0(lzn0Var, viewGroup, layoutInflater, (cir0) obj, (moq) ((jly0) jnqVar.a).get());
        }
    }
}
