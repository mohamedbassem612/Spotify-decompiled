package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y021 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ g121 a;

    public y021(g121 g121Var) {
        this.a = g121Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kly0 kly0Var = this.a.d.b;
        j6p1 j6p1Var = ((t021) obj).a;
        boolean z = j6p1Var instanceof v121;
        b7x b7xVar = b7x.a;
        if (z) {
            s221 s221Var = (s221) kly0Var.get();
            i8h1 i8h1Var = s221Var.a;
            x6h1 x6h1VarC = s221Var.b.b.c();
            x6h1VarC.i.add(new a7h1("too_many_devices_alert", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        } else if (j6p1Var instanceof t121) {
            s221 s221Var2 = (s221) kly0Var.get();
            t121 t121Var = (t121) j6p1Var;
            String str = t121Var.c;
            m0u m0uVar = t121Var.d;
            i8h1 i8h1Var2 = s221Var2.a;
            x6h1 x6h1VarC3 = s221Var2.b.b.c();
            x6h1VarC3.i.add(new a7h1("remove_download_confirmation_alert", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            x6h1 x6h1VarC4 = x6h1VarC3.a().c();
            x6h1VarC4.i.add(new a7h1("remove_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            y6h1 y6h1VarA = x6h1VarC4.a();
            ept eptVar = m0uVar.c;
            String str2 = eptVar.c;
            String strValueOf = String.valueOf((int) eptVar.b.a);
            String strValueOf2 = String.valueOf(eptVar.e);
            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
            mmr0 mmr0Var = new mmr0("item_to_remove_from_downloads", str);
            if (str2 == null) {
                str2 = "";
            }
            mmr0 mmr0Var2 = new mmr0("remote_device_id", str2);
            if (strValueOf == null) {
                strValueOf = "";
            }
            mmr0 mmr0Var3 = new mmr0("remote_device_type", strValueOf);
            if (strValueOf2 == null) {
                strValueOf2 = "";
            }
            i8h1Var2.m(new w7h1("", "", z7h1Var, new x7h1("remove_download_from_remote_device", 1, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, new mmr0("remote_client_platform", strValueOf2)})), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        } else {
            if (!(j6p1Var instanceof u121)) {
                eg.o();
                return null;
            }
            s221 s221Var3 = (s221) kly0Var.get();
            i8h1 i8h1Var3 = s221Var3.a;
            x6h1 x6h1VarC5 = s221Var3.b.b.c();
            x6h1VarC5.i.add(new a7h1("remove_download_confirmation_alert", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            x6h1 x6h1VarC6 = x6h1VarC5.a().c();
            x6h1VarC6.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = false;
            i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        return rih1.a;
    }
}
