package p;

import android.content.Context;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ep81 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fp81 b;

    public /* synthetic */ ep81(fp81 fp81Var, byte b) {
        this.a = b;
        this.b = fp81Var;
    }

    public final void run() {
        byte b = this.a;
        fp81 fp81Var = this.b;
        switch (b) {
            case 0:
                fp81Var.b.c.b(zjt.a);
                break;
            case 1:
                fp81Var.d.a(true);
                break;
            case 2:
                y3u y3uVar = fp81Var.a;
                bpb1 bpb1Var = y3uVar.g;
                Context context = y3uVar.a;
                bpb1Var.m((Object) null, new j0f0(null, context.getString(2131962509), null, new h0f0(context.getString(2131962485), u6t.V0), null, null, null, null, 245));
                break;
            case 3:
                y3u y3uVar2 = fp81Var.a;
                bpb1 bpb1Var2 = y3uVar2.g;
                Context context2 = y3uVar2.a;
                bpb1Var2.m((Object) null, new j0f0(null, context2.getString(2131962491), null, new h0f0(context2.getString(2131962485), u6t.W0), null, null, null, null, 245));
                break;
            case 4:
                y3u y3uVar3 = fp81Var.a;
                bpb1 bpb1Var3 = y3uVar3.g;
                Context context3 = y3uVar3.a;
                bpb1Var3.m((Object) null, new j0f0(context3.getString(2131962502), context3.getString(2131962501), null, new h0f0(context3.getString(2131962482), u6t.T0), new h0f0(context3.getString(2131962480), u6t.U0), null, null, null, 228));
                break;
            default:
                y3u y3uVar4 = fp81Var.a;
                bpb1 bpb1Var4 = y3uVar4.g;
                Context context4 = y3uVar4.a;
                bpb1Var4.m((Object) null, new j0f0(context4.getString(2131962508), context4.getString(2131962507), null, new h0f0(context4.getString(2131962485), u6t.X0), null, null, null, null, 244));
                break;
        }
    }
}
