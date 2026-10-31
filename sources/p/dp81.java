package p;

import android.content.Context;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dp81 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fp81 b;

    public /* synthetic */ dp81(fp81 fp81Var, byte b) {
        this.a = b;
        this.b = fp81Var;
    }

    public final void accept(Object obj) {
        sit yitVar;
        byte b = this.a;
        fp81 fp81Var = this.b;
        switch (b) {
            case 0:
                zo81 zo81Var = (zo81) obj;
                kg0.e(fp81Var.d, new ajt(zo81Var.c, zo81Var.d), new ifl1((Object) null, (byte) 25));
                break;
            case 1:
                String str = ((lo81) obj).c;
                g1f0 g1f0Var = fp81Var.e;
                if (g1f0Var.J()) {
                    yitVar = new sit(str, 14, false);
                } else {
                    yitVar = (g1f0Var.b() && fp81Var.c.getIntent().getBooleanExtra("is_web_login_flow_supported", true)) ? new yit(new d3f0(str), bk8.h, (n5o) null, 12) : new gjt(fjt.b, str);
                }
                fp81Var.d.d(yitVar, true);
                break;
            case 2:
                y3u y3uVar = fp81Var.a;
                vp81 vp81Var = new vp81(null);
                bpb1 bpb1Var = y3uVar.g;
                Context context = y3uVar.a;
                bpb1Var.m((Object) null, new j0f0(null, context.getString(2131962518), null, new h0f0(context.getString(2131962486), new f2t(y3uVar, vp81Var, (byte) 11)), null, null, null, null, 245));
                break;
            default:
                fp81Var.c.finishAffinity();
                break;
        }
    }
}
