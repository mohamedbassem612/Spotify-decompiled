package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yaf0 implements MobiusLoop.Logger {
    public final fad0 a;

    public yaf0(fad0 fad0Var) {
        this.a = fad0Var;
    }

    public final void a(Object obj, Object obj2, Next next) {
        xaf0 xaf0Var = (xaf0) obj2;
        next.e(new xzf(this, (zaf0) obj, (byte) 4));
        fad0 fad0Var = this.a;
        yok0 yok0Var = (yok0) fad0Var.c;
        i8h1 i8h1Var = (i8h1) fad0Var.b;
        boolean z = xaf0Var instanceof laf0;
        b7x b7xVar = b7x.a;
        if (z) {
            String str = ((laf0) xaf0Var).a;
            x6h1 x6h1VarC = yok0Var.b.c();
            x6h1VarC.i.add(new a7h1("data_saver_on", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("navigate_to_data_saver_settings", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (xaf0Var instanceof faf0) {
            String str2 = ((faf0) xaf0Var).a;
            x6h1 x6h1VarC3 = yok0Var.b.c();
            x6h1VarC3.i.add(new a7h1("downgraded_by_backend", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = true;
            x6h1 x6h1VarC4 = x6h1VarC3.a().c();
            x6h1VarC4.i.add(new a7h1("navigate_to_auto_adjust_settings", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (xaf0Var instanceof raf0) {
            String str3 = ((raf0) xaf0Var).a;
            x6h1 x6h1VarC5 = yok0Var.b.c();
            x6h1VarC5.i.add(new a7h1("lossless_only_downloads", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = true;
            x6h1 x6h1VarC6 = x6h1VarC5.a().c();
            x6h1VarC6.i.add(new a7h1("navigate_to_audio_quality_settings", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (xaf0Var instanceof taf0) {
            String str4 = ((taf0) xaf0Var).a;
            x6h1 x6h1VarC7 = yok0Var.b.c();
            x6h1VarC7.i.add(new a7h1("lossless_try_wifi_or_download", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC7.j = true;
            x6h1 x6h1VarC8 = x6h1VarC7.a().c();
            x6h1VarC8.i.add(new a7h1("navigate_to_audio_quality_settings", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC8.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4)), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (xaf0Var instanceof saf0) {
            String str5 = ((saf0) xaf0Var).a;
            x6h1 x6h1VarC9 = yok0Var.b.c();
            x6h1VarC9.i.add(new a7h1("lossless_try_cellular_or_download", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC9.j = true;
            x6h1 x6h1VarC10 = x6h1VarC9.a().c();
            x6h1VarC10.i.add(new a7h1("navigate_to_audio_quality_settings", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC10.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (xaf0Var instanceof qaf0) {
            String str6 = ((qaf0) xaf0Var).a;
            x6h1 x6h1VarC11 = yok0Var.b.c();
            x6h1VarC11.i.add(new a7h1("lossless_only_on_other_device", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC11.j = true;
            x6h1 x6h1VarC12 = x6h1VarC11.a().c();
            x6h1VarC12.i.add(new a7h1("navigate_to_audio_quality_settings", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC12.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6)), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
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
