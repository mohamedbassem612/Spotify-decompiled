package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ufc1 implements MobiusLoop.Logger {
    public final i8h1 a;
    public final yok0 b;

    public ufc1(i8h1 i8h1Var) {
        this.a = i8h1Var;
        r6h1 r6h1Var = r6h1.c;
        this.b = new yok0((byte) 27);
    }

    public final void a(Object obj, Object obj2, Next next) {
        tfc1 tfc1Var = (tfc1) obj2;
        next.e(new xzf(this, (yfc1) obj, (byte) 7));
        y6h1 y6h1Var = this.b.b;
        boolean zEquals = tfc1Var.equals(pfc1.a);
        b7x b7xVar = b7x.a;
        i8h1 i8h1Var = this.a;
        if (zEquals) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("onboarding_card", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("onboarding_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA = x6h1VarC2.a();
            String str = nik1.b3.a;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if ((tfc1Var instanceof ofc1) || (tfc1Var instanceof qfc1) || (tfc1Var instanceof sfc1)) {
            return;
        }
        if (!tfc1Var.equals(rfc1.a)) {
            eg.o();
            return;
        }
        x6h1 x6h1VarC3 = y6h1Var.c();
        x6h1VarC3.i.add(new a7h1("streaming_quality_card", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = true;
        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
        x6h1VarC4.i.add(new a7h1("audio_quality_settings_page_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC4.j = false;
        y6h1 y6h1VarA2 = x6h1VarC4.a();
        String str2 = nik1.d3.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2, Exception exc) {
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, First first) {
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, Object obj2) {
    }

    public final /* bridge */ /* synthetic */ void e(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void f(Object obj, Exception exc) {
    }
}
