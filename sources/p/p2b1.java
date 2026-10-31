package p;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p2b1 extends hab0 implements Function0 {
    public final /* synthetic */ r2b1 a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ yt91 c;
    public final /* synthetic */ Uri d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2b1(r2b1 r2b1Var, Activity activity, yt91 yt91Var, Uri uri, boolean z) {
        super(0);
        this.a = r2b1Var;
        this.b = activity;
        this.c = yt91Var;
        this.d = uri;
        this.e = z;
    }

    public final Object invoke() {
        dn81 dn81VarA;
        r2b1 r2b1Var = this.a;
        r2b1Var.b.getClass();
        r2b1Var.a.getClass();
        m3c m3cVar = new m3c(this.b);
        yt91 yt91Var = this.c;
        if (yt91Var != null) {
            m3cVar.k(new o2b1(yt91Var, (byte) 0));
        }
        m3cVar.l(this.d);
        if (this.e) {
            m3cVar.h();
        } else {
            m3cVar.c();
        }
        if (r2b1Var.f.b() && (dn81VarA = u3c.a()) != null) {
            dn81VarA.m();
        }
        return rih1.a;
    }
}
